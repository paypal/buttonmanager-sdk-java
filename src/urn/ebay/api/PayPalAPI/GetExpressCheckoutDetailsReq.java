package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetExpressCheckoutDetailsRequestType;

/**
 * 
 */
public class GetExpressCheckoutDetailsReq{


	/**
	 * 	 
	 */ 
	private GetExpressCheckoutDetailsRequestType GetExpressCheckoutDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetExpressCheckoutDetailsReq (){
	}	

	/**
	 * Getter for GetExpressCheckoutDetailsRequest
	 */
	 public GetExpressCheckoutDetailsRequestType getGetExpressCheckoutDetailsRequest() {
	 	return GetExpressCheckoutDetailsRequest;
	 }
	 
	/**
	 * Setter for GetExpressCheckoutDetailsRequest
	 */
	 public void setGetExpressCheckoutDetailsRequest(GetExpressCheckoutDetailsRequestType GetExpressCheckoutDetailsRequest) {
	 	this.GetExpressCheckoutDetailsRequest = GetExpressCheckoutDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetExpressCheckoutDetailsReq>");
		if(GetExpressCheckoutDetailsRequest != null) {
			sb.append("<urn:GetExpressCheckoutDetailsRequest>");
			sb.append(GetExpressCheckoutDetailsRequest.toXMLString());
			sb.append("</urn:GetExpressCheckoutDetailsRequest>");
		}
		sb.append("</urn:GetExpressCheckoutDetailsReq>");
		return sb.toString();
	}

}