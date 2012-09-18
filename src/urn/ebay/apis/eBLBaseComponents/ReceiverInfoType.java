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
		    this.Business = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Receiver", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Receiver = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ReceiverID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ReceiverID = childNode.getTextContent();
		}
	
	}
 
}