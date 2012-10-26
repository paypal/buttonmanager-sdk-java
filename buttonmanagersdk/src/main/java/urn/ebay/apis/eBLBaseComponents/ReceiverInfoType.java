package urn.ebay.apis.eBLBaseComponents;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
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
	private String business;

	/**
	 * Primary email address of the payment recipient (the seller).
	 * If you are the recipient of the payment and the payment is
	 * sent to your non-primary email address, the value of
	 * Receiver is still your primary email address. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String receiver;

	/**
	 * Unique account ID of the payment recipient (the seller).
	 * This value is the same as the value of the recipient's
	 * referral ID. 	 
	 */ 
	private String receiverID;

	

	/**
	 * Default Constructor
	 */
	public ReceiverInfoType (){
	}	

	/**
	 * Getter for business
	 */
	 public String getBusiness() {
	 	return business;
	 }
	 
	/**
	 * Setter for business
	 */
	 public void setBusiness(String business) {
	 	this.business = business;
	 }
	 
	/**
	 * Getter for receiver
	 */
	 public String getReceiver() {
	 	return receiver;
	 }
	 
	/**
	 * Setter for receiver
	 */
	 public void setReceiver(String receiver) {
	 	this.receiver = receiver;
	 }
	 
	/**
	 * Getter for receiverID
	 */
	 public String getReceiverID() {
	 	return receiverID;
	 }
	 
	/**
	 * Setter for receiverID
	 */
	 public void setReceiverID(String receiverID) {
	 	this.receiverID = receiverID;
	 }
	 



	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ) {
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	public ReceiverInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Business", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.business = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Receiver", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.receiver = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ReceiverID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.receiverID = childNode.getTextContent();
		}
	
	}
 
}