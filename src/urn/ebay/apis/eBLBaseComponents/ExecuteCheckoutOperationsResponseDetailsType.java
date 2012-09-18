package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.SetDataResponseType;
import urn.ebay.apis.eBLBaseComponents.AuthorizationResponseType;
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
public class ExecuteCheckoutOperationsResponseDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private SetDataResponseType SetDataResponse;

	/**
	 * 	 
	 */ 
	private AuthorizationResponseType AuthorizationResponse;

	

	/**
	 * Default Constructor
	 */
	public ExecuteCheckoutOperationsResponseDetailsType (){
	}	

	/**
	 * Getter for SetDataResponse
	 */
	 public SetDataResponseType getSetDataResponse() {
	 	return SetDataResponse;
	 }
	 
	/**
	 * Setter for SetDataResponse
	 */
	 public void setSetDataResponse(SetDataResponseType SetDataResponse) {
	 	this.SetDataResponse = SetDataResponse;
	 }
	 
	/**
	 * Getter for AuthorizationResponse
	 */
	 public AuthorizationResponseType getAuthorizationResponse() {
	 	return AuthorizationResponse;
	 }
	 
	/**
	 * Setter for AuthorizationResponse
	 */
	 public void setAuthorizationResponse(AuthorizationResponseType AuthorizationResponse) {
	 	this.AuthorizationResponse = AuthorizationResponse;
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
	
	public ExecuteCheckoutOperationsResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("SetDataResponse", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SetDataResponse =  new SetDataResponseType(childNode);
		}
		childNode = (Node) xpath.evaluate("AuthorizationResponse", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AuthorizationResponse =  new AuthorizationResponseType(childNode);
		}
	}
 
}