package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import com.paypal.core.SDKUtil;

/**
 * How you want to obtain payment. Required Authorization
 * indicates that this payment is a basic authorization subject
 * to settlement with PayPal Authorization and Capture. Sale
 * indicates that this is a final sale for which you are
 * requesting payment. NOTE: Order is not allowed for Direct
 * Payment. Character length and limit: Up to 13 single-byte
 * alphabetic characters 
 */
public class DoDirectPaymentRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * How you want to obtain payment. Required Authorization
	 * indicates that this payment is a basic authorization subject
	 * to settlement with PayPal Authorization and Capture. Sale
	 * indicates that this is a final sale for which you are
	 * requesting payment. NOTE: Order is not allowed for Direct
	 * Payment. Character length and limit: Up to 13 single-byte
	 * alphabetic characters	 
	 */ 
	private PaymentActionCodeType paymentAction;

	/**
	 * Information about the payment Required 	 
	 */ 
	private PaymentDetailsType paymentDetails;

	/**
	 * Information about the credit card to be charged. Required 	 
	 */ 
	private CreditCardDetailsType creditCard;

	/**
	 * IP address of the payer's browser as recorded in its HTTP
	 * request to your website. PayPal records this IP addresses as
	 * a means to detect possible fraud. Required Character length
	 * and limitations: 15 single-byte characters, including
	 * periods, in dotted-quad format: ???.???.???.???	 
	 */ 
	private String iPAddress;

	/**
	 * Your customer session identification token. PayPal records
	 * this optional session identification token as an additional
	 * means to detect possible fraud. Optional Character length
	 * and limitations: 64 single-byte numeric characters	 
	 */ 
	private String merchantSessionId;

	/**
	 * 	 
	 */ 
	private Boolean returnFMFDetails;

	/**
	 * Use this optional parameter to pass in your business name
	 * and other data describing the transaction. Optional This
	 * information is usually displayed in the account holder's
	 * statement. Example: RedCross Haiti, RedCross Uganda,
	 * Realtor.com dues, Realtor.com list fee Length 25 characters.
	 * Alphanumeric characters and dash(-), dot(.), asterisk(*),
	 * space( ) On the customer's statement, an asterisk is used to
	 * separate the DBA name and product name. The asterisk
	 * delimiter can appear in position 4, 8, or 13. 	 
	 */ 
	private String softDescriptor;

	/**
	 * Use this optional parameter to pass information about how
	 * consumer should contact the merchant. Optional This
	 * information is usually displayed in the account holder's
	 * statement. For Ecom trx: phone, email or URL is allowed For
	 * Retail trx: only the actual city is allowed For details on
	 * allowed characters in Soft Descriptor City refer to the API
	 * documentation. 	 
	 */ 
	private String softDescriptorCity;

	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentRequestDetailsType (){
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
	 * Getter for paymentDetails
	 */
	 public PaymentDetailsType getPaymentDetails() {
	 	return paymentDetails;
	 }
	 
	/**
	 * Setter for paymentDetails
	 */
	 public void setPaymentDetails(PaymentDetailsType paymentDetails) {
	 	this.paymentDetails = paymentDetails;
	 }
	 
	/**
	 * Getter for creditCard
	 */
	 public CreditCardDetailsType getCreditCard() {
	 	return creditCard;
	 }
	 
	/**
	 * Setter for creditCard
	 */
	 public void setCreditCard(CreditCardDetailsType creditCard) {
	 	this.creditCard = creditCard;
	 }
	 
	/**
	 * Getter for iPAddress
	 */
	 public String getIPAddress() {
	 	return iPAddress;
	 }
	 
	/**
	 * Setter for iPAddress
	 */
	 public void setIPAddress(String iPAddress) {
	 	this.iPAddress = iPAddress;
	 }
	 
	/**
	 * Getter for merchantSessionId
	 */
	 public String getMerchantSessionId() {
	 	return merchantSessionId;
	 }
	 
	/**
	 * Setter for merchantSessionId
	 */
	 public void setMerchantSessionId(String merchantSessionId) {
	 	this.merchantSessionId = merchantSessionId;
	 }
	 
	/**
	 * Getter for returnFMFDetails
	 */
	 public Boolean getReturnFMFDetails() {
	 	return returnFMFDetails;
	 }
	 
	/**
	 * Setter for returnFMFDetails
	 */
	 public void setReturnFMFDetails(Boolean returnFMFDetails) {
	 	this.returnFMFDetails = returnFMFDetails;
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
	 * Getter for softDescriptorCity
	 */
	 public String getSoftDescriptorCity() {
	 	return softDescriptorCity;
	 }
	 
	/**
	 * Setter for softDescriptorCity
	 */
	 public void setSoftDescriptorCity(String softDescriptorCity) {
	 	this.softDescriptorCity = softDescriptorCity;
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
		if(paymentDetails != null) {
			sb.append(paymentDetails.toXMLString(preferredPrefix,"PaymentDetails"));
		}
		if(creditCard != null) {
			sb.append(creditCard.toXMLString(preferredPrefix,"CreditCard"));
		}
		if(iPAddress != null) {
			sb.append("<").append(preferredPrefix).append(":IPAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.iPAddress));
			sb.append("</").append(preferredPrefix).append(":IPAddress>");
		}
		if(merchantSessionId != null) {
			sb.append("<").append(preferredPrefix).append(":MerchantSessionId>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.merchantSessionId));
			sb.append("</").append(preferredPrefix).append(":MerchantSessionId>");
		}
		if(returnFMFDetails != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnFMFDetails>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.returnFMFDetails));
			sb.append("</").append(preferredPrefix).append(":ReturnFMFDetails>");
		}
		if(softDescriptor != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.softDescriptor));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptor>");
		}
		if(softDescriptorCity != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptorCity>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.softDescriptorCity));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptorCity>");
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