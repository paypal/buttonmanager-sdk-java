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
 * Response information resulting from opt-in operation or
 * current login bypass status. 
 */
public class ExternalRememberMeStatusDetailsType{


	/**
	 * Required field that reports status of opt-in or login bypass
	 * attempt. 0 = Success - successful opt-in or
	 * ExternalRememberMeID specified in SetExpressCheckout is
	 * valid. 1 = Invalid ID - ExternalRememberMeID specified in
	 * SetExpressCheckout is invalid. 2 = Internal Error - System
	 * error or outage during opt-in or login bypass. Can retry
	 * opt-in or login bypass next time. Flow will force full
	 * authentication and allow buyer to complete transaction. -1 =
	 * None - the return value does not signify any valid remember
	 * me status. 	  
	 *@Required	 
	 */ 
	private Integer externalRememberMeStatus;

	/**
	 * Identifier returned on external-remember-me-opt-in to allow
	 * the merchant to request bypass of PayPal login through
	 * external remember me on behalf of the buyer in future
	 * transactions. The ExternalRememberMeID is a 17-character
	 * alphanumeric (encrypted) string. This field has meaning only
	 * to the merchant. 	 
	 */ 
	private String externalRememberMeID;

	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeStatusDetailsType (){
	}	

	/**
	 * Getter for externalRememberMeStatus
	 */
	 public Integer getExternalRememberMeStatus() {
	 	return externalRememberMeStatus;
	 }
	 
	/**
	 * Setter for externalRememberMeStatus
	 */
	 public void setExternalRememberMeStatus(Integer externalRememberMeStatus) {
	 	this.externalRememberMeStatus = externalRememberMeStatus;
	 }
	 
	/**
	 * Getter for externalRememberMeID
	 */
	 public String getExternalRememberMeID() {
	 	return externalRememberMeID;
	 }
	 
	/**
	 * Setter for externalRememberMeID
	 */
	 public void setExternalRememberMeID(String externalRememberMeID) {
	 	this.externalRememberMeID = externalRememberMeID;
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
	
	public ExternalRememberMeStatusDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ExternalRememberMeStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.externalRememberMeStatus = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("ExternalRememberMeID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.externalRememberMeID = childNode.getTextContent();
		}
	
	}
 
}