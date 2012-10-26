package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoUATPExpressCheckoutPaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoUATPExpressCheckoutPaymentReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoUATPExpressCheckoutPaymentRequestType doUATPExpressCheckoutPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoUATPExpressCheckoutPaymentReq (){
	}	

	/**
	 * Getter for doUATPExpressCheckoutPaymentRequest
	 */
	 public DoUATPExpressCheckoutPaymentRequestType getDoUATPExpressCheckoutPaymentRequest() {
	 	return doUATPExpressCheckoutPaymentRequest;
	 }
	 
	/**
	 * Setter for doUATPExpressCheckoutPaymentRequest
	 */
	 public void setDoUATPExpressCheckoutPaymentRequest(DoUATPExpressCheckoutPaymentRequestType doUATPExpressCheckoutPaymentRequest) {
	 	this.doUATPExpressCheckoutPaymentRequest = doUATPExpressCheckoutPaymentRequest;
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
		if(doUATPExpressCheckoutPaymentRequest != null) {
			sb.append(doUATPExpressCheckoutPaymentRequest.toXMLString(null,"DoUATPExpressCheckoutPaymentRequest"));
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