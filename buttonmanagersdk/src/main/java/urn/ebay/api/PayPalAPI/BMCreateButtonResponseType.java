package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
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
 * 
 */
public class BMCreateButtonResponseType extends AbstractResponseType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String website;

	/**
	 * 	 
	 */ 
	private String email;

	/**
	 * 	 
	 */ 
	private String mobile;

	/**
	 * 	 
	 */ 
	private String hostedButtonID;

	

	/**
	 * Default Constructor
	 */
	public BMCreateButtonResponseType (){
	}	

	/**
	 * Getter for website
	 */
	 public String getWebsite() {
	 	return website;
	 }
	 
	/**
	 * Setter for website
	 */
	 public void setWebsite(String website) {
	 	this.website = website;
	 }
	 
	/**
	 * Getter for email
	 */
	 public String getEmail() {
	 	return email;
	 }
	 
	/**
	 * Setter for email
	 */
	 public void setEmail(String email) {
	 	this.email = email;
	 }
	 
	/**
	 * Getter for mobile
	 */
	 public String getMobile() {
	 	return mobile;
	 }
	 
	/**
	 * Setter for mobile
	 */
	 public void setMobile(String mobile) {
	 	this.mobile = mobile;
	 }
	 
	/**
	 * Getter for hostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return hostedButtonID;
	 }
	 
	/**
	 * Setter for hostedButtonID
	 */
	 public void setHostedButtonID(String hostedButtonID) {
	 	this.hostedButtonID = hostedButtonID;
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
	
	public BMCreateButtonResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Website", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.website = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Email", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.email = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Mobile", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.mobile = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("HostedButtonID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.hostedButtonID = childNode.getTextContent();
		}
	
	}
 
}