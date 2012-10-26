package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.UATPDetailsType;
import urn.ebay.api.PayPalAPI.DoAuthorizationResponseType;
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
 * Auth Authorization Code. 
 */
public class DoUATPAuthorizationResponseType extends DoAuthorizationResponseType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private UATPDetailsType uATPDetails;

	/**
	 * Auth Authorization Code. 	  
	 *@Required	 
	 */ 
	private String authorizationCode;

	/**
	 * Invoice ID. A pass through. 	 
	 */ 
	private String invoiceID;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Default Constructor
	 */
	public DoUATPAuthorizationResponseType (){
	}	

	/**
	 * Getter for uATPDetails
	 */
	 public UATPDetailsType getUATPDetails() {
	 	return uATPDetails;
	 }
	 
	/**
	 * Setter for uATPDetails
	 */
	 public void setUATPDetails(UATPDetailsType uATPDetails) {
	 	this.uATPDetails = uATPDetails;
	 }
	 
	/**
	 * Getter for authorizationCode
	 */
	 public String getAuthorizationCode() {
	 	return authorizationCode;
	 }
	 
	/**
	 * Setter for authorizationCode
	 */
	 public void setAuthorizationCode(String authorizationCode) {
	 	this.authorizationCode = authorizationCode;
	 }
	 
	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for msgSubID
	 */
	 public String getMsgSubID() {
	 	return msgSubID;
	 }
	 
	/**
	 * Setter for msgSubID
	 */
	 public void setMsgSubID(String msgSubID) {
	 	this.msgSubID = msgSubID;
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
	
	public DoUATPAuthorizationResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("UATPDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.uATPDetails =  new UATPDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("AuthorizationCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.authorizationCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.invoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MsgSubID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.msgSubID = childNode.getTextContent();
		}
	
	}
 
}