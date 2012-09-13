package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoMobileCheckoutPaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoMobileCheckoutPaymentReq{


	/**
	 * 	 
	 */ 
	private DoMobileCheckoutPaymentRequestType DoMobileCheckoutPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoMobileCheckoutPaymentReq (){
	}	

	/**
	 * Getter for DoMobileCheckoutPaymentRequest
	 */
	 public DoMobileCheckoutPaymentRequestType getDoMobileCheckoutPaymentRequest() {
	 	return DoMobileCheckoutPaymentRequest;
	 }
	 
	/**
	 * Setter for DoMobileCheckoutPaymentRequest
	 */
	 public void setDoMobileCheckoutPaymentRequest(DoMobileCheckoutPaymentRequestType DoMobileCheckoutPaymentRequest) {
	 	this.DoMobileCheckoutPaymentRequest = DoMobileCheckoutPaymentRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoMobileCheckoutPaymentReq>");
		if(DoMobileCheckoutPaymentRequest != null) {
			sb.append("<urn:DoMobileCheckoutPaymentRequest>");
			sb.append(DoMobileCheckoutPaymentRequest.toXMLString());
			sb.append("</urn:DoMobileCheckoutPaymentRequest>");
		}
		sb.append("</urn:DoMobileCheckoutPaymentReq>");
		return sb.toString();
	}

}