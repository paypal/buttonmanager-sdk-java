
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;


/**
 * How you want to obtain payment. 
 * Required
 * Authorization indicates that this payment is a basic authorization subject to settlement with PayPal Authorization and Capture.
 * Sale indicates that this is a final sale for which you are requesting payment.
 * NOTE: Order is not allowed for Direct Payment.
 * Character length and limit: Up to 13 single-byte alphabetic characters
 */
public class DoDirectPaymentRequestDetailsType {

	/**
	 * How you want to obtain payment. 
	 * Required
	 * Authorization indicates that this payment is a basic authorization subject to settlement with PayPal Authorization and Capture.
	 * Sale indicates that this is a final sale for which you are requesting payment.
	 * NOTE: Order is not allowed for Direct Payment.
	 * Character length and limit: Up to 13 single-byte alphabetic characters	 */
	private PaymentActionCodeType PaymentAction;
	public PaymentActionCodeType getPaymentAction() {
		return PaymentAction;
	}
	public void setPaymentAction(PaymentActionCodeType value) {
		this.PaymentAction = value;
	}

	/**
	 * Information about the payment 
	 * Required
	 */
	private PaymentDetailsType PaymentDetails;
	public PaymentDetailsType getPaymentDetails() {
		return PaymentDetails;
	}
	public void setPaymentDetails(PaymentDetailsType value) {
		this.PaymentDetails = value;
	}

	/**
	 * Information about the credit card to be charged. 
	 * Required
	 */
	private CreditCardDetailsType CreditCard;
	public CreditCardDetailsType getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(CreditCardDetailsType value) {
		this.CreditCard = value;
	}

	/**
	 * IP address of the payer's browser as recorded in its HTTP request to your website. PayPal records this IP addresses as a means to detect possible fraud. 
	 * Required
	 * Character length and limitations: 15 single-byte characters, including periods, in dotted-quad format: ???.???.???.???
	 */
	private String IPAddress;
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String value) {
		this.IPAddress = value;
	}

	/**
	 * Your customer session identification token. PayPal records this optional session identification token as an additional means to detect possible fraud. 
	 * Optional
	 * Character length and limitations: 64 single-byte numeric characters	 */
	private String MerchantSessionId;
	public String getMerchantSessionId() {
		return MerchantSessionId;
	}
	public void setMerchantSessionId(String value) {
		this.MerchantSessionId = value;
	}

	/**
	 */
	private Boolean ReturnFMFDetails;
	public Boolean getReturnFMFDetails() {
		return ReturnFMFDetails;
	}
	public void setReturnFMFDetails(Boolean value) {
		this.ReturnFMFDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( PaymentAction != null ) {
			sb.append("<ebl:PaymentAction>").append( PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if( PaymentDetails != null ) {
			sb.append("<ebl:PaymentDetails>");
			sb.append(PaymentDetails.toXMLString());
			sb.append("</ebl:PaymentDetails>");
		}
		if( CreditCard != null ) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if( IPAddress != null ) {
			sb.append("<ebl:IPAddress>").append(IPAddress);
			sb.append("</ebl:IPAddress>");
		}
		if( MerchantSessionId != null ) {
			sb.append("<ebl:MerchantSessionId>").append(MerchantSessionId);
			sb.append("</ebl:MerchantSessionId>");
		}
		if( ReturnFMFDetails != null ) {
			sb.append("<ebl:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</ebl:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}
