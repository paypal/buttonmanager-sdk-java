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
 * Unique transaction identifier of the reversal transaction
 * created. Character length and limitations:17 single-byte
 * characters 
 */
public class ReverseTransactionResponseDetailsType{


	/**
	 * Unique transaction identifier of the reversal transaction
	 * created. Character length and limitations:17 single-byte
	 * characters 	 
	 */ 
	private String reverseTransactionID;

	/**
	 * Status of reversal request. Required 	  
	 *@Required	 
	 */ 
	private String status;

	

	/**
	 * Default Constructor
	 */
	public ReverseTransactionResponseDetailsType (){
	}	

	/**
	 * Getter for reverseTransactionID
	 */
	 public String getReverseTransactionID() {
	 	return reverseTransactionID;
	 }
	 
	/**
	 * Setter for reverseTransactionID
	 */
	 public void setReverseTransactionID(String reverseTransactionID) {
	 	this.reverseTransactionID = reverseTransactionID;
	 }
	 
	/**
	 * Getter for status
	 */
	 public String getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(String status) {
	 	this.status = status;
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
	
	public ReverseTransactionResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ReverseTransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.reverseTransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.status = childNode.getTextContent();
		}
	
	}
 
}