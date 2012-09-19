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
	private String Username;

	/**
	 * Merchant’s PayPal API passwordCharacter length and
	 * limitations: 40 alphanumeric characters	 
	 */ 
	private String Password;

	/**
	 * Merchant’s PayPal API signature, if one exists. Character
	 * length and limitations: 256 alphanumeric characters	 
	 */ 
	private String Signature;

	/**
	 * Merchant’s PayPal API certificate in PEM format, if one
	 * exists The certificate consists of two parts: the private
	 * key (2,048 bytes) and the certificate proper (4,000 bytes).
	 * Character length and limitations: 6,048 alphanumeric
	 * characters	 
	 */ 
	private String Certificate;

	/**
	 * Merchant’s PayPal API authentication mechanism. Auth-None:
	 * no authentication mechanism on file Cert: API certificate
	 * Sign: API signature Character length and limitations: 9
	 * alphanumeric characters	 
	 */ 
	private APIAuthenticationType Type;

	

	/**
	 * Default Constructor
	 */
	public APICredentialsType (){
	}	

	/**
	 * Getter for Username
	 */
	 public String getUsername() {
	 	return Username;
	 }
	 
	/**
	 * Setter for Username
	 */
	 public void setUsername(String Username) {
	 	this.Username = Username;
	 }
	 
	/**
	 * Getter for Password
	 */
	 public String getPassword() {
	 	return Password;
	 }
	 
	/**
	 * Setter for Password
	 */
	 public void setPassword(String Password) {
	 	this.Password = Password;
	 }
	 
	/**
	 * Getter for Signature
	 */
	 public String getSignature() {
	 	return Signature;
	 }
	 
	/**
	 * Setter for Signature
	 */
	 public void setSignature(String Signature) {
	 	this.Signature = Signature;
	 }
	 
	/**
	 * Getter for Certificate
	 */
	 public String getCertificate() {
	 	return Certificate;
	 }
	 
	/**
	 * Setter for Certificate
	 */
	 public void setCertificate(String Certificate) {
	 	this.Certificate = Certificate;
	 }
	 
	/**
	 * Getter for Type
	 */
	 public APIAuthenticationType getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(APIAuthenticationType Type) {
	 	this.Type = Type;
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
		    this.Username = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Password", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Password = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Signature", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Signature = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Certificate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Certificate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Type", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Type = APIAuthenticationType.fromValue(childNode.getTextContent());
		}
	}
 
}