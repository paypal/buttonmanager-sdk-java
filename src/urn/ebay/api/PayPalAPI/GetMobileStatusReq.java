
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetMobileStatusRequestType;


/**
 */
public class GetMobileStatusReq {

	/**
	 */
	private GetMobileStatusRequestType GetMobileStatusRequest;
	public GetMobileStatusRequestType getGetMobileStatusRequest() {
		return GetMobileStatusRequest;
	}
	public void setGetMobileStatusRequest(GetMobileStatusRequestType value) {
		this.GetMobileStatusRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetMobileStatusReq>");
		if( GetMobileStatusRequest != null ) {
			sb.append("<urn:GetMobileStatusRequest>");
			sb.append(GetMobileStatusRequest.toXMLString());
			sb.append("</urn:GetMobileStatusRequest>");
		}
sb.append("</urn:GetMobileStatusReq>");
		return sb.toString();
	}

}
