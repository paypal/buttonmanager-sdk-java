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
 * 
 */
public class ButtonSearchResultType{


	/**
	 * 	 
	 */ 
	private String hostedButtonID;

	/**
	 * 	 
	 */ 
	private String buttonType;

	/**
	 * 	 
	 */ 
	private String itemName;

	/**
	 * 	 
	 */ 
	private String modifyDate;

	

	/**
	 * Default Constructor
	 */
	public ButtonSearchResultType (){
	}	

	/**
	 * Getter for hostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return hostedButtonID;
	 }
	 
	/**
	 * Setter for hostedButtonID
	 */
	 public void setHostedButtonID(String hostedButtonID) {
	 	this.hostedButtonID = hostedButtonID;
	 }
	 
	/**
	 * Getter for buttonType
	 */
	 public String getButtonType() {
	 	return buttonType;
	 }
	 
	/**
	 * Setter for buttonType
	 */
	 public void setButtonType(String buttonType) {
	 	this.buttonType = buttonType;
	 }
	 
	/**
	 * Getter for itemName
	 */
	 public String getItemName() {
	 	return itemName;
	 }
	 
	/**
	 * Setter for itemName
	 */
	 public void setItemName(String itemName) {
	 	this.itemName = itemName;
	 }
	 
	/**
	 * Getter for modifyDate
	 */
	 public String getModifyDate() {
	 	return modifyDate;
	 }
	 
	/**
	 * Setter for modifyDate
	 */
	 public void setModifyDate(String modifyDate) {
	 	this.modifyDate = modifyDate;
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
	
	public ButtonSearchResultType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("HostedButtonID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.hostedButtonID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ButtonType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buttonType = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ModifyDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.modifyDate = childNode.getTextContent();
		}
	
	}
 
}