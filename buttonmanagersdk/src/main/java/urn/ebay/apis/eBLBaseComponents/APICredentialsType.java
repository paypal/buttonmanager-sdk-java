package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.APIAuthenticationType;
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
 * APICredentialsType 
 */
public class APICredentialsType{


	/**
	 * Merchant’s PayPal API usernameCharacter length and
	 * limitations: 128 alphanumeric characters	 
	 */ 
	private String username;

	/**
	 * Merchant’s PayPal API passwordCharacter length and
	 * limitations: 40 alphanumeric characters	 
	 */ 
	private String password;

	/**
	 * Merchant’s PayPal API signature, if one exists. Character
	 * length and limitations: 256 alphanumeric characters	 
	 */ 
	private String signature;

	/**
	 * Merchant’s PayPal API certificate in PEM format, if one
	 * exists The certificate consists of two parts: the private
	 * key (2,048 bytes) and the certificate proper (4,000 bytes).
	 * Character length and limitations: 6,048 alphanumeric
	 * characters	 
	 */ 
	private String certificate;

	/**
	 * Merchant’s PayPal API authentication mechanism. Auth-None:
	 * no authentication mechanism on file Cert: API certificate
	 * Sign: API signature Character length and limitations: 9
	 * alphanumeric characters	 
	 */ 
	private APIAuthenticationType type;

	

	/**
	 * Default Constructor
	 */
	public APICredentialsType (){
	}	

	/**
	 * Getter for username
	 */
	 public String getUsername() {
	 	return username;
	 }
	 
	/**
	 * Setter for username
	 */
	 public void setUsername(String username) {
	 	this.username = username;
	 }
	 
	/**
	 * Getter for password
	 */
	 public String getPassword() {
	 	return password;
	 }
	 
	/**
	 * Setter for password
	 */
	 public void setPassword(String password) {
	 	this.password = password;
	 }
	 
	/**
	 * Getter for signature
	 */
	 public String getSignature() {
	 	return signature;
	 }
	 
	/**
	 * Setter for signature
	 */
	 public void setSignature(String signature) {
	 	this.signature = signature;
	 }
	 
	/**
	 * Getter for certificate
	 */
	 public String getCertificate() {
	 	return certificate;
	 }
	 
	/**
	 * Setter for certificate
	 */
	 public void setCertificate(String certificate) {
	 	this.certificate = certificate;
	 }
	 
	/**
	 * Getter for type
	 */
	 public APIAuthenticationType getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(APIAuthenticationType type) {
	 	this.type = type;
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
	
	public APICredentialsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Username", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.username = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Password", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.password = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Signature", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.signature = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Certificate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.certificate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Type", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.type = APIAuthenticationType.fromValue(childNode.getTextContent());
		}
	}
 
}