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
 * The first name of the User. Character length and
 * limitations: 127 single-byte alphanumeric characters 
 */
public class GetAuthDetailsResponseDetailsType{


	/**
	 * The first name of the User. Character length and
	 * limitations: 127 single-byte alphanumeric characters	 
	 */ 
	private String FirstName;

	/**
	 * The Last name of the user. Character length and limitations:
	 * 127 single-byte alphanumeric characters	 
	 */ 
	private String LastName;

	/**
	 * The email address of the user. Character length and
	 * limitations: 256 single-byte alphanumeric characters. 	 
	 */ 
	private String Email;

	/**
	 * Encrypted PayPal customer account identification number.
	 * Required Character length and limitations: 127 single-byte
	 * characters.	 
	 */ 
	private String PayerID;

	

	/**
	 * Default Constructor
	 */
	public GetAuthDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for FirstName
	 */
	 public String getFirstName() {
	 	return FirstName;
	 }
	 
	/**
	 * Setter for FirstName
	 */
	 public void setFirstName(String FirstName) {
	 	this.FirstName = FirstName;
	 }
	 
	/**
	 * Getter for LastName
	 */
	 public String getLastName() {
	 	return LastName;
	 }
	 
	/**
	 * Setter for LastName
	 */
	 public void setLastName(String LastName) {
	 	this.LastName = LastName;
	 }
	 
	/**
	 * Getter for Email
	 */
	 public String getEmail() {
	 	return Email;
	 }
	 
	/**
	 * Setter for Email
	 */
	 public void setEmail(String Email) {
	 	this.Email = Email;
	 }
	 
	/**
	 * Getter for PayerID
	 */
	 public String getPayerID() {
	 	return PayerID;
	 }
	 
	/**
	 * Setter for PayerID
	 */
	 public void setPayerID(String PayerID) {
	 	this.PayerID = PayerID;
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
	
	public GetAuthDetailsResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("FirstName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FirstName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LastName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LastName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Email", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Email = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerID = childNode.getTextContent();
		}
	
	}
 
}