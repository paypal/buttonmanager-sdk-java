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
	private String timestamp;

	/**
	 * The time zone of the transaction 	 
	 */ 
	private String timezone;

	/**
	 * The type of the transaction	 
	 */ 
	private String type;

	/**
	 * The email address of the payer	 
	 */ 
	private String payer;

	/**
	 * Display name of the payer	 
	 */ 
	private String payerDisplayName;

	/**
	 * The transaction ID of the seller	 
	 */ 
	private String transactionID;

	/**
	 * The status of the transaction	 
	 */ 
	private String status;

	/**
	 * The total gross amount charged, including any profile
	 * shipping cost and taxes	 
	 */ 
	private BasicAmountType grossAmount;

	/**
	 * The fee that PayPal charged for the transaction 	 
	 */ 
	private BasicAmountType feeAmount;

	/**
	 * The net amount of the transaction 	 
	 */ 
	private BasicAmountType netAmount;

	

	/**
	 * Default Constructor
	 */
	public PaymentTransactionSearchResultType (){
	}	

	/**
	 * Getter for timestamp
	 */
	 public String getTimestamp() {
	 	return timestamp;
	 }
	 
	/**
	 * Setter for timestamp
	 */
	 public void setTimestamp(String timestamp) {
	 	this.timestamp = timestamp;
	 }
	 
	/**
	 * Getter for timezone
	 */
	 public String getTimezone() {
	 	return timezone;
	 }
	 
	/**
	 * Setter for timezone
	 */
	 public void setTimezone(String timezone) {
	 	this.timezone = timezone;
	 }
	 
	/**
	 * Getter for type
	 */
	 public String getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(String type) {
	 	this.type = type;
	 }
	 
	/**
	 * Getter for payer
	 */
	 public String getPayer() {
	 	return payer;
	 }
	 
	/**
	 * Setter for payer
	 */
	 public void setPayer(String payer) {
	 	this.payer = payer;
	 }
	 
	/**
	 * Getter for payerDisplayName
	 */
	 public String getPayerDisplayName() {
	 	return payerDisplayName;
	 }
	 
	/**
	 * Setter for payerDisplayName
	 */
	 public void setPayerDisplayName(String payerDisplayName) {
	 	this.payerDisplayName = payerDisplayName;
	 }
	 
	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
	 }
	 
	/**
	 * Getter for status
	 */
	 public String getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(String status) {
	 	this.status = status;
	 }
	 
	/**
	 * Getter for grossAmount
	 */
	 public BasicAmountType getGrossAmount() {
	 	return grossAmount;
	 }
	 
	/**
	 * Setter for grossAmount
	 */
	 public void setGrossAmount(BasicAmountType grossAmount) {
	 	this.grossAmount = grossAmount;
	 }
	 
	/**
	 * Getter for feeAmount
	 */
	 public BasicAmountType getFeeAmount() {
	 	return feeAmount;
	 }
	 
	/**
	 * Setter for feeAmount
	 */
	 public void setFeeAmount(BasicAmountType feeAmount) {
	 	this.feeAmount = feeAmount;
	 }
	 
	/**
	 * Getter for netAmount
	 */
	 public BasicAmountType getNetAmount() {
	 	return netAmount;
	 }
	 
	/**
	 * Setter for netAmount
	 */
	 public void setNetAmount(BasicAmountType netAmount) {
	 	this.netAmount = netAmount;
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
		    this.timestamp = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Timezone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.timezone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Type", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.type = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Payer", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payer = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerDisplayName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerDisplayName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.transactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Status", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.status = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GrossAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.grossAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FeeAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.feeAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("NetAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.netAmount =  new BasicAmountType(childNode);
		}
	}
 
}