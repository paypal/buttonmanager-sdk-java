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
	private String RefundTransactionID;

	/**
	 * Amount subtracted from PayPal balance of original recipient
	 * of payment to make this refund 	 
	 */ 
	private BasicAmountType NetRefundAmount;

	/**
	 * Transaction fee refunded to original recipient of payment 	 
	 */ 
	private BasicAmountType FeeRefundAmount;

	/**
	 * Amount of money refunded to original payer 	 
	 */ 
	private BasicAmountType GrossRefundAmount;

	/**
	 * Total of all previous refunds	 
	 */ 
	private BasicAmountType TotalRefundedAmount;

	/**
	 * Contains Refund Payment status information.	 
	 */ 
	private RefundInfoType RefundInfo;

	/**
	 * Any general information like offer details that is
	 * reinstated or any other marketing data	 
	 */ 
	private String ReceiptData;

	/**
	 * Return msgsubid back to merchant	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Default Constructor
	 */
	public RefundTransactionResponseType (){
	}	

	/**
	 * Getter for RefundTransactionID
	 */
	 public String getRefundTransactionID() {
	 	return RefundTransactionID;
	 }
	 
	/**
	 * Setter for RefundTransactionID
	 */
	 public void setRefundTransactionID(String RefundTransactionID) {
	 	this.RefundTransactionID = RefundTransactionID;
	 }
	 
	/**
	 * Getter for NetRefundAmount
	 */
	 public BasicAmountType getNetRefundAmount() {
	 	return NetRefundAmount;
	 }
	 
	/**
	 * Setter for NetRefundAmount
	 */
	 public void setNetRefundAmount(BasicAmountType NetRefundAmount) {
	 	this.NetRefundAmount = NetRefundAmount;
	 }
	 
	/**
	 * Getter for FeeRefundAmount
	 */
	 public BasicAmountType getFeeRefundAmount() {
	 	return FeeRefundAmount;
	 }
	 
	/**
	 * Setter for FeeRefundAmount
	 */
	 public void setFeeRefundAmount(BasicAmountType FeeRefundAmount) {
	 	this.FeeRefundAmount = FeeRefundAmount;
	 }
	 
	/**
	 * Getter for GrossRefundAmount
	 */
	 public BasicAmountType getGrossRefundAmount() {
	 	return GrossRefundAmount;
	 }
	 
	/**
	 * Setter for GrossRefundAmount
	 */
	 public void setGrossRefundAmount(BasicAmountType GrossRefundAmount) {
	 	this.GrossRefundAmount = GrossRefundAmount;
	 }
	 
	/**
	 * Getter for TotalRefundedAmount
	 */
	 public BasicAmountType getTotalRefundedAmount() {
	 	return TotalRefundedAmount;
	 }
	 
	/**
	 * Setter for TotalRefundedAmount
	 */
	 public void setTotalRefundedAmount(BasicAmountType TotalRefundedAmount) {
	 	this.TotalRefundedAmount = TotalRefundedAmount;
	 }
	 
	/**
	 * Getter for RefundInfo
	 */
	 public RefundInfoType getRefundInfo() {
	 	return RefundInfo;
	 }
	 
	/**
	 * Setter for RefundInfo
	 */
	 public void setRefundInfo(RefundInfoType RefundInfo) {
	 	this.RefundInfo = RefundInfo;
	 }
	 
	/**
	 * Getter for ReceiptData
	 */
	 public String getReceiptData() {
	 	return ReceiptData;
	 }
	 
	/**
	 * Setter for ReceiptData
	 */
	 public void setReceiptData(String ReceiptData) {
	 	this.ReceiptData = ReceiptData;
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
	
	public RefundTransactionResponseType(Node node) throws XPathExpressionException {
		super(node);
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("RefundTransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RefundTransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("NetRefundAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.NetRefundAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FeeRefundAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.FeeRefundAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("GrossRefundAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GrossRefundAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("TotalRefundedAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.TotalRefundedAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("RefundInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RefundInfo =  new RefundInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("ReceiptData", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ReceiptData = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("MsgSubID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.MsgSubID = childNode.getTextContent();
		}
	
	}
 
}