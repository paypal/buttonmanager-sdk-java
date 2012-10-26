package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
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
 * 
 */
public class DoReferenceTransactionResponseDetailsType{


	/**
	 * 	 
	 */ 
	private String billingAgreementID;

	/**
	 * 	 
	 */ 
	private PaymentInfoType paymentInfo;

	/**
	 * 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * 	 
	 */ 
	private String aVSCode;

	/**
	 * 	 
	 */ 
	private String cVV2Code;

	/**
	 * 	 
	 */ 
	private String transactionID;

	/**
	 * Response code from the processor when a recurring
	 * transaction is declined 	 
	 */ 
	private String paymentAdviceCode;

	/**
	 * Return msgsubid back to merchant 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionResponseDetailsType (){
	}	

	/**
	 * Getter for billingAgreementID
	 */
	 public String getBillingAgreementID() {
	 	return billingAgreementID;
	 }
	 
	/**
	 * Setter for billingAgreementID
	 */
	 public void setBillingAgreementID(String billingAgreementID) {
	 	this.billingAgreementID = billingAgreementID;
	 }
	 
	/**
	 * Getter for paymentInfo
	 */
	 public PaymentInfoType getPaymentInfo() {
	 	return paymentInfo;
	 }
	 
	/**
	 * Setter for paymentInfo
	 */
	 public void setPaymentInfo(PaymentInfoType paymentInfo) {
	 	this.paymentInfo = paymentInfo;
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
	 * Getter for aVSCode
	 */
	 public String getAVSCode() {
	 	return aVSCode;
	 }
	 
	/**
	 * Setter for aVSCode
	 */
	 public void setAVSCode(String aVSCode) {
	 	this.aVSCode = aVSCode;
	 }
	 
	/**
	 * Getter for cVV2Code
	 */
	 public String getCVV2Code() {
	 	return cVV2Code;
	 }
	 
	/**
	 * Setter for cVV2Code
	 */
	 public void setCVV2Code(String cVV2Code) {
	 	this.cVV2Code = cVV2Code;
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
	 * Getter for paymentAdviceCode
	 */
	 public String getPaymentAdviceCode() {
	 	return paymentAdviceCode;
	 }
	 
	/**
	 * Setter for paymentAdviceCode
	 */
	 public void setPaymentAdviceCode(String paymentAdviceCode) {
	 	this.paymentAdviceCode = paymentAdviceCode;
	 }
	 
	/**
	 * Getter for msgSubID
	 */
	 public String getMsgSubID() {
	 	return msgSubID;
	 }
	 
	/**
	 * Setter for msgSubID
	 */
	 public void setMsgSubID(String msgSubID) {
	 	this.msgSubID = msgSubID;
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
	
	public DoReferenceTransactionResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("BillingAgreementID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAgreementID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentInfo =  new PaymentInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("AVSCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.aVSCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CVV2Code", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.cVV2Code = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.transactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentAdviceCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentAdviceCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MsgSubID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.msgSubID = childNode.getTextContent();
		}
	
	}
 
}