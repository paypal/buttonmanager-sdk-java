package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.EnhancedDataType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;

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
	private PaymentActionCodeType PaymentAction;

	/**
	 * The timestamped token value that was returned by
	 * SetExpressCheckoutResponse and passed on
	 * GetExpressCheckoutDetailsRequest. Required Character length
	 * and limitations: 20 single-byte characters	 
	 */ 
	private String Token;

	/**
	 * Encrypted PayPal customer account identification number as
	 * returned by GetExpressCheckoutDetailsResponse. Required
	 * Character length and limitations: 127 single-byte
	 * characters.	 
	 */ 
	private String PayerID;

	/**
	 * URL on Merchant site pertaining to this invoice. Optional 	 
	 */ 
	private String OrderURL;

	/**
	 * Information about the payment Required 	 
	 */ 
	private List<PaymentDetailsType> PaymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * Flag to indicate if previously set promoCode shall be
	 * overriden. Value 1 indicates overriding.  	 
	 */ 
	private String PromoOverrideFlag;

	/**
	 * Promotional financing code for item. Overrides any previous
	 * PromoCode setting. 	 
	 */ 
	private String PromoCode;

	/**
	 * Contains data for enhanced data like Airline Itinerary Data.
	 * 	 
	 */ 
	private EnhancedDataType EnhancedData;

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For
	 * Order this will be ignored. 	 
	 */ 
	private String SoftDescriptor;

	/**
	 * Information about the user selected options. 	 
	 */ 
	private UserSelectedOptionType UserSelectedOptions;

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
	 * An identification code for use by third-party applications
	 * to identify transactions. Optional Character length and
	 * limitations: 32 single-byte alphanumeric characters 	 
	 */ 
	private String ButtonSource;

	/**
	 * Merchant specified flag which indicates whether to create
	 * billing agreement as part of DoEC or not. Optional 	 
	 */ 
	private Boolean SkipBACreation;

	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentRequestDetailsType (){
	}	

	/**
	 * Getter for PaymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return PaymentAction;
	 }
	 
	/**
	 * Setter for PaymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType PaymentAction) {
	 	this.PaymentAction = PaymentAction;
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
	 * Getter for PayerID
	 */
	 public String getPayerID() {
	 	return PayerID;
	 }
	 
	/**
	 * Setter for PayerID
	 */
	 public void setPayerID(String PayerID) {
	 	this.PayerID = PayerID;
	 }
	 
	/**
	 * Getter for OrderURL
	 */
	 public String getOrderURL() {
	 	return OrderURL;
	 }
	 
	/**
	 * Setter for OrderURL
	 */
	 public void setOrderURL(String OrderURL) {
	 	this.OrderURL = OrderURL;
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
	 * Getter for PromoOverrideFlag
	 */
	 public String getPromoOverrideFlag() {
	 	return PromoOverrideFlag;
	 }
	 
	/**
	 * Setter for PromoOverrideFlag
	 */
	 public void setPromoOverrideFlag(String PromoOverrideFlag) {
	 	this.PromoOverrideFlag = PromoOverrideFlag;
	 }
	 
	/**
	 * Getter for PromoCode
	 */
	 public String getPromoCode() {
	 	return PromoCode;
	 }
	 
	/**
	 * Setter for PromoCode
	 */
	 public void setPromoCode(String PromoCode) {
	 	this.PromoCode = PromoCode;
	 }
	 
	/**
	 * Getter for EnhancedData
	 */
	 public EnhancedDataType getEnhancedData() {
	 	return EnhancedData;
	 }
	 
	/**
	 * Setter for EnhancedData
	 */
	 public void setEnhancedData(EnhancedDataType EnhancedData) {
	 	this.EnhancedData = EnhancedData;
	 }
	 
	/**
	 * Getter for SoftDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return SoftDescriptor;
	 }
	 
	/**
	 * Setter for SoftDescriptor
	 */
	 public void setSoftDescriptor(String SoftDescriptor) {
	 	this.SoftDescriptor = SoftDescriptor;
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
	 * Getter for ButtonSource
	 */
	 public String getButtonSource() {
	 	return ButtonSource;
	 }
	 
	/**
	 * Setter for ButtonSource
	 */
	 public void setButtonSource(String ButtonSource) {
	 	this.ButtonSource = ButtonSource;
	 }
	 
	/**
	 * Getter for SkipBACreation
	 */
	 public Boolean getSkipBACreation() {
	 	return SkipBACreation;
	 }
	 
	/**
	 * Setter for SkipBACreation
	 */
	 public void setSkipBACreation(Boolean SkipBACreation) {
	 	this.SkipBACreation = SkipBACreation;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(PaymentAction != null) {
			sb.append("<ebl:PaymentAction>").append(PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if(Token != null) {
			sb.append("<ebl:Token>").append(Token);
			sb.append("</ebl:Token>");
		}
		if(PayerID != null) {
			sb.append("<ebl:PayerID>").append(PayerID);
			sb.append("</ebl:PayerID>");
		}
		if(OrderURL != null) {
			sb.append("<ebl:OrderURL>").append(OrderURL);
			sb.append("</ebl:OrderURL>");
		}
		if(PaymentDetails != null) {
			for(int i=0; i < PaymentDetails.size(); i++) {
				sb.append("<ebl:PaymentDetails>");
				sb.append(PaymentDetails.get(i).toXMLString());
				sb.append("</ebl:PaymentDetails>");
			}
		}
		if(PromoOverrideFlag != null) {
			sb.append("<ebl:PromoOverrideFlag>").append(PromoOverrideFlag);
			sb.append("</ebl:PromoOverrideFlag>");
		}
		if(PromoCode != null) {
			sb.append("<ebl:PromoCode>").append(PromoCode);
			sb.append("</ebl:PromoCode>");
		}
		if(EnhancedData != null) {
			sb.append("<ebl:EnhancedData>");
			sb.append(EnhancedData.toXMLString());
			sb.append("</ebl:EnhancedData>");
		}
		if(SoftDescriptor != null) {
			sb.append("<ebl:SoftDescriptor>").append(SoftDescriptor);
			sb.append("</ebl:SoftDescriptor>");
		}
		if(UserSelectedOptions != null) {
			sb.append("<ebl:UserSelectedOptions>");
			sb.append(UserSelectedOptions.toXMLString());
			sb.append("</ebl:UserSelectedOptions>");
		}
		if(GiftMessage != null) {
			sb.append("<ebl:GiftMessage>").append(GiftMessage);
			sb.append("</ebl:GiftMessage>");
		}
		if(GiftReceiptEnable != null) {
			sb.append("<ebl:GiftReceiptEnable>").append(GiftReceiptEnable);
			sb.append("</ebl:GiftReceiptEnable>");
		}
		if(GiftWrapName != null) {
			sb.append("<ebl:GiftWrapName>").append(GiftWrapName);
			sb.append("</ebl:GiftWrapName>");
		}
		if(GiftWrapAmount != null) {
			sb.append("<ebl:GiftWrapAmount");
			sb.append(GiftWrapAmount.toXMLString());
			sb.append("</ebl:GiftWrapAmount>");
		}
		if(BuyerMarketingEmail != null) {
			sb.append("<ebl:BuyerMarketingEmail>").append(BuyerMarketingEmail);
			sb.append("</ebl:BuyerMarketingEmail>");
		}
		if(SurveyQuestion != null) {
			sb.append("<ebl:SurveyQuestion>").append(SurveyQuestion);
			sb.append("</ebl:SurveyQuestion>");
		}
		if(SurveyChoiceSelected != null) {
			for(int i=0; i < SurveyChoiceSelected.size(); i++) {
				sb.append("<ebl:SurveyChoiceSelected>").append(SurveyChoiceSelected.get(i));
				sb.append("</ebl:SurveyChoiceSelected>");
			}
		}
		if(ButtonSource != null) {
			sb.append("<ebl:ButtonSource>").append(ButtonSource);
			sb.append("</ebl:ButtonSource>");
		}
		if(SkipBACreation != null) {
			sb.append("<ebl:SkipBACreation>").append(SkipBACreation);
			sb.append("</ebl:SkipBACreation>");
		}
		return sb.toString();
	}

}