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
	private String Token;

	/**
	 * Information about the payer	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * A free-form field for your own use, as set by you in the
	 * Custom element of SetExpressCheckoutRequest. Character
	 * length and limitations: 256 single-byte alphanumeric
	 * characters	 
	 */ 
	private String Custom;

	/**
	 * Your own invoice or tracking number, as set by you in the
	 * InvoiceID element of SetExpressCheckoutRequest. Character
	 * length and limitations: 127 single-byte alphanumeric
	 * characters	 
	 */ 
	private String InvoiceID;

	/**
	 * Payer's contact telephone number. PayPal returns a contact
	 * telephone number only if your Merchant account profile
	 * settings require that the buyer enter one.	 
	 */ 
	private String ContactPhone;

	/**
	 * 	 
	 */ 
	private Boolean BillingAgreementAcceptedStatus;

	/**
	 * 	 
	 */ 
	private String RedirectRequired;

	/**
	 * Customer's billing address. Optional If you have credit card
	 * mapped in your account then billing address of the credit
	 * card is returned otherwise your primary address is returned
	 * , PayPal returns this address in
	 * GetExpressCheckoutDetailsResponse.	 
	 */ 
	private AddressType BillingAddress;

	/**
	 * Text note entered by the buyer in PayPal flow. 	 
	 */ 
	private String Note;

	/**
	 * Returns the status of the EC checkout session. Values
	 * include 'PaymentActionNotInitiated', 'PaymentActionFailed',
	 * 'PaymentActionInProgress', 'PaymentCompleted'. 	 
	 */ 
	private String CheckoutStatus;

	/**
	 * PayPal may offer a discount or gift certificate to the
	 * buyer, which will be represented by a negativeamount. If the
	 * buyer has a negative balance, PayPal will add that amount to
	 * the current charges, which will be represented as a positive
	 * amount. 	 
	 */ 
	private BasicAmountType PayPalAdjustment;

	/**
	 * Information about the individual purchased items. 	 
	 */ 
	private List<PaymentDetailsType> PaymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType UserSelectedOptions;

	/**
	 * Information about the incentives that were applied from Ebay
	 * RYP page and PayPal RYP page. 	 
	 */ 
	private List<IncentiveDetailsType> IncentiveDetails = new ArrayList<IncentiveDetailsType>();

	/**
	 * Information about the Gift message. 	 
	 */ 
	private String GiftMessage;

	/**
	 * Information about the Gift receipt enable. 	 
	 */ 
	private String GiftReceiptEnable;

	/**
	 * Information about the Gift Wrap name. 	 
	 */ 
	private String GiftWrapName;

	/**
	 * Information about the Gift Wrap amount. 	 
	 */ 
	private BasicAmountType GiftWrapAmount;

	/**
	 * Information about the Buyer marketing email. 	 
	 */ 
	private String BuyerMarketingEmail;

	/**
	 * Information about the survey question. 	 
	 */ 
	private String SurveyQuestion;

	/**
	 * Information about the survey choice selected by the user. 	 
	 */ 
	private List<String> SurveyChoiceSelected = new ArrayList<String>();

	/**
	 * Contains payment request information about each bucket in
	 * the cart. 	 
	 */ 
	private List<PaymentRequestInfoType> PaymentRequestInfo = new ArrayList<PaymentRequestInfoType>();

	/**
	 * Response information resulting from opt-in operation or
	 * current login bypass status. 	 
	 */ 
	private ExternalRememberMeStatusDetailsType ExternalRememberMeStatusDetails;

	/**
	 * Response information resulting from opt-in operation or
	 * current login bypass status. 	 
	 */ 
	private RefreshTokenStatusDetailsType RefreshTokenStatusDetails;

	

	/**
	 * Default Constructor
	 */
	public GetExpressCheckoutDetailsResponseDetailsType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
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
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for ContactPhone
	 */
	 public String getContactPhone() {
	 	return ContactPhone;
	 }
	 
	/**
	 * Setter for ContactPhone
	 */
	 public void setContactPhone(String ContactPhone) {
	 	this.ContactPhone = ContactPhone;
	 }
	 
	/**
	 * Getter for BillingAgreementAcceptedStatus
	 */
	 public Boolean getBillingAgreementAcceptedStatus() {
	 	return BillingAgreementAcceptedStatus;
	 }
	 
	/**
	 * Setter for BillingAgreementAcceptedStatus
	 */
	 public void setBillingAgreementAcceptedStatus(Boolean BillingAgreementAcceptedStatus) {
	 	this.BillingAgreementAcceptedStatus = BillingAgreementAcceptedStatus;
	 }
	 
	/**
	 * Getter for RedirectRequired
	 */
	 public String getRedirectRequired() {
	 	return RedirectRequired;
	 }
	 
	/**
	 * Setter for RedirectRequired
	 */
	 public void setRedirectRequired(String RedirectRequired) {
	 	this.RedirectRequired = RedirectRequired;
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
	 
	/**
	 * Getter for Note
	 */
	 public String getNote() {
	 	return Note;
	 }
	 
	/**
	 * Setter for Note
	 */
	 public void setNote(String Note) {
	 	this.Note = Note;
	 }
	 
	/**
	 * Getter for CheckoutStatus
	 */
	 public String getCheckoutStatus() {
	 	return CheckoutStatus;
	 }
	 
	/**
	 * Setter for CheckoutStatus
	 */
	 public void setCheckoutStatus(String CheckoutStatus) {
	 	this.CheckoutStatus = CheckoutStatus;
	 }
	 
	/**
	 * Getter for PayPalAdjustment
	 */
	 public BasicAmountType getPayPalAdjustment() {
	 	return PayPalAdjustment;
	 }
	 
	/**
	 * Setter for PayPalAdjustment
	 */
	 public void setPayPalAdjustment(BasicAmountType PayPalAdjustment) {
	 	this.PayPalAdjustment = PayPalAdjustment;
	 }
	 
	/**
	 * Getter for PaymentDetails
	 */
	 public List<PaymentDetailsType> getPaymentDetails() {
	 	return PaymentDetails;
	 }
	 
	/**
	 * Setter for PaymentDetails
	 */
	 public void setPaymentDetails(List<PaymentDetailsType> PaymentDetails) {
	 	this.PaymentDetails = PaymentDetails;
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
	 * Getter for IncentiveDetails
	 */
	 public List<IncentiveDetailsType> getIncentiveDetails() {
	 	return IncentiveDetails;
	 }
	 
	/**
	 * Setter for IncentiveDetails
	 */
	 public void setIncentiveDetails(List<IncentiveDetailsType> IncentiveDetails) {
	 	this.IncentiveDetails = IncentiveDetails;
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
	 * Getter for GiftReceiptEnable
	 */
	 public String getGiftReceiptEnable() {
	 	return GiftReceiptEnable;
	 }
	 
	/**
	 * Setter for GiftReceiptEnable
	 */
	 public void setGiftReceiptEnable(String GiftReceiptEnable) {
	 	this.GiftReceiptEnable = GiftReceiptEnable;
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
	 * Getter for BuyerMarketingEmail
	 */
	 public String getBuyerMarketingEmail() {
	 	return BuyerMarketingEmail;
	 }
	 
	/**
	 * Setter for BuyerMarketingEmail
	 */
	 public void setBuyerMarketingEmail(String BuyerMarketingEmail) {
	 	this.BuyerMarketingEmail = BuyerMarketingEmail;
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
	 
	/**
	 * Getter for PaymentRequestInfo
	 */
	 public List<PaymentRequestInfoType> getPaymentRequestInfo() {
	 	return PaymentRequestInfo;
	 }
	 
	/**
	 * Setter for PaymentRequestInfo
	 */
	 public void setPaymentRequestInfo(List<PaymentRequestInfoType> PaymentRequestInfo) {
	 	this.PaymentRequestInfo = PaymentRequestInfo;
	 }
	 
	/**
	 * Getter for ExternalRememberMeStatusDetails
	 */
	 public ExternalRememberMeStatusDetailsType getExternalRememberMeStatusDetails() {
	 	return ExternalRememberMeStatusDetails;
	 }
	 
	/**
	 * Setter for ExternalRememberMeStatusDetails
	 */
	 public void setExternalRememberMeStatusDetails(ExternalRememberMeStatusDetailsType ExternalRememberMeStatusDetails) {
	 	this.ExternalRememberMeStatusDetails = ExternalRememberMeStatusDetails;
	 }
	 
	/**
	 * Getter for RefreshTokenStatusDetails
	 */
	 public RefreshTokenStatusDetailsType getRefreshTokenStatusDetails() {
	 	return RefreshTokenStatusDetails;
	 }
	 
	/**
	 * Setter for RefreshTokenStatusDetails
	 */
	 public void setRefreshTokenStatusDetails(RefreshTokenStatusDetailsType RefreshTokenStatusDetails) {
	 	this.RefreshTokenStatusDetails = RefreshTokenStatusDetails;
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
		    this.Token = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayerInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayerInfo =  new PayerInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("Custom", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Custom = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InvoiceID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.InvoiceID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ContactPhone", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ContactPhone = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAgreementAcceptedStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
			this.BillingAgreementAcceptedStatus = Boolean.valueOf(childNode.getTextContent());
		}
	
		childNode = (Node) xpath.evaluate("RedirectRequired", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RedirectRequired = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("BillingAddress", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BillingAddress =  new AddressType(childNode);
		}
		childNode = (Node) xpath.evaluate("Note", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.Note = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("CheckoutStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.CheckoutStatus = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PayPalAdjustment", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.PayPalAdjustment =  new BasicAmountType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("PaymentDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.PaymentDetails.add(new PaymentDetailsType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("UserSelectedOptions", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.UserSelectedOptions =  new UserSelectedOptionType(childNode);
		}
        nodeList = (NodeList) xpath.evaluate("IncentiveDetails", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.IncentiveDetails.add(new IncentiveDetailsType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("GiftMessage", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftMessage = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftReceiptEnable", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftReceiptEnable = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapName", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftWrapName = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GiftWrapAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.GiftWrapAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("BuyerMarketingEmail", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.BuyerMarketingEmail = childNode.getTextContent();
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
        nodeList = (NodeList) xpath.evaluate("PaymentRequestInfo", node, XPathConstants.NODESET);
		if (nodeList != null && nodeList.getLength() > 0) {
			for(int i=0; i < nodeList.getLength(); i++) {
				Node subNode = nodeList.item(i);
				this.PaymentRequestInfo.add(new PaymentRequestInfoType(subNode));
			}
		}
		childNode = (Node) xpath.evaluate("ExternalRememberMeStatusDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ExternalRememberMeStatusDetails =  new ExternalRememberMeStatusDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("RefreshTokenStatusDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.RefreshTokenStatusDetails =  new RefreshTokenStatusDetailsType(childNode);
		}
	}
 
}