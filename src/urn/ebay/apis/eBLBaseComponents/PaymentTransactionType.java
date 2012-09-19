package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ReceiverInfoType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentItemInfoType;
import urn.ebay.apis.eBLBaseComponents.OfferCouponInfoType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
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
 * PaymentTransactionType Information about a PayPal payment
 * from the seller side 
 */
public class PaymentTransactionType{


	/**
	 * Information about the recipient of the payment 	 
	 */ 
	private ReceiverInfoType ReceiverInfo;

	/**
	 * Information about the payer 	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * Information about the transaction 	 
	 */ 
	private PaymentInfoType PaymentInfo;

	/**
	 * Information about an individual item in the transaction	 
	 */ 
	private PaymentItemInfoType PaymentItemInfo;

	/**
	 * Information about an individual Offer and Coupon information
	 * in the transaction	 
	 */ 
	private OfferCouponInfoType OfferCouponInfo;

	/**
	 * Information about Secondary Address	 
	 */ 
	private AddressType SecondaryAddress;

	/**
	 * Information about the user selected options.  	 
	 */ 
	private UserSelectedOptionType UserSelectedOptions;

	/**
	 * Information about the Gift message.  	 
	 */ 
	private String GiftMessage;

	/**
	 * Information about the Gift receipt.  	 
	 */ 
	private String GiftReceipt;

	/**
	 * Information about the Gift Wrap name.  	 
	 */ 
	private String GiftWrapName;

	/**
	 * Information about the Gift Wrap amount.  	 
	 */ 
	private BasicAmountType GiftWrapAmount;

	/**
	 * Information about the Buyer email.  	 
	 */ 
	private String BuyerEmailOptIn;

	/**
	 * Information about the survey question.  	 
	 */ 
	private String SurveyQuestion;

	/**
	 * Information about the survey choice selected by the user.  	 
	 */ 
	private List<String> SurveyChoiceSelected = new ArrayList<String>();

	

	/**
	 * Default Constructor
	 */
	public PaymentTransactionType (){
	}	

	/**
	 * Getter for ReceiverInfo
	 */
	 public ReceiverInfoType getReceiverInfo() {
	 	return ReceiverInfo;
	 }
	 
	/**
	 * Setter for ReceiverInfo
	 */
	 public void setReceiverInfo(ReceiverInfoType ReceiverInfo) {
	 	this.ReceiverInfo = ReceiverInfo;
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
	 * Getter for PaymentItemInfo
	 */
	 public PaymentItemInfoType getPaymentItemInfo() {
	 	return PaymentItemInfo;
	 }
	 
	/**
	 * Setter for PaymentItemInfo
	 */
	 public void setPaymentItemInfo(PaymentItemInfoType PaymentItemInfo) {
	 	this.PaymentItemInfo = PaymentItemInfo;
	 }
	 
	/**
	 * Getter for OfferCouponInfo
	 */
	 public OfferCouponInfoType getOfferCouponInfo() {
	 	return OfferCouponInfo;
	 }
	 
	/**
	 * Setter for OfferCouponInfo
	 */
	 public void setOfferCouponInfo(OfferCouponInfoType OfferCouponInfo) {
	 	this.OfferCouponInfo = OfferCouponInfo;
	 }
	 
	/**
	 * Getter for SecondaryAddress
	 */
	 public AddressType getSecondaryAddress() {
	 	return SecondaryAddress;
	 }
	 
	/**
	 * Setter for SecondaryAddress
	 */
	 public void setSecondaryAddress(AddressType SecondaryAddress) {
	 	this.SecondaryAddress = SecondaryAddress;
	 }
	 
	/**
	 * Getter for UserSelectedOptions
	 */
	 public UserSelectedOptionType getUserSelectedOptions() {
	 	return UserSelectedOptions;
	 }
	 
	/**
	 * Setter for UserSelectedOptions
	 */
	 public void setUserSelectedOptions(UserSelectedOptionType UserSelectedOptions) {
	 	this.UserSelectedOptions = UserSelectedOptions;
	 }
	 
	/**
	 * Getter for GiftMessage
	 */
	 public String getGiftMessage() {
	 	return GiftMessage;
	 }
	 
	/**
	 * Setter for GiftMessage
	 */
	 public void setGiftMessage(String GiftMessage) {
	 	this.GiftMessage = GiftMessage;
	 }
	 
	/**
	 * Getter for GiftReceipt
	 */
	 public String getGiftReceipt() {
	 	return GiftReceipt;
	 }
	 
	/**
	 * Setter for GiftReceipt
	 */
	 public void setGiftReceipt(String GiftReceipt) {
	 	this.GiftReceipt = GiftReceipt;
	 }
	 
	/**
	 * Getter for GiftWrapName
	 */
	 public String getGiftWrapName() {
	 	return GiftWrapName;
	 }
	 
	/**
	 * Setter for GiftWrapName
	 */
	 public void setGiftWrapName(String GiftWrapName) {
	 	this.GiftWrapName = GiftWrapName;
	 }
	 
	/**
	 * Getter for GiftWrapAmount
	 */
	 public BasicAmountType getGiftWrapAmount() {
	 	return GiftWrapAmount;
	 }
	 
	/**
	 * Setter for GiftWrapAmount
	 */
	 public void setGiftWrapAmount(BasicAmountType GiftWrapAmount) {
	 	this.GiftWrapAmount = GiftWrapAmount;
	 }
	 
	/**
	 * Getter for BuyerEmailOptIn
	 */
	 public String getBuyerEmailOptIn() {
	 	return BuyerEmailOptIn;
	 }
	 
	/**
	 * Setter for BuyerEmailOptIn
	 */
	 public void setBuyerEmailOptIn(String BuyerEmailOptIn) {
	 	this.BuyerEmailOptIn = BuyerEmailOptIn;
	 }
	 
	/**
	 * Getter for SurveyQuestion
	 */
	 public String getSurveyQuestion() {
	 	return SurveyQuestion;
	 }
	 
	/**
	 * Setter for SurveyQuestion
	 */
	 public void setSurveyQuestion(String SurveyQuestion) {
	 	this.SurveyQuestion = SurveyQuestion;
	 }
	 
	/**
	 * Getter for SurveyChoiceSelected
	 */
	 public List<String> getSurveyChoiceSelected() {
	 	return SurveyChoiceSelected;
	 }
	 
	/**
	 * Setter for SurveyChoiceSelected
	 */
	 public void setSurveyChoiceSelected(List<String> SurveyChoiceSelected) {
	 	this.SurveyChoiceSelected = SurveyChoiceSelected;
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
	
	public PaymentTransactionType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("ReceiverInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ReceiverInfo =  new ReceiverInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("PayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerInfo =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentInfo =  new PaymentInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentItemInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PaymentItemInfo =  new PaymentItemInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("OfferCouponInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.OfferCouponInfo =  new OfferCouponInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("SecondaryAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SecondaryAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("UserSelectedOptions", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.UserSelectedOptions =  new UserSelectedOptionType(childNode);
		}
		childNode = (Node) xpath.evaluate("GiftMessage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftReceipt", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftReceipt = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftWrapName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftWrapAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BuyerEmailOptIn", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BuyerEmailOptIn = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SurveyQuestion", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.SurveyQuestion = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("SurveyChoiceSelected", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.SurveyChoiceSelected.add(value);
					
			}
		}
	}
 
}