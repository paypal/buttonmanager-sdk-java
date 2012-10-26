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


	/**
	 * Item Number. Required 	 
	 */ 
	private String ItemNumber;

	/**
	 * Option Quantity. Optional 	 
	 */ 
	private String ItemQty;

	/**
	 * Item Quantity Delta. Optional 	 
	 */ 
	private String ItemQtyDelta;

	/**
	 * Item Alert. Optional 	 
	 */ 
	private String ItemAlert;

	/**
	 * Item Cost. Optional 	 
	 */ 
	private String ItemCost;

	

	/**
	 * Default Constructor
	 */
	public ItemTrackingDetailsType (){
	}	

	/**
	 * Getter for ItemNumber
	 */
	 public String getItemNumber() {
	 	return ItemNumber;
	 }
	 
	/**
	 * Setter for ItemNumber
	 */
	 public void setItemNumber(String ItemNumber) {
	 	this.ItemNumber = ItemNumber;
	 }
	 
	/**
	 * Getter for ItemQty
	 */
	 public String getItemQty() {
	 	return ItemQty;
	 }
	 
	/**
	 * Setter for ItemQty
	 */
	 public void setItemQty(String ItemQty) {
	 	this.ItemQty = ItemQty;
	 }
	 
	/**
	 * Getter for ItemQtyDelta
	 */
	 public String getItemQtyDelta() {
	 	return ItemQtyDelta;
	 }
	 
	/**
	 * Setter for ItemQtyDelta
	 */
	 public void setItemQtyDelta(String ItemQtyDelta) {
	 	this.ItemQtyDelta = ItemQtyDelta;
	 }
	 
	/**
	 * Getter for ItemAlert
	 */
	 public String getItemAlert() {
	 	return ItemAlert;
	 }
	 
	/**
	 * Setter for ItemAlert
	 */
	 public void setItemAlert(String ItemAlert) {
	 	this.ItemAlert = ItemAlert;
	 }
	 
	/**
	 * Getter for ItemCost
	 */
	 public String getItemCost() {
	 	return ItemCost;
	 }
	 
	/**
	 * Setter for ItemCost
	 */
	 public void setItemCost(String ItemCost) {
	 	this.ItemCost = ItemCost;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ItemNumber != null) {
			sb.append("<ebl:ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemNumber));
			sb.append("</ebl:ItemNumber>");
		}
		if(ItemQty != null) {
			sb.append("<ebl:ItemQty>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemQty));
			sb.append("</ebl:ItemQty>");
		}
		if(ItemQtyDelta != null) {
			sb.append("<ebl:ItemQtyDelta>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemQtyDelta));
			sb.append("</ebl:ItemQtyDelta>");
		}
		if(ItemAlert != null) {
			sb.append("<ebl:ItemAlert>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemAlert));
			sb.append("</ebl:ItemAlert>");
		}
		if(ItemCost != null) {
			sb.append("<ebl:ItemCost>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemCost));
			sb.append("</ebl:ItemCost>");
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
		    this.ItemNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemQty", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemQty = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemQtyDelta", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemQtyDelta = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemAlert", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemAlert = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemCost", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemCost = childNode.getTextContent();
		}
	
	}
 
}