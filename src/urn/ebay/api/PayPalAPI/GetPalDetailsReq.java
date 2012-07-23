package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetPalDetailsRequestType;

/**
 * No Document Comments
 */
public class GetPalDetailsReq{


	/**
	 * No Document Comments	 
	 */ 
	private GetPalDetailsRequestType GetPalDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetPalDetailsReq (){
	}	

	/**
	 * Getter for GetPalDetailsRequest
	 */
	 public GetPalDetailsRequestType getGetPalDetailsRequest() {
	 	return GetPalDetailsRequest;
	 }
	 
	/**
	 * Setter for GetPalDetailsRequest
	 */
	 public void setGetPalDetailsRequest(GetPalDetailsRequestType GetPalDetailsRequest) {
	 	this.GetPalDetailsRequest = GetPalDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetPalDetailsReq>");
		if(GetPalDetailsRequest != null) {
			sb.append("<urn:GetPalDetailsRequest>");
			sb.append(GetPalDetailsRequest.toXMLString());
			sb.append("</urn:GetPalDetailsRequest>");
		}
		sb.append("</urn:GetPalDetailsReq>");
		return sb.toString();
	}

}