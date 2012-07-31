package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ErrorType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Contains payment request information for each bucket in the
 * cart.  
 */
public class PaymentRequestInfoType{


	/**
	 * Contains the transaction id of the bucket.  	 
	 */ 
	private String TransactionId;

	/**
	 * Contains the bucket id.  	 
	 */ 
	private String PaymentRequestID;

	/**
	 * Contains the error details.  	 
	 */ 
	private ErrorType PaymentError;

	

	/**
	 * Default Constructor
	 */
	public PaymentRequestInfoType (){
	}	

	/**
	 * Getter for TransactionId
	 */
	 public String getTransactionId() {
	 	return TransactionId;
	 }
	 
	/**
	 * Setter for TransactionId
	 */
	 public void setTransactionId(String TransactionId) {
	 	this.TransactionId = TransactionId;
	 }
	 
	/**
	 * Getter for PaymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return PaymentRequestID;
	 }
	 
	/**
	 * Setter for PaymentRequestID
	 */
	 public void setPaymentRequestID(String PaymentRequestID) {
	 	this.PaymentRequestID = PaymentRequestID;
	 }
	 
	/**
	 * Getter for PaymentError
	 */
	 public ErrorType getPaymentError() {
	 	return PaymentError;
	 }
	 
	/**
	 * Setter for PaymentError
	 */
	 public void setPaymentError(ErrorType PaymentError) {
	 	this.PaymentError = PaymentError;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public PaymentRequestInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("TransactionId").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TransactionId").item(0))) {
				this.TransactionId = (String)document.getElementsByTagName("TransactionId").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PaymentRequestID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestID").item(0))) {
				this.PaymentRequestID = (String)document.getElementsByTagName("PaymentRequestID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("PaymentError").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentError").item(0))) {
				nodeList = document.getElementsByTagName("PaymentError");
				xmlString = convertToXML(nodeList.item(0));
				this.PaymentError =  new ErrorType(xmlString);
			}
		}
	}

}