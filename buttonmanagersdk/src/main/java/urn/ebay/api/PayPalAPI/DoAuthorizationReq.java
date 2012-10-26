package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoAuthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoAuthorizationReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoAuthorizationRequestType doAuthorizationRequest;

	

	/**
	 * Default Constructor
	 */
	public DoAuthorizationReq (){
	}	

	/**
	 * Getter for doAuthorizationRequest
	 */
	 public DoAuthorizationRequestType getDoAuthorizationRequest() {
	 	return doAuthorizationRequest;
	 }
	 
	/**
	 * Setter for doAuthorizationRequest
	 */
	 public void setDoAuthorizationRequest(DoAuthorizationRequestType doAuthorizationRequest) {
	 	this.doAuthorizationRequest = doAuthorizationRequest;
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
		if(doAuthorizationRequest != null) {
			sb.append(doAuthorizationRequest.toXMLString(null,"DoAuthorizationRequest"));
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