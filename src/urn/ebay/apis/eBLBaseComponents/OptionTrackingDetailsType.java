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
 * Option Number. Optional 
 */
public class OptionTrackingDetailsType{


	/**
	 * Option Number. Optional 	 
	 */ 
	private String OptionNumber;

	/**
	 * Option Quantity. Optional 	 
	 */ 
	private String OptionQty;

	/**
	 * Option Select Name. Optional 	 
	 */ 
	private String OptionSelect;

	/**
	 * Option Quantity Delta. Optional 	 
	 */ 
	private String OptionQtyDelta;

	/**
	 * Option Alert. Optional 	 
	 */ 
	private String OptionAlert;

	/**
	 * Option Cost. Optional 	 
	 */ 
	private String OptionCost;

	

	/**
	 * Default Constructor
	 */
	public OptionTrackingDetailsType (){
	}	

	/**
	 * Getter for OptionNumber
	 */
	 public String getOptionNumber() {
	 	return OptionNumber;
	 }
	 
	/**
	 * Setter for OptionNumber
	 */
	 public void setOptionNumber(String OptionNumber) {
	 	this.OptionNumber = OptionNumber;
	 }
	 
	/**
	 * Getter for OptionQty
	 */
	 public String getOptionQty() {
	 	return OptionQty;
	 }
	 
	/**
	 * Setter for OptionQty
	 */
	 public void setOptionQty(String OptionQty) {
	 	this.OptionQty = OptionQty;
	 }
	 
	/**
	 * Getter for OptionSelect
	 */
	 public String getOptionSelect() {
	 	return OptionSelect;
	 }
	 
	/**
	 * Setter for OptionSelect
	 */
	 public void setOptionSelect(String OptionSelect) {
	 	this.OptionSelect = OptionSelect;
	 }
	 
	/**
	 * Getter for OptionQtyDelta
	 */
	 public String getOptionQtyDelta() {
	 	return OptionQtyDelta;
	 }
	 
	/**
	 * Setter for OptionQtyDelta
	 */
	 public void setOptionQtyDelta(String OptionQtyDelta) {
	 	this.OptionQtyDelta = OptionQtyDelta;
	 }
	 
	/**
	 * Getter for OptionAlert
	 */
	 public String getOptionAlert() {
	 	return OptionAlert;
	 }
	 
	/**
	 * Setter for OptionAlert
	 */
	 public void setOptionAlert(String OptionAlert) {
	 	this.OptionAlert = OptionAlert;
	 }
	 
	/**
	 * Getter for OptionCost
	 */
	 public String getOptionCost() {
	 	return OptionCost;
	 }
	 
	/**
	 * Setter for OptionCost
	 */
	 public void setOptionCost(String OptionCost) {
	 	this.OptionCost = OptionCost;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OptionNumber != null) {
			sb.append("<ebl:OptionNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionNumber));
			sb.append("</ebl:OptionNumber>");
		}
		if(OptionQty != null) {
			sb.append("<ebl:OptionQty>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionQty));
			sb.append("</ebl:OptionQty>");
		}
		if(OptionSelect != null) {
			sb.append("<ebl:OptionSelect>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionSelect));
			sb.append("</ebl:OptionSelect>");
		}
		if(OptionQtyDelta != null) {
			sb.append("<ebl:OptionQtyDelta>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionQtyDelta));
			sb.append("</ebl:OptionQtyDelta>");
		}
		if(OptionAlert != null) {
			sb.append("<ebl:OptionAlert>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionAlert));
			sb.append("</ebl:OptionAlert>");
		}
		if(OptionCost != null) {
			sb.append("<ebl:OptionCost>").append(SDKUtil.escapeInvalidXmlCharsRegex(OptionCost));
			sb.append("</ebl:OptionCost>");
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
	
	public OptionTrackingDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OptionNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionQty", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionQty = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionSelect", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionSelect = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionQtyDelta", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionQtyDelta = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionAlert", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionAlert = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionCost", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OptionCost = childNode.getTextContent();
		}
	
	}
 
}