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


	/**
	 * Unit of meausre for billing cycle 	  
	 *@Required	 
	 */ 
	private BillingPeriodType BillingPeriod;

	/**
	 * Number of BillingPeriod that make up one billing cycle 	  
	 *@Required	 
	 */ 
	private Integer BillingFrequency;

	/**
	 * Total billing cycles in this portion of the schedule 	 
	 */ 
	private Integer TotalBillingCycles;

	/**
	 * Amount to charge 	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Additional shipping amount to charge 	 
	 */ 
	private BasicAmountType ShippingAmount;

	/**
	 * Additional tax amount to charge 	 
	 */ 
	private BasicAmountType TaxAmount;

	

	/**
	 * Constructor with arguments
	 */
	public BillingPeriodDetailsType (BillingPeriodType BillingPeriod, Integer BillingFrequency, BasicAmountType Amount){
		this.BillingPeriod = BillingPeriod;
		this.BillingFrequency = BillingFrequency;
		this.Amount = Amount;
	}	

	/**
	 * Default Constructor
	 */
	public BillingPeriodDetailsType (){
	}	

	/**
	 * Getter for BillingPeriod
	 */
	 public BillingPeriodType getBillingPeriod() {
	 	return BillingPeriod;
	 }
	 
	/**
	 * Setter for BillingPeriod
	 */
	 public void setBillingPeriod(BillingPeriodType BillingPeriod) {
	 	this.BillingPeriod = BillingPeriod;
	 }
	 
	/**
	 * Getter for BillingFrequency
	 */
	 public Integer getBillingFrequency() {
	 	return BillingFrequency;
	 }
	 
	/**
	 * Setter for BillingFrequency
	 */
	 public void setBillingFrequency(Integer BillingFrequency) {
	 	this.BillingFrequency = BillingFrequency;
	 }
	 
	/**
	 * Getter for TotalBillingCycles
	 */
	 public Integer getTotalBillingCycles() {
	 	return TotalBillingCycles;
	 }
	 
	/**
	 * Setter for TotalBillingCycles
	 */
	 public void setTotalBillingCycles(Integer TotalBillingCycles) {
	 	this.TotalBillingCycles = TotalBillingCycles;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for ShippingAmount
	 */
	 public BasicAmountType getShippingAmount() {
	 	return ShippingAmount;
	 }
	 
	/**
	 * Setter for ShippingAmount
	 */
	 public void setShippingAmount(BasicAmountType ShippingAmount) {
	 	this.ShippingAmount = ShippingAmount;
	 }
	 
	/**
	 * Getter for TaxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return TaxAmount;
	 }
	 
	/**
	 * Setter for TaxAmount
	 */
	 public void setTaxAmount(BasicAmountType TaxAmount) {
	 	this.TaxAmount = TaxAmount;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BillingPeriod != null) {
			sb.append("<ebl:BillingPeriod>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingPeriod.getValue()));
			sb.append("</ebl:BillingPeriod>");
		}
		if(BillingFrequency != null) {
			sb.append("<ebl:BillingFrequency>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingFrequency));
			sb.append("</ebl:BillingFrequency>");
		}
		if(TotalBillingCycles != null) {
			sb.append("<ebl:TotalBillingCycles>").append(SDKUtil.escapeInvalidXmlCharsRegex(TotalBillingCycles));
			sb.append("</ebl:TotalBillingCycles>");
		}
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(ShippingAmount != null) {
			sb.append("<ebl:ShippingAmount");
			sb.append(ShippingAmount.toXMLString());
			sb.append("</ebl:ShippingAmount>");
		}
		if(TaxAmount != null) {
			sb.append("<ebl:TaxAmount");
			sb.append(TaxAmount.toXMLString());
			sb.append("</ebl:TaxAmount>");
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
		    this.BillingPeriod = BillingPeriodType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("BillingFrequency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.BillingFrequency = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("TotalBillingCycles", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.TotalBillingCycles = Integer.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ShippingAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("TaxAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TaxAmount =  new BasicAmountType(childNode);
		}
	}
 
}