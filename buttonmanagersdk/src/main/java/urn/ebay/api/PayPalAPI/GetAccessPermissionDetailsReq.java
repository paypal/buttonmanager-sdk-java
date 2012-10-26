package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetAccessPermissionDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetAccessPermissionDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetAccessPermissionDetailsRequestType getAccessPermissionDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetAccessPermissionDetailsReq (){
	}	

	/**
	 * Getter for getAccessPermissionDetailsRequest
	 */
	 public GetAccessPermissionDetailsRequestType getGetAccessPermissionDetailsRequest() {
	 	return getAccessPermissionDetailsRequest;
	 }
	 
	/**
	 * Setter for getAccessPermissionDetailsRequest
	 */
	 public void setGetAccessPermissionDetailsRequest(GetAccessPermissionDetailsRequestType getAccessPermissionDetailsRequest) {
	 	this.getAccessPermissionDetailsRequest = getAccessPermissionDetailsRequest;
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
		if(getAccessPermissionDetailsRequest != null) {
			sb.append(getAccessPermissionDetailsRequest.toXMLString(null,"GetAccessPermissionDetailsRequest"));
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