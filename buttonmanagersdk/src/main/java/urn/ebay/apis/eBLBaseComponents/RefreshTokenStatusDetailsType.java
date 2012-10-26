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
public class RefreshTokenStatusDetailsType{


	/**
	 * Required field that reports status of opt-in or login bypass
	 * attempt.  0 = Success, successful opt-in or RefreshToken
	 * corresponding to AccessToken specified  in
	 * SetExpressCheckout is valid (user is still opted in).  1 =
	 * New RefreshToken was generated (user is still opted in).  2
	 * = Invalid ID, RefreshToken corresponding to AccessToken
	 * specified in SetExpressCheckout  is invalid (user is opted
	 * out). -2 = Internal Error, system error or outage during
	 * opt-in or login bypass. Can retry  opt-in or login bypass
	 * next time. Flow will force full authentication and allow 
	 * buyer to complete transaction. -1 = None, the field does not
	 * represent any valid value of the status. 	  
	 *@Required	 
	 */ 
	private Integer refreshTokenStatus;

	/**
	 * Identifier returned on external-remember-me-opt-in to allow
	 * the merchant to request bypass of PayPal login 	 
	 */ 
	private String refreshToken;

	/**
	 * The immutable_id is the user's unique value per merchant
	 * that should never ever change for that account. This would
	 * be the key used to uniquely identify the user 	 
	 */ 
	private String immutableID;

	

	/**
	 * Default Constructor
	 */
	public RefreshTokenStatusDetailsType (){
	}	

	/**
	 * Getter for refreshTokenStatus
	 */
	 public Integer getRefreshTokenStatus() {
	 	return refreshTokenStatus;
	 }
	 
	/**
	 * Setter for refreshTokenStatus
	 */
	 public void setRefreshTokenStatus(Integer refreshTokenStatus) {
	 	this.refreshTokenStatus = refreshTokenStatus;
	 }
	 
	/**
	 * Getter for refreshToken
	 */
	 public String getRefreshToken() {
	 	return refreshToken;
	 }
	 
	/**
	 * Setter for refreshToken
	 */
	 public void setRefreshToken(String refreshToken) {
	 	this.refreshToken = refreshToken;
	 }
	 
	/**
	 * Getter for immutableID
	 */
	 public String getImmutableID() {
	 	return immutableID;
	 }
	 
	/**
	 * Setter for immutableID
	 */
	 public void setImmutableID(String immutableID) {
	 	this.immutableID = immutableID;
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
	
	public RefreshTokenStatusDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("RefreshTokenStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.refreshTokenStatus = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("RefreshToken", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.refreshToken = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ImmutableID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.immutableID = childNode.getTextContent();
		}
	
	}
 
}