package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.RefundInfoType;
import urn.ebay.apis.eBLBaseComponents.AbstractResponseType;
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
 * Unique transaction ID of the refund. Character length and
 * limitations:17 single-byte characters 
 */
public class RefundTransactionResponseType extends AbstractResponseType {


	/**
	 * Unique transaction ID of the refund. Character length and
	 * limitations:17 single-byte characters	 
	 */ 
	private String refundTransactionID;

	/**
	 * Amount subtracted from PayPal balance of original recipient
	 * of payment to make this refund 	 
	 */ 
	private BasicAmountType netRefundAmount;

	/**
	 * Transaction fee refunded to original recipient of payment 	 
	 */ 
	private BasicAmountType feeRefundAmount;

	/**
	 * Amount of money refunded to original payer 	 
	 */ 
	private BasicAmountType grossRefundAmount;

	/**
	 * Total of all previous refunds	 
	 */ 
	private BasicAmountType totalRefundedAmount;

	/**
	 * Contains Refund Payment status information.	 
	 */ 
	private RefundInfoType refundInfo;

	/**
	 * Any general information like offer details that is
	 * reinstated or any other marketing data	 
	 */ 
	private String receiptData;

	/**
	 * Return msgsubid back to merchant	 
	 */ 
	private String msgSubID;

	

	/**
	 * Default Constructor
	 */
	public RefundTransactionResponseType (){
	}	

	/**
	 * Getter for refundTransactionID
	 */
	 public String getRefundTransactionID() {
	 	return refundTransactionID;
	 }
	 
	/**
	 * Setter for refundTransactionID
	 */
	 public void setRefundTransactionID(String refundTransactionID) {
	 	this.refundTransactionID = refundTransactionID;
	 }
	 
	/**
	 * Getter for netRefundAmount
	 */
	 public BasicAmountType getNetRefundAmount() {
	 	return netRefundAmount;
	 }
	 
	/**
	 * Setter for netRefundAmount
	 */
	 public void setNetRefundAmount(BasicAmountType netRefundAmount) {
	 	this.netRefundAmount = netRefundAmount;
	 }
	 
	/**
	 * Getter for feeRefundAmount
	 */
	 public BasicAmountType getFeeRefundAmount() {
	 	return feeRefundAmount;
	 }
	 
	/**
	 * Setter for feeRefundAmount
	 */
	 public void setFeeRefundAmount(BasicAmountType feeRefundAmount) {
	 	this.feeRefundAmount = feeRefundAmount;
	 }
	 
	/**
	 * Getter for grossRefundAmount
	 */
	 public BasicAmountType getGrossRefundAmount() {
	 	return grossRefundAmount;
	 }
	 
	/**
	 * Setter for grossRefundAmount
	 */
	 public void setGrossRefundAmount(BasicAmountType grossRefundAmount) {
	 	this.grossRefundAmount = grossRefundAmount;
	 }
	 
	/**
	 * Getter for totalRefundedAmount
	 */
	 public BasicAmountType getTotalRefundedAmount() {
	 	return totalRefundedAmount;
	 }
	 
	/**
	 * Setter for totalRefundedAmount
	 */
	 public void setTotalRefundedAmount(BasicAmountType totalRefundedAmount) {
	 	this.totalRefundedAmount = totalRefundedAmount;
	 }
	 
	/**
	 * Getter for refundInfo
	 */
	 public RefundInfoType getRefundInfo() {
	 	return refundInfo;
	 }
	 
	/**
	 * Setter for refundInfo
	 */
	 public void setRefundInfo(RefundInfoType refundInfo) {
	 	this.refundInfo = refundInfo;
	 }
	 
	/**
	 * Getter for receiptData
	 */
	 public String getReceiptData() {
	 	return receiptData;
	 }
	 
	/**
	 * Setter for receiptData
	 */
	 public void setReceiptData(String receiptData) {
	 	this.receiptData = receiptData;
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
	
	public RefundTransactionResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("RefundTransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.refundTransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("NetRefundAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.netRefundAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FeeRefundAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.feeRefundAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("GrossRefundAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.grossRefundAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("TotalRefundedAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.totalRefundedAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("RefundInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.refundInfo =  new RefundInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("ReceiptData", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.receiptData = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MsgSubID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.msgSubID = childNode.getTextContent();
		}
	
	}
 
}