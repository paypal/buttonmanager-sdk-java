package urn.ebay.apis.eBLBaseComponents;
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
 * ReceiverInfoType Receiver information. 
 */
public class ReceiverInfoType{


	/**
	 * Email address or account ID of the payment recipient (the
	 * seller). Equivalent to Receiver if payment is sent to
	 * primary account. Character length and limitations: 127
	 * single-byte alphanumeric characters	 
	 */ 
	private String Business;

	/**
	 * Primary email address of the payment recipient (the seller).
	 * If you are the recipient of the payment and the payment is
	 * sent to your non-primary email address, the value of
	 * Receiver is still your primary email address. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Receiver;

	/**
	 * Unique account ID of the payment recipient (the seller).
	 * This value is the same as the value of the recipient's
	 * referral ID. 	 
	 */ 
	private String ReceiverID;

	

	/**
	 * Default Constructor
	 */
	public ReceiverInfoType (){
	}	

	/**
	 * Getter for Business
	 */
	 public String getBusiness() {
	 	return Business;
	 }
	 
	/**
	 * Setter for Business
	 */
	 public void setBusiness(String Business) {
	 	this.Business = Business;
	 }
	 
	/**
	 * Getter for Receiver
	 */
	 public String getReceiver() {
	 	return Receiver;
	 }
	 
	/**
	 * Setter for Receiver
	 */
	 public void setReceiver(String Receiver) {
	 	this.Receiver = Receiver;
	 }
	 
	/**
	 * Getter for ReceiverID
	 */
	 public String getReceiverID() {
	 	return ReceiverID;
	 }
	 
	/**
	 * Setter for ReceiverID
	 */
	 public void setReceiverID(String ReceiverID) {
	 	this.ReceiverID = ReceiverID;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ){
			return (n.getChildNodes().getLength() == 0);
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
	
	public ReceiverInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Business").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Business").item(0))) {
				this.Business = (String)document.getElementsByTagName("Business").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Receiver").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Receiver").item(0))) {
				this.Receiver = (String)document.getElementsByTagName("Receiver").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ReceiverID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ReceiverID").item(0))) {
				this.ReceiverID = (String)document.getElementsByTagName("ReceiverID").item(0).getTextContent();
			}
		}
	
	}
 
}