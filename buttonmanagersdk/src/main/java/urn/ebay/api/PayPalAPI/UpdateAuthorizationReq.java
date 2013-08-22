package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.UpdateAuthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class UpdateAuthorizationReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private UpdateAuthorizationRequestType updateAuthorizationRequest;

	

	/**
	 * Default Constructor
	 */
	public UpdateAuthorizationReq (){
	}	

	/**
	 * Getter for updateAuthorizationRequest
	 */
	 public UpdateAuthorizationRequestType getUpdateAuthorizationRequest() {
	 	return updateAuthorizationRequest;
	 }
	 
	/**
	 * Setter for updateAuthorizationRequest
	 */
	 public void setUpdateAuthorizationRequest(UpdateAuthorizationRequestType updateAuthorizationRequest) {
	 	this.updateAuthorizationRequest = updateAuthorizationRequest;
	 }
	 


	public String toXMLString(String prefix, String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(updateAuthorizationRequest != null) {
			sb.append(updateAuthorizationRequest.toXMLString(null,"UpdateAuthorizationRequest"));
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