package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentItemType;
import urn.ebay.apis.eBLBaseComponents.SubscriptionInfoType;
import urn.ebay.apis.eBLBaseComponents.AuctionInfoType;
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
 * PaymentItemInfoType Information about a PayPal item. 
 */
public class PaymentItemInfoType{


	/**
	 * Invoice number you set in the original transaction.
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String invoiceID;

	/**
	 * Custom field you set in the original transaction. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String custom;

	/**
	 * Memo entered by your customer in PayPal Website Payments
	 * note field. Character length and limitations: 255
	 * single-byte alphanumeric characters	 
	 */ 
	private String memo;

	/**
	 * Amount of tax charged on transaction	 
	 */ 
	private String salesTax;

	/**
	 * Details about the indivudal purchased item	 
	 */ 
	private List<PaymentItemType> paymentItem = new ArrayList<PaymentItemType>();

	/**
	 * Information about the transaction if it was created via
	 * PayPal Subcriptions	 
	 */ 
	private SubscriptionInfoType subscription;

	/**
	 * Information about the transaction if it was created via an
	 * auction	 
	 */ 
	private AuctionInfoType auction;

	

	/**
	 * Default Constructor
	 */
	public PaymentItemInfoType (){
	}	

	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for custom
	 */
	 public String getCustom() {
	 	return custom;
	 }
	 
	/**
	 * Setter for custom
	 */
	 public void setCustom(String custom) {
	 	this.custom = custom;
	 }
	 
	/**
	 * Getter for memo
	 */
	 public String getMemo() {
	 	return memo;
	 }
	 
	/**
	 * Setter for memo
	 */
	 public void setMemo(String memo) {
	 	this.memo = memo;
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
	 * Getter for paymentItem
	 */
	 public List<PaymentItemType> getPaymentItem() {
	 	return paymentItem;
	 }
	 
	/**
	 * Setter for paymentItem
	 */
	 public void setPaymentItem(List<PaymentItemType> paymentItem) {
	 	this.paymentItem = paymentItem;
	 }
	 
	/**
	 * Getter for subscription
	 */
	 public SubscriptionInfoType getSubscription() {
	 	return subscription;
	 }
	 
	/**
	 * Setter for subscription
	 */
	 public void setSubscription(SubscriptionInfoType subscription) {
	 	this.subscription = subscription;
	 }
	 
	/**
	 * Getter for auction
	 */
	 public AuctionInfoType getAuction() {
	 	return auction;
	 }
	 
	/**
	 * Setter for auction
	 */
	 public void setAuction(AuctionInfoType auction) {
	 	this.auction = auction;
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
	
	public PaymentItemInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.invoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Memo", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.memo = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SalesTax", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.salesTax = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("PaymentItem", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.paymentItem.add(new PaymentItemType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("Subscription", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.subscription =  new SubscriptionInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Auction", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.auction =  new AuctionInfoType(childNode);
		}
	}
 
}