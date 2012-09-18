package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureRequestType;
import urn.ebay.apis.eBLBaseComponents.ThreeDSecureResponseType;
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
 * 3DSecureInfoType Information about 3D Secure parameters. 
 */
public class ThreeDSecureInfoType{


	/**
	 * 	 
	 */ 
	private ThreeDSecureRequestType ThreeDSecureRequest;

	/**
	 * 	 
	 */ 
	private ThreeDSecureResponseType ThreeDSecureResponse;

	

	/**
	 * Default Constructor
	 */
	public ThreeDSecureInfoType (){
	}	

	/**
	 * Getter for ThreeDSecureRequest
	 */
	 public ThreeDSecureRequestType getThreeDSecureRequest() {
	 	return ThreeDSecureRequest;
	 }
	 
	/**
	 * Setter for ThreeDSecureRequest
	 */
	 public void setThreeDSecureRequest(ThreeDSecureRequestType ThreeDSecureRequest) {
	 	this.ThreeDSecureRequest = ThreeDSecureRequest;
	 }
	 
	/**
	 * Getter for ThreeDSecureResponse
	 */
	 public ThreeDSecureResponseType getThreeDSecureResponse() {
	 	return ThreeDSecureResponse;
	 }
	 
	/**
	 * Setter for ThreeDSecureResponse
	 */
	 public void setThreeDSecureResponse(ThreeDSecureResponseType ThreeDSecureResponse) {
	 	this.ThreeDSecureResponse = ThreeDSecureResponse;
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
	
	public ThreeDSecureInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ThreeDSecureRequest", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ThreeDSecureRequest =  new ThreeDSecureRequestType(childNode);
		}
		childNode = (Node) xpath.evaluate("ThreeDSecureResponse", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ThreeDSecureResponse =  new ThreeDSecureResponseType(childNode);
		}
	}
 
}