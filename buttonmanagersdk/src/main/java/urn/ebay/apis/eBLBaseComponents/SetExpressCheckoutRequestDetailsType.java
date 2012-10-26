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
import urn.ebay.apis.eBLBaseComponents.CoupledBucketsType;
import com.paypal.core.SDKUtil;

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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

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
	private BasicAmountType orderTotal;

	/**
	 * URL to which the customer's browser is returned after
	 * choosing to pay with PayPal. PayPal recommends that the
	 * value of ReturnURL be the final review page on which the
	 * customer confirms the order and payment. Required Character
	 * length and limitations: no limit. 	 
	 */ 
	private String returnURL;

	/**
	 * URL to which the customer is returned if he does not approve
	 * the use of PayPal to pay you. PayPal recommends that the
	 * value of CancelURL be the original page on which the
	 * customer chose to pay with PayPal. Required Character length
	 * and limitations: no limit	 
	 */ 
	private String cancelURL;

	/**
	 * Tracking URL for ebay. Required Character length and
	 * limitations: no limit	 
	 */ 
	private String trackingImageURL;

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
	private String banktxnPendingURL;

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
	private String token;

	/**
	 * The expected maximum total amount of the complete order,
	 * including shipping cost and tax charges. Optional You must
	 * set the currencyID attribute to one of the three-character
	 * currency codes for any of the supported PayPal currencies.
	 * Limitations: Must not exceed $10,000 USD in any currency. No
	 * currency symbol. Decimal separator must be a period (.), and
	 * the thousands separator must be a comma (,).	 
	 */ 
	private BasicAmountType maxAmount;

	/**
	 * Description of items the customer is purchasing. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String orderDescription;

	/**
	 * A free-form field for your own use, such as a tracking
	 * number or other value you want PayPal to return on
	 * GetExpressCheckoutDetailsResponse and
	 * DoExpressCheckoutPaymentResponse. Optional Character length
	 * and limitations: 256 single-byte alphanumeric characters	 
	 */ 
	private String custom;

	/**
	 * Your own unique invoice or tracking number. PayPal returns
	 * this value to you on DoExpressCheckoutPaymentResponse.
	 * Optional Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String invoiceID;

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
	private String reqConfirmShipping;

	/**
	 * The value 1 indicates that you require that the customer's
	 * billing address on file. Setting this element overrides the
	 * setting you have specified in Admin. Optional Character
	 * length and limitations: One single-byte numeric character. 	 
	 */ 
	private String reqBillingAddress;

	/**
	 * The billing address for the buyer. Optional If you include
	 * the BillingAddress element, the AddressType elements are
	 * required: Name Street1 CityName CountryCode Do not set set
	 * the CountryName element. 	 
	 */ 
	private AddressType billingAddress;

	/**
	 * The value 1 indicates that on the PayPal pages, no shipping
	 * address fields should be displayed whatsoever. Optional
	 * Character length and limitations: Four single-byte numeric
	 * characters.	 
	 */ 
	private String noShipping;

	/**
	 * The value 1 indicates that the PayPal pages should display
	 * the shipping address set by you in the Address element on
	 * this SetExpressCheckoutRequest, not the shipping address on
	 * file with PayPal for this customer. Displaying the PayPal
	 * street address on file does not allow the customer to edit
	 * that address. Optional Character length and limitations:
	 * Four single-byte numeric characters.	 
	 */ 
	private String addressOverride;

	/**
	 * Locale of pages displayed by PayPal during Express Checkout.
	 * Optional Character length and limitations: Five single-byte
	 * alphabetic characters, upper- or lowercase. Allowable
	 * values: AU or en_AUDE or de_DEFR or fr_FRGB or en_GBIT or
	 * it_ITJP or ja_JPUS or en_US	 
	 */ 
	private String localeCode;

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
	private String pageStyle;

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
	private AddressType address;

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
	private PaymentActionCodeType paymentAction;

	/**
	 * This will indicate which flow you are choosing
	 * (expresschecheckout or expresscheckout optional) Optional
	 * None Sole indicates that you are in the ExpressO flow Mark
	 * indicates that you are in the old express flow. 	 
	 */ 
	private SolutionTypeType solutionType;

	/**
	 * This indicates Which page to display for ExpressO (Billing
	 * or Login) Optional None Billing indicates that you are not a
	 * paypal account holder Login indicates that you are a paypal
	 * account holder 	 
	 */ 
	private LandingPageType landingPage;

	/**
	 * Email address of the buyer as entered during checkout.
	 * PayPal uses this value to pre-fill the PayPal membership
	 * sign-up portion of the PayPal login page. Optional Character
	 * length and limit: 127 single-byte alphanumeric characters 	 
	 */ 
	private String buyerEmail;

	/**
	 * 	 
	 */ 
	private ChannelType channelType;

	/**
	 * 	 
	 */ 
	private List<BillingAgreementDetailsType> billingAgreementDetails = new ArrayList<BillingAgreementDetailsType>();

	/**
	 * Promo Code Optional List of promo codes supplied by
	 * merchant. These promo codes enable the Merchant Services
	 * Promotion Financing feature. 	 
	 */ 
	private List<String> promoCodes = new ArrayList<String>();

	/**
	 * Default Funding option for PayLater Checkout button. 	 
	 */ 
	private String payPalCheckOutBtnType;

	/**
	 * 	 
	 */ 
	private ProductCategoryType productCategory;

	/**
	 * 	 
	 */ 
	private ShippingServiceCodeType shippingMethod;

	/**
	 * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
	 * which address was changed by the user. 	 
	 */ 
	private String profileAddressChangeDate;

	/**
	 * The value 1 indicates that the customer may enter a note to
	 * the merchant on the PayPal page during checkout. The note is
	 * returned in the GetExpressCheckoutDetails response and the
	 * DoExpressCheckoutPayment response. Optional Character length
	 * and limitations: One single-byte numeric character.
	 * Allowable values: 0,1 	 
	 */ 
	private String allowNote;

	/**
	 * Funding source preferences. 	 
	 */ 
	private FundingSourceDetailsType fundingSourceDetails;

	/**
	 * The label that needs to be displayed on the cancel links in
	 * the PayPal hosted checkout pages. Optional Character length
	 * and limit: 127 single-byte alphanumeric characters 	 
	 */ 
	private String brandName;

	/**
	 * URL for PayPal to use to retrieve shipping, handling,
	 * insurance, and tax details from your website. Optional
	 * Character length and limitations: 2048 characters. 	 
	 */ 
	private String callbackURL;

	/**
	 * Enhanced data for different industry segments. Optional 	 
	 */ 
	private EnhancedCheckoutDataType enhancedCheckoutData;

	/**
	 * List of other payment methods the user can pay with.
	 * Optional Refer to the OtherPaymentMethodDetailsType for more
	 * details. 	 
	 */ 
	private List<OtherPaymentMethodDetailsType> otherPaymentMethods = new ArrayList<OtherPaymentMethodDetailsType>();

	/**
	 * Details about the buyer's account. Optional Refer to the
	 * BuyerDetailsType for more details. 	 
	 */ 
	private BuyerDetailsType buyerDetails;

	/**
	 * Information about the payment. 	 
	 */ 
	private List<PaymentDetailsType> paymentDetails = new ArrayList<PaymentDetailsType>();

	/**
	 * List of Fall Back Shipping options provided by merchant. 	 
	 */ 
	private List<ShippingOptionType> flatRateShippingOptions = new ArrayList<ShippingOptionType>();

	/**
	 * Information about the call back timeout override. 	 
	 */ 
	private String callbackTimeout;

	/**
	 * Information about the call back version. 	 
	 */ 
	private String callbackVersion;

	/**
	 * Information about the Customer service number. 	 
	 */ 
	private String customerServiceNumber;

	/**
	 * Information about the Gift message enable. 	 
	 */ 
	private String giftMessageEnable;

	/**
	 * Information about the Gift receipt enable. 	 
	 */ 
	private String giftReceiptEnable;

	/**
	 * Information about the Gift Wrap enable. 	 
	 */ 
	private String giftWrapEnable;

	/**
	 * Information about the Gift Wrap name. 	 
	 */ 
	private String giftWrapName;

	/**
	 * Information about the Gift Wrap amount. 	 
	 */ 
	private BasicAmountType giftWrapAmount;

	/**
	 * Information about the Buyer email option enable . 	 
	 */ 
	private String buyerEmailOptInEnable;

	/**
	 * Information about the survey enable. 	 
	 */ 
	private String surveyEnable;

	/**
	 * Information about the survey question. 	 
	 */ 
	private String surveyQuestion;

	/**
	 * Information about the survey choices for survey question. 	 
	 */ 
	private List<String> surveyChoice = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private TotalType totalType;

	/**
	 * Any message the seller would like to be displayed in the
	 * Mini Cart for UX. 	 
	 */ 
	private String noteToBuyer;

	/**
	 * Incentive Code Optional List of incentive codes supplied by
	 * ebay/merchant. 	 
	 */ 
	private List<IncentiveInfoType> incentives = new ArrayList<IncentiveInfoType>();

	/**
	 * Merchant specified flag which indicates whether to return
	 * Funding Instrument Details in DoEC or not. Optional 	 
	 */ 
	private String reqInstrumentDetails;

	/**
	 * This element contains information that allows the merchant
	 * to request to opt into external remember me on behalf of the
	 * buyer or to request login bypass using external remember me.
	 * Note the opt-in details are silently ignored if the
	 * ExternalRememberMeID is present. 	 
	 */ 
	private ExternalRememberMeOptInDetailsType externalRememberMeOptInDetails;

	/**
	 * An optional set of values related to flow-specific details. 	 
	 */ 
	private FlowControlDetailsType flowControlDetails;

	/**
	 * An optional set of values related to display-specific
	 * details. 	 
	 */ 
	private DisplayControlDetailsType displayControlDetails;

	/**
	 * An optional set of values related to tracking for external
	 * partner. 	 
	 */ 
	private ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails;

	/**
	 * Optional element that defines relationship between buckets 	 
	 */ 
	private List<CoupledBucketsType> coupledBuckets = new ArrayList<CoupledBucketsType>();

	

	/**
	 * Default Constructor
	 */
	public SetExpressCheckoutRequestDetailsType (){
	}	

	/**
	 * Getter for orderTotal
	 */
	 public BasicAmountType getOrderTotal() {
	 	return orderTotal;
	 }
	 
	/**
	 * Setter for orderTotal
	 */
	 public void setOrderTotal(BasicAmountType orderTotal) {
	 	this.orderTotal = orderTotal;
	 }
	 
	/**
	 * Getter for returnURL
	 */
	 public String getReturnURL() {
	 	return returnURL;
	 }
	 
	/**
	 * Setter for returnURL
	 */
	 public void setReturnURL(String returnURL) {
	 	this.returnURL = returnURL;
	 }
	 
	/**
	 * Getter for cancelURL
	 */
	 public String getCancelURL() {
	 	return cancelURL;
	 }
	 
	/**
	 * Setter for cancelURL
	 */
	 public void setCancelURL(String cancelURL) {
	 	this.cancelURL = cancelURL;
	 }
	 
	/**
	 * Getter for trackingImageURL
	 */
	 public String getTrackingImageURL() {
	 	return trackingImageURL;
	 }
	 
	/**
	 * Setter for trackingImageURL
	 */
	 public void setTrackingImageURL(String trackingImageURL) {
	 	this.trackingImageURL = trackingImageURL;
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
	 * Getter for banktxnPendingURL
	 */
	 public String getBanktxnPendingURL() {
	 	return banktxnPendingURL;
	 }
	 
	/**
	 * Setter for banktxnPendingURL
	 */
	 public void setBanktxnPendingURL(String banktxnPendingURL) {
	 	this.banktxnPendingURL = banktxnPendingURL;
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
	 * Getter for maxAmount
	 */
	 public BasicAmountType getMaxAmount() {
	 	return maxAmount;
	 }
	 
	/**
	 * Setter for maxAmount
	 */
	 public void setMaxAmount(BasicAmountType maxAmount) {
	 	this.maxAmount = maxAmount;
	 }
	 
	/**
	 * Getter for orderDescription
	 */
	 public String getOrderDescription() {
	 	return orderDescription;
	 }
	 
	/**
	 * Setter for orderDescription
	 */
	 public void setOrderDescription(String orderDescription) {
	 	this.orderDescription = orderDescription;
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
	 * Getter for reqConfirmShipping
	 */
	 public String getReqConfirmShipping() {
	 	return reqConfirmShipping;
	 }
	 
	/**
	 * Setter for reqConfirmShipping
	 */
	 public void setReqConfirmShipping(String reqConfirmShipping) {
	 	this.reqConfirmShipping = reqConfirmShipping;
	 }
	 
	/**
	 * Getter for reqBillingAddress
	 */
	 public String getReqBillingAddress() {
	 	return reqBillingAddress;
	 }
	 
	/**
	 * Setter for reqBillingAddress
	 */
	 public void setReqBillingAddress(String reqBillingAddress) {
	 	this.reqBillingAddress = reqBillingAddress;
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
	 * Getter for noShipping
	 */
	 public String getNoShipping() {
	 	return noShipping;
	 }
	 
	/**
	 * Setter for noShipping
	 */
	 public void setNoShipping(String noShipping) {
	 	this.noShipping = noShipping;
	 }
	 
	/**
	 * Getter for addressOverride
	 */
	 public String getAddressOverride() {
	 	return addressOverride;
	 }
	 
	/**
	 * Setter for addressOverride
	 */
	 public void setAddressOverride(String addressOverride) {
	 	this.addressOverride = addressOverride;
	 }
	 
	/**
	 * Getter for localeCode
	 */
	 public String getLocaleCode() {
	 	return localeCode;
	 }
	 
	/**
	 * Setter for localeCode
	 */
	 public void setLocaleCode(String localeCode) {
	 	this.localeCode = localeCode;
	 }
	 
	/**
	 * Getter for pageStyle
	 */
	 public String getPageStyle() {
	 	return pageStyle;
	 }
	 
	/**
	 * Setter for pageStyle
	 */
	 public void setPageStyle(String pageStyle) {
	 	this.pageStyle = pageStyle;
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
	 * Getter for address
	 */
	 public AddressType getAddress() {
	 	return address;
	 }
	 
	/**
	 * Setter for address
	 */
	 public void setAddress(AddressType address) {
	 	this.address = address;
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
	 * Getter for solutionType
	 */
	 public SolutionTypeType getSolutionType() {
	 	return solutionType;
	 }
	 
	/**
	 * Setter for solutionType
	 */
	 public void setSolutionType(SolutionTypeType solutionType) {
	 	this.solutionType = solutionType;
	 }
	 
	/**
	 * Getter for landingPage
	 */
	 public LandingPageType getLandingPage() {
	 	return landingPage;
	 }
	 
	/**
	 * Setter for landingPage
	 */
	 public void setLandingPage(LandingPageType landingPage) {
	 	this.landingPage = landingPage;
	 }
	 
	/**
	 * Getter for buyerEmail
	 */
	 public String getBuyerEmail() {
	 	return buyerEmail;
	 }
	 
	/**
	 * Setter for buyerEmail
	 */
	 public void setBuyerEmail(String buyerEmail) {
	 	this.buyerEmail = buyerEmail;
	 }
	 
	/**
	 * Getter for channelType
	 */
	 public ChannelType getChannelType() {
	 	return channelType;
	 }
	 
	/**
	 * Setter for channelType
	 */
	 public void setChannelType(ChannelType channelType) {
	 	this.channelType = channelType;
	 }
	 
	/**
	 * Getter for billingAgreementDetails
	 */
	 public List<BillingAgreementDetailsType> getBillingAgreementDetails() {
	 	return billingAgreementDetails;
	 }
	 
	/**
	 * Setter for billingAgreementDetails
	 */
	 public void setBillingAgreementDetails(List<BillingAgreementDetailsType> billingAgreementDetails) {
	 	this.billingAgreementDetails = billingAgreementDetails;
	 }
	 
	/**
	 * Getter for promoCodes
	 */
	 public List<String> getPromoCodes() {
	 	return promoCodes;
	 }
	 
	/**
	 * Setter for promoCodes
	 */
	 public void setPromoCodes(List<String> promoCodes) {
	 	this.promoCodes = promoCodes;
	 }
	 
	/**
	 * Getter for payPalCheckOutBtnType
	 */
	 public String getPayPalCheckOutBtnType() {
	 	return payPalCheckOutBtnType;
	 }
	 
	/**
	 * Setter for payPalCheckOutBtnType
	 */
	 public void setPayPalCheckOutBtnType(String payPalCheckOutBtnType) {
	 	this.payPalCheckOutBtnType = payPalCheckOutBtnType;
	 }
	 
	/**
	 * Getter for productCategory
	 */
	 public ProductCategoryType getProductCategory() {
	 	return productCategory;
	 }
	 
	/**
	 * Setter for productCategory
	 */
	 public void setProductCategory(ProductCategoryType productCategory) {
	 	this.productCategory = productCategory;
	 }
	 
	/**
	 * Getter for shippingMethod
	 */
	 public ShippingServiceCodeType getShippingMethod() {
	 	return shippingMethod;
	 }
	 
	/**
	 * Setter for shippingMethod
	 */
	 public void setShippingMethod(ShippingServiceCodeType shippingMethod) {
	 	this.shippingMethod = shippingMethod;
	 }
	 
	/**
	 * Getter for profileAddressChangeDate
	 */
	 public String getProfileAddressChangeDate() {
	 	return profileAddressChangeDate;
	 }
	 
	/**
	 * Setter for profileAddressChangeDate
	 */
	 public void setProfileAddressChangeDate(String profileAddressChangeDate) {
	 	this.profileAddressChangeDate = profileAddressChangeDate;
	 }
	 
	/**
	 * Getter for allowNote
	 */
	 public String getAllowNote() {
	 	return allowNote;
	 }
	 
	/**
	 * Setter for allowNote
	 */
	 public void setAllowNote(String allowNote) {
	 	this.allowNote = allowNote;
	 }
	 
	/**
	 * Getter for fundingSourceDetails
	 */
	 public FundingSourceDetailsType getFundingSourceDetails() {
	 	return fundingSourceDetails;
	 }
	 
	/**
	 * Setter for fundingSourceDetails
	 */
	 public void setFundingSourceDetails(FundingSourceDetailsType fundingSourceDetails) {
	 	this.fundingSourceDetails = fundingSourceDetails;
	 }
	 
	/**
	 * Getter for brandName
	 */
	 public String getBrandName() {
	 	return brandName;
	 }
	 
	/**
	 * Setter for brandName
	 */
	 public void setBrandName(String brandName) {
	 	this.brandName = brandName;
	 }
	 
	/**
	 * Getter for callbackURL
	 */
	 public String getCallbackURL() {
	 	return callbackURL;
	 }
	 
	/**
	 * Setter for callbackURL
	 */
	 public void setCallbackURL(String callbackURL) {
	 	this.callbackURL = callbackURL;
	 }
	 
	/**
	 * Getter for enhancedCheckoutData
	 */
	 public EnhancedCheckoutDataType getEnhancedCheckoutData() {
	 	return enhancedCheckoutData;
	 }
	 
	/**
	 * Setter for enhancedCheckoutData
	 */
	 public void setEnhancedCheckoutData(EnhancedCheckoutDataType enhancedCheckoutData) {
	 	this.enhancedCheckoutData = enhancedCheckoutData;
	 }
	 
	/**
	 * Getter for otherPaymentMethods
	 */
	 public List<OtherPaymentMethodDetailsType> getOtherPaymentMethods() {
	 	return otherPaymentMethods;
	 }
	 
	/**
	 * Setter for otherPaymentMethods
	 */
	 public void setOtherPaymentMethods(List<OtherPaymentMethodDetailsType> otherPaymentMethods) {
	 	this.otherPaymentMethods = otherPaymentMethods;
	 }
	 
	/**
	 * Getter for buyerDetails
	 */
	 public BuyerDetailsType getBuyerDetails() {
	 	return buyerDetails;
	 }
	 
	/**
	 * Setter for buyerDetails
	 */
	 public void setBuyerDetails(BuyerDetailsType buyerDetails) {
	 	this.buyerDetails = buyerDetails;
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
	 * Getter for flatRateShippingOptions
	 */
	 public List<ShippingOptionType> getFlatRateShippingOptions() {
	 	return flatRateShippingOptions;
	 }
	 
	/**
	 * Setter for flatRateShippingOptions
	 */
	 public void setFlatRateShippingOptions(List<ShippingOptionType> flatRateShippingOptions) {
	 	this.flatRateShippingOptions = flatRateShippingOptions;
	 }
	 
	/**
	 * Getter for callbackTimeout
	 */
	 public String getCallbackTimeout() {
	 	return callbackTimeout;
	 }
	 
	/**
	 * Setter for callbackTimeout
	 */
	 public void setCallbackTimeout(String callbackTimeout) {
	 	this.callbackTimeout = callbackTimeout;
	 }
	 
	/**
	 * Getter for callbackVersion
	 */
	 public String getCallbackVersion() {
	 	return callbackVersion;
	 }
	 
	/**
	 * Setter for callbackVersion
	 */
	 public void setCallbackVersion(String callbackVersion) {
	 	this.callbackVersion = callbackVersion;
	 }
	 
	/**
	 * Getter for customerServiceNumber
	 */
	 public String getCustomerServiceNumber() {
	 	return customerServiceNumber;
	 }
	 
	/**
	 * Setter for customerServiceNumber
	 */
	 public void setCustomerServiceNumber(String customerServiceNumber) {
	 	this.customerServiceNumber = customerServiceNumber;
	 }
	 
	/**
	 * Getter for giftMessageEnable
	 */
	 public String getGiftMessageEnable() {
	 	return giftMessageEnable;
	 }
	 
	/**
	 * Setter for giftMessageEnable
	 */
	 public void setGiftMessageEnable(String giftMessageEnable) {
	 	this.giftMessageEnable = giftMessageEnable;
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
	 * Getter for giftWrapEnable
	 */
	 public String getGiftWrapEnable() {
	 	return giftWrapEnable;
	 }
	 
	/**
	 * Setter for giftWrapEnable
	 */
	 public void setGiftWrapEnable(String giftWrapEnable) {
	 	this.giftWrapEnable = giftWrapEnable;
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
	 * Getter for buyerEmailOptInEnable
	 */
	 public String getBuyerEmailOptInEnable() {
	 	return buyerEmailOptInEnable;
	 }
	 
	/**
	 * Setter for buyerEmailOptInEnable
	 */
	 public void setBuyerEmailOptInEnable(String buyerEmailOptInEnable) {
	 	this.buyerEmailOptInEnable = buyerEmailOptInEnable;
	 }
	 
	/**
	 * Getter for surveyEnable
	 */
	 public String getSurveyEnable() {
	 	return surveyEnable;
	 }
	 
	/**
	 * Setter for surveyEnable
	 */
	 public void setSurveyEnable(String surveyEnable) {
	 	this.surveyEnable = surveyEnable;
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
	 * Getter for surveyChoice
	 */
	 public List<String> getSurveyChoice() {
	 	return surveyChoice;
	 }
	 
	/**
	 * Setter for surveyChoice
	 */
	 public void setSurveyChoice(List<String> surveyChoice) {
	 	this.surveyChoice = surveyChoice;
	 }
	 
	/**
	 * Getter for totalType
	 */
	 public TotalType getTotalType() {
	 	return totalType;
	 }
	 
	/**
	 * Setter for totalType
	 */
	 public void setTotalType(TotalType totalType) {
	 	this.totalType = totalType;
	 }
	 
	/**
	 * Getter for noteToBuyer
	 */
	 public String getNoteToBuyer() {
	 	return noteToBuyer;
	 }
	 
	/**
	 * Setter for noteToBuyer
	 */
	 public void setNoteToBuyer(String noteToBuyer) {
	 	this.noteToBuyer = noteToBuyer;
	 }
	 
	/**
	 * Getter for incentives
	 */
	 public List<IncentiveInfoType> getIncentives() {
	 	return incentives;
	 }
	 
	/**
	 * Setter for incentives
	 */
	 public void setIncentives(List<IncentiveInfoType> incentives) {
	 	this.incentives = incentives;
	 }
	 
	/**
	 * Getter for reqInstrumentDetails
	 */
	 public String getReqInstrumentDetails() {
	 	return reqInstrumentDetails;
	 }
	 
	/**
	 * Setter for reqInstrumentDetails
	 */
	 public void setReqInstrumentDetails(String reqInstrumentDetails) {
	 	this.reqInstrumentDetails = reqInstrumentDetails;
	 }
	 
	/**
	 * Getter for externalRememberMeOptInDetails
	 */
	 public ExternalRememberMeOptInDetailsType getExternalRememberMeOptInDetails() {
	 	return externalRememberMeOptInDetails;
	 }
	 
	/**
	 * Setter for externalRememberMeOptInDetails
	 */
	 public void setExternalRememberMeOptInDetails(ExternalRememberMeOptInDetailsType externalRememberMeOptInDetails) {
	 	this.externalRememberMeOptInDetails = externalRememberMeOptInDetails;
	 }
	 
	/**
	 * Getter for flowControlDetails
	 */
	 public FlowControlDetailsType getFlowControlDetails() {
	 	return flowControlDetails;
	 }
	 
	/**
	 * Setter for flowControlDetails
	 */
	 public void setFlowControlDetails(FlowControlDetailsType flowControlDetails) {
	 	this.flowControlDetails = flowControlDetails;
	 }
	 
	/**
	 * Getter for displayControlDetails
	 */
	 public DisplayControlDetailsType getDisplayControlDetails() {
	 	return displayControlDetails;
	 }
	 
	/**
	 * Setter for displayControlDetails
	 */
	 public void setDisplayControlDetails(DisplayControlDetailsType displayControlDetails) {
	 	this.displayControlDetails = displayControlDetails;
	 }
	 
	/**
	 * Getter for externalPartnerTrackingDetails
	 */
	 public ExternalPartnerTrackingDetailsType getExternalPartnerTrackingDetails() {
	 	return externalPartnerTrackingDetails;
	 }
	 
	/**
	 * Setter for externalPartnerTrackingDetails
	 */
	 public void setExternalPartnerTrackingDetails(ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails) {
	 	this.externalPartnerTrackingDetails = externalPartnerTrackingDetails;
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
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(orderTotal != null) {
			sb.append(orderTotal.toXMLString(preferredPrefix,"OrderTotal"));
		}
		if(returnURL != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnURL));
			sb.append("</").append(preferredPrefix).append(":ReturnURL>");
		}
		if(cancelURL != null) {
			sb.append("<").append(preferredPrefix).append(":CancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(cancelURL));
			sb.append("</").append(preferredPrefix).append(":CancelURL>");
		}
		if(trackingImageURL != null) {
			sb.append("<").append(preferredPrefix).append(":TrackingImageURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(trackingImageURL));
			sb.append("</").append(preferredPrefix).append(":TrackingImageURL>");
		}
		if(giropaySuccessURL != null) {
			sb.append("<").append(preferredPrefix).append(":giropaySuccessURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(giropaySuccessURL));
			sb.append("</").append(preferredPrefix).append(":giropaySuccessURL>");
		}
		if(giropayCancelURL != null) {
			sb.append("<").append(preferredPrefix).append(":giropayCancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(giropayCancelURL));
			sb.append("</").append(preferredPrefix).append(":giropayCancelURL>");
		}
		if(banktxnPendingURL != null) {
			sb.append("<").append(preferredPrefix).append(":BanktxnPendingURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(banktxnPendingURL));
			sb.append("</").append(preferredPrefix).append(":BanktxnPendingURL>");
		}
		if(token != null) {
			sb.append("<").append(preferredPrefix).append(":Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(token));
			sb.append("</").append(preferredPrefix).append(":Token>");
		}
		if(maxAmount != null) {
			sb.append(maxAmount.toXMLString(preferredPrefix,"MaxAmount"));
		}
		if(orderDescription != null) {
			sb.append("<").append(preferredPrefix).append(":OrderDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(orderDescription));
			sb.append("</").append(preferredPrefix).append(":OrderDescription>");
		}
		if(custom != null) {
			sb.append("<").append(preferredPrefix).append(":Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(custom));
			sb.append("</").append(preferredPrefix).append(":Custom>");
		}
		if(invoiceID != null) {
			sb.append("<").append(preferredPrefix).append(":InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoiceID));
			sb.append("</").append(preferredPrefix).append(":InvoiceID>");
		}
		if(reqConfirmShipping != null) {
			sb.append("<").append(preferredPrefix).append(":ReqConfirmShipping>").append(SDKUtil.escapeInvalidXmlCharsRegex(reqConfirmShipping));
			sb.append("</").append(preferredPrefix).append(":ReqConfirmShipping>");
		}
		if(reqBillingAddress != null) {
			sb.append("<").append(preferredPrefix).append(":ReqBillingAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(reqBillingAddress));
			sb.append("</").append(preferredPrefix).append(":ReqBillingAddress>");
		}
		if(billingAddress != null) {
			sb.append(billingAddress.toXMLString(preferredPrefix,"BillingAddress"));
		}
		if(noShipping != null) {
			sb.append("<").append(preferredPrefix).append(":NoShipping>").append(SDKUtil.escapeInvalidXmlCharsRegex(noShipping));
			sb.append("</").append(preferredPrefix).append(":NoShipping>");
		}
		if(addressOverride != null) {
			sb.append("<").append(preferredPrefix).append(":AddressOverride>").append(SDKUtil.escapeInvalidXmlCharsRegex(addressOverride));
			sb.append("</").append(preferredPrefix).append(":AddressOverride>");
		}
		if(localeCode != null) {
			sb.append("<").append(preferredPrefix).append(":LocaleCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(localeCode));
			sb.append("</").append(preferredPrefix).append(":LocaleCode>");
		}
		if(pageStyle != null) {
			sb.append("<").append(preferredPrefix).append(":PageStyle>").append(SDKUtil.escapeInvalidXmlCharsRegex(pageStyle));
			sb.append("</").append(preferredPrefix).append(":PageStyle>");
		}
		if(cppHeaderImage != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-image>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderImage));
			sb.append("</").append(preferredPrefix).append(":cpp-header-image>");
		}
		if(cppHeaderBorderColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-border-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBorderColor));
			sb.append("</").append(preferredPrefix).append(":cpp-header-border-color>");
		}
		if(cppHeaderBackColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-back-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBackColor));
			sb.append("</").append(preferredPrefix).append(":cpp-header-back-color>");
		}
		if(cppPayflowColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-payflow-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppPayflowColor));
			sb.append("</").append(preferredPrefix).append(":cpp-payflow-color>");
		}
		if(cppCartBorderColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-cart-border-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppCartBorderColor));
			sb.append("</").append(preferredPrefix).append(":cpp-cart-border-color>");
		}
		if(cppLogoImage != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-logo-image>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppLogoImage));
			sb.append("</").append(preferredPrefix).append(":cpp-logo-image>");
		}
		if(address != null) {
			sb.append(address.toXMLString(preferredPrefix,"Address"));
		}
		if(paymentAction != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentAction.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentAction>");
		}
		if(solutionType != null) {
			sb.append("<").append(preferredPrefix).append(":SolutionType>").append(SDKUtil.escapeInvalidXmlCharsRegex(solutionType.getValue()));
			sb.append("</").append(preferredPrefix).append(":SolutionType>");
		}
		if(landingPage != null) {
			sb.append("<").append(preferredPrefix).append(":LandingPage>").append(SDKUtil.escapeInvalidXmlCharsRegex(landingPage.getValue()));
			sb.append("</").append(preferredPrefix).append(":LandingPage>");
		}
		if(buyerEmail != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyerEmail));
			sb.append("</").append(preferredPrefix).append(":BuyerEmail>");
		}
		if(channelType != null) {
			sb.append("<").append(preferredPrefix).append(":ChannelType>").append(SDKUtil.escapeInvalidXmlCharsRegex(channelType.getValue()));
			sb.append("</").append(preferredPrefix).append(":ChannelType>");
		}
		if(billingAgreementDetails != null) {
			for(int i=0; i < billingAgreementDetails.size(); i++) {
				sb.append(billingAgreementDetails.get(i).toXMLString(preferredPrefix,"BillingAgreementDetails"));
			}
		}
		if(promoCodes != null) {
			for(int i=0; i < promoCodes.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":PromoCodes>").append(SDKUtil.escapeInvalidXmlCharsRegex(promoCodes.get(i)));
				sb.append("</").append(preferredPrefix).append(":PromoCodes>");
			}
		}
		if(payPalCheckOutBtnType != null) {
			sb.append("<").append(preferredPrefix).append(":PayPalCheckOutBtnType>").append(SDKUtil.escapeInvalidXmlCharsRegex(payPalCheckOutBtnType));
			sb.append("</").append(preferredPrefix).append(":PayPalCheckOutBtnType>");
		}
		if(productCategory != null) {
			sb.append("<").append(preferredPrefix).append(":ProductCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(productCategory.getValue()));
			sb.append("</").append(preferredPrefix).append(":ProductCategory>");
		}
		if(shippingMethod != null) {
			sb.append("<").append(preferredPrefix).append(":ShippingMethod>").append(SDKUtil.escapeInvalidXmlCharsRegex(shippingMethod.getValue()));
			sb.append("</").append(preferredPrefix).append(":ShippingMethod>");
		}
		if(profileAddressChangeDate != null) {
			sb.append("<").append(preferredPrefix).append(":ProfileAddressChangeDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(profileAddressChangeDate));
			sb.append("</").append(preferredPrefix).append(":ProfileAddressChangeDate>");
		}
		if(allowNote != null) {
			sb.append("<").append(preferredPrefix).append(":AllowNote>").append(SDKUtil.escapeInvalidXmlCharsRegex(allowNote));
			sb.append("</").append(preferredPrefix).append(":AllowNote>");
		}
		if(fundingSourceDetails != null) {
			sb.append(fundingSourceDetails.toXMLString(preferredPrefix,"FundingSourceDetails"));
		}
		if(brandName != null) {
			sb.append("<").append(preferredPrefix).append(":BrandName>").append(SDKUtil.escapeInvalidXmlCharsRegex(brandName));
			sb.append("</").append(preferredPrefix).append(":BrandName>");
		}
		if(callbackURL != null) {
			sb.append("<").append(preferredPrefix).append(":CallbackURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(callbackURL));
			sb.append("</").append(preferredPrefix).append(":CallbackURL>");
		}
		if(enhancedCheckoutData != null) {
			sb.append(enhancedCheckoutData.toXMLString(preferredPrefix,"EnhancedCheckoutData"));
		}
		if(otherPaymentMethods != null) {
			for(int i=0; i < otherPaymentMethods.size(); i++) {
				sb.append(otherPaymentMethods.get(i).toXMLString(preferredPrefix,"OtherPaymentMethods"));
			}
		}
		if(buyerDetails != null) {
			sb.append(buyerDetails.toXMLString(preferredPrefix,"BuyerDetails"));
		}
		if(paymentDetails != null) {
			for(int i=0; i < paymentDetails.size(); i++) {
				sb.append(paymentDetails.get(i).toXMLString(preferredPrefix,"PaymentDetails"));
			}
		}
		if(flatRateShippingOptions != null) {
			for(int i=0; i < flatRateShippingOptions.size(); i++) {
				sb.append(flatRateShippingOptions.get(i).toXMLString(preferredPrefix,"FlatRateShippingOptions"));
			}
		}
		if(callbackTimeout != null) {
			sb.append("<").append(preferredPrefix).append(":CallbackTimeout>").append(SDKUtil.escapeInvalidXmlCharsRegex(callbackTimeout));
			sb.append("</").append(preferredPrefix).append(":CallbackTimeout>");
		}
		if(callbackVersion != null) {
			sb.append("<").append(preferredPrefix).append(":CallbackVersion>").append(SDKUtil.escapeInvalidXmlCharsRegex(callbackVersion));
			sb.append("</").append(preferredPrefix).append(":CallbackVersion>");
		}
		if(customerServiceNumber != null) {
			sb.append("<").append(preferredPrefix).append(":CustomerServiceNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(customerServiceNumber));
			sb.append("</").append(preferredPrefix).append(":CustomerServiceNumber>");
		}
		if(giftMessageEnable != null) {
			sb.append("<").append(preferredPrefix).append(":GiftMessageEnable>").append(SDKUtil.escapeInvalidXmlCharsRegex(giftMessageEnable));
			sb.append("</").append(preferredPrefix).append(":GiftMessageEnable>");
		}
		if(giftReceiptEnable != null) {
			sb.append("<").append(preferredPrefix).append(":GiftReceiptEnable>").append(SDKUtil.escapeInvalidXmlCharsRegex(giftReceiptEnable));
			sb.append("</").append(preferredPrefix).append(":GiftReceiptEnable>");
		}
		if(giftWrapEnable != null) {
			sb.append("<").append(preferredPrefix).append(":GiftWrapEnable>").append(SDKUtil.escapeInvalidXmlCharsRegex(giftWrapEnable));
			sb.append("</").append(preferredPrefix).append(":GiftWrapEnable>");
		}
		if(giftWrapName != null) {
			sb.append("<").append(preferredPrefix).append(":GiftWrapName>").append(SDKUtil.escapeInvalidXmlCharsRegex(giftWrapName));
			sb.append("</").append(preferredPrefix).append(":GiftWrapName>");
		}
		if(giftWrapAmount != null) {
			sb.append(giftWrapAmount.toXMLString(preferredPrefix,"GiftWrapAmount"));
		}
		if(buyerEmailOptInEnable != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerEmailOptInEnable>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyerEmailOptInEnable));
			sb.append("</").append(preferredPrefix).append(":BuyerEmailOptInEnable>");
		}
		if(surveyEnable != null) {
			sb.append("<").append(preferredPrefix).append(":SurveyEnable>").append(SDKUtil.escapeInvalidXmlCharsRegex(surveyEnable));
			sb.append("</").append(preferredPrefix).append(":SurveyEnable>");
		}
		if(surveyQuestion != null) {
			sb.append("<").append(preferredPrefix).append(":SurveyQuestion>").append(SDKUtil.escapeInvalidXmlCharsRegex(surveyQuestion));
			sb.append("</").append(preferredPrefix).append(":SurveyQuestion>");
		}
		if(surveyChoice != null) {
			for(int i=0; i < surveyChoice.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":SurveyChoice>").append(SDKUtil.escapeInvalidXmlCharsRegex(surveyChoice.get(i)));
				sb.append("</").append(preferredPrefix).append(":SurveyChoice>");
			}
		}
		if(totalType != null) {
			sb.append("<").append(preferredPrefix).append(":TotalType>").append(SDKUtil.escapeInvalidXmlCharsRegex(totalType.getValue()));
			sb.append("</").append(preferredPrefix).append(":TotalType>");
		}
		if(noteToBuyer != null) {
			sb.append("<").append(preferredPrefix).append(":NoteToBuyer>").append(SDKUtil.escapeInvalidXmlCharsRegex(noteToBuyer));
			sb.append("</").append(preferredPrefix).append(":NoteToBuyer>");
		}
		if(incentives != null) {
			for(int i=0; i < incentives.size(); i++) {
				sb.append(incentives.get(i).toXMLString(preferredPrefix,"Incentives"));
			}
		}
		if(reqInstrumentDetails != null) {
			sb.append("<").append(preferredPrefix).append(":ReqInstrumentDetails>").append(SDKUtil.escapeInvalidXmlCharsRegex(reqInstrumentDetails));
			sb.append("</").append(preferredPrefix).append(":ReqInstrumentDetails>");
		}
		if(externalRememberMeOptInDetails != null) {
			sb.append(externalRememberMeOptInDetails.toXMLString(preferredPrefix,"ExternalRememberMeOptInDetails"));
		}
		if(flowControlDetails != null) {
			sb.append(flowControlDetails.toXMLString(preferredPrefix,"FlowControlDetails"));
		}
		if(displayControlDetails != null) {
			sb.append(displayControlDetails.toXMLString(preferredPrefix,"DisplayControlDetails"));
		}
		if(externalPartnerTrackingDetails != null) {
			sb.append(externalPartnerTrackingDetails.toXMLString(preferredPrefix,"ExternalPartnerTrackingDetails"));
		}
		if(coupledBuckets != null) {
			for(int i=0; i < coupledBuckets.size(); i++) {
				sb.append(coupledBuckets.get(i).toXMLString(preferredPrefix,"CoupledBuckets"));
			}
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