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
	private String InvoiceID;

	/**
	 * Custom field you set in the original transaction. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Custom;

	/**
	 * Memo entered by your customer in PayPal Website Payments
	 * note field. Character length and limitations: 255
	 * single-byte alphanumeric characters	 
	 */ 
	private String Memo;

	/**
	 * Amount of tax charged on transaction	 
	 */ 
	private String SalesTax;

	/**
	 * Details about the indivudal purchased item	 
	 */ 
	private List<PaymentItemType> PaymentItem = new ArrayList<PaymentItemType>();

	/**
	 * Information about the transaction if it was created via
	 * PayPal Subcriptions	 
	 */ 
	private SubscriptionInfoType Subscription;

	/**
	 * Information about the transaction if it was created via an
	 * auction	 
	 */ 
	private AuctionInfoType Auction;

	

	/**
	 * Default Constructor
	 */
	public PaymentItemInfoType (){
	}	

	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for Custom
	 */
	 public String getCustom() {
	 	return Custom;
	 }
	 
	/**
	 * Setter for Custom
	 */
	 public void setCustom(String Custom) {
	 	this.Custom = Custom;
	 }
	 
	/**
	 * Getter for Memo
	 */
	 public String getMemo() {
	 	return Memo;
	 }
	 
	/**
	 * Setter for Memo
	 */
	 public void setMemo(String Memo) {
	 	this.Memo = Memo;
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
	 * Getter for PaymentItem
	 */
	 public List<PaymentItemType> getPaymentItem() {
	 	return PaymentItem;
	 }
	 
	/**
	 * Setter for PaymentItem
	 */
	 public void setPaymentItem(List<PaymentItemType> PaymentItem) {
	 	this.PaymentItem = PaymentItem;
	 }
	 
	/**
	 * Getter for Subscription
	 */
	 public SubscriptionInfoType getSubscription() {
	 	return Subscription;
	 }
	 
	/**
	 * Setter for Subscription
	 */
	 public void setSubscription(SubscriptionInfoType Subscription) {
	 	this.Subscription = Subscription;
	 }
	 
	/**
	 * Getter for Auction
	 */
	 public AuctionInfoType getAuction() {
	 	return Auction;
	 }
	 
	/**
	 * Setter for Auction
	 */
	 public void setAuction(AuctionInfoType Auction) {
	 	this.Auction = Auction;
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
		    this.InvoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Memo", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Memo = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SalesTax", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SalesTax = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("PaymentItem", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.PaymentItem.add(new PaymentItemType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("Subscription", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Subscription =  new SubscriptionInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Auction", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Auction =  new AuctionInfoType(childNode);
		}
	}
 
}