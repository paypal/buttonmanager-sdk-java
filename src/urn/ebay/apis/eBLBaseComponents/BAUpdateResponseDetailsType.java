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
	private String BillingAgreementID;

	/**
	 * 	 
	 */ 
	private String BillingAgreementDescription;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private MerchantPullStatusCodeType BillingAgreementStatus;

	/**
	 * 	 
	 */ 
	private String BillingAgreementCustom;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * 	 
	 */ 
	private BasicAmountType BillingAgreementMax;

	/**
	 * Customer's billing address. Optional If you have credit card
	 * mapped in your account then billing address of the credit
	 * card is returned otherwise your primary address is returned
	 * , PayPal returns this address in BAUpdateResponseDetails. 	 
	 */ 
	private AddressType BillingAddress;

	

	/**
	 * Default Constructor
	 */
	public BAUpdateResponseDetailsType (){
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
	 * Getter for BillingAgreementDescription
	 */
	 public String getBillingAgreementDescription() {
	 	return BillingAgreementDescription;
	 }
	 
	/**
	 * Setter for BillingAgreementDescription
	 */
	 public void setBillingAgreementDescription(String BillingAgreementDescription) {
	 	this.BillingAgreementDescription = BillingAgreementDescription;
	 }
	 
	/**
	 * Getter for BillingAgreementStatus
	 */
	 public MerchantPullStatusCodeType getBillingAgreementStatus() {
	 	return BillingAgreementStatus;
	 }
	 
	/**
	 * Setter for BillingAgreementStatus
	 */
	 public void setBillingAgreementStatus(MerchantPullStatusCodeType BillingAgreementStatus) {
	 	this.BillingAgreementStatus = BillingAgreementStatus;
	 }
	 
	/**
	 * Getter for BillingAgreementCustom
	 */
	 public String getBillingAgreementCustom() {
	 	return BillingAgreementCustom;
	 }
	 
	/**
	 * Setter for BillingAgreementCustom
	 */
	 public void setBillingAgreementCustom(String BillingAgreementCustom) {
	 	this.BillingAgreementCustom = BillingAgreementCustom;
	 }
	 
	/**
	 * Getter for PayerInfo
	 */
	 public PayerInfoType getPayerInfo() {
	 	return PayerInfo;
	 }
	 
	/**
	 * Setter for PayerInfo
	 */
	 public void setPayerInfo(PayerInfoType PayerInfo) {
	 	this.PayerInfo = PayerInfo;
	 }
	 
	/**
	 * Getter for BillingAgreementMax
	 */
	 public BasicAmountType getBillingAgreementMax() {
	 	return BillingAgreementMax;
	 }
	 
	/**
	 * Setter for BillingAgreementMax
	 */
	 public void setBillingAgreementMax(BasicAmountType BillingAgreementMax) {
	 	this.BillingAgreementMax = BillingAgreementMax;
	 }
	 
	/**
	 * Getter for BillingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return BillingAddress;
	 }
	 
	/**
	 * Setter for BillingAddress
	 */
	 public void setBillingAddress(AddressType BillingAddress) {
	 	this.BillingAddress = BillingAddress;
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
		    this.BillingAgreementID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAgreementDescription", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingAgreementDescription = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAgreementStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingAgreementStatus = MerchantPullStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("BillingAgreementCustom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingAgreementCustom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerInfo =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("BillingAgreementMax", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingAgreementMax =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BillingAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingAddress =  new AddressType(childNode);
		}
	}
 
}