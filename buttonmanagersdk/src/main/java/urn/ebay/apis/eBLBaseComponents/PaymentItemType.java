package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.InvoiceItemType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.OptionType;
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
 * PaymentItemType Information about a Payment Item. 
 */
public class PaymentItemType{


	/**
	 * eBay Auction Transaction ID of the Item Optional Character
	 * length and limitations: 255 single-byte characters 	 
	 */ 
	private String ebayItemTxnId;

	/**
	 * Item name set by you or entered by the customer. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String name;

	/**
	 * Item number set by you. Character length and limitations:
	 * 127 single-byte alphanumeric characters	 
	 */ 
	private String number;

	/**
	 * Quantity set by you or entered by the customer. Character
	 * length and limitations: no limit	 
	 */ 
	private String quantity;

	/**
	 * Amount of tax charged on payment 	 
	 */ 
	private String salesTax;

	/**
	 * Amount of shipping charged on payment 	 
	 */ 
	private String shippingAmount;

	/**
	 * Amount of handling charged on payment 	 
	 */ 
	private String handlingAmount;

	/**
	 * Invoice item details 	 
	 */ 
	private InvoiceItemType invoiceItemDetails;

	/**
	 * Coupon ID Number 	 
	 */ 
	private String couponID;

	/**
	 * Amount Value of The Coupon 	 
	 */ 
	private String couponAmount;

	/**
	 * Currency of the Coupon Amount 	 
	 */ 
	private String couponAmountCurrency;

	/**
	 * Amount of Discount on this Loyalty Card	 
	 */ 
	private String loyaltyCardDiscountAmount;

	/**
	 * Currency of the Discount	 
	 */ 
	private String loyaltyCardDiscountCurrency;

	/**
	 * Cost of item 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Item options selected in PayPal shopping cart 	 
	 */ 
	private List<OptionType> options = new ArrayList<OptionType>();

	

	/**
	 * Default Constructor
	 */
	public PaymentItemType (){
	}	

	/**
	 * Getter for ebayItemTxnId
	 */
	 public String getEbayItemTxnId() {
	 	return ebayItemTxnId;
	 }
	 
	/**
	 * Setter for ebayItemTxnId
	 */
	 public void setEbayItemTxnId(String ebayItemTxnId) {
	 	this.ebayItemTxnId = ebayItemTxnId;
	 }
	 
	/**
	 * Getter for name
	 */
	 public String getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(String name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for number
	 */
	 public String getNumber() {
	 	return number;
	 }
	 
	/**
	 * Setter for number
	 */
	 public void setNumber(String number) {
	 	this.number = number;
	 }
	 
	/**
	 * Getter for quantity
	 */
	 public String getQuantity() {
	 	return quantity;
	 }
	 
	/**
	 * Setter for quantity
	 */
	 public void setQuantity(String quantity) {
	 	this.quantity = quantity;
	 }
	 
	/**
	 * Getter for salesTax
	 */
	 public String getSalesTax() {
	 	return salesTax;
	 }
	 
	/**
	 * Setter for salesTax
	 */
	 public void setSalesTax(String salesTax) {
	 	this.salesTax = salesTax;
	 }
	 
	/**
	 * Getter for shippingAmount
	 */
	 public String getShippingAmount() {
	 	return shippingAmount;
	 }
	 
	/**
	 * Setter for shippingAmount
	 */
	 public void setShippingAmount(String shippingAmount) {
	 	this.shippingAmount = shippingAmount;
	 }
	 
	/**
	 * Getter for handlingAmount
	 */
	 public String getHandlingAmount() {
	 	return handlingAmount;
	 }
	 
	/**
	 * Setter for handlingAmount
	 */
	 public void setHandlingAmount(String handlingAmount) {
	 	this.handlingAmount = handlingAmount;
	 }
	 
	/**
	 * Getter for invoiceItemDetails
	 */
	 public InvoiceItemType getInvoiceItemDetails() {
	 	return invoiceItemDetails;
	 }
	 
	/**
	 * Setter for invoiceItemDetails
	 */
	 public void setInvoiceItemDetails(InvoiceItemType invoiceItemDetails) {
	 	this.invoiceItemDetails = invoiceItemDetails;
	 }
	 
	/**
	 * Getter for couponID
	 */
	 public String getCouponID() {
	 	return couponID;
	 }
	 
	/**
	 * Setter for couponID
	 */
	 public void setCouponID(String couponID) {
	 	this.couponID = couponID;
	 }
	 
	/**
	 * Getter for couponAmount
	 */
	 public String getCouponAmount() {
	 	return couponAmount;
	 }
	 
	/**
	 * Setter for couponAmount
	 */
	 public void setCouponAmount(String couponAmount) {
	 	this.couponAmount = couponAmount;
	 }
	 
	/**
	 * Getter for couponAmountCurrency
	 */
	 public String getCouponAmountCurrency() {
	 	return couponAmountCurrency;
	 }
	 
	/**
	 * Setter for couponAmountCurrency
	 */
	 public void setCouponAmountCurrency(String couponAmountCurrency) {
	 	this.couponAmountCurrency = couponAmountCurrency;
	 }
	 
	/**
	 * Getter for loyaltyCardDiscountAmount
	 */
	 public String getLoyaltyCardDiscountAmount() {
	 	return loyaltyCardDiscountAmount;
	 }
	 
	/**
	 * Setter for loyaltyCardDiscountAmount
	 */
	 public void setLoyaltyCardDiscountAmount(String loyaltyCardDiscountAmount) {
	 	this.loyaltyCardDiscountAmount = loyaltyCardDiscountAmount;
	 }
	 
	/**
	 * Getter for loyaltyCardDiscountCurrency
	 */
	 public String getLoyaltyCardDiscountCurrency() {
	 	return loyaltyCardDiscountCurrency;
	 }
	 
	/**
	 * Setter for loyaltyCardDiscountCurrency
	 */
	 public void setLoyaltyCardDiscountCurrency(String loyaltyCardDiscountCurrency) {
	 	this.loyaltyCardDiscountCurrency = loyaltyCardDiscountCurrency;
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
	 * Getter for options
	 */
	 public List<OptionType> getOptions() {
	 	return options;
	 }
	 
	/**
	 * Setter for options
	 */
	 public void setOptions(List<OptionType> options) {
	 	this.options = options;
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
	
	public PaymentItemType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("EbayItemTxnId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ebayItemTxnId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Name", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Number", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.number = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Quantity", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.quantity = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SalesTax", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.salesTax = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShippingAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shippingAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("HandlingAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.handlingAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceItemDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.invoiceItemDetails =  new InvoiceItemType(childNode);
		}
		childNode = (Node) xpath.evaluate("CouponID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.couponID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CouponAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.couponAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CouponAmountCurrency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.couponAmountCurrency = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LoyaltyCardDiscountAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.loyaltyCardDiscountAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LoyaltyCardDiscountCurrency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.loyaltyCardDiscountCurrency = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.amount =  new BasicAmountType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("Options", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.options.add(new OptionType(subNode));
			}
		}
	}
 
}