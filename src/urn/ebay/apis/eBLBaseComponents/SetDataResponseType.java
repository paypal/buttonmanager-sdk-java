package urn.ebay.apis.eBLBaseComponents;
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
 * If Checkout session was initialized successfully, the
 * corresponding token is returned in this element. 
 */
public class SetDataResponseType{


	/**
	 * If Checkout session was initialized successfully, the
	 * corresponding token is returned in this element. 	 
	 */ 
	private String Token;

	/**
	 * 	 
	 */ 
	private List<ErrorType> SetDataError = new ArrayList<ErrorType>();

	

	/**
	 * Default Constructor
	 */
	public SetDataResponseType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
	 }
	 
	/**
	 * Getter for SetDataError
	 */
	 public List<ErrorType> getSetDataError() {
	 	return SetDataError;
	 }
	 
	/**
	 * Setter for SetDataError
	 */
	 public void setSetDataError(List<ErrorType> SetDataError) {
	 	this.SetDataError = SetDataError;
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
	
	public SetDataResponseType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Token", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Token = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("SetDataError", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.SetDataError.add(new ErrorType(subNode));
			}
		}
	}
 
}