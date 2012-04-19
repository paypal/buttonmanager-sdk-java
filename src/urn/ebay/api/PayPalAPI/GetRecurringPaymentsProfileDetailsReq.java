
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetRecurringPaymentsProfileDetailsRequestType;


/**
 */
public class GetRecurringPaymentsProfileDetailsReq {

	/**
	 */
	private GetRecurringPaymentsProfileDetailsRequestType GetRecurringPaymentsProfileDetailsRequest;
	public GetRecurringPaymentsProfileDetailsRequestType getGetRecurringPaymentsProfileDetailsRequest() {
		return GetRecurringPaymentsProfileDetailsRequest;
	}
	public void setGetRecurringPaymentsProfileDetailsRequest(GetRecurringPaymentsProfileDetailsRequestType value) {
		this.GetRecurringPaymentsProfileDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetRecurringPaymentsProfileDetailsReq>");
		if( GetRecurringPaymentsProfileDetailsRequest != null ) {
			sb.append("<urn:GetRecurringPaymentsProfileDetailsRequest>");
			sb.append(GetRecurringPaymentsProfileDetailsRequest.toXMLString());
			sb.append("</urn:GetRecurringPaymentsProfileDetailsRequest>");
		}
sb.append("</urn:GetRecurringPaymentsProfileDetailsReq>");
		return sb.toString();
	}

}
