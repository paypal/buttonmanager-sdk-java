package urn.ebay.apis.eBLBaseComponents;
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
	private String EbayItemTxnId;

	/**
	 * Item name set by you or entered by the customer. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Name;

	/**
	 * Item number set by you. Character length and limitations:
	 * 127 single-byte alphanumeric characters	 
	 */ 
	private String Number;

	/**
	 * Quantity set by you or entered by the customer. Character
	 * length and limitations: no limit	 
	 */ 
	private String Quantity;

	/**
	 * Amount of tax charged on payment 	 
	 */ 
	private String SalesTax;

	/**
	 * Amount of shipping charged on payment 	 
	 */ 
	private String ShippingAmount;

	/**
	 * Amount of handling charged on payment 	 
	 */ 
	private String HandlingAmount;

	/**
	 * Coupon ID Number 	 
	 */ 
	private String CouponID;

	/**
	 * Amount Value of The Coupon 	 
	 */ 
	private String CouponAmount;

	/**
	 * Currency of the Coupon Amount 	 
	 */ 
	private String CouponAmountCurrency;

	/**
	 * Amount of Discount on this Loyalty Card	 
	 */ 
	private String LoyaltyCardDiscountAmount;

	/**
	 * Currency of the Discount	 
	 */ 
	private String LoyaltyCardDiscountCurrency;

	/**
	 * Cost of item 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Item options selected in PayPal shopping cart 	 
	 */ 
	private List<OptionType> Options = new ArrayList<OptionType>();

	

	/**
	 * Default Constructor
	 */
	public PaymentItemType (){
	}	

	/**
	 * Getter for EbayItemTxnId
	 */
	 public String getEbayItemTxnId() {
	 	return EbayItemTxnId;
	 }
	 
	/**
	 * Setter for EbayItemTxnId
	 */
	 public void setEbayItemTxnId(String EbayItemTxnId) {
	 	this.EbayItemTxnId = EbayItemTxnId;
	 }
	 
	/**
	 * Getter for Name
	 */
	 public String getName() {
	 	return Name;
	 }
	 
	/**
	 * Setter for Name
	 */
	 public void setName(String Name) {
	 	this.Name = Name;
	 }
	 
	/**
	 * Getter for Number
	 */
	 public String getNumber() {
	 	return Number;
	 }
	 
	/**
	 * Setter for Number
	 */
	 public void setNumber(String Number) {
	 	this.Number = Number;
	 }
	 
	/**
	 * Getter for Quantity
	 */
	 public String getQuantity() {
	 	return Quantity;
	 }
	 
	/**
	 * Setter for Quantity
	 */
	 public void setQuantity(String Quantity) {
	 	this.Quantity = Quantity;
	 }
	 
	/**
	 * Getter for SalesTax
	 */
	 public String getSalesTax() {
	 	return SalesTax;
	 }
	 
	/**
	 * Setter for SalesTax
	 */
	 public void setSalesTax(String SalesTax) {
	 	this.SalesTax = SalesTax;
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
	 * Getter for HandlingAmount
	 */
	 public String getHandlingAmount() {
	 	return HandlingAmount;
	 }
	 
	/**
	 * Setter for HandlingAmount
	 */
	 public void setHandlingAmount(String HandlingAmount) {
	 	this.HandlingAmount = HandlingAmount;
	 }
	 
	/**
	 * Getter for CouponID
	 */
	 public String getCouponID() {
	 	return CouponID;
	 }
	 
	/**
	 * Setter for CouponID
	 */
	 public void setCouponID(String CouponID) {
	 	this.CouponID = CouponID;
	 }
	 
	/**
	 * Getter for CouponAmount
	 */
	 public String getCouponAmount() {
	 	return CouponAmount;
	 }
	 
	/**
	 * Setter for CouponAmount
	 */
	 public void setCouponAmount(String CouponAmount) {
	 	this.CouponAmount = CouponAmount;
	 }
	 
	/**
	 * Getter for CouponAmountCurrency
	 */
	 public String getCouponAmountCurrency() {
	 	return CouponAmountCurrency;
	 }
	 
	/**
	 * Setter for CouponAmountCurrency
	 */
	 public void setCouponAmountCurrency(String CouponAmountCurrency) {
	 	this.CouponAmountCurrency = CouponAmountCurrency;
	 }
	 
	/**
	 * Getter for LoyaltyCardDiscountAmount
	 */
	 public String getLoyaltyCardDiscountAmount() {
	 	return LoyaltyCardDiscountAmount;
	 }
	 
	/**
	 * Setter for LoyaltyCardDiscountAmount
	 */
	 public void setLoyaltyCardDiscountAmount(String LoyaltyCardDiscountAmount) {
	 	this.LoyaltyCardDiscountAmount = LoyaltyCardDiscountAmount;
	 }
	 
	/**
	 * Getter for LoyaltyCardDiscountCurrency
	 */
	 public String getLoyaltyCardDiscountCurrency() {
	 	return LoyaltyCardDiscountCurrency;
	 }
	 
	/**
	 * Setter for LoyaltyCardDiscountCurrency
	 */
	 public void setLoyaltyCardDiscountCurrency(String LoyaltyCardDiscountCurrency) {
	 	this.LoyaltyCardDiscountCurrency = LoyaltyCardDiscountCurrency;
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
	 * Getter for Options
	 */
	 public List<OptionType> getOptions() {
	 	return Options;
	 }
	 
	/**
	 * Setter for Options
	 */
	 public void setOptions(List<OptionType> Options) {
	 	this.Options = Options;
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
		    this.EbayItemTxnId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Name", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Name = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Number", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Number = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Quantity", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Quantity = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SalesTax", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SalesTax = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShippingAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ShippingAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("HandlingAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.HandlingAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CouponID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CouponID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CouponAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CouponAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CouponAmountCurrency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CouponAmountCurrency = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LoyaltyCardDiscountAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LoyaltyCardDiscountAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("LoyaltyCardDiscountCurrency", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.LoyaltyCardDiscountCurrency = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Amount =  new BasicAmountType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("Options", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.Options.add(new OptionType(subNode));
			}
		}
	}
 
}