
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedCheckoutDataType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.BillingAgreementDetailsType;
import urn.ebay.apis.eBLBaseComponents.BuyerDetailsType;
import urn.ebay.apis.eBLBaseComponents.ChannelType;
import urn.ebay.apis.eBLBaseComponents.DisplayControlDetailsType;
import urn.ebay.apis.eBLBaseComponents.ExternalPartnerTrackingDetailsType;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeOptInDetailsType;
import urn.ebay.apis.eBLBaseComponents.FlowControlDetailsType;
import urn.ebay.apis.eBLBaseComponents.FundingSourceDetailsType;
import urn.ebay.apis.eBLBaseComponents.IncentiveInfoType;
import urn.ebay.apis.eBLBaseComponents.LandingPageType;
import urn.ebay.apis.eBLBaseComponents.OtherPaymentMethodDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.ProductCategoryType;
import urn.ebay.apis.eBLBaseComponents.ShippingOptionType;
import urn.ebay.apis.eBLBaseComponents.ShippingServiceCodeType;
import urn.ebay.apis.eBLBaseComponents.SolutionTypeType;
import urn.ebay.apis.eBLBaseComponents.TotalType;


/**
 * The total cost of the order to the customer. If shipping cost and tax charges are known, include them in OrderTotal; if not, OrderTotal should be the current sub-total of the order. 
 * You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies. 
 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,).
 */
public class SetExpressCheckoutRequestDetailsType {

	/**
The total cost of the order to the customer. If shipping cost and tax charges are known, include them in OrderTotal; if not, OrderTotal should be the current sub-total of the order. 
	 * You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies. 
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,).
	 */
	private BasicAmountType OrderTotal;
	public BasicAmountType getOrderTotal() {
		return OrderTotal;
	}
	public void setOrderTotal(BasicAmountType value) {
		this.OrderTotal = value;
	}

	/**
URL to which the customer's browser is returned after choosing to pay with PayPal. PayPal recommends that the value of ReturnURL be the final review page on which the customer confirms the order and payment. 
	 * Required
	 * Character length and limitations: no limit. 	 */
	private String ReturnURL;
	public String getReturnURL() {
		return ReturnURL;
	}
	public void setReturnURL(String value) {
		this.ReturnURL = value;
	}

	/**
URL to which the customer is returned if he does not approve the use of PayPal to pay you. PayPal recommends that the value of CancelURL be the original page on which the customer chose to pay with PayPal. 
	 * Required
	 * Character length and limitations: no limit
	 */
	private String CancelURL;
	public String getCancelURL() {
		return CancelURL;
	}
	public void setCancelURL(String value) {
		this.CancelURL = value;
	}

	/**
Tracking URL for ebay. 
	 * Required
	 * Character length and limitations: no limit
	 */
	private String TrackingImageURL;
	public String getTrackingImageURL() {
		return TrackingImageURL;
	}
	public void setTrackingImageURL(String value) {
		this.TrackingImageURL = value;
	}

	/**
URL to which the customer's browser is returned after paying with giropay online. 
	 * Optional
	 * Character length and limitations: no limit.
	 */
	private String giropaySuccessURL;
	public String getGiropaySuccessURL() {
		return giropaySuccessURL;
	}
	public void setGiropaySuccessURL(String value) {
		this.giropaySuccessURL = value;
	}

	/**
URL to which the customer's browser is returned after fail to pay with giropay online. 
	 * Optional
	 * Character length and limitations: no limit.
	 */
	private String giropayCancelURL;
	public String getGiropayCancelURL() {
		return giropayCancelURL;
	}
	public void setGiropayCancelURL(String value) {
		this.giropayCancelURL = value;
	}

	/**
URL to which the customer's browser can be returned in the mEFT done page. 
	 * Optional
	 * Character length and limitations: no limit.
	 */
	private String BanktxnPendingURL;
	public String getBanktxnPendingURL() {
		return BanktxnPendingURL;
	}
	public void setBanktxnPendingURL(String value) {
		this.BanktxnPendingURL = value;
	}

	/**
On your first invocation of SetExpressCheckoutRequest, the value of this token is returned by SetExpressCheckoutResponse. 
	 * Optional
	 * Include this element and its value only if you want to modify an existing checkout session with another invocation of SetExpressCheckoutRequest; for example, if you want the customer to edit his shipping address on PayPal. 
	 * Character length and limitations: 20 single-byte characters
	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
	}

	/**
The expected maximum total amount of the complete order, including shipping cost and tax charges. 
	 * Optional
	 * You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies. 
	 * Limitations: Must not exceed $10,000 USD in any currency. No currency symbol. Decimal separator must be a period (.), and the thousands separator must be a comma (,).
	 */
	private BasicAmountType MaxAmount;
	public BasicAmountType getMaxAmount() {
		return MaxAmount;
	}
	public void setMaxAmount(BasicAmountType value) {
		this.MaxAmount = value;
	}

	/**
Description of items the customer is purchasing. 
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String OrderDescription;
	public String getOrderDescription() {
		return OrderDescription;
	}
	public void setOrderDescription(String value) {
		this.OrderDescription = value;
	}

	/**
A free-form field for your own use, such as a tracking number or other value you want PayPal to return on GetExpressCheckoutDetailsResponse and DoExpressCheckoutPaymentResponse. 
	 * Optional
	 * Character length and limitations: 256 single-byte alphanumeric characters
	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}

	/**
Your own unique invoice or tracking number. PayPal returns this value to you on DoExpressCheckoutPaymentResponse. 
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}

	/**
The value 1 indicates that you require that the customer's shipping address on file with PayPal be a confirmed address. Any value other than 1 indicates that the customer's shipping address on file with PayPal need NOT be a confirmed address. Setting this element overrides the setting you have specified in the recipient's Merchant Account Profile. 
	 * Optional
	 * Character length and limitations: One single-byte numeric character.
	 */
	private String ReqConfirmShipping;
	public String getReqConfirmShipping() {
		return ReqConfirmShipping;
	}
	public void setReqConfirmShipping(String value) {
		this.ReqConfirmShipping = value;
	}

	/**
The value 1 indicates that you require that the customer's billing address on file. Setting this element overrides the setting you have specified in Admin.
	 * Optional
	 * Character length and limitations: One single-byte numeric character.
	 */
	private String ReqBillingAddress;
	public String getReqBillingAddress() {
		return ReqBillingAddress;
	}
	public void setReqBillingAddress(String value) {
		this.ReqBillingAddress = value;
	}

	/**
	 * The billing address for the buyer.
	 * Optional
	 * If you include the BillingAddress element, the AddressType elements are required:
	 * Name
	 * Street1
	 * CityName
	 * CountryCode
	 * Do not set set the CountryName element.
	 */
	private AddressType BillingAddress;
	public AddressType getBillingAddress() {
		return BillingAddress;
	}
	public void setBillingAddress(AddressType value) {
		this.BillingAddress = value;
	}

	/**
The value 1 indicates that on the PayPal pages, no shipping address fields should be displayed whatsoever. 
	 * Optional
	 * Character length and limitations: Four single-byte numeric characters.
	 */
	private String NoShipping;
	public String getNoShipping() {
		return NoShipping;
	}
	public void setNoShipping(String value) {
		this.NoShipping = value;
	}

	/**
The value 1 indicates that the PayPal pages should display the shipping address set by you in the Address element on this SetExpressCheckoutRequest, not the shipping address on file with PayPal for this customer. Displaying the PayPal street address on file does not allow the customer to edit that address. 
	 * Optional
	 * Character length and limitations: Four single-byte numeric characters.
	 */
	private String AddressOverride;
	public String getAddressOverride() {
		return AddressOverride;
	}
	public void setAddressOverride(String value) {
		this.AddressOverride = value;
	}

	/**
	 * Locale of pages displayed by PayPal during Express Checkout. 
	 * Optional
	 * Character length and limitations: Five single-byte alphabetic characters, upper- or lowercase. 
	 * Allowable values: 
	 * AU or en_AU
	 * DE or de_DE
	 * FR or fr_FR
	 * GB or en_GB
	 * IT or it_IT
	 * JP or ja_JP
	 * US or en_US
	 */
	private String LocaleCode;
	public String getLocaleCode() {
		return LocaleCode;
	}
	public void setLocaleCode(String value) {
		this.LocaleCode = value;
	}

	/**
Sets the Custom Payment Page Style for payment pages associated with this button/link. PageStyle corresponds to the HTML variable page_style for customizing payment pages. The value is the same as the Page Style Name you chose when adding or editing the page style from the Profile subtab of the My Account tab of your PayPal account. 
	 * Optional
	 * Character length and limitations: 30 single-byte alphabetic characters.
	 */
	private String PageStyle;
	public String getPageStyle() {
		return PageStyle;
	}
	public void setPageStyle(String value) {
		this.PageStyle = value;
	}

	/**
	 * A URL for the image you want to appear at the top left of the payment page. The image has a maximum size of 750 pixels wide by 90 pixels high. PayPal recommends that you provide an image that is stored on a secure (https) server. 
	 * Optional
	 * Character length and limitations: 127
	 */
	private String cppheaderimage;
	public String getCppheaderimage() {
		return cppheaderimage;
	}
	public void setCppheaderimage(String value) {
		this.cppheaderimage = value;
	}

	/**
	 * Sets the border color around the header of the payment page. The border is a 2-pixel perimeter around the header space, which is 750 pixels wide by 90 pixels high. 
	 * Optional
	 * Character length and limitations: Six character HTML hexadecimal color code in ASCII
	 */
	private String cppheaderbordercolor;
	public String getCppheaderbordercolor() {
		return cppheaderbordercolor;
	}
	public void setCppheaderbordercolor(String value) {
		this.cppheaderbordercolor = value;
	}

	/**
	 * Sets the background color for the header of the payment page. 
	 * Optional
	 * Character length and limitation: Six character HTML hexadecimal color code in ASCII
	 */
	private String cppheaderbackcolor;
	public String getCppheaderbackcolor() {
		return cppheaderbackcolor;
	}
	public void setCppheaderbackcolor(String value) {
		this.cppheaderbackcolor = value;
	}

	/**
	 * Sets the background color for the payment page. 
	 * Optional
	 * Character length and limitation: Six character HTML hexadecimal color code in ASCII
	 */
	private String cpppayflowcolor;
	public String getCpppayflowcolor() {
		return cpppayflowcolor;
	}
	public void setCpppayflowcolor(String value) {
		this.cpppayflowcolor = value;
	}

	/**
	 * Sets the cart gradient color for the Mini Cart on 1X flow. 
	 * Optional
	 * Character length and limitation: Six character HTML hexadecimal color code in ASCII
	 */
	private String cppcartbordercolor;
	public String getCppcartbordercolor() {
		return cppcartbordercolor;
	}
	public void setCppcartbordercolor(String value) {
		this.cppcartbordercolor = value;
	}

	/**
	 * A URL for the image you want to appear above the mini-cart. The image has a maximum size of 190 pixels wide by 60 pixels high. PayPal recommends that you provide an image that is stored on a secure (https) server. 
	 * Optional
	 * Character length and limitations: 127
	 */
	private String cpplogoimage;
	public String getCpplogoimage() {
		return cpplogoimage;
	}
	public void setCpplogoimage(String value) {
		this.cpplogoimage = value;
	}

	/**
Customer's shipping address. 
	 * Optional
	 * If you include a shipping address and set the AddressOverride element on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse. 
	 */
	private AddressType Address;
	public AddressType getAddress() {
		return Address;
	}
	public void setAddress(AddressType value) {
		this.Address = value;
	}

	/**
	 * How you want to obtain payment. 
	 * Required
	 * Authorization indicates that this payment is a basic authorization subject to settlement with PayPal Authorization and Capture.
	 * Order indicates that this payment is is an order authorization subject to settlement with PayPal Authorization and Capture.
	 * Sale indicates that this is a final sale for which you are requesting payment.
	 * IMPORTANT: You cannot set PaymentAction to Sale or Order on SetExpressCheckoutRequest and then change PaymentAction to Authorization on the final Express Checkout API, DoExpressCheckoutPaymentRequest.
	 * Character length and limit: Up to 13 single-byte alphabetic characters
	 */
	private PaymentActionCodeType PaymentAction;
	public PaymentActionCodeType getPaymentAction() {
		return PaymentAction;
	}
	public void setPaymentAction(PaymentActionCodeType value) {
		this.PaymentAction = value;
	}

	/**
	 * This will indicate which flow you are choosing (expresschecheckout or expresscheckout optional)
	 * Optional
	 * None
	 * Sole indicates that you are in the ExpressO flow
	 * Mark indicates that you are in the old express flow.
	 */
	private SolutionTypeType SolutionType;
	public SolutionTypeType getSolutionType() {
		return SolutionType;
	}
	public void setSolutionType(SolutionTypeType value) {
		this.SolutionType = value;
	}

	/**
	 * This indicates Which page to display for ExpressO (Billing or Login) 
	 * Optional
	 * None
	 * Billing indicates that you are not a paypal account holder
	 * Login indicates that you are a paypal account holder
	 */
	private LandingPageType LandingPage;
	public LandingPageType getLandingPage() {
		return LandingPage;
	}
	public void setLandingPage(LandingPageType value) {
		this.LandingPage = value;
	}

	/**
	 * Email address of the buyer as entered during checkout. PayPal uses this value to pre-fill the PayPal membership sign-up portion of the PayPal login page. 
	 * Optional
	 * Character length and limit: 127 single-byte alphanumeric characters 
	 */
	private String BuyerEmail;
	public String getBuyerEmail() {
		return BuyerEmail;
	}
	public void setBuyerEmail(String value) {
		this.BuyerEmail = value;
	}

	/**
	 */
	private ChannelType ChannelType;
	public ChannelType getChannelType() {
		return ChannelType;
	}
	public void setChannelType(ChannelType value) {
		this.ChannelType = value;
	}

	/**
	 */
	private List<BillingAgreementDetailsType> BillingAgreementDetails = new ArrayList<BillingAgreementDetailsType>();
	public List<BillingAgreementDetailsType> getBillingAgreementDetails() {
		return BillingAgreementDetails;
	}
	public void setBillingAgreementDetails(List<BillingAgreementDetailsType> value) {
		this.BillingAgreementDetails = value;
	}

	/**
	 * Promo Code
	 * Optional
	 * List of promo codes supplied by merchant. These promo codes enable the Merchant Services Promotion Financing feature.
	 */
	private List<String> PromoCodes = new ArrayList<String>();
	public List<String> getPromoCodes() {
		return PromoCodes;
	}
	public void setPromoCodes(List<String> value) {
		this.PromoCodes = value;
	}

	/**
	 * Default Funding option for PayLater Checkout button.
	 */
	private String PayPalCheckOutBtnType;
	public String getPayPalCheckOutBtnType() {
		return PayPalCheckOutBtnType;
	}
	public void setPayPalCheckOutBtnType(String value) {
		this.PayPalCheckOutBtnType = value;
	}

	/**
	 */
	private ProductCategoryType ProductCategory;
	public ProductCategoryType getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(ProductCategoryType value) {
		this.ProductCategory = value;
	}

	/**
	 */
	private ShippingServiceCodeType ShippingMethod;
	public ShippingServiceCodeType getShippingMethod() {
		return ShippingMethod;
	}
	public void setShippingMethod(ShippingServiceCodeType value) {
		this.ShippingMethod = value;
	}

	/**
	 * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at which address was changed by the user. 
	 */
	private String ProfileAddressChangeDate;
	public String getProfileAddressChangeDate() {
		return ProfileAddressChangeDate;
	}
	public void setProfileAddressChangeDate(String value) {
		this.ProfileAddressChangeDate = value;
	}

	/**
	 * The value 1 indicates that the customer may enter a note to the merchant on the PayPal page during checkout. The note is returned in the GetExpressCheckoutDetails response and the DoExpressCheckoutPayment response.
	 * Optional
	 * Character length and limitations: One single-byte numeric character.
	 * Allowable values: 0,1 
	 */
	private String AllowNote;
	public String getAllowNote() {
		return AllowNote;
	}
	public void setAllowNote(String value) {
		this.AllowNote = value;
	}

	/**
	 * Funding source preferences. 
	 */
	private FundingSourceDetailsType FundingSourceDetails;
	public FundingSourceDetailsType getFundingSourceDetails() {
		return FundingSourceDetails;
	}
	public void setFundingSourceDetails(FundingSourceDetailsType value) {
		this.FundingSourceDetails = value;
	}

	/**
	 * The label that needs to be displayed on the cancel links in the PayPal hosted checkout pages.  
	 * Optional  
	 * Character length and limit: 127 single-byte alphanumeric characters 
	 */
	private String BrandName;
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String value) {
		this.BrandName = value;
	}

	/**
	 * URL for PayPal to use to retrieve shipping, handling, insurance, and tax details from your website.
	 * Optional
	 * Character length and limitations: 2048 characters.
	 */
	private String CallbackURL;
	public String getCallbackURL() {
		return CallbackURL;
	}
	public void setCallbackURL(String value) {
		this.CallbackURL = value;
	}

	/**
	 * Enhanced data for different industry segments. 
	 * Optional
	 */
	private EnhancedCheckoutDataType EnhancedCheckoutData;
	public EnhancedCheckoutDataType getEnhancedCheckoutData() {
		return EnhancedCheckoutData;
	}
	public void setEnhancedCheckoutData(EnhancedCheckoutDataType value) {
		this.EnhancedCheckoutData = value;
	}

	/**
	 * List of other payment methods the user can pay with.
	 * Optional
	 * Refer to the OtherPaymentMethodDetailsType for more details.
	 */
	private List<OtherPaymentMethodDetailsType> OtherPaymentMethods = new ArrayList<OtherPaymentMethodDetailsType>();
	public List<OtherPaymentMethodDetailsType> getOtherPaymentMethods() {
		return OtherPaymentMethods;
	}
	public void setOtherPaymentMethods(List<OtherPaymentMethodDetailsType> value) {
		this.OtherPaymentMethods = value;
	}

	/**
	 * Details about the buyer's account. 
	 * Optional
	 * Refer to the BuyerDetailsType for more details. 
	 */
	private BuyerDetailsType BuyerDetails;
	public BuyerDetailsType getBuyerDetails() {
		return BuyerDetails;
	}
	public void setBuyerDetails(BuyerDetailsType value) {
		this.BuyerDetails = value;
	}

	/**
	 * Information about the payment.
	 */
	private List<PaymentDetailsType> PaymentDetails = new ArrayList<PaymentDetailsType>();
	public List<PaymentDetailsType> getPaymentDetails() {
		return PaymentDetails;
	}
	public void setPaymentDetails(List<PaymentDetailsType> value) {
		this.PaymentDetails = value;
	}

	/**
	 * List of Fall Back Shipping options provided by merchant.
	 */
	private List<ShippingOptionType> FlatRateShippingOptions = new ArrayList<ShippingOptionType>();
	public List<ShippingOptionType> getFlatRateShippingOptions() {
		return FlatRateShippingOptions;
	}
	public void setFlatRateShippingOptions(List<ShippingOptionType> value) {
		this.FlatRateShippingOptions = value;
	}

	/**
	 * Information about the call back timeout override.
	 */
	private String CallbackTimeout;
	public String getCallbackTimeout() {
		return CallbackTimeout;
	}
	public void setCallbackTimeout(String value) {
		this.CallbackTimeout = value;
	}

	/**
	 * Information about the call back version.
	 */
	private String CallbackVersion;
	public String getCallbackVersion() {
		return CallbackVersion;
	}
	public void setCallbackVersion(String value) {
		this.CallbackVersion = value;
	}

	/**
	 * Information about the Customer service number.
	 */
	private String CustomerServiceNumber;
	public String getCustomerServiceNumber() {
		return CustomerServiceNumber;
	}
	public void setCustomerServiceNumber(String value) {
		this.CustomerServiceNumber = value;
	}

	/**
	 * Information about the Gift message enable.
	 */
	private String GiftMessageEnable;
	public String getGiftMessageEnable() {
		return GiftMessageEnable;
	}
	public void setGiftMessageEnable(String value) {
		this.GiftMessageEnable = value;
	}

	/**
	 * Information about the Gift receipt enable.
	 */
	private String GiftReceiptEnable;
	public String getGiftReceiptEnable() {
		return GiftReceiptEnable;
	}
	public void setGiftReceiptEnable(String value) {
		this.GiftReceiptEnable = value;
	}

	/**
	 * Information about the Gift Wrap enable.
	 */
	private String GiftWrapEnable;
	public String getGiftWrapEnable() {
		return GiftWrapEnable;
	}
	public void setGiftWrapEnable(String value) {
		this.GiftWrapEnable = value;
	}

	/**
	 * Information about the Gift Wrap name.
	 */
	private String GiftWrapName;
	public String getGiftWrapName() {
		return GiftWrapName;
	}
	public void setGiftWrapName(String value) {
		this.GiftWrapName = value;
	}

	/**
	 * Information about the Gift Wrap amount.
	 */
	private BasicAmountType GiftWrapAmount;
	public BasicAmountType getGiftWrapAmount() {
		return GiftWrapAmount;
	}
	public void setGiftWrapAmount(BasicAmountType value) {
		this.GiftWrapAmount = value;
	}

	/**
	 * Information about the Buyer email option enable .
	 */
	private String BuyerEmailOptInEnable;
	public String getBuyerEmailOptInEnable() {
		return BuyerEmailOptInEnable;
	}
	public void setBuyerEmailOptInEnable(String value) {
		this.BuyerEmailOptInEnable = value;
	}

	/**
	 * Information about the survey enable.
	 */
	private String SurveyEnable;
	public String getSurveyEnable() {
		return SurveyEnable;
	}
	public void setSurveyEnable(String value) {
		this.SurveyEnable = value;
	}

	/**
	 * Information about the survey question.
	 */
	private String SurveyQuestion;
	public String getSurveyQuestion() {
		return SurveyQuestion;
	}
	public void setSurveyQuestion(String value) {
		this.SurveyQuestion = value;
	}

	/**
	 * Information about the survey choices for survey question.
	 */
	private List<String> SurveyChoice = new ArrayList<String>();
	public List<String> getSurveyChoice() {
		return SurveyChoice;
	}
	public void setSurveyChoice(List<String> value) {
		this.SurveyChoice = value;
	}

	/**
	 */
	private TotalType TotalType;
	public TotalType getTotalType() {
		return TotalType;
	}
	public void setTotalType(TotalType value) {
		this.TotalType = value;
	}

	/**
	 * Any message the seller would like to be displayed in the Mini Cart for UX.
	 */
	private String NoteToBuyer;
	public String getNoteToBuyer() {
		return NoteToBuyer;
	}
	public void setNoteToBuyer(String value) {
		this.NoteToBuyer = value;
	}

	/**
	 * Incentive Code
	 * Optional
	 * List of incentive codes supplied by ebay/merchant.
	 */
	private List<IncentiveInfoType> Incentives = new ArrayList<IncentiveInfoType>();
	public List<IncentiveInfoType> getIncentives() {
		return Incentives;
	}
	public void setIncentives(List<IncentiveInfoType> value) {
		this.Incentives = value;
	}

	/**
	 * Merchant specified flag which indicates whether to return Funding Instrument Details in DoEC or not.
	 * Optional
	 */
	private String ReqInstrumentDetails;
	public String getReqInstrumentDetails() {
		return ReqInstrumentDetails;
	}
	public void setReqInstrumentDetails(String value) {
		this.ReqInstrumentDetails = value;
	}

	/**
	 * This element contains information that allows the merchant to request to
	 * opt into external remember me on behalf of the buyer or to request login
	 * bypass using external remember me.  Note the opt-in details are silently
	 * ignored if the ExternalRememberMeID is present.
	 */
	private ExternalRememberMeOptInDetailsType ExternalRememberMeOptInDetails;
	public ExternalRememberMeOptInDetailsType getExternalRememberMeOptInDetails() {
		return ExternalRememberMeOptInDetails;
	}
	public void setExternalRememberMeOptInDetails(ExternalRememberMeOptInDetailsType value) {
		this.ExternalRememberMeOptInDetails = value;
	}

	/**
	 * An optional set of values related to flow-specific details.
	 */
	private FlowControlDetailsType FlowControlDetails;
	public FlowControlDetailsType getFlowControlDetails() {
		return FlowControlDetails;
	}
	public void setFlowControlDetails(FlowControlDetailsType value) {
		this.FlowControlDetails = value;
	}

	/**
	 * An optional set of values related to display-specific details.
	 */
	private DisplayControlDetailsType DisplayControlDetails;
	public DisplayControlDetailsType getDisplayControlDetails() {
		return DisplayControlDetails;
	}
	public void setDisplayControlDetails(DisplayControlDetailsType value) {
		this.DisplayControlDetails = value;
	}

	/**
	 * An optional set of values related to tracking for external partner.
	 */
	private ExternalPartnerTrackingDetailsType ExternalPartnerTrackingDetails;
	public ExternalPartnerTrackingDetailsType getExternalPartnerTrackingDetails() {
		return ExternalPartnerTrackingDetails;
	}
	public void setExternalPartnerTrackingDetails(ExternalPartnerTrackingDetailsType value) {
		this.ExternalPartnerTrackingDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( OrderTotal != null ) {
			sb.append("<ebl:OrderTotal ");
			sb.append(OrderTotal.toXMLString());
			sb.append("</ebl:OrderTotal>");
		}
		if( ReturnURL != null ) {
			sb.append("<ebl:ReturnURL>").append(ReturnURL);
			sb.append("</ebl:ReturnURL>");
		}
		if( CancelURL != null ) {
			sb.append("<ebl:CancelURL>").append(CancelURL);
			sb.append("</ebl:CancelURL>");
		}
		if( TrackingImageURL != null ) {
			sb.append("<ebl:TrackingImageURL>").append(TrackingImageURL);
			sb.append("</ebl:TrackingImageURL>");
		}
		if( giropaySuccessURL != null ) {
			sb.append("<ebl:giropaySuccessURL>").append(giropaySuccessURL);
			sb.append("</ebl:giropaySuccessURL>");
		}
		if( giropayCancelURL != null ) {
			sb.append("<ebl:giropayCancelURL>").append(giropayCancelURL);
			sb.append("</ebl:giropayCancelURL>");
		}
		if( BanktxnPendingURL != null ) {
			sb.append("<ebl:BanktxnPendingURL>").append(BanktxnPendingURL);
			sb.append("</ebl:BanktxnPendingURL>");
		}
		if( Token != null ) {
			sb.append("<ebl:Token>").append(Token);
			sb.append("</ebl:Token>");
		}
		if( MaxAmount != null ) {
			sb.append("<ebl:MaxAmount ");
			sb.append(MaxAmount.toXMLString());
			sb.append("</ebl:MaxAmount>");
		}
		if( OrderDescription != null ) {
			sb.append("<ebl:OrderDescription>").append(OrderDescription);
			sb.append("</ebl:OrderDescription>");
		}
		if( Custom != null ) {
			sb.append("<ebl:Custom>").append(Custom);
			sb.append("</ebl:Custom>");
		}
		if( InvoiceID != null ) {
			sb.append("<ebl:InvoiceID>").append(InvoiceID);
			sb.append("</ebl:InvoiceID>");
		}
		if( ReqConfirmShipping != null ) {
			sb.append("<ebl:ReqConfirmShipping>").append(ReqConfirmShipping);
			sb.append("</ebl:ReqConfirmShipping>");
		}
		if( ReqBillingAddress != null ) {
			sb.append("<ebl:ReqBillingAddress>").append(ReqBillingAddress);
			sb.append("</ebl:ReqBillingAddress>");
		}
		if( BillingAddress != null ) {
			sb.append("<ebl:BillingAddress>");
			sb.append(BillingAddress.toXMLString());
			sb.append("</ebl:BillingAddress>");
		}
		if( NoShipping != null ) {
			sb.append("<ebl:NoShipping>").append(NoShipping);
			sb.append("</ebl:NoShipping>");
		}
		if( AddressOverride != null ) {
			sb.append("<ebl:AddressOverride>").append(AddressOverride);
			sb.append("</ebl:AddressOverride>");
		}
		if( LocaleCode != null ) {
			sb.append("<ebl:LocaleCode>").append(LocaleCode);
			sb.append("</ebl:LocaleCode>");
		}
		if( PageStyle != null ) {
			sb.append("<ebl:PageStyle>").append(PageStyle);
			sb.append("</ebl:PageStyle>");
		}
		if( cppheaderimage != null ) {
			sb.append("<ebl:cpp-header-image>").append(cppheaderimage);
			sb.append("</ebl:cpp-header-image>");
		}
		if( cppheaderbordercolor != null ) {
			sb.append("<ebl:cpp-header-border-color>").append(cppheaderbordercolor);
			sb.append("</ebl:cpp-header-border-color>");
		}
		if( cppheaderbackcolor != null ) {
			sb.append("<ebl:cpp-header-back-color>").append(cppheaderbackcolor);
			sb.append("</ebl:cpp-header-back-color>");
		}
		if( cpppayflowcolor != null ) {
			sb.append("<ebl:cpp-payflow-color>").append(cpppayflowcolor);
			sb.append("</ebl:cpp-payflow-color>");
		}
		if( cppcartbordercolor != null ) {
			sb.append("<ebl:cpp-cart-border-color>").append(cppcartbordercolor);
			sb.append("</ebl:cpp-cart-border-color>");
		}
		if( cpplogoimage != null ) {
			sb.append("<ebl:cpp-logo-image>").append(cpplogoimage);
			sb.append("</ebl:cpp-logo-image>");
		}
		if( Address != null ) {
			sb.append("<ebl:Address>");
			sb.append(Address.toXMLString());
			sb.append("</ebl:Address>");
		}
		if( PaymentAction != null ) {
			sb.append("<ebl:PaymentAction>").append( PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if( SolutionType != null ) {
			sb.append("<ebl:SolutionType>").append( SolutionType.getValue());
			sb.append("</ebl:SolutionType>");
		}
		if( LandingPage != null ) {
			sb.append("<ebl:LandingPage>").append( LandingPage.getValue());
			sb.append("</ebl:LandingPage>");
		}
		if( BuyerEmail != null ) {
			sb.append("<ebl:BuyerEmail>").append(BuyerEmail);
			sb.append("</ebl:BuyerEmail>");
		}
		if( ChannelType != null ) {
			sb.append("<ebl:ChannelType>").append( ChannelType.getValue());
			sb.append("</ebl:ChannelType>");
		}
		if( BillingAgreementDetails != null ) {
			for(int i=0; i<BillingAgreementDetails.size(); i++) {
				sb.append("<ebl:BillingAgreementDetails>");
				sb.append(BillingAgreementDetails.get(i).toXMLString());
				sb.append("</ebl:BillingAgreementDetails>");
			}
		}
		if( PromoCodes != null ) {
			for(int i=0; i<PromoCodes.size(); i++) {
				sb.append("<ebl:PromoCodes>").append(PromoCodes.get(i));
				sb.append("</ebl:PromoCodes>");
			}
		}
		if( PayPalCheckOutBtnType != null ) {
			sb.append("<ebl:PayPalCheckOutBtnType>").append(PayPalCheckOutBtnType);
			sb.append("</ebl:PayPalCheckOutBtnType>");
		}
		if( ProductCategory != null ) {
			sb.append("<ebl:ProductCategory>").append( ProductCategory.getValue());
			sb.append("</ebl:ProductCategory>");
		}
		if( ShippingMethod != null ) {
			sb.append("<ebl:ShippingMethod>").append( ShippingMethod.getValue());
			sb.append("</ebl:ShippingMethod>");
		}
		if( ProfileAddressChangeDate != null ) {
			sb.append("<ebl:ProfileAddressChangeDate>").append(ProfileAddressChangeDate);
			sb.append("</ebl:ProfileAddressChangeDate>");
		}
		if( AllowNote != null ) {
			sb.append("<ebl:AllowNote>").append(AllowNote);
			sb.append("</ebl:AllowNote>");
		}
		if( FundingSourceDetails != null ) {
			sb.append("<ebl:FundingSourceDetails>");
			sb.append(FundingSourceDetails.toXMLString());
			sb.append("</ebl:FundingSourceDetails>");
		}
		if( BrandName != null ) {
			sb.append("<ebl:BrandName>").append(BrandName);
			sb.append("</ebl:BrandName>");
		}
		if( CallbackURL != null ) {
			sb.append("<ebl:CallbackURL>").append(CallbackURL);
			sb.append("</ebl:CallbackURL>");
		}
		if( EnhancedCheckoutData != null ) {
			sb.append("<ebl:EnhancedCheckoutData>");
			sb.append(EnhancedCheckoutData.toXMLString());
			sb.append("</ebl:EnhancedCheckoutData>");
		}
		if( OtherPaymentMethods != null ) {
			for(int i=0; i<OtherPaymentMethods.size(); i++) {
				sb.append("<ebl:OtherPaymentMethods>");
				sb.append(OtherPaymentMethods.get(i).toXMLString());
				sb.append("</ebl:OtherPaymentMethods>");
			}
		}
		if( BuyerDetails != null ) {
			sb.append("<ebl:BuyerDetails>");
			sb.append(BuyerDetails.toXMLString());
			sb.append("</ebl:BuyerDetails>");
		}
		if( PaymentDetails != null ) {
			for(int i=0; i<PaymentDetails.size(); i++) {
				sb.append("<ebl:PaymentDetails>");
				sb.append(PaymentDetails.get(i).toXMLString());
				sb.append("</ebl:PaymentDetails>");
			}
		}
		if( FlatRateShippingOptions != null ) {
			for(int i=0; i<FlatRateShippingOptions.size(); i++) {
				sb.append("<ebl:FlatRateShippingOptions>");
				sb.append(FlatRateShippingOptions.get(i).toXMLString());
				sb.append("</ebl:FlatRateShippingOptions>");
			}
		}
		if( CallbackTimeout != null ) {
			sb.append("<ebl:CallbackTimeout>").append(CallbackTimeout);
			sb.append("</ebl:CallbackTimeout>");
		}
		if( CallbackVersion != null ) {
			sb.append("<ebl:CallbackVersion>").append(CallbackVersion);
			sb.append("</ebl:CallbackVersion>");
		}
		if( CustomerServiceNumber != null ) {
			sb.append("<ebl:CustomerServiceNumber>").append(CustomerServiceNumber);
			sb.append("</ebl:CustomerServiceNumber>");
		}
		if( GiftMessageEnable != null ) {
			sb.append("<ebl:GiftMessageEnable>").append(GiftMessageEnable);
			sb.append("</ebl:GiftMessageEnable>");
		}
		if( GiftReceiptEnable != null ) {
			sb.append("<ebl:GiftReceiptEnable>").append(GiftReceiptEnable);
			sb.append("</ebl:GiftReceiptEnable>");
		}
		if( GiftWrapEnable != null ) {
			sb.append("<ebl:GiftWrapEnable>").append(GiftWrapEnable);
			sb.append("</ebl:GiftWrapEnable>");
		}
		if( GiftWrapName != null ) {
			sb.append("<ebl:GiftWrapName>").append(GiftWrapName);
			sb.append("</ebl:GiftWrapName>");
		}
		if( GiftWrapAmount != null ) {
			sb.append("<ebl:GiftWrapAmount ");
			sb.append(GiftWrapAmount.toXMLString());
			sb.append("</ebl:GiftWrapAmount>");
		}
		if( BuyerEmailOptInEnable != null ) {
			sb.append("<ebl:BuyerEmailOptInEnable>").append(BuyerEmailOptInEnable);
			sb.append("</ebl:BuyerEmailOptInEnable>");
		}
		if( SurveyEnable != null ) {
			sb.append("<ebl:SurveyEnable>").append(SurveyEnable);
			sb.append("</ebl:SurveyEnable>");
		}
		if( SurveyQuestion != null ) {
			sb.append("<ebl:SurveyQuestion>").append(SurveyQuestion);
			sb.append("</ebl:SurveyQuestion>");
		}
		if( SurveyChoice != null ) {
			for(int i=0; i<SurveyChoice.size(); i++) {
				sb.append("<ebl:SurveyChoice>").append(SurveyChoice.get(i));
				sb.append("</ebl:SurveyChoice>");
			}
		}
		if( TotalType != null ) {
			sb.append("<ebl:TotalType>").append( TotalType.getValue());
			sb.append("</ebl:TotalType>");
		}
		if( NoteToBuyer != null ) {
			sb.append("<ebl:NoteToBuyer>").append(NoteToBuyer);
			sb.append("</ebl:NoteToBuyer>");
		}
		if( Incentives != null ) {
			for(int i=0; i<Incentives.size(); i++) {
				sb.append("<ebl:Incentives>");
				sb.append(Incentives.get(i).toXMLString());
				sb.append("</ebl:Incentives>");
			}
		}
		if( ReqInstrumentDetails != null ) {
			sb.append("<ebl:ReqInstrumentDetails>").append(ReqInstrumentDetails);
			sb.append("</ebl:ReqInstrumentDetails>");
		}
		if( ExternalRememberMeOptInDetails != null ) {
			sb.append("<ebl:ExternalRememberMeOptInDetails>");
			sb.append(ExternalRememberMeOptInDetails.toXMLString());
			sb.append("</ebl:ExternalRememberMeOptInDetails>");
		}
		if( FlowControlDetails != null ) {
			sb.append("<ebl:FlowControlDetails>");
			sb.append(FlowControlDetails.toXMLString());
			sb.append("</ebl:FlowControlDetails>");
		}
		if( DisplayControlDetails != null ) {
			sb.append("<ebl:DisplayControlDetails>");
			sb.append(DisplayControlDetails.toXMLString());
			sb.append("</ebl:DisplayControlDetails>");
		}
		if( ExternalPartnerTrackingDetails != null ) {
			sb.append("<ebl:ExternalPartnerTrackingDetails>");
			sb.append(ExternalPartnerTrackingDetails.toXMLString());
			sb.append("</ebl:ExternalPartnerTrackingDetails>");
		}
		return sb.toString();
	}

}
