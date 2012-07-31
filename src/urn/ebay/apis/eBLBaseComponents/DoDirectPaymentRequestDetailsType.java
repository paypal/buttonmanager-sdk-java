package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;

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


	/**
	 * How you want to obtain payment. Required Authorization
	 * indicates that this payment is a basic authorization subject
	 * to settlement with PayPal Authorization and Capture. Sale
	 * indicates that this is a final sale for which you are
	 * requesting payment. NOTE: Order is not allowed for Direct
	 * Payment. Character length and limit: Up to 13 single-byte
	 * alphabetic characters	 
	 */ 
	private PaymentActionCodeType PaymentAction;

	/**
	 * Information about the payment Required 	 
	 */ 
	private PaymentDetailsType PaymentDetails;

	/**
	 * Information about the credit card to be charged. Required 	 
	 */ 
	private CreditCardDetailsType CreditCard;

	/**
	 * IP address of the payer's browser as recorded in its HTTP
	 * request to your website. PayPal records this IP addresses as
	 * a means to detect possible fraud. Required Character length
	 * and limitations: 15 single-byte characters, including
	 * periods, in dotted-quad format: ???.???.???.???	 
	 */ 
	private String IPAddress;

	/**
	 * Your customer session identification token. PayPal records
	 * this optional session identification token as an additional
	 * means to detect possible fraud. Optional Character length
	 * and limitations: 64 single-byte numeric characters	 
	 */ 
	private String MerchantSessionId;

	/**
	 * 	 
	 */ 
	private Boolean ReturnFMFDetails;

	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentRequestDetailsType (){
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
	 * Getter for PaymentDetails
	 */
	 public PaymentDetailsType getPaymentDetails() {
	 	return PaymentDetails;
	 }
	 
	/**
	 * Setter for PaymentDetails
	 */
	 public void setPaymentDetails(PaymentDetailsType PaymentDetails) {
	 	this.PaymentDetails = PaymentDetails;
	 }
	 
	/**
	 * Getter for CreditCard
	 */
	 public CreditCardDetailsType getCreditCard() {
	 	return CreditCard;
	 }
	 
	/**
	 * Setter for CreditCard
	 */
	 public void setCreditCard(CreditCardDetailsType CreditCard) {
	 	this.CreditCard = CreditCard;
	 }
	 
	/**
	 * Getter for IPAddress
	 */
	 public String getIPAddress() {
	 	return IPAddress;
	 }
	 
	/**
	 * Setter for IPAddress
	 */
	 public void setIPAddress(String IPAddress) {
	 	this.IPAddress = IPAddress;
	 }
	 
	/**
	 * Getter for MerchantSessionId
	 */
	 public String getMerchantSessionId() {
	 	return MerchantSessionId;
	 }
	 
	/**
	 * Setter for MerchantSessionId
	 */
	 public void setMerchantSessionId(String MerchantSessionId) {
	 	this.MerchantSessionId = MerchantSessionId;
	 }
	 
	/**
	 * Getter for ReturnFMFDetails
	 */
	 public Boolean getReturnFMFDetails() {
	 	return ReturnFMFDetails;
	 }
	 
	/**
	 * Setter for ReturnFMFDetails
	 */
	 public void setReturnFMFDetails(Boolean ReturnFMFDetails) {
	 	this.ReturnFMFDetails = ReturnFMFDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(PaymentAction != null) {
			sb.append("<ebl:PaymentAction>").append(PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if(PaymentDetails != null) {
			sb.append("<ebl:PaymentDetails>");
			sb.append(PaymentDetails.toXMLString());
			sb.append("</ebl:PaymentDetails>");
		}
		if(CreditCard != null) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if(IPAddress != null) {
			sb.append("<ebl:IPAddress>").append(IPAddress);
			sb.append("</ebl:IPAddress>");
		}
		if(MerchantSessionId != null) {
			sb.append("<ebl:MerchantSessionId>").append(MerchantSessionId);
			sb.append("</ebl:MerchantSessionId>");
		}
		if(ReturnFMFDetails != null) {
			sb.append("<ebl:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</ebl:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}