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
	private ReceiverInfoType receiverInfo;

	/**
	 * Information about the payer 	 
	 */ 
	private PayerInfoType payerInfo;

	/**
	 * This field is for holding ReferenceId for shippment sent
	 * from Merchant to the 3rd Party  	 
	 */ 
	private String tPLReferenceID;

	/**
	 * Information about the transaction 	 
	 */ 
	private PaymentInfoType paymentInfo;

	/**
	 * Information about an individual item in the transaction	 
	 */ 
	private PaymentItemInfoType paymentItemInfo;

	/**
	 * Information about an individual Offer and Coupon information
	 * in the transaction	 
	 */ 
	private OfferCouponInfoType offerCouponInfo;

	/**
	 * Information about Secondary Address	 
	 */ 
	private AddressType secondaryAddress;

	/**
	 * Information about the user selected options.  	 
	 */ 
	private UserSelectedOptionType userSelectedOptions;

	/**
	 * Information about the Gift message.  	 
	 */ 
	private String giftMessage;

	/**
	 * Information about the Gift receipt.  	 
	 */ 
	private String giftReceipt;

	/**
	 * Information about the Gift Wrap name.  	 
	 */ 
	private String giftWrapName;

	/**
	 * Information about the Gift Wrap amount.  	 
	 */ 
	private BasicAmountType giftWrapAmount;

	/**
	 * Information about the Buyer email.  	 
	 */ 
	private String buyerEmailOptIn;

	/**
	 * Information about the survey question.  	 
	 */ 
	private String surveyQuestion;

	/**
	 * Information about the survey choice selected by the user.  	 
	 */ 
	private List<String> surveyChoiceSelected = new ArrayList<String>();

	

	/**
	 * Default Constructor
	 */
	public PaymentTransactionType (){
	}	

	/**
	 * Getter for receiverInfo
	 */
	 public ReceiverInfoType getReceiverInfo() {
	 	return receiverInfo;
	 }
	 
	/**
	 * Setter for receiverInfo
	 */
	 public void setReceiverInfo(ReceiverInfoType receiverInfo) {
	 	this.receiverInfo = receiverInfo;
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
	 * Getter for tPLReferenceID
	 */
	 public String getTPLReferenceID() {
	 	return tPLReferenceID;
	 }
	 
	/**
	 * Setter for tPLReferenceID
	 */
	 public void setTPLReferenceID(String tPLReferenceID) {
	 	this.tPLReferenceID = tPLReferenceID;
	 }
	 
	/**
	 * Getter for paymentInfo
	 */
	 public PaymentInfoType getPaymentInfo() {
	 	return paymentInfo;
	 }
	 
	/**
	 * Setter for paymentInfo
	 */
	 public void setPaymentInfo(PaymentInfoType paymentInfo) {
	 	this.paymentInfo = paymentInfo;
	 }
	 
	/**
	 * Getter for paymentItemInfo
	 */
	 public PaymentItemInfoType getPaymentItemInfo() {
	 	return paymentItemInfo;
	 }
	 
	/**
	 * Setter for paymentItemInfo
	 */
	 public void setPaymentItemInfo(PaymentItemInfoType paymentItemInfo) {
	 	this.paymentItemInfo = paymentItemInfo;
	 }
	 
	/**
	 * Getter for offerCouponInfo
	 */
	 public OfferCouponInfoType getOfferCouponInfo() {
	 	return offerCouponInfo;
	 }
	 
	/**
	 * Setter for offerCouponInfo
	 */
	 public void setOfferCouponInfo(OfferCouponInfoType offerCouponInfo) {
	 	this.offerCouponInfo = offerCouponInfo;
	 }
	 
	/**
	 * Getter for secondaryAddress
	 */
	 public AddressType getSecondaryAddress() {
	 	return secondaryAddress;
	 }
	 
	/**
	 * Setter for secondaryAddress
	 */
	 public void setSecondaryAddress(AddressType secondaryAddress) {
	 	this.secondaryAddress = secondaryAddress;
	 }
	 
	/**
	 * Getter for userSelectedOptions
	 */
	 public UserSelectedOptionType getUserSelectedOptions() {
	 	return userSelectedOptions;
	 }
	 
	/**
	 * Setter for userSelectedOptions
	 */
	 public void setUserSelectedOptions(UserSelectedOptionType userSelectedOptions) {
	 	this.userSelectedOptions = userSelectedOptions;
	 }
	 
	/**
	 * Getter for giftMessage
	 */
	 public String getGiftMessage() {
	 	return giftMessage;
	 }
	 
	/**
	 * Setter for giftMessage
	 */
	 public void setGiftMessage(String giftMessage) {
	 	this.giftMessage = giftMessage;
	 }
	 
	/**
	 * Getter for giftReceipt
	 */
	 public String getGiftReceipt() {
	 	return giftReceipt;
	 }
	 
	/**
	 * Setter for giftReceipt
	 */
	 public void setGiftReceipt(String giftReceipt) {
	 	this.giftReceipt = giftReceipt;
	 }
	 
	/**
	 * Getter for giftWrapName
	 */
	 public String getGiftWrapName() {
	 	return giftWrapName;
	 }
	 
	/**
	 * Setter for giftWrapName
	 */
	 public void setGiftWrapName(String giftWrapName) {
	 	this.giftWrapName = giftWrapName;
	 }
	 
	/**
	 * Getter for giftWrapAmount
	 */
	 public BasicAmountType getGiftWrapAmount() {
	 	return giftWrapAmount;
	 }
	 
	/**
	 * Setter for giftWrapAmount
	 */
	 public void setGiftWrapAmount(BasicAmountType giftWrapAmount) {
	 	this.giftWrapAmount = giftWrapAmount;
	 }
	 
	/**
	 * Getter for buyerEmailOptIn
	 */
	 public String getBuyerEmailOptIn() {
	 	return buyerEmailOptIn;
	 }
	 
	/**
	 * Setter for buyerEmailOptIn
	 */
	 public void setBuyerEmailOptIn(String buyerEmailOptIn) {
	 	this.buyerEmailOptIn = buyerEmailOptIn;
	 }
	 
	/**
	 * Getter for surveyQuestion
	 */
	 public String getSurveyQuestion() {
	 	return surveyQuestion;
	 }
	 
	/**
	 * Setter for surveyQuestion
	 */
	 public void setSurveyQuestion(String surveyQuestion) {
	 	this.surveyQuestion = surveyQuestion;
	 }
	 
	/**
	 * Getter for surveyChoiceSelected
	 */
	 public List<String> getSurveyChoiceSelected() {
	 	return surveyChoiceSelected;
	 }
	 
	/**
	 * Setter for surveyChoiceSelected
	 */
	 public void setSurveyChoiceSelected(List<String> surveyChoiceSelected) {
	 	this.surveyChoiceSelected = surveyChoiceSelected;
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
		    this.receiverInfo =  new ReceiverInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("PayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerInfo =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("TPLReferenceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.tPLReferenceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentInfo =  new PaymentInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentItemInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentItemInfo =  new PaymentItemInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("OfferCouponInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.offerCouponInfo =  new OfferCouponInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("SecondaryAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.secondaryAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("UserSelectedOptions", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.userSelectedOptions =  new UserSelectedOptionType(childNode);
		}
		childNode = (Node) xpath.evaluate("GiftMessage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftReceipt", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftReceipt = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftWrapName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftWrapAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BuyerEmailOptIn", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buyerEmailOptIn = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SurveyQuestion", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.surveyQuestion = childNode.getTextContent();
		}
	
        nodeList = (NodeList) xpath.evaluate("SurveyChoiceSelected", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
			    Node subNode = nodeList.item(i);
			    String value = subNode.getTextContent();
			    this.surveyChoiceSelected.add(value);
					
			}
		}
	}
 
}