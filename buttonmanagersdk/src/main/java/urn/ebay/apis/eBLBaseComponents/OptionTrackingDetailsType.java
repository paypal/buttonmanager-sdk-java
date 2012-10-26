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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Option Number. Optional 	 
	 */ 
	private String optionNumber;

	/**
	 * Option Quantity. Optional 	 
	 */ 
	private String optionQty;

	/**
	 * Option Select Name. Optional 	 
	 */ 
	private String optionSelect;

	/**
	 * Option Quantity Delta. Optional 	 
	 */ 
	private String optionQtyDelta;

	/**
	 * Option Alert. Optional 	 
	 */ 
	private String optionAlert;

	/**
	 * Option Cost. Optional 	 
	 */ 
	private String optionCost;

	

	/**
	 * Default Constructor
	 */
	public OptionTrackingDetailsType (){
	}	

	/**
	 * Getter for optionNumber
	 */
	 public String getOptionNumber() {
	 	return optionNumber;
	 }
	 
	/**
	 * Setter for optionNumber
	 */
	 public void setOptionNumber(String optionNumber) {
	 	this.optionNumber = optionNumber;
	 }
	 
	/**
	 * Getter for optionQty
	 */
	 public String getOptionQty() {
	 	return optionQty;
	 }
	 
	/**
	 * Setter for optionQty
	 */
	 public void setOptionQty(String optionQty) {
	 	this.optionQty = optionQty;
	 }
	 
	/**
	 * Getter for optionSelect
	 */
	 public String getOptionSelect() {
	 	return optionSelect;
	 }
	 
	/**
	 * Setter for optionSelect
	 */
	 public void setOptionSelect(String optionSelect) {
	 	this.optionSelect = optionSelect;
	 }
	 
	/**
	 * Getter for optionQtyDelta
	 */
	 public String getOptionQtyDelta() {
	 	return optionQtyDelta;
	 }
	 
	/**
	 * Setter for optionQtyDelta
	 */
	 public void setOptionQtyDelta(String optionQtyDelta) {
	 	this.optionQtyDelta = optionQtyDelta;
	 }
	 
	/**
	 * Getter for optionAlert
	 */
	 public String getOptionAlert() {
	 	return optionAlert;
	 }
	 
	/**
	 * Setter for optionAlert
	 */
	 public void setOptionAlert(String optionAlert) {
	 	this.optionAlert = optionAlert;
	 }
	 
	/**
	 * Getter for optionCost
	 */
	 public String getOptionCost() {
	 	return optionCost;
	 }
	 
	/**
	 * Setter for optionCost
	 */
	 public void setOptionCost(String optionCost) {
	 	this.optionCost = optionCost;
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
		if(optionNumber != null) {
			sb.append("<").append(preferredPrefix).append(":OptionNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionNumber));
			sb.append("</").append(preferredPrefix).append(":OptionNumber>");
		}
		if(optionQty != null) {
			sb.append("<").append(preferredPrefix).append(":OptionQty>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionQty));
			sb.append("</").append(preferredPrefix).append(":OptionQty>");
		}
		if(optionSelect != null) {
			sb.append("<").append(preferredPrefix).append(":OptionSelect>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionSelect));
			sb.append("</").append(preferredPrefix).append(":OptionSelect>");
		}
		if(optionQtyDelta != null) {
			sb.append("<").append(preferredPrefix).append(":OptionQtyDelta>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionQtyDelta));
			sb.append("</").append(preferredPrefix).append(":OptionQtyDelta>");
		}
		if(optionAlert != null) {
			sb.append("<").append(preferredPrefix).append(":OptionAlert>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionAlert));
			sb.append("</").append(preferredPrefix).append(":OptionAlert>");
		}
		if(optionCost != null) {
			sb.append("<").append(preferredPrefix).append(":OptionCost>").append(SDKUtil.escapeInvalidXmlCharsRegex(optionCost));
			sb.append("</").append(preferredPrefix).append(":OptionCost>");
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
	
	public OptionTrackingDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("OptionNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionQty", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionQty = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionSelect", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionSelect = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionQtyDelta", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionQtyDelta = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionAlert", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionAlert = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("OptionCost", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.optionCost = childNode.getTextContent();
		}
	
	}
 
}