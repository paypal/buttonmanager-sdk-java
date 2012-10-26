package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.AckCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.ErrorType;
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
 * Status will denote whether Auto authorization was successful
 * or not. 
 */
public class AuthorizationResponseType{


	/**
	 * Status will denote whether Auto authorization was successful
	 * or not. 	  
	 *@Required	 
	 */ 
	private AckCodeType Status;

	/**
	 * 	 
	 */ 
	private List<ErrorType> AuthorizationError = new ArrayList<ErrorType>();

	

	/**
	 * Default Constructor
	 */
	public AuthorizationResponseType (){
	}	

	/**
	 * Getter for Status
	 */
	 public AckCodeType getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(AckCodeType Status) {
	 	this.Status = Status;
	 }
	 
	/**
	 * Getter for AuthorizationError
	 */
	 public List<ErrorType> getAuthorizationError() {
	 	return AuthorizationError;
	 }
	 
	/**
	 * Setter for AuthorizationError
	 */
	 public void setAuthorizationError(List<ErrorType> AuthorizationError) {
	 	this.AuthorizationError = AuthorizationError;
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
	
	public AuthorizationResponseType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Status = AckCodeType.fromValue(childNode.getTextContent());
		}
        nodeList = (NodeList) xpath.evaluate("AuthorizationError", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.AuthorizationError.add(new ErrorType(subNode));
			}
		}
	}
 
}