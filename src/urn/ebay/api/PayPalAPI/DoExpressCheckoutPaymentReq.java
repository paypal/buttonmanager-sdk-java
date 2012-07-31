package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentRequestType;

/**
 * 
 */
public class DoExpressCheckoutPaymentReq{


	/**
	 * 	 
	 */ 
	private DoExpressCheckoutPaymentRequestType DoExpressCheckoutPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentReq (){
	}	

	/**
	 * Getter for DoExpressCheckoutPaymentRequest
	 */
	 public DoExpressCheckoutPaymentRequestType getDoExpressCheckoutPaymentRequest() {
	 	return DoExpressCheckoutPaymentRequest;
	 }
	 
	/**
	 * Setter for DoExpressCheckoutPaymentRequest
	 */
	 public void setDoExpressCheckoutPaymentRequest(DoExpressCheckoutPaymentRequestType DoExpressCheckoutPaymentRequest) {
	 	this.DoExpressCheckoutPaymentRequest = DoExpressCheckoutPaymentRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoExpressCheckoutPaymentReq>");
		if(DoExpressCheckoutPaymentRequest != null) {
			sb.append("<urn:DoExpressCheckoutPaymentRequest>");
			sb.append(DoExpressCheckoutPaymentRequest.toXMLString());
			sb.append("</urn:DoExpressCheckoutPaymentRequest>");
		}
		sb.append("</urn:DoExpressCheckoutPaymentReq>");
		return sb.toString();
	}

}