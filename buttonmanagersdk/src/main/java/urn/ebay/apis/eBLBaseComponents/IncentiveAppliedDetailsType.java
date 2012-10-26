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
 * Details of incentive application on individual bucket/item. 
 */
public class IncentiveAppliedDetailsType{


	/**
	 * PaymentRequestID uniquely identifies a bucket. It is the
	 * "bucket id" in the world of EC API. 	 
	 */ 
	private String paymentRequestID;

	/**
	 * The item id passed through by the merchant. 	 
	 */ 
	private String itemId;

	/**
	 * The item transaction id passed through by the merchant. 	 
	 */ 
	private String externalTxnId;

	/**
	 * Discount offerred for this bucket or item. 	 
	 */ 
	private BasicAmountType discountAmount;

	/**
	 * SubType for coupon. 	 
	 */ 
	private String subType;

	

	/**
	 * Default Constructor
	 */
	public IncentiveAppliedDetailsType (){
	}	

	/**
	 * Getter for paymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return paymentRequestID;
	 }
	 
	/**
	 * Setter for paymentRequestID
	 */
	 public void setPaymentRequestID(String paymentRequestID) {
	 	this.paymentRequestID = paymentRequestID;
	 }
	 
	/**
	 * Getter for itemId
	 */
	 public String getItemId() {
	 	return itemId;
	 }
	 
	/**
	 * Setter for itemId
	 */
	 public void setItemId(String itemId) {
	 	this.itemId = itemId;
	 }
	 
	/**
	 * Getter for externalTxnId
	 */
	 public String getExternalTxnId() {
	 	return externalTxnId;
	 }
	 
	/**
	 * Setter for externalTxnId
	 */
	 public void setExternalTxnId(String externalTxnId) {
	 	this.externalTxnId = externalTxnId;
	 }
	 
	/**
	 * Getter for discountAmount
	 */
	 public BasicAmountType getDiscountAmount() {
	 	return discountAmount;
	 }
	 
	/**
	 * Setter for discountAmount
	 */
	 public void setDiscountAmount(BasicAmountType discountAmount) {
	 	this.discountAmount = discountAmount;
	 }
	 
	/**
	 * Getter for subType
	 */
	 public String getSubType() {
	 	return subType;
	 }
	 
	/**
	 * Setter for subType
	 */
	 public void setSubType(String subType) {
	 	this.subType = subType;
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
	
	public IncentiveAppliedDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("PaymentRequestID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentRequestID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.itemId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ExternalTxnId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.externalTxnId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DiscountAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.discountAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("SubType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.subType = childNode.getTextContent();
		}
	
	}
 
}