package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetAuthDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetAuthDetailsReq{


	/**
	 * 	 
	 */ 
	private GetAuthDetailsRequestType GetAuthDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetAuthDetailsReq (){
	}	

	/**
	 * Getter for GetAuthDetailsRequest
	 */
	 public GetAuthDetailsRequestType getGetAuthDetailsRequest() {
	 	return GetAuthDetailsRequest;
	 }
	 
	/**
	 * Setter for GetAuthDetailsRequest
	 */
	 public void setGetAuthDetailsRequest(GetAuthDetailsRequestType GetAuthDetailsRequest) {
	 	this.GetAuthDetailsRequest = GetAuthDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetAuthDetailsReq>");
		if(GetAuthDetailsRequest != null) {
			sb.append("<urn:GetAuthDetailsRequest>");
			sb.append(GetAuthDetailsRequest.toXMLString());
			sb.append("</urn:GetAuthDetailsRequest>");
		}
		sb.append("</urn:GetAuthDetailsReq>");
		return sb.toString();
	}


}