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
	private MerchantPullStatusCodeType MpStatus;

	/**
	 * Monthly maximum payment amount	 
	 */ 
	private BasicAmountType MpMax;

	/**
	 * The value of the mp_custom variable that you specified in a
	 * FORM submission to PayPal during the creation or updating of
	 * a customer billing agreement 	 
	 */ 
	private String MpCustom;

	/**
	 * The value of the mp_desc variable (description of goods or
	 * services) associated with the billing agreement 	 
	 */ 
	private String Desc;

	/**
	 * Invoice value as set by BillUserRequest API call 	 
	 */ 
	private String Invoice;

	/**
	 * Custom field as set by BillUserRequest API call 	 
	 */ 
	private String Custom;

	/**
	 * Note: This field is no longer used and is always empty.	 
	 */ 
	private String PaymentSourceID;

	

	/**
	 * Default Constructor
	 */
	public MerchantPullInfoType (){
	}	

	/**
	 * Getter for MpStatus
	 */
	 public MerchantPullStatusCodeType getMpStatus() {
	 	return MpStatus;
	 }
	 
	/**
	 * Setter for MpStatus
	 */
	 public void setMpStatus(MerchantPullStatusCodeType MpStatus) {
	 	this.MpStatus = MpStatus;
	 }
	 
	/**
	 * Getter for MpMax
	 */
	 public BasicAmountType getMpMax() {
	 	return MpMax;
	 }
	 
	/**
	 * Setter for MpMax
	 */
	 public void setMpMax(BasicAmountType MpMax) {
	 	this.MpMax = MpMax;
	 }
	 
	/**
	 * Getter for MpCustom
	 */
	 public String getMpCustom() {
	 	return MpCustom;
	 }
	 
	/**
	 * Setter for MpCustom
	 */
	 public void setMpCustom(String MpCustom) {
	 	this.MpCustom = MpCustom;
	 }
	 
	/**
	 * Getter for Desc
	 */
	 public String getDesc() {
	 	return Desc;
	 }
	 
	/**
	 * Setter for Desc
	 */
	 public void setDesc(String Desc) {
	 	this.Desc = Desc;
	 }
	 
	/**
	 * Getter for Invoice
	 */
	 public String getInvoice() {
	 	return Invoice;
	 }
	 
	/**
	 * Setter for Invoice
	 */
	 public void setInvoice(String Invoice) {
	 	this.Invoice = Invoice;
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
	 * Getter for PaymentSourceID
	 */
	 public String getPaymentSourceID() {
	 	return PaymentSourceID;
	 }
	 
	/**
	 * Setter for PaymentSourceID
	 */
	 public void setPaymentSourceID(String PaymentSourceID) {
	 	this.PaymentSourceID = PaymentSourceID;
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
		    this.MpStatus = MerchantPullStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("MpMax", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.MpMax =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("MpCustom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.MpCustom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Desc", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Desc = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Invoice", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Invoice = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentSourceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentSourceID = childNode.getTextContent();
		}
	
	}
 
}