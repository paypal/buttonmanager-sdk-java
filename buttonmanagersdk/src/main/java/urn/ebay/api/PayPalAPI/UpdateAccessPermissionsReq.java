package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.UpdateAccessPermissionsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class UpdateAccessPermissionsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private UpdateAccessPermissionsRequestType updateAccessPermissionsRequest;

	

	/**
	 * Default Constructor
	 */
	public UpdateAccessPermissionsReq (){
	}	

	/**
	 * Getter for updateAccessPermissionsRequest
	 */
	 public UpdateAccessPermissionsRequestType getUpdateAccessPermissionsRequest() {
	 	return updateAccessPermissionsRequest;
	 }
	 
	/**
	 * Setter for updateAccessPermissionsRequest
	 */
	 public void setUpdateAccessPermissionsRequest(UpdateAccessPermissionsRequestType updateAccessPermissionsRequest) {
	 	this.updateAccessPermissionsRequest = updateAccessPermissionsRequest;
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
		if(updateAccessPermissionsRequest != null) {
			sb.append(updateAccessPermissionsRequest.toXMLString(null,"UpdateAccessPermissionsRequest"));
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