package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoDirectPaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoDirectPaymentReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoDirectPaymentRequestType doDirectPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentReq (){
	}	

	/**
	 * Getter for doDirectPaymentRequest
	 */
	 public DoDirectPaymentRequestType getDoDirectPaymentRequest() {
	 	return doDirectPaymentRequest;
	 }
	 
	/**
	 * Setter for doDirectPaymentRequest
	 */
	 public void setDoDirectPaymentRequest(DoDirectPaymentRequestType doDirectPaymentRequest) {
	 	this.doDirectPaymentRequest = doDirectPaymentRequest;
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
		if(doDirectPaymentRequest != null) {
			sb.append(doDirectPaymentRequest.toXMLString(null,"DoDirectPaymentRequest"));
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