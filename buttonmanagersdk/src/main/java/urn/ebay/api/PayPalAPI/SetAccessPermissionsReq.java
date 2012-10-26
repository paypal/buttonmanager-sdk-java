package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetAccessPermissionsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetAccessPermissionsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private SetAccessPermissionsRequestType setAccessPermissionsRequest;

	

	/**
	 * Default Constructor
	 */
	public SetAccessPermissionsReq (){
	}	

	/**
	 * Getter for setAccessPermissionsRequest
	 */
	 public SetAccessPermissionsRequestType getSetAccessPermissionsRequest() {
	 	return setAccessPermissionsRequest;
	 }
	 
	/**
	 * Setter for setAccessPermissionsRequest
	 */
	 public void setSetAccessPermissionsRequest(SetAccessPermissionsRequestType setAccessPermissionsRequest) {
	 	this.setAccessPermissionsRequest = setAccessPermissionsRequest;
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
		if(setAccessPermissionsRequest != null) {
			sb.append(setAccessPermissionsRequest.toXMLString(null,"SetAccessPermissionsRequest"));
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