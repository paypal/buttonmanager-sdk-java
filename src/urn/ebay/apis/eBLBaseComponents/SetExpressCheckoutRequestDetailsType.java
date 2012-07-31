package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.SolutionTypeType;
import urn.ebay.apis.eBLBaseComponents.LandingPageType;
import urn.ebay.apis.eBLBaseComponents.ChannelType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.BillingAgreementDetailsType;
import urn.ebay.apis.eBLBaseComponents.ProductCategoryType;
import urn.ebay.apis.eBLBaseComponents.ShippingServiceCodeType;
import urn.ebay.apis.eBLBaseComponents.FundingSourceDetailsType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedCheckoutDataType;
import urn.ebay.apis.eBLBaseComponents.OtherPaymentMethodDetailsType;
import urn.ebay.apis.eBLBaseComponents.BuyerDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.ShippingOptionType;
import urn.ebay.apis.eBLBaseComponents.TotalType;
import urn.ebay.apis.eBLBaseComponents.IncentiveInfoType;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeOptInDetailsType;
import urn.ebay.apis.eBLBaseComponents.FlowControlDetailsType;
import urn.ebay.apis.eBLBaseComponents.DisplayControlDetailsType;
import urn.ebay.apis.eBLBaseComponents.ExternalPartnerTrackingDetailsType;

/**
 * The total cost of the order to the customer. If shipping
 * cost and tax charges are known, include them in OrderTotal;
 * if not, OrderTotal should be the current sub-total of the
 * order. You must set the currencyID attribute to one of the
 * three-character currency codes for any of the supported
 * PayPal currencies. Limitations: Must not exceed $10,000 USD
 * in any currency. No currency symbol. Decimal separator must
 * be a period (.), and the thousands separator must be a comma
 * (,). 
 */
public class SetExpressCheckoutRequestDetailsType{


	/**
	 * The total cost of the order to the customer. If shipping
	 * cost and tax charges are known, include them in OrderTotal;
	 * if not, OrderTotal should be the current sub-total of the
	 * order. You must set the currencyID attribute to one of the
	 * three-character currency codes for any of the supported
	 * PayPal currencies. Limitations: Must not exceed $10,000 USD
	 * in any currency. No currency symbol. Decimal separator must
	 * be a period (.), and the thousands separator must be a comma
	 * (,).	 
	 */ 
	private BasicAmountType OrderTotal;

	/**
	 * URL to which the customer's browser is returned after
	 * choosing to pay with PayPal. PayPal recommends that the
	 * value of ReturnURL be the final review page on which the
	 * customer confirms the order and payment. Required Character
	 * length and limitations: no limit. 	 
	 */ 
	private String ReturnURL;

	/**
	 * URL to which the customer is returned if he does not approve
	 * the use of PayPal to pay you. PayPal recommends that the
	 * value of CancelURL be the original page on which the
	 * customer chose to pay with PayPal. Required Character length
	 * and limitations: no limit	 
	 */ 
	private String CancelURL;

	/**
	 * Tracking URL for ebay. Required Character length and
	 * limitations: no limit	 
	 */ 
	private String TrackingImageURL;

	/**
	 * URL to which the customer's browser is returned after paying
	 * with giropay online. Optional Character length and
	 * limitations: no limit.	 
	 */ 
	private String giropaySuccessURL;

	/**
	 * URL to which the customer's browser is returned after fail
	 * to pay with giropay online. Optional Character length and
	 * limitations: no limit.	 
	 */ 
	private String giropayCancelURL;

	/**
	 * URL to which the customer's browser can be returned in the
	 * mEFT done page. Optional Character length and limitations:
	 * no limit.	 
	 */ 
	private String BanktxnPendingURL;

	/**
	 * On your first invocation of SetExpressCheckoutRequest, the
	 * value of this token is returned by
	 * SetExpressCheckoutResponse. Optional Include this element
	 * and its value only if you want to modify an existing
	 * checkout session with another invocation of
	 * SetExpressCheckoutRequest; for example, if you want the
	 * customer to edit his shipping address on PayPal. Character
	 * length and limitations: 20 single-byte characters	 
	 */ 
	private String Token;

	/**
	 * The expected maximum total amount of the complete order,
	 * including shipping cost and tax charges. Optional You must
	 * set the currencyID attribute to one of the three-character
	 * currency codes for any of the supported PayPal currencies.
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType MaxAmount;

	/**
	 * Description of items the customer is purchasing. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String OrderDescription;

	/**
	 * A free-form field for your own use, such as a tracking
	 * number or other value you want PayPal to return on
	 * GetExpressCheckoutDetailsResponse and
	 * DoExpressCheckoutPaymentResponse. Optional Character length
	 * and limitations: 256 single-byte alphanumeric characters	 
	 */ 
	private String Custom;

	/**
	 * Your own unique invoice or tracking number. PayPal returns
	 * this value to you on DoExpressCheckoutPaymentResponse.
	 * Optional Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String InvoiceID;

	/**
	 * The value 1 indicates that you require that the customer's
	 * shipping address on file with PayPal be a confirmed address.
	 * Any value other than 1 indicates that the customer's
	 * shipping address on file with PayPal need NOT be a confirmed
	 * address. Setting this element overrides the setting you have
	 * specified in the recipient's Merchant Account Profile.
	 * Optional Character length and limitations: One single-byte
	 * numeric character.	 
	 */ 
	private String ReqConfirmShipping;

	/**
	 * The value 1 indicates that you require that the customer's
	 * billing address on file. Setting this element overrides the
	 * setting you have specified in Admin. Optional Character
	 * length and limitations: One single-byte numeric character. 	 
	 */ 
	private String ReqBillingAddress;

	/**
	 * The billing address for the buyer. Optional If you include
	 * the BillingAddress element, the AddressType elements are
	 * required: Name Street1 CityName CountryCode Do not set set
	 * the CountryName element. 	 
	 */ 
	private AddressType BillingAddress;

	/**
	 * The value 1 indicates that on the PayPal pages, no shipping
	 * address fields should be displayed whatsoever. Optional
	 * Character length and limitations: Four single-byte numeric
	 * characters.	 
	 */ 
	private String NoShipping;

	/**
	 * The value 1 indicates that the PayPal pages should display
	 * the shipping address set by you in the Address element on
	 * this SetExpressCheckoutRequest, not the shipping address on
	 * file with PayPal for this customer. Displaying the PayPal
	 * street address on file does not allow the customer to edit
	 * that address. Optional Character length and limitations:
	 * Four single-byte numeric characters.	 
	 */ 
	private String AddressOverride;

	/**
	 * Locale of pages displayed by PayPal during Express Checkout.
	 * Optional Character length and limitations: Five single-byte
	 * alphabetic characters, upper- or lowercase. Allowable
	 * values: AU or en_AUDE or de_DEFR or fr_FRGB or en_GBIT or
	 * it_ITJP or ja_JPUS or en_US	 
	 */ 
	private String LocaleCode;

	/**
	 * Sets the Custom Payment Page Style for payment pages
	 * associated with this button/link. PageStyle corresponds to
	 * the HTML variable page_style for customizing payment pages.
	 * The value is the same as the Page Style Name you chose when
	 * adding or editing the page style from the Profile subtab of
	 * the My Account tab of your PayPal account. Optional
	 * Character length and limitations: 30 single-byte alphabetic
	 * characters. 	 
	 */ 
	private String PageStyle;

	/**
	 * A URL for the image you want to appear at the top left of
	 * the payment page. The image has a maximum size of 750 pixels
	 * wide by 90 pixels high. PayPal recommends that you provide
	 * an image that is stored on a secure (https) server. Optional
	 * Character length and limitations: 127	 
	 */ 
	private String cppHeaderImage;

	/**
	 * Sets the border color around the header of the payment page.
	 * The border is a 2-pixel perimeter around the header space,
	 * which is 750 pixels wide by 90 pixels high. Optional
	 * Character length and limitations: Six character HTML
	 * hexadecimal color code in ASCII	 
	 */ 
	private String cppHeaderBorderColor;

	/**
	 * Sets the background color for the header of the payment
	 * page. Optional Character length and limitation: Six
	 * character HTML hexadecimal color code in ASCII	 
	 */ 
	private String cppHeaderBackColor;

	/**
	 * Sets the background color for the payment page. Optional
	 * Character length and limitation: Six character HTML
	 * hexadecimal color code in ASCII	 
	 */ 
	private String cppPayflowColor;

	/**
	 * Sets the cart gradient color for the Mini Cart on 1X flow.
	 * Optional Character length and limitation: Six character HTML
	 * hexadecimal color code in ASCII	 
	 */ 
	private String cppCartBorderColor;

	/**
	 * A URL for the image you want to appear above the mini-cart.
	 * The image has a maximum size of 190 pixels wide by 60 pixels
	 * high. PayPal recommends that you provide an image that is
	 * stored on a secure (https) server. Optional Character length
	 * and limitations: 127	 
	 */ 
	private String cppLogoImage;

	/**
	 * Customer's shipping address. Optional If you include a
	 * shipping address and set the AddressOverride element on the
	 * request, PayPal returns this same address in
	 * GetExpressCheckoutDetailsResponse. 	 
	 */ 
	private AddressType Address;

	/**
	 * How you want to obtain payment. Required Authorization
	 * indicates that this payment is a basic authorization subject
	 * to settlement with PayPal Authorization and Capture. Order
	 * indicates that this payment is is an order authorization
	 * subject to settlement with PayPal Authorization and Capture.
	 * Sale indicates that this is a final sale for which you are
	 * requesting payment. IMPORTANT: You cannot set PaymentAction
	 * to Sale or Order on SetExpressCheckoutRequest and then
	 * change PaymentAction to Authorization on the final Express
	 * Checkout API, DoExpressCheckoutPaymentRequest. Character
	 * length and limit: Up to 13 single-byte alphabetic characters	 
	 */ 
	private PaymentActionCodeType PaymentAction;

	/**
	 * This will indicate which flow you are choosing
	 * (expresschecheckout or expresscheckout optional) Optional
	 * None Sole indicates that you are in the ExpressO flow Mark
	 * indicates that you are in the old express flow. 	 
	 */ 
	private SolutionTypeType SolutionType;

	/**
	 * This indicates Which page to display for ExpressO (Billing
	 * or Login) Optional None Billing indicates that you are not a
	 * paypal account holder Login indicates that you are a paypal
	 * account holder 	 
	 */ 
	private LandingPageType LandingPage;

	/**
	 * Email address of the buyer as entered during checkout.
	 * PayPal uses this value to pre-fill the PayPal membership
	 * sign-up portion of the PayPal login page. Optional Character
	 * length and limit: 127 single-byte alphanumeric characters 	 
	 */ 
	private String BuyerEmail;

	/**
	 * 	 
	 */ 
	private ChannelType ChannelType;

	/**
	 * 	 
	 */ 
	private List<BillingAgreementDetailsType> BillingAgreementDetails = new ArrayList<BillingAgreementDetailsType>();

	/**
	 * Promo Code Optional List of promo codes supplied by
	 * merchant. These promo codes enable the Merchant Services
	 * Promotion Financing feature. 	 
	 */ 
	private List<String> PromoCodes = new ArrayList<String>();

	/**
	 * Default Funding option for PayLater Checkout button. 	 
	 */ 
	private String PayPalCheckOutBtnType;

	/**
	 * 	 
	 */ 
	private ProductCategoryType ProductCategory;

	/**
	 * 	 
	 */ 
	private ShippingServiceCodeType ShippingMethod;

	/**
	 * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
	 * which address was changed by the user. 	 
	 */ 
	private String ProfileAddressChangeDate;

	/**
	 * The value 1 indicates that the customer may enter a note to
	 * the merchant on the PayPal page during checkout. The note is
	 * returned in the GetExpressCheckoutDetails response and the
	 * DoExpressCheckoutPayment response. Optional Character length
	 * and limitations: One single-byte numeric character.
	 * Allowable values: 0,1 	 
	 */ 
	private String AllowNote;

	/**
	 * Funding source preferences. 	 
	 */ 
	private FundingSourceDetailsType FundingSourceDetails;

	/**
	 * The label that needs to be displayed on the cancel links in
	 * the PayPal hosted checkout pages. Optional Character length
	 * and limit: 127 single-byte alphanumeric characters 	 
	 */ 
	private String BrandName;

	/**
	 * URL for PayPal to use to retrieve shipping, handling,
	 * insurance, and tax details from your website. Optional
	 * Character length and limitations: 2048 characters. 	 
	 */ 
	private String CallbackURL;

	/**
	 * Enhanced data for different industry segments. Optional 	 
	 */ 
	private EnhancedCheckoutDataType EnhancedCheckoutData;

	/**
	 * List of other payment methods the user can pay with.
	 * Optional Refer to the OtherPaymentMethodDetailsType for more
	 * details. 	 
	 */ 
	private List<OtherPaymentMethodDetailsType> OtherPaymentMethods = new ArrayList<OtherPaymentMethodDetailsType>();

	/**
	 * Details about the buyer's account. Optional Refer to the
	 * BuyerDetailsType for more details. 	 
	 */ 
	private BuyerDetailsType BuyerDetails;

	/**
	 * Information about the payment. 	 
	 */ 
	private List<PaymentDetailsType> PaymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * List of Fall Back Shipping options provided by merchant. 	 
	 */ 
	private List<ShippingOptionType> FlatRateShippingOptions = new ArrayList<ShippingOptionType>();

	/**
	 * Information about the call back timeout override. 	 
	 */ 
	private String CallbackTimeout;

	/**
	 * Information about the call back version. 	 
	 */ 
	private String CallbackVersion;

	/**
	 * Information about the Customer service number. 	 
	 */ 
	private String CustomerServiceNumber;

	/**
	 * Information about the Gift message enable. 	 
	 */ 
	private String GiftMessageEnable;

	/**
	 * Information about the Gift receipt enable. 	 
	 */ 
	private String GiftReceiptEnable;

	/**
	 * Information about the Gift Wrap enable. 	 
	 */ 
	private String GiftWrapEnable;

	/**
	 * Information about the Gift Wrap name. 	 
	 */ 
	private String GiftWrapName;

	/**
	 * Information about the Gift Wrap amount. 	 
	 */ 
	private BasicAmountType GiftWrapAmount;

	/**
	 * Information about the Buyer email option enable . 	 
	 */ 
	private String BuyerEmailOptInEnable;

	/**
	 * Information about the survey enable. 	 
	 */ 
	private String SurveyEnable;

	/**
	 * Information about the survey question. 	 
	 */ 
	private String SurveyQuestion;

	/**
	 * Information about the survey choices for survey question. 	 
	 */ 
	private List<String> SurveyChoice = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private TotalType TotalType;

	/**
	 * Any message the seller would like to be displayed in the
	 * Mini Cart for UX. 	 
	 */ 
	private String NoteToBuyer;

	/**
	 * Incentive Code Optional List of incentive codes supplied by
	 * ebay/merchant. 	 
	 */ 
	private List<IncentiveInfoType> Incentives = new ArrayList<IncentiveInfoType>();

	/**
	 * Merchant specified flag which indicates whether to return
	 * Funding Instrument Details in DoEC or not. Optional 	 
	 */ 
	private String ReqInstrumentDetails;

	/**
	 * This element contains information that allows the merchant
	 * to request to opt into external remember me on behalf of the
	 * buyer or to request login bypass using external remember me.
	 * Note the opt-in details are silently ignored if the
	 * ExternalRememberMeID is present. 	 
	 */ 
	private ExternalRememberMeOptInDetailsType ExternalRememberMeOptInDetails;

	/**
	 * An optional set of values related to flow-specific details. 	 
	 */ 
	private FlowControlDetailsType FlowControlDetails;

	/**
	 * An optional set of values related to display-specific
	 * details. 	 
	 */ 
	private DisplayControlDetailsType DisplayControlDetails;

	/**
	 * An optional set of values related to tracking for external
	 * partner. 	 
	 */ 
	private ExternalPartnerTrackingDetailsType ExternalPartnerTrackingDetails;

	

	/**
	 * Default Constructor
	 */
	public SetExpressCheckoutRequestDetailsType (){
	}	

	/**
	 * Getter for OrderTotal
	 */
	 public BasicAmountType getOrderTotal() {
	 	return OrderTotal;
	 }
	 
	/**
	 * Setter for OrderTotal
	 */
	 public void setOrderTotal(BasicAmountType OrderTotal) {
	 	this.OrderTotal = OrderTotal;
	 }
	 
	/**
	 * Getter for ReturnURL
	 */
	 public String getReturnURL() {
	 	return ReturnURL;
	 }
	 
	/**
	 * Setter for ReturnURL
	 */
	 public void setReturnURL(String ReturnURL) {
	 	this.ReturnURL = ReturnURL;
	 }
	 
	/**
	 * Getter for CancelURL
	 */
	 public String getCancelURL() {
	 	return CancelURL;
	 }
	 
	/**
	 * Setter for CancelURL
	 */
	 public void setCancelURL(String CancelURL) {
	 	this.CancelURL = CancelURL;
	 }
	 
	/**
	 * Getter for TrackingImageURL
	 */
	 public String getTrackingImageURL() {
	 	return TrackingImageURL;
	 }
	 
	/**
	 * Setter for TrackingImageURL
	 */
	 public void setTrackingImageURL(String TrackingImageURL) {
	 	this.TrackingImageURL = TrackingImageURL;
	 }
	 
	/**
	 * Getter for giropaySuccessURL
	 */
	 public String getGiropaySuccessURL() {
	 	return giropaySuccessURL;
	 }
	 
	/**
	 * Setter for giropaySuccessURL
	 */
	 public void setGiropaySuccessURL(String giropaySuccessURL) {
	 	this.giropaySuccessURL = giropaySuccessURL;
	 }
	 
	/**
	 * Getter for giropayCancelURL
	 */
	 public String getGiropayCancelURL() {
	 	return giropayCancelURL;
	 }
	 
	/**
	 * Setter for giropayCancelURL
	 */
	 public void setGiropayCancelURL(String giropayCancelURL) {
	 	this.giropayCancelURL = giropayCancelURL;
	 }
	 
	/**
	 * Getter for BanktxnPendingURL
	 */
	 public String getBanktxnPendingURL() {
	 	return BanktxnPendingURL;
	 }
	 
	/**
	 * Setter for BanktxnPendingURL
	 */
	 public void setBanktxnPendingURL(String BanktxnPendingURL) {
	 	this.BanktxnPendingURL = BanktxnPendingURL;
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
	 * Getter for MaxAmount
	 */
	 public BasicAmountType getMaxAmount() {
	 	return MaxAmount;
	 }
	 
	/**
	 * Setter for MaxAmount
	 */
	 public void setMaxAmount(BasicAmountType MaxAmount) {
	 	this.MaxAmount = MaxAmount;
	 }
	 
	/**
	 * Getter for OrderDescription
	 */
	 public String getOrderDescription() {
	 	return OrderDescription;
	 }
	 
	/**
	 * Setter for OrderDescription
	 */
	 public void setOrderDescription(String OrderDescription) {
	 	this.OrderDescription = OrderDescription;
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
	 * Getter for ReqConfirmShipping
	 */
	 public String getReqConfirmShipping() {
	 	return ReqConfirmShipping;
	 }
	 
	/**
	 * Setter for ReqConfirmShipping
	 */
	 public void setReqConfirmShipping(String ReqConfirmShipping) {
	 	this.ReqConfirmShipping = ReqConfirmShipping;
	 }
	 
	/**
	 * Getter for ReqBillingAddress
	 */
	 public String getReqBillingAddress() {
	 	return ReqBillingAddress;
	 }
	 
	/**
	 * Setter for ReqBillingAddress
	 */
	 public void setReqBillingAddress(String ReqBillingAddress) {
	 	this.ReqBillingAddress = ReqBillingAddress;
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
	 * Getter for NoShipping
	 */
	 public String getNoShipping() {
	 	return NoShipping;
	 }
	 
	/**
	 * Setter for NoShipping
	 */
	 public void setNoShipping(String NoShipping) {
	 	this.NoShipping = NoShipping;
	 }
	 
	/**
	 * Getter for AddressOverride
	 */
	 public String getAddressOverride() {
	 	return AddressOverride;
	 }
	 
	/**
	 * Setter for AddressOverride
	 */
	 public void setAddressOverride(String AddressOverride) {
	 	this.AddressOverride = AddressOverride;
	 }
	 
	/**
	 * Getter for LocaleCode
	 */
	 public String getLocaleCode() {
	 	return LocaleCode;
	 }
	 
	/**
	 * Setter for LocaleCode
	 */
	 public void setLocaleCode(String LocaleCode) {
	 	this.LocaleCode = LocaleCode;
	 }
	 
	/**
	 * Getter for PageStyle
	 */
	 public String getPageStyle() {
	 	return PageStyle;
	 }
	 
	/**
	 * Setter for PageStyle
	 */
	 public void setPageStyle(String PageStyle) {
	 	this.PageStyle = PageStyle;
	 }
	 
	/**
	 * Getter for cppHeaderImage
	 */
	 public String getCppHeaderImage() {
	 	return cppHeaderImage;
	 }
	 
	/**
	 * Setter for cppHeaderImage
	 */
	 public void setCppHeaderImage(String cppHeaderImage) {
	 	this.cppHeaderImage = cppHeaderImage;
	 }
	 
	/**
	 * Getter for cppHeaderBorderColor
	 */
	 public String getCppHeaderBorderColor() {
	 	return cppHeaderBorderColor;
	 }
	 
	/**
	 * Setter for cppHeaderBorderColor
	 */
	 public void setCppHeaderBorderColor(String cppHeaderBorderColor) {
	 	this.cppHeaderBorderColor = cppHeaderBorderColor;
	 }
	 
	/**
	 * Getter for cppHeaderBackColor
	 */
	 public String getCppHeaderBackColor() {
	 	return cppHeaderBackColor;
	 }
	 
	/**
	 * Setter for cppHeaderBackColor
	 */
	 public void setCppHeaderBackColor(String cppHeaderBackColor) {
	 	this.cppHeaderBackColor = cppHeaderBackColor;
	 }
	 
	/**
	 * Getter for cppPayflowColor
	 */
	 public String getCppPayflowColor() {
	 	return cppPayflowColor;
	 }
	 
	/**
	 * Setter for cppPayflowColor
	 */
	 public void setCppPayflowColor(String cppPayflowColor) {
	 	this.cppPayflowColor = cppPayflowColor;
	 }
	 
	/**
	 * Getter for cppCartBorderColor
	 */
	 public String getCppCartBorderColor() {
	 	return cppCartBorderColor;
	 }
	 
	/**
	 * Setter for cppCartBorderColor
	 */
	 public void setCppCartBorderColor(String cppCartBorderColor) {
	 	this.cppCartBorderColor = cppCartBorderColor;
	 }
	 
	/**
	 * Getter for cppLogoImage
	 */
	 public String getCppLogoImage() {
	 	return cppLogoImage;
	 }
	 
	/**
	 * Setter for cppLogoImage
	 */
	 public void setCppLogoImage(String cppLogoImage) {
	 	this.cppLogoImage = cppLogoImage;
	 }
	 
	/**
	 * Getter for Address
	 */
	 public AddressType getAddress() {
	 	return Address;
	 }
	 
	/**
	 * Setter for Address
	 */
	 public void setAddress(AddressType Address) {
	 	this.Address = Address;
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
	 * Getter for SolutionType
	 */
	 public SolutionTypeType getSolutionType() {
	 	return SolutionType;
	 }
	 
	/**
	 * Setter for SolutionType
	 */
	 public void setSolutionType(SolutionTypeType SolutionType) {
	 	this.SolutionType = SolutionType;
	 }
	 
	/**
	 * Getter for LandingPage
	 */
	 public LandingPageType getLandingPage() {
	 	return LandingPage;
	 }
	 
	/**
	 * Setter for LandingPage
	 */
	 public void setLandingPage(LandingPageType LandingPage) {
	 	this.LandingPage = LandingPage;
	 }
	 
	/**
	 * Getter for BuyerEmail
	 */
	 public String getBuyerEmail() {
	 	return BuyerEmail;
	 }
	 
	/**
	 * Setter for BuyerEmail
	 */
	 public void setBuyerEmail(String BuyerEmail) {
	 	this.BuyerEmail = BuyerEmail;
	 }
	 
	/**
	 * Getter for ChannelType
	 */
	 public ChannelType getChannelType() {
	 	return ChannelType;
	 }
	 
	/**
	 * Setter for ChannelType
	 */
	 public void setChannelType(ChannelType ChannelType) {
	 	this.ChannelType = ChannelType;
	 }
	 
	/**
	 * Getter for BillingAgreementDetails
	 */
	 public List<BillingAgreementDetailsType> getBillingAgreementDetails() {
	 	return BillingAgreementDetails;
	 }
	 
	/**
	 * Setter for BillingAgreementDetails
	 */
	 public void setBillingAgreementDetails(List<BillingAgreementDetailsType> BillingAgreementDetails) {
	 	this.BillingAgreementDetails = BillingAgreementDetails;
	 }
	 
	/**
	 * Getter for PromoCodes
	 */
	 public List<String> getPromoCodes() {
	 	return PromoCodes;
	 }
	 
	/**
	 * Setter for PromoCodes
	 */
	 public void setPromoCodes(List<String> PromoCodes) {
	 	this.PromoCodes = PromoCodes;
	 }
	 
	/**
	 * Getter for PayPalCheckOutBtnType
	 */
	 public String getPayPalCheckOutBtnType() {
	 	return PayPalCheckOutBtnType;
	 }
	 
	/**
	 * Setter for PayPalCheckOutBtnType
	 */
	 public void setPayPalCheckOutBtnType(String PayPalCheckOutBtnType) {
	 	this.PayPalCheckOutBtnType = PayPalCheckOutBtnType;
	 }
	 
	/**
	 * Getter for ProductCategory
	 */
	 public ProductCategoryType getProductCategory() {
	 	return ProductCategory;
	 }
	 
	/**
	 * Setter for ProductCategory
	 */
	 public void setProductCategory(ProductCategoryType ProductCategory) {
	 	this.ProductCategory = ProductCategory;
	 }
	 
	/**
	 * Getter for ShippingMethod
	 */
	 public ShippingServiceCodeType getShippingMethod() {
	 	return ShippingMethod;
	 }
	 
	/**
	 * Setter for ShippingMethod
	 */
	 public void setShippingMethod(ShippingServiceCodeType ShippingMethod) {
	 	this.ShippingMethod = ShippingMethod;
	 }
	 
	/**
	 * Getter for ProfileAddressChangeDate
	 */
	 public String getProfileAddressChangeDate() {
	 	return ProfileAddressChangeDate;
	 }
	 
	/**
	 * Setter for ProfileAddressChangeDate
	 */
	 public void setProfileAddressChangeDate(String ProfileAddressChangeDate) {
	 	this.ProfileAddressChangeDate = ProfileAddressChangeDate;
	 }
	 
	/**
	 * Getter for AllowNote
	 */
	 public String getAllowNote() {
	 	return AllowNote;
	 }
	 
	/**
	 * Setter for AllowNote
	 */
	 public void setAllowNote(String AllowNote) {
	 	this.AllowNote = AllowNote;
	 }
	 
	/**
	 * Getter for FundingSourceDetails
	 */
	 public FundingSourceDetailsType getFundingSourceDetails() {
	 	return FundingSourceDetails;
	 }
	 
	/**
	 * Setter for FundingSourceDetails
	 */
	 public void setFundingSourceDetails(FundingSourceDetailsType FundingSourceDetails) {
	 	this.FundingSourceDetails = FundingSourceDetails;
	 }
	 
	/**
	 * Getter for BrandName
	 */
	 public String getBrandName() {
	 	return BrandName;
	 }
	 
	/**
	 * Setter for BrandName
	 */
	 public void setBrandName(String BrandName) {
	 	this.BrandName = BrandName;
	 }
	 
	/**
	 * Getter for CallbackURL
	 */
	 public String getCallbackURL() {
	 	return CallbackURL;
	 }
	 
	/**
	 * Setter for CallbackURL
	 */
	 public void setCallbackURL(String CallbackURL) {
	 	this.CallbackURL = CallbackURL;
	 }
	 
	/**
	 * Getter for EnhancedCheckoutData
	 */
	 public EnhancedCheckoutDataType getEnhancedCheckoutData() {
	 	return EnhancedCheckoutData;
	 }
	 
	/**
	 * Setter for EnhancedCheckoutData
	 */
	 public void setEnhancedCheckoutData(EnhancedCheckoutDataType EnhancedCheckoutData) {
	 	this.EnhancedCheckoutData = EnhancedCheckoutData;
	 }
	 
	/**
	 * Getter for OtherPaymentMethods
	 */
	 public List<OtherPaymentMethodDetailsType> getOtherPaymentMethods() {
	 	return OtherPaymentMethods;
	 }
	 
	/**
	 * Setter for OtherPaymentMethods
	 */
	 public void setOtherPaymentMethods(List<OtherPaymentMethodDetailsType> OtherPaymentMethods) {
	 	this.OtherPaymentMethods = OtherPaymentMethods;
	 }
	 
	/**
	 * Getter for BuyerDetails
	 */
	 public BuyerDetailsType getBuyerDetails() {
	 	return BuyerDetails;
	 }
	 
	/**
	 * Setter for BuyerDetails
	 */
	 public void setBuyerDetails(BuyerDetailsType BuyerDetails) {
	 	this.BuyerDetails = BuyerDetails;
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
	 * Getter for FlatRateShippingOptions
	 */
	 public List<ShippingOptionType> getFlatRateShippingOptions() {
	 	return FlatRateShippingOptions;
	 }
	 
	/**
	 * Setter for FlatRateShippingOptions
	 */
	 public void setFlatRateShippingOptions(List<ShippingOptionType> FlatRateShippingOptions) {
	 	this.FlatRateShippingOptions = FlatRateShippingOptions;
	 }
	 
	/**
	 * Getter for CallbackTimeout
	 */
	 public String getCallbackTimeout() {
	 	return CallbackTimeout;
	 }
	 
	/**
	 * Setter for CallbackTimeout
	 */
	 public void setCallbackTimeout(String CallbackTimeout) {
	 	this.CallbackTimeout = CallbackTimeout;
	 }
	 
	/**
	 * Getter for CallbackVersion
	 */
	 public String getCallbackVersion() {
	 	return CallbackVersion;
	 }
	 
	/**
	 * Setter for CallbackVersion
	 */
	 public void setCallbackVersion(String CallbackVersion) {
	 	this.CallbackVersion = CallbackVersion;
	 }
	 
	/**
	 * Getter for CustomerServiceNumber
	 */
	 public String getCustomerServiceNumber() {
	 	return CustomerServiceNumber;
	 }
	 
	/**
	 * Setter for CustomerServiceNumber
	 */
	 public void setCustomerServiceNumber(String CustomerServiceNumber) {
	 	this.CustomerServiceNumber = CustomerServiceNumber;
	 }
	 
	/**
	 * Getter for GiftMessageEnable
	 */
	 public String getGiftMessageEnable() {
	 	return GiftMessageEnable;
	 }
	 
	/**
	 * Setter for GiftMessageEnable
	 */
	 public void setGiftMessageEnable(String GiftMessageEnable) {
	 	this.GiftMessageEnable = GiftMessageEnable;
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
	 * Getter for GiftWrapEnable
	 */
	 public String getGiftWrapEnable() {
	 	return GiftWrapEnable;
	 }
	 
	/**
	 * Setter for GiftWrapEnable
	 */
	 public void setGiftWrapEnable(String GiftWrapEnable) {
	 	this.GiftWrapEnable = GiftWrapEnable;
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
	 * Getter for BuyerEmailOptInEnable
	 */
	 public String getBuyerEmailOptInEnable() {
	 	return BuyerEmailOptInEnable;
	 }
	 
	/**
	 * Setter for BuyerEmailOptInEnable
	 */
	 public void setBuyerEmailOptInEnable(String BuyerEmailOptInEnable) {
	 	this.BuyerEmailOptInEnable = BuyerEmailOptInEnable;
	 }
	 
	/**
	 * Getter for SurveyEnable
	 */
	 public String getSurveyEnable() {
	 	return SurveyEnable;
	 }
	 
	/**
	 * Setter for SurveyEnable
	 */
	 public void setSurveyEnable(String SurveyEnable) {
	 	this.SurveyEnable = SurveyEnable;
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
	 * Getter for SurveyChoice
	 */
	 public List<String> getSurveyChoice() {
	 	return SurveyChoice;
	 }
	 
	/**
	 * Setter for SurveyChoice
	 */
	 public void setSurveyChoice(List<String> SurveyChoice) {
	 	this.SurveyChoice = SurveyChoice;
	 }
	 
	/**
	 * Getter for TotalType
	 */
	 public TotalType getTotalType() {
	 	return TotalType;
	 }
	 
	/**
	 * Setter for TotalType
	 */
	 public void setTotalType(TotalType TotalType) {
	 	this.TotalType = TotalType;
	 }
	 
	/**
	 * Getter for NoteToBuyer
	 */
	 public String getNoteToBuyer() {
	 	return NoteToBuyer;
	 }
	 
	/**
	 * Setter for NoteToBuyer
	 */
	 public void setNoteToBuyer(String NoteToBuyer) {
	 	this.NoteToBuyer = NoteToBuyer;
	 }
	 
	/**
	 * Getter for Incentives
	 */
	 public List<IncentiveInfoType> getIncentives() {
	 	return Incentives;
	 }
	 
	/**
	 * Setter for Incentives
	 */
	 public void setIncentives(List<IncentiveInfoType> Incentives) {
	 	this.Incentives = Incentives;
	 }
	 
	/**
	 * Getter for ReqInstrumentDetails
	 */
	 public String getReqInstrumentDetails() {
	 	return ReqInstrumentDetails;
	 }
	 
	/**
	 * Setter for ReqInstrumentDetails
	 */
	 public void setReqInstrumentDetails(String ReqInstrumentDetails) {
	 	this.ReqInstrumentDetails = ReqInstrumentDetails;
	 }
	 
	/**
	 * Getter for ExternalRememberMeOptInDetails
	 */
	 public ExternalRememberMeOptInDetailsType getExternalRememberMeOptInDetails() {
	 	return ExternalRememberMeOptInDetails;
	 }
	 
	/**
	 * Setter for ExternalRememberMeOptInDetails
	 */
	 public void setExternalRememberMeOptInDetails(ExternalRememberMeOptInDetailsType ExternalRememberMeOptInDetails) {
	 	this.ExternalRememberMeOptInDetails = ExternalRememberMeOptInDetails;
	 }
	 
	/**
	 * Getter for FlowControlDetails
	 */
	 public FlowControlDetailsType getFlowControlDetails() {
	 	return FlowControlDetails;
	 }
	 
	/**
	 * Setter for FlowControlDetails
	 */
	 public void setFlowControlDetails(FlowControlDetailsType FlowControlDetails) {
	 	this.FlowControlDetails = FlowControlDetails;
	 }
	 
	/**
	 * Getter for DisplayControlDetails
	 */
	 public DisplayControlDetailsType getDisplayControlDetails() {
	 	return DisplayControlDetails;
	 }
	 
	/**
	 * Setter for DisplayControlDetails
	 */
	 public void setDisplayControlDetails(DisplayControlDetailsType DisplayControlDetails) {
	 	this.DisplayControlDetails = DisplayControlDetails;
	 }
	 
	/**
	 * Getter for ExternalPartnerTrackingDetails
	 */
	 public ExternalPartnerTrackingDetailsType getExternalPartnerTrackingDetails() {
	 	return ExternalPartnerTrackingDetails;
	 }
	 
	/**
	 * Setter for ExternalPartnerTrackingDetails
	 */
	 public void setExternalPartnerTrackingDetails(ExternalPartnerTrackingDetailsType ExternalPartnerTrackingDetails) {
	 	this.ExternalPartnerTrackingDetails = ExternalPartnerTrackingDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(OrderTotal != null) {
			sb.append("<ebl:OrderTotal");
			sb.append(OrderTotal.toXMLString());
			sb.append("</ebl:OrderTotal>");
		}
		if(ReturnURL != null) {
			sb.append("<ebl:ReturnURL>").append(ReturnURL);
			sb.append("</ebl:ReturnURL>");
		}
		if(CancelURL != null) {
			sb.append("<ebl:CancelURL>").append(CancelURL);
			sb.append("</ebl:CancelURL>");
		}
		if(TrackingImageURL != null) {
			sb.append("<ebl:TrackingImageURL>").append(TrackingImageURL);
			sb.append("</ebl:TrackingImageURL>");
		}
		if(giropaySuccessURL != null) {
			sb.append("<ebl:giropaySuccessURL>").append(giropaySuccessURL);
			sb.append("</ebl:giropaySuccessURL>");
		}
		if(giropayCancelURL != null) {
			sb.append("<ebl:giropayCancelURL>").append(giropayCancelURL);
			sb.append("</ebl:giropayCancelURL>");
		}
		if(BanktxnPendingURL != null) {
			sb.append("<ebl:BanktxnPendingURL>").append(BanktxnPendingURL);
			sb.append("</ebl:BanktxnPendingURL>");
		}
		if(Token != null) {
			sb.append("<ebl:Token>").append(Token);
			sb.append("</ebl:Token>");
		}
		if(MaxAmount != null) {
			sb.append("<ebl:MaxAmount");
			sb.append(MaxAmount.toXMLString());
			sb.append("</ebl:MaxAmount>");
		}
		if(OrderDescription != null) {
			sb.append("<ebl:OrderDescription>").append(OrderDescription);
			sb.append("</ebl:OrderDescription>");
		}
		if(Custom != null) {
			sb.append("<ebl:Custom>").append(Custom);
			sb.append("</ebl:Custom>");
		}
		if(InvoiceID != null) {
			sb.append("<ebl:InvoiceID>").append(InvoiceID);
			sb.append("</ebl:InvoiceID>");
		}
		if(ReqConfirmShipping != null) {
			sb.append("<ebl:ReqConfirmShipping>").append(ReqConfirmShipping);
			sb.append("</ebl:ReqConfirmShipping>");
		}
		if(ReqBillingAddress != null) {
			sb.append("<ebl:ReqBillingAddress>").append(ReqBillingAddress);
			sb.append("</ebl:ReqBillingAddress>");
		}
		if(BillingAddress != null) {
			sb.append("<ebl:BillingAddress>");
			sb.append(BillingAddress.toXMLString());
			sb.append("</ebl:BillingAddress>");
		}
		if(NoShipping != null) {
			sb.append("<ebl:NoShipping>").append(NoShipping);
			sb.append("</ebl:NoShipping>");
		}
		if(AddressOverride != null) {
			sb.append("<ebl:AddressOverride>").append(AddressOverride);
			sb.append("</ebl:AddressOverride>");
		}
		if(LocaleCode != null) {
			sb.append("<ebl:LocaleCode>").append(LocaleCode);
			sb.append("</ebl:LocaleCode>");
		}
		if(PageStyle != null) {
			sb.append("<ebl:PageStyle>").append(PageStyle);
			sb.append("</ebl:PageStyle>");
		}
		if(cppHeaderImage != null) {
			sb.append("<ebl:cpp-header-image>").append(cppHeaderImage);
			sb.append("</ebl:cpp-header-image>");
		}
		if(cppHeaderBorderColor != null) {
			sb.append("<ebl:cpp-header-border-color>").append(cppHeaderBorderColor);
			sb.append("</ebl:cpp-header-border-color>");
		}
		if(cppHeaderBackColor != null) {
			sb.append("<ebl:cpp-header-back-color>").append(cppHeaderBackColor);
			sb.append("</ebl:cpp-header-back-color>");
		}
		if(cppPayflowColor != null) {
			sb.append("<ebl:cpp-payflow-color>").append(cppPayflowColor);
			sb.append("</ebl:cpp-payflow-color>");
		}
		if(cppCartBorderColor != null) {
			sb.append("<ebl:cpp-cart-border-color>").append(cppCartBorderColor);
			sb.append("</ebl:cpp-cart-border-color>");
		}
		if(cppLogoImage != null) {
			sb.append("<ebl:cpp-logo-image>").append(cppLogoImage);
			sb.append("</ebl:cpp-logo-image>");
		}
		if(Address != null) {
			sb.append("<ebl:Address>");
			sb.append(Address.toXMLString());
			sb.append("</ebl:Address>");
		}
		if(PaymentAction != null) {
			sb.append("<ebl:PaymentAction>").append(PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if(SolutionType != null) {
			sb.append("<ebl:SolutionType>").append(SolutionType.getValue());
			sb.append("</ebl:SolutionType>");
		}
		if(LandingPage != null) {
			sb.append("<ebl:LandingPage>").append(LandingPage.getValue());
			sb.append("</ebl:LandingPage>");
		}
		if(BuyerEmail != null) {
			sb.append("<ebl:BuyerEmail>").append(BuyerEmail);
			sb.append("</ebl:BuyerEmail>");
		}
		if(ChannelType != null) {
			sb.append("<ebl:ChannelType>").append(ChannelType.getValue());
			sb.append("</ebl:ChannelType>");
		}
		if(BillingAgreementDetails != null) {
			for(int i=0; i < BillingAgreementDetails.size(); i++) {
				sb.append("<ebl:BillingAgreementDetails>");
				sb.append(BillingAgreementDetails.get(i).toXMLString());
				sb.append("</ebl:BillingAgreementDetails>");
			}
		}
		if(PromoCodes != null) {
			for(int i=0; i < PromoCodes.size(); i++) {
				sb.append("<ebl:PromoCodes>").append(PromoCodes.get(i));
				sb.append("</ebl:PromoCodes>");
			}
		}
		if(PayPalCheckOutBtnType != null) {
			sb.append("<ebl:PayPalCheckOutBtnType>").append(PayPalCheckOutBtnType);
			sb.append("</ebl:PayPalCheckOutBtnType>");
		}
		if(ProductCategory != null) {
			sb.append("<ebl:ProductCategory>").append(ProductCategory.getValue());
			sb.append("</ebl:ProductCategory>");
		}
		if(ShippingMethod != null) {
			sb.append("<ebl:ShippingMethod>").append(ShippingMethod.getValue());
			sb.append("</ebl:ShippingMethod>");
		}
		if(ProfileAddressChangeDate != null) {
			sb.append("<ebl:ProfileAddressChangeDate>").append(ProfileAddressChangeDate);
			sb.append("</ebl:ProfileAddressChangeDate>");
		}
		if(AllowNote != null) {
			sb.append("<ebl:AllowNote>").append(AllowNote);
			sb.append("</ebl:AllowNote>");
		}
		if(FundingSourceDetails != null) {
			sb.append("<ebl:FundingSourceDetails>");
			sb.append(FundingSourceDetails.toXMLString());
			sb.append("</ebl:FundingSourceDetails>");
		}
		if(BrandName != null) {
			sb.append("<ebl:BrandName>").append(BrandName);
			sb.append("</ebl:BrandName>");
		}
		if(CallbackURL != null) {
			sb.append("<ebl:CallbackURL>").append(CallbackURL);
			sb.append("</ebl:CallbackURL>");
		}
		if(EnhancedCheckoutData != null) {
			sb.append("<ebl:EnhancedCheckoutData>");
			sb.append(EnhancedCheckoutData.toXMLString());
			sb.append("</ebl:EnhancedCheckoutData>");
		}
		if(OtherPaymentMethods != null) {
			for(int i=0; i < OtherPaymentMethods.size(); i++) {
				sb.append("<ebl:OtherPaymentMethods>");
				sb.append(OtherPaymentMethods.get(i).toXMLString());
				sb.append("</ebl:OtherPaymentMethods>");
			}
		}
		if(BuyerDetails != null) {
			sb.append("<ebl:BuyerDetails>");
			sb.append(BuyerDetails.toXMLString());
			sb.append("</ebl:BuyerDetails>");
		}
		if(PaymentDetails != null) {
			for(int i=0; i < PaymentDetails.size(); i++) {
				sb.append("<ebl:PaymentDetails>");
				sb.append(PaymentDetails.get(i).toXMLString());
				sb.append("</ebl:PaymentDetails>");
			}
		}
		if(FlatRateShippingOptions != null) {
			for(int i=0; i < FlatRateShippingOptions.size(); i++) {
				sb.append("<ebl:FlatRateShippingOptions>");
				sb.append(FlatRateShippingOptions.get(i).toXMLString());
				sb.append("</ebl:FlatRateShippingOptions>");
			}
		}
		if(CallbackTimeout != null) {
			sb.append("<ebl:CallbackTimeout>").append(CallbackTimeout);
			sb.append("</ebl:CallbackTimeout>");
		}
		if(CallbackVersion != null) {
			sb.append("<ebl:CallbackVersion>").append(CallbackVersion);
			sb.append("</ebl:CallbackVersion>");
		}
		if(CustomerServiceNumber != null) {
			sb.append("<ebl:CustomerServiceNumber>").append(CustomerServiceNumber);
			sb.append("</ebl:CustomerServiceNumber>");
		}
		if(GiftMessageEnable != null) {
			sb.append("<ebl:GiftMessageEnable>").append(GiftMessageEnable);
			sb.append("</ebl:GiftMessageEnable>");
		}
		if(GiftReceiptEnable != null) {
			sb.append("<ebl:GiftReceiptEnable>").append(GiftReceiptEnable);
			sb.append("</ebl:GiftReceiptEnable>");
		}
		if(GiftWrapEnable != null) {
			sb.append("<ebl:GiftWrapEnable>").append(GiftWrapEnable);
			sb.append("</ebl:GiftWrapEnable>");
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
		if(BuyerEmailOptInEnable != null) {
			sb.append("<ebl:BuyerEmailOptInEnable>").append(BuyerEmailOptInEnable);
			sb.append("</ebl:BuyerEmailOptInEnable>");
		}
		if(SurveyEnable != null) {
			sb.append("<ebl:SurveyEnable>").append(SurveyEnable);
			sb.append("</ebl:SurveyEnable>");
		}
		if(SurveyQuestion != null) {
			sb.append("<ebl:SurveyQuestion>").append(SurveyQuestion);
			sb.append("</ebl:SurveyQuestion>");
		}
		if(SurveyChoice != null) {
			for(int i=0; i < SurveyChoice.size(); i++) {
				sb.append("<ebl:SurveyChoice>").append(SurveyChoice.get(i));
				sb.append("</ebl:SurveyChoice>");
			}
		}
		if(TotalType != null) {
			sb.append("<ebl:TotalType>").append(TotalType.getValue());
			sb.append("</ebl:TotalType>");
		}
		if(NoteToBuyer != null) {
			sb.append("<ebl:NoteToBuyer>").append(NoteToBuyer);
			sb.append("</ebl:NoteToBuyer>");
		}
		if(Incentives != null) {
			for(int i=0; i < Incentives.size(); i++) {
				sb.append("<ebl:Incentives>");
				sb.append(Incentives.get(i).toXMLString());
				sb.append("</ebl:Incentives>");
			}
		}
		if(ReqInstrumentDetails != null) {
			sb.append("<ebl:ReqInstrumentDetails>").append(ReqInstrumentDetails);
			sb.append("</ebl:ReqInstrumentDetails>");
		}
		if(ExternalRememberMeOptInDetails != null) {
			sb.append("<ebl:ExternalRememberMeOptInDetails>");
			sb.append(ExternalRememberMeOptInDetails.toXMLString());
			sb.append("</ebl:ExternalRememberMeOptInDetails>");
		}
		if(FlowControlDetails != null) {
			sb.append("<ebl:FlowControlDetails>");
			sb.append(FlowControlDetails.toXMLString());
			sb.append("</ebl:FlowControlDetails>");
		}
		if(DisplayControlDetails != null) {
			sb.append("<ebl:DisplayControlDetails>");
			sb.append(DisplayControlDetails.toXMLString());
			sb.append("</ebl:DisplayControlDetails>");
		}
		if(ExternalPartnerTrackingDetails != null) {
			sb.append("<ebl:ExternalPartnerTrackingDetails>");
			sb.append(ExternalPartnerTrackingDetails.toXMLString());
			sb.append("</ebl:ExternalPartnerTrackingDetails>");
		}
		return sb.toString();
	}

}