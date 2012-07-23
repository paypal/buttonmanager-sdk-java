package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetRecurringPaymentsProfileDetailsRequestType;

/**
 * No Document Comments
 */
public class GetRecurringPaymentsProfileDetailsReq{


	/**
	 * No Document Comments	 
	 */ 
	private GetRecurringPaymentsProfileDetailsRequestType GetRecurringPaymentsProfileDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetRecurringPaymentsProfileDetailsReq (){
	}	

	/**
	 * Getter for GetRecurringPaymentsProfileDetailsRequest
	 */
	 public GetRecurringPaymentsProfileDetailsRequestType getGetRecurringPaymentsProfileDetailsRequest() {
	 	return GetRecurringPaymentsProfileDetailsRequest;
	 }
	 
	/**
	 * Setter for GetRecurringPaymentsProfileDetailsRequest
	 */
	 public void setGetRecurringPaymentsProfileDetailsRequest(GetRecurringPaymentsProfileDetailsRequestType GetRecurringPaymentsProfileDetailsRequest) {
	 	this.GetRecurringPaymentsProfileDetailsRequest = GetRecurringPaymentsProfileDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetRecurringPaymentsProfileDetailsReq>");
		if(GetRecurringPaymentsProfileDetailsRequest != null) {
			sb.append("<urn:GetRecurringPaymentsProfileDetailsRequest>");
			sb.append(GetRecurringPaymentsProfileDetailsRequest.toXMLString());
			sb.append("</urn:GetRecurringPaymentsProfileDetailsRequest>");
		}
		sb.append("</urn:GetRecurringPaymentsProfileDetailsReq>");
		return sb.toString();
	}

}