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
	private String BillingAgreementID;

	/**
	 * 	 
	 */ 
	private PaymentInfoType PaymentInfo;

	/**
	 * 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * 	 
	 */ 
	private String AVSCode;

	/**
	 * 	 
	 */ 
	private String CVV2Code;

	/**
	 * 	 
	 */ 
	private String TransactionID;

	/**
	 * Response code from the processor when a recurring
	 * transaction is declined 	 
	 */ 
	private String PaymentAdviceCode;

	/**
	 * Return msgsubid back to merchant 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionResponseDetailsType (){
	}	

	/**
	 * Getter for BillingAgreementID
	 */
	 public String getBillingAgreementID() {
	 	return BillingAgreementID;
	 }
	 
	/**
	 * Setter for BillingAgreementID
	 */
	 public void setBillingAgreementID(String BillingAgreementID) {
	 	this.BillingAgreementID = BillingAgreementID;
	 }
	 
	/**
	 * Getter for PaymentInfo
	 */
	 public PaymentInfoType getPaymentInfo() {
	 	return PaymentInfo;
	 }
	 
	/**
	 * Setter for PaymentInfo
	 */
	 public void setPaymentInfo(PaymentInfoType PaymentInfo) {
	 	this.PaymentInfo = PaymentInfo;
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
	 * Getter for AVSCode
	 */
	 public String getAVSCode() {
	 	return AVSCode;
	 }
	 
	/**
	 * Setter for AVSCode
	 */
	 public void setAVSCode(String AVSCode) {
	 	this.AVSCode = AVSCode;
	 }
	 
	/**
	 * Getter for CVV2Code
	 */
	 public String getCVV2Code() {
	 	return CVV2Code;
	 }
	 
	/**
	 * Setter for CVV2Code
	 */
	 public void setCVV2Code(String CVV2Code) {
	 	this.CVV2Code = CVV2Code;
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
	 * Getter for PaymentAdviceCode
	 */
	 public String getPaymentAdviceCode() {
	 	return PaymentAdviceCode;
	 }
	 
	/**
	 * Setter for PaymentAdviceCode
	 */
	 public void setPaymentAdviceCode(String PaymentAdviceCode) {
	 	this.PaymentAdviceCode = PaymentAdviceCode;
	 }
	 
	/**
	 * Getter for MsgSubID
	 */
	 public String getMsgSubID() {
	 	return MsgSubID;
	 }
	 
	/**
	 * Setter for MsgSubID
	 */
	 public void setMsgSubID(String MsgSubID) {
	 	this.MsgSubID = MsgSubID;
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
		    this.BillingAgreementID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentInfo =  new PaymentInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Amount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Amount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("AVSCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.AVSCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CVV2Code", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CVV2Code = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentAdviceCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentAdviceCode = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MsgSubID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.MsgSubID = childNode.getTextContent();
		}
	
	}
 
}