package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
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
 * PaymentTransactionSearchResultType Results from a
 * PaymentTransaction search 
 */
public class PaymentTransactionSearchResultType{


	/**
	 * The date and time (in UTC/GMT format) the transaction
	 * occurred	 
	 */ 
	private String Timestamp;

	/**
	 * The time zone of the transaction 	 
	 */ 
	private String Timezone;

	/**
	 * The type of the transaction	 
	 */ 
	private String Type;

	/**
	 * The email address of the payer	 
	 */ 
	private String Payer;

	/**
	 * Display name of the payer	 
	 */ 
	private String PayerDisplayName;

	/**
	 * The transaction ID of the seller	 
	 */ 
	private String TransactionID;

	/**
	 * The status of the transaction	 
	 */ 
	private String Status;

	/**
	 * The total gross amount charged, including any profile
	 * shipping cost and taxes	 
	 */ 
	private BasicAmountType GrossAmount;

	/**
	 * The fee that PayPal charged for the transaction 	 
	 */ 
	private BasicAmountType FeeAmount;

	/**
	 * The net amount of the transaction 	 
	 */ 
	private BasicAmountType NetAmount;

	

	/**
	 * Default Constructor
	 */
	public PaymentTransactionSearchResultType (){
	}	

	/**
	 * Getter for Timestamp
	 */
	 public String getTimestamp() {
	 	return Timestamp;
	 }
	 
	/**
	 * Setter for Timestamp
	 */
	 public void setTimestamp(String Timestamp) {
	 	this.Timestamp = Timestamp;
	 }
	 
	/**
	 * Getter for Timezone
	 */
	 public String getTimezone() {
	 	return Timezone;
	 }
	 
	/**
	 * Setter for Timezone
	 */
	 public void setTimezone(String Timezone) {
	 	this.Timezone = Timezone;
	 }
	 
	/**
	 * Getter for Type
	 */
	 public String getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(String Type) {
	 	this.Type = Type;
	 }
	 
	/**
	 * Getter for Payer
	 */
	 public String getPayer() {
	 	return Payer;
	 }
	 
	/**
	 * Setter for Payer
	 */
	 public void setPayer(String Payer) {
	 	this.Payer = Payer;
	 }
	 
	/**
	 * Getter for PayerDisplayName
	 */
	 public String getPayerDisplayName() {
	 	return PayerDisplayName;
	 }
	 
	/**
	 * Setter for PayerDisplayName
	 */
	 public void setPayerDisplayName(String PayerDisplayName) {
	 	this.PayerDisplayName = PayerDisplayName;
	 }
	 
	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
	 }
	 
	/**
	 * Getter for Status
	 */
	 public String getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(String Status) {
	 	this.Status = Status;
	 }
	 
	/**
	 * Getter for GrossAmount
	 */
	 public BasicAmountType getGrossAmount() {
	 	return GrossAmount;
	 }
	 
	/**
	 * Setter for GrossAmount
	 */
	 public void setGrossAmount(BasicAmountType GrossAmount) {
	 	this.GrossAmount = GrossAmount;
	 }
	 
	/**
	 * Getter for FeeAmount
	 */
	 public BasicAmountType getFeeAmount() {
	 	return FeeAmount;
	 }
	 
	/**
	 * Setter for FeeAmount
	 */
	 public void setFeeAmount(BasicAmountType FeeAmount) {
	 	this.FeeAmount = FeeAmount;
	 }
	 
	/**
	 * Getter for NetAmount
	 */
	 public BasicAmountType getNetAmount() {
	 	return NetAmount;
	 }
	 
	/**
	 * Setter for NetAmount
	 */
	 public void setNetAmount(BasicAmountType NetAmount) {
	 	this.NetAmount = NetAmount;
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
	
	public PaymentTransactionSearchResultType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Timestamp", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Timestamp = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Timezone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Timezone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Type", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Type = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Payer", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Payer = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerDisplayName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerDisplayName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Status = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GrossAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GrossAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FeeAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FeeAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("NetAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.NetAmount =  new BasicAmountType(childNode);
		}
	}
 
}