package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoUATPAuthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoUATPAuthorizationReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoUATPAuthorizationRequestType doUATPAuthorizationRequest;

	

	/**
	 * Default Constructor
	 */
	public DoUATPAuthorizationReq (){
	}	

	/**
	 * Getter for doUATPAuthorizationRequest
	 */
	 public DoUATPAuthorizationRequestType getDoUATPAuthorizationRequest() {
	 	return doUATPAuthorizationRequest;
	 }
	 
	/**
	 * Setter for doUATPAuthorizationRequest
	 */
	 public void setDoUATPAuthorizationRequest(DoUATPAuthorizationRequestType doUATPAuthorizationRequest) {
	 	this.doUATPAuthorizationRequest = doUATPAuthorizationRequest;
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
		if(doUATPAuthorizationRequest != null) {
			sb.append(doUATPAuthorizationRequest.toXMLString(null,"DoUATPAuthorizationRequest"));
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