
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetExpressCheckoutDetailsRequestType;


/**
 */
public class GetExpressCheckoutDetailsReq {

	/**
	 */
	private GetExpressCheckoutDetailsRequestType GetExpressCheckoutDetailsRequest;
	public GetExpressCheckoutDetailsRequestType getGetExpressCheckoutDetailsRequest() {
		return GetExpressCheckoutDetailsRequest;
	}
	public void setGetExpressCheckoutDetailsRequest(GetExpressCheckoutDetailsRequestType value) {
		this.GetExpressCheckoutDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetExpressCheckoutDetailsReq>");
		if( GetExpressCheckoutDetailsRequest != null ) {
			sb.append("<urn:GetExpressCheckoutDetailsRequest>");
			sb.append(GetExpressCheckoutDetailsRequest.toXMLString());
			sb.append("</urn:GetExpressCheckoutDetailsRequest>");
		}
sb.append("</urn:GetExpressCheckoutDetailsReq>");
		return sb.toString();
	}

}
