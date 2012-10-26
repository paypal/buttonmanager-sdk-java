package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoExpressCheckoutPaymentReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoExpressCheckoutPaymentRequestType doExpressCheckoutPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentReq (){
	}	

	/**
	 * Getter for doExpressCheckoutPaymentRequest
	 */
	 public DoExpressCheckoutPaymentRequestType getDoExpressCheckoutPaymentRequest() {
	 	return doExpressCheckoutPaymentRequest;
	 }
	 
	/**
	 * Setter for doExpressCheckoutPaymentRequest
	 */
	 public void setDoExpressCheckoutPaymentRequest(DoExpressCheckoutPaymentRequestType doExpressCheckoutPaymentRequest) {
	 	this.doExpressCheckoutPaymentRequest = doExpressCheckoutPaymentRequest;
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
		if(doExpressCheckoutPaymentRequest != null) {
			sb.append(doExpressCheckoutPaymentRequest.toXMLString(null,"DoExpressCheckoutPaymentRequest"));
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