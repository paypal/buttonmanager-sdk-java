
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetAuthDetailsRequestType;


/**
 */
public class GetAuthDetailsReq {

	/**
	 */
	private GetAuthDetailsRequestType GetAuthDetailsRequest;
	public GetAuthDetailsRequestType getGetAuthDetailsRequest() {
		return GetAuthDetailsRequest;
	}
	public void setGetAuthDetailsRequest(GetAuthDetailsRequestType value) {
		this.GetAuthDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetAuthDetailsReq>");
		if( GetAuthDetailsRequest != null ) {
			sb.append("<urn:GetAuthDetailsRequest>");
			sb.append(GetAuthDetailsRequest.toXMLString());
			sb.append("</urn:GetAuthDetailsRequest>");
		}
sb.append("</urn:GetAuthDetailsReq>");
		return sb.toString();
	}

}
