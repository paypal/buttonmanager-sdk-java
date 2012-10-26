package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
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
public class BAUpdateResponseDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String billingAgreementID;

	/**
	 * 	 
	 */ 
	private String billingAgreementDescription;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private MerchantPullStatusCodeType billingAgreementStatus;

	/**
	 * 	 
	 */ 
	private String billingAgreementCustom;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private PayerInfoType payerInfo;

	/**
	 * 	 
	 */ 
	private BasicAmountType billingAgreementMax;

	/**
	 * Customer's billing address. Optional If you have credit card
	 * mapped in your account then billing address of the credit
	 * card is returned otherwise your primary address is returned
	 * , PayPal returns this address in BAUpdateResponseDetails. 	 
	 */ 
	private AddressType billingAddress;

	

	/**
	 * Default Constructor
	 */
	public BAUpdateResponseDetailsType (){
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
	 * Getter for billingAgreementDescription
	 */
	 public String getBillingAgreementDescription() {
	 	return billingAgreementDescription;
	 }
	 
	/**
	 * Setter for billingAgreementDescription
	 */
	 public void setBillingAgreementDescription(String billingAgreementDescription) {
	 	this.billingAgreementDescription = billingAgreementDescription;
	 }
	 
	/**
	 * Getter for billingAgreementStatus
	 */
	 public MerchantPullStatusCodeType getBillingAgreementStatus() {
	 	return billingAgreementStatus;
	 }
	 
	/**
	 * Setter for billingAgreementStatus
	 */
	 public void setBillingAgreementStatus(MerchantPullStatusCodeType billingAgreementStatus) {
	 	this.billingAgreementStatus = billingAgreementStatus;
	 }
	 
	/**
	 * Getter for billingAgreementCustom
	 */
	 public String getBillingAgreementCustom() {
	 	return billingAgreementCustom;
	 }
	 
	/**
	 * Setter for billingAgreementCustom
	 */
	 public void setBillingAgreementCustom(String billingAgreementCustom) {
	 	this.billingAgreementCustom = billingAgreementCustom;
	 }
	 
	/**
	 * Getter for payerInfo
	 */
	 public PayerInfoType getPayerInfo() {
	 	return payerInfo;
	 }
	 
	/**
	 * Setter for payerInfo
	 */
	 public void setPayerInfo(PayerInfoType payerInfo) {
	 	this.payerInfo = payerInfo;
	 }
	 
	/**
	 * Getter for billingAgreementMax
	 */
	 public BasicAmountType getBillingAgreementMax() {
	 	return billingAgreementMax;
	 }
	 
	/**
	 * Setter for billingAgreementMax
	 */
	 public void setBillingAgreementMax(BasicAmountType billingAgreementMax) {
	 	this.billingAgreementMax = billingAgreementMax;
	 }
	 
	/**
	 * Getter for billingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return billingAddress;
	 }
	 
	/**
	 * Setter for billingAddress
	 */
	 public void setBillingAddress(AddressType billingAddress) {
	 	this.billingAddress = billingAddress;
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
	
	public BAUpdateResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("BillingAgreementID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAgreementID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAgreementDescription", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAgreementDescription = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAgreementStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAgreementStatus = MerchantPullStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("BillingAgreementCustom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAgreementCustom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerInfo =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("BillingAgreementMax", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAgreementMax =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BillingAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAddress =  new AddressType(childNode);
		}
	}
 
}