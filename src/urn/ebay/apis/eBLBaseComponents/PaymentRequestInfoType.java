
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.eBLBaseComponents.ErrorType;


/**
 * Contains payment request information for each bucket in the cart.
 */
public class PaymentRequestInfoType {

	/**
	 * Contains the transaction id of the bucket.
	 */
	private String TransactionId;
	public String getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(String value) {
		this.TransactionId = value;
	}

	/**
	 * Contains the bucket id.
	 */
	private String PaymentRequestID;
	public String getPaymentRequestID() {
		return PaymentRequestID;
	}
	public void setPaymentRequestID(String value) {
		this.PaymentRequestID = value;
	}

	/**
	 * Contains the error details.
	 */
	private ErrorType PaymentError;
	public ErrorType getPaymentError() {
		return PaymentError;
	}
	public void setPaymentError(ErrorType value) {
		this.PaymentError = value;
	}


	public PaymentRequestInfoType() {
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
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public PaymentRequestInfoType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("TransactionId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TransactionId").item(0))){ 
		 this.TransactionId =(String)document.getElementsByTagName("TransactionId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentRequestID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestID").item(0))){ 
		 this.PaymentRequestID =(String)document.getElementsByTagName("PaymentRequestID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentError").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentError").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentError");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PaymentError =  new ErrorType(xmlString);

}
	}
	}
}
