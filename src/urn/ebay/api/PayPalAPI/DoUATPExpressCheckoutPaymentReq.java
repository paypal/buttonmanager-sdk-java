package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoUATPExpressCheckoutPaymentRequestType;

/**
 * No Document Comments
 */
public class DoUATPExpressCheckoutPaymentReq{


	/**
	 * No Document Comments	 
	 */ 
	private DoUATPExpressCheckoutPaymentRequestType DoUATPExpressCheckoutPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoUATPExpressCheckoutPaymentReq (){
	}	

	/**
	 * Getter for DoUATPExpressCheckoutPaymentRequest
	 */
	 public DoUATPExpressCheckoutPaymentRequestType getDoUATPExpressCheckoutPaymentRequest() {
	 	return DoUATPExpressCheckoutPaymentRequest;
	 }
	 
	/**
	 * Setter for DoUATPExpressCheckoutPaymentRequest
	 */
	 public void setDoUATPExpressCheckoutPaymentRequest(DoUATPExpressCheckoutPaymentRequestType DoUATPExpressCheckoutPaymentRequest) {
	 	this.DoUATPExpressCheckoutPaymentRequest = DoUATPExpressCheckoutPaymentRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoUATPExpressCheckoutPaymentReq>");
		if(DoUATPExpressCheckoutPaymentRequest != null) {
			sb.append("<urn:DoUATPExpressCheckoutPaymentRequest>");
			sb.append(DoUATPExpressCheckoutPaymentRequest.toXMLString());
			sb.append("</urn:DoUATPExpressCheckoutPaymentRequest>");
		}
		sb.append("</urn:DoUATPExpressCheckoutPaymentReq>");
		return sb.toString();
	}

}