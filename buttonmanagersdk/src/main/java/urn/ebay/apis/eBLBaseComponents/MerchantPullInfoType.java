package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;
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
 * MerchantPullInfoType Information about the merchant pull. 
 */
public class MerchantPullInfoType{


	/**
	 * Current status of billing agreement 	 
	 */ 
	private MerchantPullStatusCodeType mpStatus;

	/**
	 * Monthly maximum payment amount	 
	 */ 
	private BasicAmountType mpMax;

	/**
	 * The value of the mp_custom variable that you specified in a
	 * FORM submission to PayPal during the creation or updating of
	 * a customer billing agreement 	 
	 */ 
	private String mpCustom;

	/**
	 * The value of the mp_desc variable (description of goods or
	 * services) associated with the billing agreement 	 
	 */ 
	private String desc;

	/**
	 * Invoice value as set by BillUserRequest API call 	 
	 */ 
	private String invoice;

	/**
	 * Custom field as set by BillUserRequest API call 	 
	 */ 
	private String custom;

	/**
	 * Note: This field is no longer used and is always empty.	 
	 */ 
	private String paymentSourceID;

	

	/**
	 * Default Constructor
	 */
	public MerchantPullInfoType (){
	}	

	/**
	 * Getter for mpStatus
	 */
	 public MerchantPullStatusCodeType getMpStatus() {
	 	return mpStatus;
	 }
	 
	/**
	 * Setter for mpStatus
	 */
	 public void setMpStatus(MerchantPullStatusCodeType mpStatus) {
	 	this.mpStatus = mpStatus;
	 }
	 
	/**
	 * Getter for mpMax
	 */
	 public BasicAmountType getMpMax() {
	 	return mpMax;
	 }
	 
	/**
	 * Setter for mpMax
	 */
	 public void setMpMax(BasicAmountType mpMax) {
	 	this.mpMax = mpMax;
	 }
	 
	/**
	 * Getter for mpCustom
	 */
	 public String getMpCustom() {
	 	return mpCustom;
	 }
	 
	/**
	 * Setter for mpCustom
	 */
	 public void setMpCustom(String mpCustom) {
	 	this.mpCustom = mpCustom;
	 }
	 
	/**
	 * Getter for desc
	 */
	 public String getDesc() {
	 	return desc;
	 }
	 
	/**
	 * Setter for desc
	 */
	 public void setDesc(String desc) {
	 	this.desc = desc;
	 }
	 
	/**
	 * Getter for invoice
	 */
	 public String getInvoice() {
	 	return invoice;
	 }
	 
	/**
	 * Setter for invoice
	 */
	 public void setInvoice(String invoice) {
	 	this.invoice = invoice;
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
	 * Getter for paymentSourceID
	 */
	 public String getPaymentSourceID() {
	 	return paymentSourceID;
	 }
	 
	/**
	 * Setter for paymentSourceID
	 */
	 public void setPaymentSourceID(String paymentSourceID) {
	 	this.paymentSourceID = paymentSourceID;
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
	
	public MerchantPullInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("MpStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.mpStatus = MerchantPullStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("MpMax", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.mpMax =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("MpCustom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.mpCustom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Desc", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.desc = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Invoice", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.invoice = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentSourceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentSourceID = childNode.getTextContent();
		}
	
	}
 
}