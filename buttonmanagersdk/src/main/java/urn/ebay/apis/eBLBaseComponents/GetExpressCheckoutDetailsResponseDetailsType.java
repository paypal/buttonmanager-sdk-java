package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
import urn.ebay.apis.eBLBaseComponents.IncentiveDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentRequestInfoType;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeStatusDetailsType;
import urn.ebay.apis.eBLBaseComponents.RefreshTokenStatusDetailsType;
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
 * The timestamped token value that was returned by
 * SetExpressCheckoutResponse and passed on
 * GetExpressCheckoutDetailsRequest. Character length and
 * limitations: 20 single-byte characters 
 */
public class GetExpressCheckoutDetailsResponseDetailsType{


	/**
	 * The timestamped token value that was returned by
	 * SetExpressCheckoutResponse and passed on
	 * GetExpressCheckoutDetailsRequest. Character length and
	 * limitations: 20 single-byte characters	 
	 */ 
	private String token;

	/**
	 * Information about the payer	 
	 */ 
	private PayerInfoType payerInfo;

	/**
	 * A free-form field for your own use, as set by you in the
	 * Custom element of SetExpressCheckoutRequest. Character
	 * length and limitations: 256 single-byte alphanumeric
	 * characters	 
	 */ 
	private String custom;

	/**
	 * Your own invoice or tracking number, as set by you in the
	 * InvoiceID element of SetExpressCheckoutRequest. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String invoiceID;

	/**
	 * Payer's contact telephone number. PayPal returns a contact
	 * telephone number only if your Merchant account profile
	 * settings require that the buyer enter one.	 
	 */ 
	private String contactPhone;

	/**
	 * 	 
	 */ 
	private Boolean billingAgreementAcceptedStatus;

	/**
	 * 	 
	 */ 
	private String redirectRequired;

	/**
	 * Customer's billing address. Optional If you have credit card
	 * mapped in your account then billing address of the credit
	 * card is returned otherwise your primary address is returned
	 * , PayPal returns this address in
	 * GetExpressCheckoutDetailsResponse.	 
	 */ 
	private AddressType billingAddress;

	/**
	 * Text note entered by the buyer in PayPal flow. 	 
	 */ 
	private String note;

	/**
	 * Returns the status of the EC checkout session. Values
	 * include 'PaymentActionNotInitiated', 'PaymentActionFailed',
	 * 'PaymentActionInProgress', 'PaymentCompleted'. 	 
	 */ 
	private String checkoutStatus;

	/**
	 * PayPal may offer a discount or gift certificate to the
	 * buyer, which will be represented by a negativeamount. If the
	 * buyer has a negative balance, PayPal will add that amount to
	 * the current charges, which will be represented as a positive
	 * amount. 	 
	 */ 
	private BasicAmountType payPalAdjustment;

	/**
	 * Information about the individual purchased items. 	 
	 */ 
	private List<PaymentDetailsType> paymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType userSelectedOptions;

	/**
	 * Information about the incentives that were applied from Ebay
	 * RYP page and PayPal RYP page. 	 
	 */ 
	private List<IncentiveDetailsType> incentiveDetails = new ArrayList<IncentiveDetailsType>();

	/**
	 * Information about the Gift message. 	 
	 */ 
	private String giftMessage;

	/**
	 * Information about the Gift receipt enable. 	 
	 */ 
	private String giftReceiptEnable;

	/**
	 * Information about the Gift Wrap name. 	 
	 */ 
	private String giftWrapName;

	/**
	 * Information about the Gift Wrap amount. 	 
	 */ 
	private BasicAmountType giftWrapAmount;

	/**
	 * Information about the Buyer marketing email. 	 
	 */ 
	private String buyerMarketingEmail;

	/**
	 * Information about the survey question. 	 
	 */ 
	private String surveyQuestion;

	/**
	 * Information about the survey choice selected by the user. 	 
	 */ 
	private List<String> surveyChoiceSelected = new ArrayList<String>();

	/**
	 * Contains payment request information about each bucket in
	 * the cart. 	 
	 */ 
	private List<PaymentRequestInfoType> paymentRequestInfo = new ArrayList<PaymentRequestInfoType>();

	/**
	 * Response information resulting from opt-in operation or
	 * current login bypass status. 	 
	 */ 
	private ExternalRememberMeStatusDetailsType externalRememberMeStatusDetails;

	/**
	 * Response information resulting from opt-in operation or
	 * current login bypass status. 	 
	 */ 
	private RefreshTokenStatusDetailsType refreshTokenStatusDetails;

	

	/**
	 * Default Constructor
	 */
	public GetExpressCheckoutDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for token
	 */
	 public String getToken() {
	 	return token;
	 }
	 
	/**
	 * Setter for token
	 */
	 public void setToken(String token) {
	 	this.token = token;
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
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for contactPhone
	 */
	 public String getContactPhone() {
	 	return contactPhone;
	 }
	 
	/**
	 * Setter for contactPhone
	 */
	 public void setContactPhone(String contactPhone) {
	 	this.contactPhone = contactPhone;
	 }
	 
	/**
	 * Getter for billingAgreementAcceptedStatus
	 */
	 public Boolean getBillingAgreementAcceptedStatus() {
	 	return billingAgreementAcceptedStatus;
	 }
	 
	/**
	 * Setter for billingAgreementAcceptedStatus
	 */
	 public void setBillingAgreementAcceptedStatus(Boolean billingAgreementAcceptedStatus) {
	 	this.billingAgreementAcceptedStatus = billingAgreementAcceptedStatus;
	 }
	 
	/**
	 * Getter for redirectRequired
	 */
	 public String getRedirectRequired() {
	 	return redirectRequired;
	 }
	 
	/**
	 * Setter for redirectRequired
	 */
	 public void setRedirectRequired(String redirectRequired) {
	 	this.redirectRequired = redirectRequired;
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
	 
	/**
	 * Getter for note
	 */
	 public String getNote() {
	 	return note;
	 }
	 
	/**
	 * Setter for note
	 */
	 public void setNote(String note) {
	 	this.note = note;
	 }
	 
	/**
	 * Getter for checkoutStatus
	 */
	 public String getCheckoutStatus() {
	 	return checkoutStatus;
	 }
	 
	/**
	 * Setter for checkoutStatus
	 */
	 public void setCheckoutStatus(String checkoutStatus) {
	 	this.checkoutStatus = checkoutStatus;
	 }
	 
	/**
	 * Getter for payPalAdjustment
	 */
	 public BasicAmountType getPayPalAdjustment() {
	 	return payPalAdjustment;
	 }
	 
	/**
	 * Setter for payPalAdjustment
	 */
	 public void setPayPalAdjustment(BasicAmountType payPalAdjustment) {
	 	this.payPalAdjustment = payPalAdjustment;
	 }
	 
	/**
	 * Getter for paymentDetails
	 */
	 public List<PaymentDetailsType> getPaymentDetails() {
	 	return paymentDetails;
	 }
	 
	/**
	 * Setter for paymentDetails
	 */
	 public void setPaymentDetails(List<PaymentDetailsType> paymentDetails) {
	 	this.paymentDetails = paymentDetails;
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
	 * Getter for incentiveDetails
	 */
	 public List<IncentiveDetailsType> getIncentiveDetails() {
	 	return incentiveDetails;
	 }
	 
	/**
	 * Setter for incentiveDetails
	 */
	 public void setIncentiveDetails(List<IncentiveDetailsType> incentiveDetails) {
	 	this.incentiveDetails = incentiveDetails;
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
	 * Getter for giftReceiptEnable
	 */
	 public String getGiftReceiptEnable() {
	 	return giftReceiptEnable;
	 }
	 
	/**
	 * Setter for giftReceiptEnable
	 */
	 public void setGiftReceiptEnable(String giftReceiptEnable) {
	 	this.giftReceiptEnable = giftReceiptEnable;
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
	 * Getter for buyerMarketingEmail
	 */
	 public String getBuyerMarketingEmail() {
	 	return buyerMarketingEmail;
	 }
	 
	/**
	 * Setter for buyerMarketingEmail
	 */
	 public void setBuyerMarketingEmail(String buyerMarketingEmail) {
	 	this.buyerMarketingEmail = buyerMarketingEmail;
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
	 
	/**
	 * Getter for paymentRequestInfo
	 */
	 public List<PaymentRequestInfoType> getPaymentRequestInfo() {
	 	return paymentRequestInfo;
	 }
	 
	/**
	 * Setter for paymentRequestInfo
	 */
	 public void setPaymentRequestInfo(List<PaymentRequestInfoType> paymentRequestInfo) {
	 	this.paymentRequestInfo = paymentRequestInfo;
	 }
	 
	/**
	 * Getter for externalRememberMeStatusDetails
	 */
	 public ExternalRememberMeStatusDetailsType getExternalRememberMeStatusDetails() {
	 	return externalRememberMeStatusDetails;
	 }
	 
	/**
	 * Setter for externalRememberMeStatusDetails
	 */
	 public void setExternalRememberMeStatusDetails(ExternalRememberMeStatusDetailsType externalRememberMeStatusDetails) {
	 	this.externalRememberMeStatusDetails = externalRememberMeStatusDetails;
	 }
	 
	/**
	 * Getter for refreshTokenStatusDetails
	 */
	 public RefreshTokenStatusDetailsType getRefreshTokenStatusDetails() {
	 	return refreshTokenStatusDetails;
	 }
	 
	/**
	 * Setter for refreshTokenStatusDetails
	 */
	 public void setRefreshTokenStatusDetails(RefreshTokenStatusDetailsType refreshTokenStatusDetails) {
	 	this.refreshTokenStatusDetails = refreshTokenStatusDetails;
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
	
	public GetExpressCheckoutDetailsResponseDetailsType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("Token", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.token = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payerInfo =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.invoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ContactPhone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.contactPhone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAgreementAcceptedStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.billingAgreementAcceptedStatus = Boolean.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("RedirectRequired", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.redirectRequired = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.billingAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("Note", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.note = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CheckoutStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.checkoutStatus = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayPalAdjustment", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.payPalAdjustment =  new BasicAmountType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("PaymentDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.paymentDetails.add(new PaymentDetailsType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("UserSelectedOptions", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.userSelectedOptions =  new UserSelectedOptionType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("IncentiveDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.incentiveDetails.add(new IncentiveDetailsType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("GiftMessage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftReceiptEnable", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftReceiptEnable = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftWrapName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.giftWrapAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BuyerMarketingEmail", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.buyerMarketingEmail = childNode.getTextContent();
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
        nodeList = (NodeList) xpath.evaluate("PaymentRequestInfo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.paymentRequestInfo.add(new PaymentRequestInfoType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("ExternalRememberMeStatusDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.externalRememberMeStatusDetails =  new ExternalRememberMeStatusDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("RefreshTokenStatusDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.refreshTokenStatusDetails =  new RefreshTokenStatusDetailsType(childNode);
		}
	}
 
}