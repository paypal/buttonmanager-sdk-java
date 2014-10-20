package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.EnhancedDataType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CoupledBucketsType;
import com.paypal.core.SDKUtil;

/**
 * How you want to obtain payment. Required Authorization
 * indicates that this payment is a basic authorization subject
 * to settlement with PayPal Authorization and Capture. Order
 * indicates that this payment is is an order authorization
 * subject to settlement with PayPal Authorization and Capture.
 * Sale indicates that this is a final sale for which you are
 * requesting payment. IMPORTANT: You cannot set PaymentAction
 * to Sale on SetExpressCheckoutRequest and then change
 * PaymentAction to Authorization on the final Express Checkout
 * API, DoExpressCheckoutPaymentRequest. Character length and
 * limit: Up to 13 single-byte alphabetic characters 
 */
public class DoExpressCheckoutPaymentRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * How you want to obtain payment. Required Authorization
	 * indicates that this payment is a basic authorization subject
	 * to settlement with PayPal Authorization and Capture. Order
	 * indicates that this payment is is an order authorization
	 * subject to settlement with PayPal Authorization and Capture.
	 * Sale indicates that this is a final sale for which you are
	 * requesting payment. IMPORTANT: You cannot set PaymentAction
	 * to Sale on SetExpressCheckoutRequest and then change
	 * PaymentAction to Authorization on the final Express Checkout
	 * API, DoExpressCheckoutPaymentRequest. Character length and
	 * limit: Up to 13 single-byte alphabetic characters	 
	 */ 
	private PaymentActionCodeType paymentAction;

	/**
	 * The timestamped token value that was returned by
	 * SetExpressCheckoutResponse and passed on
	 * GetExpressCheckoutDetailsRequest. Required Character length
	 * and limitations: 20 single-byte characters	 
	 */ 
	private String token;

	/**
	 * Encrypted PayPal customer account identification number as
	 * returned by GetExpressCheckoutDetailsResponse. Required
	 * Character length and limitations: 127 single-byte
	 * characters.	 
	 */ 
	private String payerID;

	/**
	 * URL on Merchant site pertaining to this invoice. Optional 	 
	 */ 
	private String orderURL;

	/**
	 * Unique id for each API request to prevent duplicate payments
	 * on merchant side. Passed directly back to merchant in
	 * response. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	/**
	 * Information about the payment Required 	 
	 */ 
	private List<PaymentDetailsType> paymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * Flag to indicate if previously set promoCode shall be
	 * overriden. Value 1 indicates overriding.  	 
	 */ 
	private String promoOverrideFlag;

	/**
	 * Promotional financing code for item. Overrides any previous
	 * PromoCode setting. 	 
	 */ 
	private String promoCode;

	/**
	 * Contains data for enhanced data like Airline Itinerary Data.
	 * 	 
	 */ 
	private EnhancedDataType enhancedData;

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For
	 * Order this will be ignored. 	 
	 */ 
	private String softDescriptor;

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType userSelectedOptions;

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
	 * An identification code for use by third-party applications
	 * to identify transactions. Optional Character length and
	 * limitations: 32 single-byte alphanumeric characters 	 
	 */ 
	private String buttonSource = "PayPal_SDK";

	/**
	 * Merchant specified flag which indicates whether to create
	 * billing agreement as part of DoEC or not. Optional 	 
	 */ 
	private Boolean skipBACreation;

	/**
	 * Merchant specified flag which indicates to use payment
	 * details from session if available. Optional 	 
	 */ 
	private String useSessionPaymentDetails;

	/**
	 * Optional element that defines relationship between buckets 	 
	 */ 
	private List<CoupledBucketsType> coupledBuckets = new ArrayList<CoupledBucketsType>();

	/**
	 * Optional element for the passing client id 	 
	 */ 
	private String clientID;

	/**
	 * Optional element for the passing product lines 	 
	 */ 
	private String productLine;

	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentRequestDetailsType (){
	}	

	/**
	 * Getter for paymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return paymentAction;
	 }
	 
	/**
	 * Setter for paymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType paymentAction) {
	 	this.paymentAction = paymentAction;
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
	 * Getter for payerID
	 */
	 public String getPayerID() {
	 	return payerID;
	 }
	 
	/**
	 * Setter for payerID
	 */
	 public void setPayerID(String payerID) {
	 	this.payerID = payerID;
	 }
	 
	/**
	 * Getter for orderURL
	 */
	 public String getOrderURL() {
	 	return orderURL;
	 }
	 
	/**
	 * Setter for orderURL
	 */
	 public void setOrderURL(String orderURL) {
	 	this.orderURL = orderURL;
	 }
	 
	/**
	 * Getter for msgSubID
	 */
	 public String getMsgSubID() {
	 	return msgSubID;
	 }
	 
	/**
	 * Setter for msgSubID
	 */
	 public void setMsgSubID(String msgSubID) {
	 	this.msgSubID = msgSubID;
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
	 * Getter for promoOverrideFlag
	 */
	 public String getPromoOverrideFlag() {
	 	return promoOverrideFlag;
	 }
	 
	/**
	 * Setter for promoOverrideFlag
	 */
	 public void setPromoOverrideFlag(String promoOverrideFlag) {
	 	this.promoOverrideFlag = promoOverrideFlag;
	 }
	 
	/**
	 * Getter for promoCode
	 */
	 public String getPromoCode() {
	 	return promoCode;
	 }
	 
	/**
	 * Setter for promoCode
	 */
	 public void setPromoCode(String promoCode) {
	 	this.promoCode = promoCode;
	 }
	 
	/**
	 * Getter for enhancedData
	 */
	 public EnhancedDataType getEnhancedData() {
	 	return enhancedData;
	 }
	 
	/**
	 * Setter for enhancedData
	 */
	 public void setEnhancedData(EnhancedDataType enhancedData) {
	 	this.enhancedData = enhancedData;
	 }
	 
	/**
	 * Getter for softDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return softDescriptor;
	 }
	 
	/**
	 * Setter for softDescriptor
	 */
	 public void setSoftDescriptor(String softDescriptor) {
	 	this.softDescriptor = softDescriptor;
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
	 * Getter for buttonSource
	 */
	 public String getButtonSource() {
	 	return buttonSource;
	 }
	 
	/**
	 * Setter for buttonSource
	 */
	 public void setButtonSource(String buttonSource) {
	 	this.buttonSource = buttonSource;
	 }
	 
	/**
	 * Getter for skipBACreation
	 */
	 public Boolean getSkipBACreation() {
	 	return skipBACreation;
	 }
	 
	/**
	 * Setter for skipBACreation
	 */
	 public void setSkipBACreation(Boolean skipBACreation) {
	 	this.skipBACreation = skipBACreation;
	 }
	 
	/**
	 * Getter for useSessionPaymentDetails
	 */
	 public String getUseSessionPaymentDetails() {
	 	return useSessionPaymentDetails;
	 }
	 
	/**
	 * Setter for useSessionPaymentDetails
	 */
	 public void setUseSessionPaymentDetails(String useSessionPaymentDetails) {
	 	this.useSessionPaymentDetails = useSessionPaymentDetails;
	 }
	 
	/**
	 * Getter for coupledBuckets
	 */
	 public List<CoupledBucketsType> getCoupledBuckets() {
	 	return coupledBuckets;
	 }
	 
	/**
	 * Setter for coupledBuckets
	 */
	 public void setCoupledBuckets(List<CoupledBucketsType> coupledBuckets) {
	 	this.coupledBuckets = coupledBuckets;
	 }
	 
	/**
	 * Getter for clientID
	 */
	 public String getClientID() {
	 	return clientID;
	 }
	 
	/**
	 * Setter for clientID
	 */
	 public void setClientID(String clientID) {
	 	this.clientID = clientID;
	 }
	 
	/**
	 * Getter for productLine
	 */
	 public String getProductLine() {
	 	return productLine;
	 }
	 
	/**
	 * Setter for productLine
	 */
	 public void setProductLine(String productLine) {
	 	this.productLine = productLine;
	 }
	 


	public String toXMLString(String prefix, String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(paymentAction != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.paymentAction.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentAction>");
		}
		if(token != null) {
			sb.append("<").append(preferredPrefix).append(":Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.token));
			sb.append("</").append(preferredPrefix).append(":Token>");
		}
		if(payerID != null) {
			sb.append("<").append(preferredPrefix).append(":PayerID>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.payerID));
			sb.append("</").append(preferredPrefix).append(":PayerID>");
		}
		if(orderURL != null) {
			sb.append("<").append(preferredPrefix).append(":OrderURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.orderURL));
			sb.append("</").append(preferredPrefix).append(":OrderURL>");
		}
		if(msgSubID != null) {
			sb.append("<").append(preferredPrefix).append(":MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.msgSubID));
			sb.append("</").append(preferredPrefix).append(":MsgSubID>");
		}
		if(paymentDetails != null) {
			for(int i=0; i < paymentDetails.size(); i++) {
				sb.append(paymentDetails.get(i).toXMLString(preferredPrefix,"PaymentDetails"));
			}
		}
		if(promoOverrideFlag != null) {
			sb.append("<").append(preferredPrefix).append(":PromoOverrideFlag>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.promoOverrideFlag));
			sb.append("</").append(preferredPrefix).append(":PromoOverrideFlag>");
		}
		if(promoCode != null) {
			sb.append("<").append(preferredPrefix).append(":PromoCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.promoCode));
			sb.append("</").append(preferredPrefix).append(":PromoCode>");
		}
		if(enhancedData != null) {
			sb.append(enhancedData.toXMLString(preferredPrefix,"EnhancedData"));
		}
		if(softDescriptor != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.softDescriptor));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptor>");
		}
		if(userSelectedOptions != null) {
			sb.append(userSelectedOptions.toXMLString(preferredPrefix,"UserSelectedOptions"));
		}
		if(giftMessage != null) {
			sb.append("<").append(preferredPrefix).append(":GiftMessage>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.giftMessage));
			sb.append("</").append(preferredPrefix).append(":GiftMessage>");
		}
		if(giftReceiptEnable != null) {
			sb.append("<").append(preferredPrefix).append(":GiftReceiptEnable>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.giftReceiptEnable));
			sb.append("</").append(preferredPrefix).append(":GiftReceiptEnable>");
		}
		if(giftWrapName != null) {
			sb.append("<").append(preferredPrefix).append(":GiftWrapName>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.giftWrapName));
			sb.append("</").append(preferredPrefix).append(":GiftWrapName>");
		}
		if(giftWrapAmount != null) {
			sb.append(giftWrapAmount.toXMLString(preferredPrefix,"GiftWrapAmount"));
		}
		if(buyerMarketingEmail != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerMarketingEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.buyerMarketingEmail));
			sb.append("</").append(preferredPrefix).append(":BuyerMarketingEmail>");
		}
		if(surveyQuestion != null) {
			sb.append("<").append(preferredPrefix).append(":SurveyQuestion>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.surveyQuestion));
			sb.append("</").append(preferredPrefix).append(":SurveyQuestion>");
		}
		if(surveyChoiceSelected != null) {
			for(int i=0; i < surveyChoiceSelected.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":SurveyChoiceSelected>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.surveyChoiceSelected.get(i)));
				sb.append("</").append(preferredPrefix).append(":SurveyChoiceSelected>");
			}
		}
		if(buttonSource != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.buttonSource));
			sb.append("</").append(preferredPrefix).append(":ButtonSource>");
		}
		if(skipBACreation != null) {
			sb.append("<").append(preferredPrefix).append(":SkipBACreation>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.skipBACreation));
			sb.append("</").append(preferredPrefix).append(":SkipBACreation>");
		}
		if(useSessionPaymentDetails != null) {
			sb.append("<").append(preferredPrefix).append(":UseSessionPaymentDetails>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.useSessionPaymentDetails));
			sb.append("</").append(preferredPrefix).append(":UseSessionPaymentDetails>");
		}
		if(coupledBuckets != null) {
			for(int i=0; i < coupledBuckets.size(); i++) {
				sb.append(coupledBuckets.get(i).toXMLString(preferredPrefix,"CoupledBuckets"));
			}
		}
		if(clientID != null) {
			sb.append("<").append(preferredPrefix).append(":ClientID>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.clientID));
			sb.append("</").append(preferredPrefix).append(":ClientID>");
		}
		if(productLine != null) {
			sb.append("<").append(preferredPrefix).append(":ProductLine>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.productLine));
			sb.append("</").append(preferredPrefix).append(":ProductLine>");
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}