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
	private String HostedButtonID;

	/**
	 * 	 
	 */ 
	private String ButtonType;

	/**
	 * 	 
	 */ 
	private String ItemName;

	/**
	 * 	 
	 */ 
	private String ModifyDate;

	

	/**
	 * Default Constructor
	 */
	public ButtonSearchResultType (){
	}	

	/**
	 * Getter for HostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return HostedButtonID;
	 }
	 
	/**
	 * Setter for HostedButtonID
	 */
	 public void setHostedButtonID(String HostedButtonID) {
	 	this.HostedButtonID = HostedButtonID;
	 }
	 
	/**
	 * Getter for ButtonType
	 */
	 public String getButtonType() {
	 	return ButtonType;
	 }
	 
	/**
	 * Setter for ButtonType
	 */
	 public void setButtonType(String ButtonType) {
	 	this.ButtonType = ButtonType;
	 }
	 
	/**
	 * Getter for ItemName
	 */
	 public String getItemName() {
	 	return ItemName;
	 }
	 
	/**
	 * Setter for ItemName
	 */
	 public void setItemName(String ItemName) {
	 	this.ItemName = ItemName;
	 }
	 
	/**
	 * Getter for ModifyDate
	 */
	 public String getModifyDate() {
	 	return ModifyDate;
	 }
	 
	/**
	 * Setter for ModifyDate
	 */
	 public void setModifyDate(String ModifyDate) {
	 	this.ModifyDate = ModifyDate;
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
		    this.HostedButtonID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ButtonType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ButtonType = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ModifyDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ModifyDate = childNode.getTextContent();
		}
	
	}
 
}