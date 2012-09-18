package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AuthorizationInfoType;
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
 * A new authorization identification number. Character length
 * and limits: 19 single-byte characters 
 */
public class DoReauthorizationResponseType extends AbstractResponseType {


	/**
	 * A new authorization identification number. Character length
	 * and limits: 19 single-byte characters 	  
	 *@Required	 
	 */ 
	private String AuthorizationID;

	/**
	 * 	 
	 */ 
	private AuthorizationInfoType AuthorizationInfo;

	

	/**
	 * Default Constructor
	 */
	public DoReauthorizationResponseType (){
	}	

	/**
	 * Getter for AuthorizationID
	 */
	 public String getAuthorizationID() {
	 	return AuthorizationID;
	 }
	 
	/**
	 * Setter for AuthorizationID
	 */
	 public void setAuthorizationID(String AuthorizationID) {
	 	this.AuthorizationID = AuthorizationID;
	 }
	 
	/**
	 * Getter for AuthorizationInfo
	 */
	 public AuthorizationInfoType getAuthorizationInfo() {
	 	return AuthorizationInfo;
	 }
	 
	/**
	 * Setter for AuthorizationInfo
	 */
	 public void setAuthorizationInfo(AuthorizationInfoType AuthorizationInfo) {
	 	this.AuthorizationInfo = AuthorizationInfo;
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
	
	public DoReauthorizationResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("AuthorizationID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AuthorizationID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("AuthorizationInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AuthorizationInfo =  new AuthorizationInfoType(childNode);
		}
	}
 
}