package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;
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
 * Unit of meausre for billing cycle 
 */
public class BillingPeriodDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Unit of meausre for billing cycle 	  
	 *@Required	 
	 */ 
	private BillingPeriodType billingPeriod;

	/**
	 * Number of BillingPeriod that make up one billing cycle 	  
	 *@Required	 
	 */ 
	private Integer billingFrequency;

	/**
	 * Total billing cycles in this portion of the schedule 	 
	 */ 
	private Integer totalBillingCycles;

	/**
	 * Amount to charge 	  
	 *@Required	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Additional shipping amount to charge 	 
	 */ 
	private BasicAmountType shippingAmount;

	/**
	 * Additional tax amount to charge 	 
	 */ 
	private BasicAmountType taxAmount;

	

	/**
	 * Constructor with arguments
	 */
	public BillingPeriodDetailsType (BillingPeriodType billingPeriod, Integer billingFrequency, BasicAmountType amount){
		this.billingPeriod = billingPeriod;
		this.billingFrequency = billingFrequency;
		this.amount = amount;
	}	

	/**
	 * Default Constructor
	 */
	public BillingPeriodDetailsType (){
	}	

	/**
	 * Getter for billingPeriod
	 */
	 public BillingPeriodType getBillingPeriod() {
	 	return billingPeriod;
	 }
	 
	/**
	 * Setter for billingPeriod
	 */
	 public void setBillingPeriod(BillingPeriodType billingPeriod) {
	 	this.billingPeriod = billingPeriod;
	 }
	 
	/**
	 * Getter for billingFrequency
	 */
	 public Integer getBillingFrequency() {
	 	return billingFrequency;
	 }
	 
	/**
	 * Setter for billingFrequency
	 */
	 public void setBillingFrequency(Integer billingFrequency) {
	 	this.billingFrequency = billingFrequency;
	 }
	 
	/**
	 * Getter for totalBillingCycles
	 */
	 public Integer getTotalBillingCycles() {
	 	return totalBillingCycles;
	 }
	 
	/**
	 * Setter for totalBillingCycles
	 */
	 public void setTotalBillingCycles(Integer totalBillingCycles) {
	 	this.totalBillingCycles = totalBillingCycles;
	 }
	 
	/**
	 * Getter for amount
	 */
	 public BasicAmountType getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(BasicAmountType amount) {
	 	this.amount = amount;
	 }
	 
	/**
	 * Getter for shippingAmount
	 */
	 public BasicAmountType getShippingAmount() {
	 	return shippingAmount;
	 }
	 
	/**
	 * Setter for shippingAmount
	 */
	 public void setShippingAmount(BasicAmountType shippingAmount) {
	 	this.shippingAmount = shippingAmount;
	 }
	 
	/**
	 * Getter for taxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return taxAmount;
	 }
	 
	/**
	 * Setter for taxAmount
	 */
	 public void setTaxAmount(BasicAmountType taxAmount) {
	 	this.taxAmount = taxAmount;
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
		if(billingPeriod != null) {
			sb.append("<").append(preferredPrefix).append(":BillingPeriod>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingPeriod.getValue()));
			sb.append("</").append(preferredPrefix).append(":BillingPeriod>");
		}
		if(billingFrequency != null) {
			sb.append("<").append(preferredPrefix).append(":BillingFrequency>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingFrequency));
			sb.append("</").append(preferredPrefix).append(":BillingFrequency>");
		}
		if(totalBillingCycles != null) {
			sb.append("<").append(preferredPrefix).append(":TotalBillingCycles>").append(SDKUtil.escapeInvalidXmlCharsRegex(totalBillingCycles));
			sb.append("</").append(preferredPrefix).append(":TotalBillingCycles>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(shippingAmount != null) {
			sb.append(shippingAmount.toXMLString(preferredPrefix,"ShippingAmount"));
		}
		if(taxAmount != null) {
			sb.append(taxAmount.toXMLString(preferredPrefix,"TaxAmount"));
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
	
	public BillingPeriodDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("BillingPeriod", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingPeriod = BillingPeriodType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("BillingFrequency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.billingFrequency = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("TotalBillingCycles", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.totalBillingCycles = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ShippingAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shippingAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("TaxAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.taxAmount =  new BasicAmountType(childNode);
		}
	}
 
}