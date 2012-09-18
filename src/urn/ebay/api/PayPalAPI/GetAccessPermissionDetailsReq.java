package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetAccessPermissionDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetAccessPermissionDetailsReq{


	/**
	 * 	 
	 */ 
	private GetAccessPermissionDetailsRequestType GetAccessPermissionDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetAccessPermissionDetailsReq (){
	}	

	/**
	 * Getter for GetAccessPermissionDetailsRequest
	 */
	 public GetAccessPermissionDetailsRequestType getGetAccessPermissionDetailsRequest() {
	 	return GetAccessPermissionDetailsRequest;
	 }
	 
	/**
	 * Setter for GetAccessPermissionDetailsRequest
	 */
	 public void setGetAccessPermissionDetailsRequest(GetAccessPermissionDetailsRequestType GetAccessPermissionDetailsRequest) {
	 	this.GetAccessPermissionDetailsRequest = GetAccessPermissionDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetAccessPermissionDetailsReq>");
		if(GetAccessPermissionDetailsRequest != null) {
			sb.append("<urn:GetAccessPermissionDetailsRequest>");
			sb.append(GetAccessPermissionDetailsRequest.toXMLString());
			sb.append("</urn:GetAccessPermissionDetailsRequest>");
		}
		sb.append("</urn:GetAccessPermissionDetailsReq>");
		return sb.toString();
	}

}