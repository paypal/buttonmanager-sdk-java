package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;
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
 * Installment Period. Optional 
 */
public class InstallmentDetailsType{


	/**
	 * Installment Period. Optional 	 
	 */ 
	private BillingPeriodType BillingPeriod;

	/**
	 * Installment Frequency. Optional 	 
	 */ 
	private Integer BillingFrequency;

	/**
	 * Installment Cycles. Optional 	 
	 */ 
	private Integer TotalBillingCycles;

	/**
	 * Installment Amount. Optional 	 
	 */ 
	private String Amount;

	/**
	 * Installment Amount. Optional 	 
	 */ 
	private String ShippingAmount;

	/**
	 * Installment Amount. Optional 	 
	 */ 
	private String TaxAmount;

	

	/**
	 * Default Constructor
	 */
	public InstallmentDetailsType (){
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
	 public String getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(String Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for ShippingAmount
	 */
	 public String getShippingAmount() {
	 	return ShippingAmount;
	 }
	 
	/**
	 * Setter for ShippingAmount
	 */
	 public void setShippingAmount(String ShippingAmount) {
	 	this.ShippingAmount = ShippingAmount;
	 }
	 
	/**
	 * Getter for TaxAmount
	 */
	 public String getTaxAmount() {
	 	return TaxAmount;
	 }
	 
	/**
	 * Setter for TaxAmount
	 */
	 public void setTaxAmount(String TaxAmount) {
	 	this.TaxAmount = TaxAmount;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BillingPeriod != null) {
			sb.append("<urn:BillingPeriod>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingPeriod.getValue()));
			sb.append("</urn:BillingPeriod>");
		}
		if(BillingFrequency != null) {
			sb.append("<urn:BillingFrequency>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingFrequency));
			sb.append("</urn:BillingFrequency>");
		}
		if(TotalBillingCycles != null) {
			sb.append("<urn:TotalBillingCycles>").append(SDKUtil.escapeInvalidXmlCharsRegex(TotalBillingCycles));
			sb.append("</urn:TotalBillingCycles>");
		}
		if(Amount != null) {
			sb.append("<urn:Amount>").append(SDKUtil.escapeInvalidXmlCharsRegex(Amount));
			sb.append("</urn:Amount>");
		}
		if(ShippingAmount != null) {
			sb.append("<urn:ShippingAmount>").append(SDKUtil.escapeInvalidXmlCharsRegex(ShippingAmount));
			sb.append("</urn:ShippingAmount>");
		}
		if(TaxAmount != null) {
			sb.append("<urn:TaxAmount>").append(SDKUtil.escapeInvalidXmlCharsRegex(TaxAmount));
			sb.append("</urn:TaxAmount>");
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
	
	public InstallmentDetailsType(Node node) throws XPathExpressionException {
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
		    this.Amount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShippingAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TaxAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TaxAmount = childNode.getTextContent();
		}
	
	}
 
}