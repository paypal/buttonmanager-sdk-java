package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetMobileStatusRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetMobileStatusReq{


	/**
	 * 	 
	 */ 
	private GetMobileStatusRequestType GetMobileStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public GetMobileStatusReq (){
	}	

	/**
	 * Getter for GetMobileStatusRequest
	 */
	 public GetMobileStatusRequestType getGetMobileStatusRequest() {
	 	return GetMobileStatusRequest;
	 }
	 
	/**
	 * Setter for GetMobileStatusRequest
	 */
	 public void setGetMobileStatusRequest(GetMobileStatusRequestType GetMobileStatusRequest) {
	 	this.GetMobileStatusRequest = GetMobileStatusRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetMobileStatusReq>");
		if(GetMobileStatusRequest != null) {
			sb.append("<urn:GetMobileStatusRequest>");
			sb.append(GetMobileStatusRequest.toXMLString());
			sb.append("</urn:GetMobileStatusRequest>");
		}
		sb.append("</urn:GetMobileStatusReq>");
		return sb.toString();
	}


}