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
	private UATPDetailsType UATPDetails;

	/**
	 * Auth Authorization Code. 	  
	 *@Required	 
	 */ 
	private String AuthorizationCode;

	/**
	 * Invoice ID. A pass through. 	 
	 */ 
	private String InvoiceID;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Default Constructor
	 */
	public DoUATPAuthorizationResponseType (){
	}	

	/**
	 * Getter for UATPDetails
	 */
	 public UATPDetailsType getUATPDetails() {
	 	return UATPDetails;
	 }
	 
	/**
	 * Setter for UATPDetails
	 */
	 public void setUATPDetails(UATPDetailsType UATPDetails) {
	 	this.UATPDetails = UATPDetails;
	 }
	 
	/**
	 * Getter for AuthorizationCode
	 */
	 public String getAuthorizationCode() {
	 	return AuthorizationCode;
	 }
	 
	/**
	 * Setter for AuthorizationCode
	 */
	 public void setAuthorizationCode(String AuthorizationCode) {
	 	this.AuthorizationCode = AuthorizationCode;
	 }
	 
	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for MsgSubID
	 */
	 public String getMsgSubID() {
	 	return MsgSubID;
	 }
	 
	/**
	 * Setter for MsgSubID
	 */
	 public void setMsgSubID(String MsgSubID) {
	 	this.MsgSubID = MsgSubID;
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
		    this.UATPDetails =  new UATPDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("AuthorizationCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AuthorizationCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InvoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MsgSubID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.MsgSubID = childNode.getTextContent();
		}
	
	}
 
}