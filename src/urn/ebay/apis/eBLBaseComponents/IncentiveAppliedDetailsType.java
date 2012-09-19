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
	private String PaymentRequestID;

	/**
	 * The item id passed through by the merchant. 	 
	 */ 
	private String ItemId;

	/**
	 * The item transaction id passed through by the merchant. 	 
	 */ 
	private String ExternalTxnId;

	/**
	 * Discount offerred for this bucket or item. 	 
	 */ 
	private BasicAmountType DiscountAmount;

	/**
	 * SubType for coupon. 	 
	 */ 
	private String SubType;

	

	/**
	 * Default Constructor
	 */
	public IncentiveAppliedDetailsType (){
	}	

	/**
	 * Getter for PaymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return PaymentRequestID;
	 }
	 
	/**
	 * Setter for PaymentRequestID
	 */
	 public void setPaymentRequestID(String PaymentRequestID) {
	 	this.PaymentRequestID = PaymentRequestID;
	 }
	 
	/**
	 * Getter for ItemId
	 */
	 public String getItemId() {
	 	return ItemId;
	 }
	 
	/**
	 * Setter for ItemId
	 */
	 public void setItemId(String ItemId) {
	 	this.ItemId = ItemId;
	 }
	 
	/**
	 * Getter for ExternalTxnId
	 */
	 public String getExternalTxnId() {
	 	return ExternalTxnId;
	 }
	 
	/**
	 * Setter for ExternalTxnId
	 */
	 public void setExternalTxnId(String ExternalTxnId) {
	 	this.ExternalTxnId = ExternalTxnId;
	 }
	 
	/**
	 * Getter for DiscountAmount
	 */
	 public BasicAmountType getDiscountAmount() {
	 	return DiscountAmount;
	 }
	 
	/**
	 * Setter for DiscountAmount
	 */
	 public void setDiscountAmount(BasicAmountType DiscountAmount) {
	 	this.DiscountAmount = DiscountAmount;
	 }
	 
	/**
	 * Getter for SubType
	 */
	 public String getSubType() {
	 	return SubType;
	 }
	 
	/**
	 * Setter for SubType
	 */
	 public void setSubType(String SubType) {
	 	this.SubType = SubType;
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
		    this.PaymentRequestID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ItemId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ItemId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ExternalTxnId", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ExternalTxnId = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("DiscountAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.DiscountAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("SubType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SubType = childNode.getTextContent();
		}
	
	}
 
}