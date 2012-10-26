package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoMobileCheckoutPaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoMobileCheckoutPaymentReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoMobileCheckoutPaymentRequestType doMobileCheckoutPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoMobileCheckoutPaymentReq (){
	}	

	/**
	 * Getter for doMobileCheckoutPaymentRequest
	 */
	 public DoMobileCheckoutPaymentRequestType getDoMobileCheckoutPaymentRequest() {
	 	return doMobileCheckoutPaymentRequest;
	 }
	 
	/**
	 * Setter for doMobileCheckoutPaymentRequest
	 */
	 public void setDoMobileCheckoutPaymentRequest(DoMobileCheckoutPaymentRequestType doMobileCheckoutPaymentRequest) {
	 	this.doMobileCheckoutPaymentRequest = doMobileCheckoutPaymentRequest;
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
		if(doMobileCheckoutPaymentRequest != null) {
			sb.append(doMobileCheckoutPaymentRequest.toXMLString(null,"DoMobileCheckoutPaymentRequest"));
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