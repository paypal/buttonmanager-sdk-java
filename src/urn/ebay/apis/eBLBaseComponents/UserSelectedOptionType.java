package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
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
 * Information on user selected options 
 */
public class UserSelectedOptionType{


	/**
	 * 	 
	 */ 
	private String ShippingCalculationMode;

	/**
	 * 	 
	 */ 
	private String InsuranceOptionSelected;

	/**
	 * 	 
	 */ 
	private String ShippingOptionIsDefault;

	/**
	 * 	 
	 */ 
	private BasicAmountType ShippingOptionAmount;

	/**
	 * 	 
	 */ 
	private String ShippingOptionName;

	

	/**
	 * Default Constructor
	 */
	public UserSelectedOptionType (){
	}	

	/**
	 * Getter for ShippingCalculationMode
	 */
	 public String getShippingCalculationMode() {
	 	return ShippingCalculationMode;
	 }
	 
	/**
	 * Setter for ShippingCalculationMode
	 */
	 public void setShippingCalculationMode(String ShippingCalculationMode) {
	 	this.ShippingCalculationMode = ShippingCalculationMode;
	 }
	 
	/**
	 * Getter for InsuranceOptionSelected
	 */
	 public String getInsuranceOptionSelected() {
	 	return InsuranceOptionSelected;
	 }
	 
	/**
	 * Setter for InsuranceOptionSelected
	 */
	 public void setInsuranceOptionSelected(String InsuranceOptionSelected) {
	 	this.InsuranceOptionSelected = InsuranceOptionSelected;
	 }
	 
	/**
	 * Getter for ShippingOptionIsDefault
	 */
	 public String getShippingOptionIsDefault() {
	 	return ShippingOptionIsDefault;
	 }
	 
	/**
	 * Setter for ShippingOptionIsDefault
	 */
	 public void setShippingOptionIsDefault(String ShippingOptionIsDefault) {
	 	this.ShippingOptionIsDefault = ShippingOptionIsDefault;
	 }
	 
	/**
	 * Getter for ShippingOptionAmount
	 */
	 public BasicAmountType getShippingOptionAmount() {
	 	return ShippingOptionAmount;
	 }
	 
	/**
	 * Setter for ShippingOptionAmount
	 */
	 public void setShippingOptionAmount(BasicAmountType ShippingOptionAmount) {
	 	this.ShippingOptionAmount = ShippingOptionAmount;
	 }
	 
	/**
	 * Getter for ShippingOptionName
	 */
	 public String getShippingOptionName() {
	 	return ShippingOptionName;
	 }
	 
	/**
	 * Setter for ShippingOptionName
	 */
	 public void setShippingOptionName(String ShippingOptionName) {
	 	this.ShippingOptionName = ShippingOptionName;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ShippingCalculationMode != null) {
			sb.append("<ebl:ShippingCalculationMode>").append(SDKUtil.escapeInvalidXmlCharsRegex(ShippingCalculationMode));
			sb.append("</ebl:ShippingCalculationMode>");
		}
		if(InsuranceOptionSelected != null) {
			sb.append("<ebl:InsuranceOptionSelected>").append(SDKUtil.escapeInvalidXmlCharsRegex(InsuranceOptionSelected));
			sb.append("</ebl:InsuranceOptionSelected>");
		}
		if(ShippingOptionIsDefault != null) {
			sb.append("<ebl:ShippingOptionIsDefault>").append(SDKUtil.escapeInvalidXmlCharsRegex(ShippingOptionIsDefault));
			sb.append("</ebl:ShippingOptionIsDefault>");
		}
		if(ShippingOptionAmount != null) {
			sb.append("<ebl:ShippingOptionAmount");
			sb.append(ShippingOptionAmount.toXMLString());
			sb.append("</ebl:ShippingOptionAmount>");
		}
		if(ShippingOptionName != null) {
			sb.append("<ebl:ShippingOptionName>").append(SDKUtil.escapeInvalidXmlCharsRegex(ShippingOptionName));
			sb.append("</ebl:ShippingOptionName>");
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
	
	public UserSelectedOptionType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ShippingCalculationMode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingCalculationMode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InsuranceOptionSelected", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InsuranceOptionSelected = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShippingOptionIsDefault", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingOptionIsDefault = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShippingOptionAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingOptionAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ShippingOptionName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingOptionName = childNode.getTextContent();
		}
	
	}
 
}