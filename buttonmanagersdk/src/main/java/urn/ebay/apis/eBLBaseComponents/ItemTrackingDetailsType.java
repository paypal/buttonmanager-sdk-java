package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;
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
 * Item Number. Required 
 */
public class ItemTrackingDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Item Number. Required 	 
	 */ 
	private String itemNumber;

	/**
	 * Option Quantity. Optional 	 
	 */ 
	private String itemQty;

	/**
	 * Item Quantity Delta. Optional 	 
	 */ 
	private String itemQtyDelta;

	/**
	 * Item Alert. Optional 	 
	 */ 
	private String itemAlert;

	/**
	 * Item Cost. Optional 	 
	 */ 
	private String itemCost;

	

	/**
	 * Default Constructor
	 */
	public ItemTrackingDetailsType (){
	}	

	/**
	 * Getter for itemNumber
	 */
	 public String getItemNumber() {
	 	return itemNumber;
	 }
	 
	/**
	 * Setter for itemNumber
	 */
	 public void setItemNumber(String itemNumber) {
	 	this.itemNumber = itemNumber;
	 }
	 
	/**
	 * Getter for itemQty
	 */
	 public String getItemQty() {
	 	return itemQty;
	 }
	 
	/**
	 * Setter for itemQty
	 */
	 public void setItemQty(String itemQty) {
	 	this.itemQty = itemQty;
	 }
	 
	/**
	 * Getter for itemQtyDelta
	 */
	 public String getItemQtyDelta() {
	 	return itemQtyDelta;
	 }
	 
	/**
	 * Setter for itemQtyDelta
	 */
	 public void setItemQtyDelta(String itemQtyDelta) {
	 	this.itemQtyDelta = itemQtyDelta;
	 }
	 
	/**
	 * Getter for itemAlert
	 */
	 public String getItemAlert() {
	 	return itemAlert;
	 }
	 
	/**
	 * Setter for itemAlert
	 */
	 public void setItemAlert(String itemAlert) {
	 	this.itemAlert = itemAlert;
	 }
	 
	/**
	 * Getter for itemCost
	 */
	 public String getItemCost() {
	 	return itemCost;
	 }
	 
	/**
	 * Setter for itemCost
	 */
	 public void setItemCost(String itemCost) {
	 	this.itemCost = itemCost;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(itemNumber != null) {
			sb.append("<").append(preferredPrefix).append(":ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemNumber));
			sb.append("</").append(preferredPrefix).append(":ItemNumber>");
		}
		if(itemQty != null) {
			sb.append("<").append(preferredPrefix).append(":ItemQty>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemQty));
			sb.append("</").append(preferredPrefix).append(":ItemQty>");
		}
		if(itemQtyDelta != null) {
			sb.append("<").append(preferredPrefix).append(":ItemQtyDelta>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemQtyDelta));
			sb.append("</").append(preferredPrefix).append(":ItemQtyDelta>");
		}
		if(itemAlert != null) {
			sb.append("<").append(preferredPrefix).append(":ItemAlert>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemAlert));
			sb.append("</").append(preferredPrefix).append(":ItemAlert>");
		}
		if(itemCost != null) {
			sb.append("<").append(preferredPrefix).append(":ItemCost>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemCost));
			sb.append("</").append(preferredPrefix).append(":ItemCost>");
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
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
	
	public ItemTrackingDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ItemNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemQty", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemQty = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemQtyDelta", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemQtyDelta = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemAlert", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemAlert = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemCost", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemCost = childNode.getTextContent();
		}
	
	}
 
}