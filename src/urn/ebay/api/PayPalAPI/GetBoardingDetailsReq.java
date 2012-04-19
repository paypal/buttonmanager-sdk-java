
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetBoardingDetailsRequestType;


/**
 */
public class GetBoardingDetailsReq {

	/**
	 */
	private GetBoardingDetailsRequestType GetBoardingDetailsRequest;
	public GetBoardingDetailsRequestType getGetBoardingDetailsRequest() {
		return GetBoardingDetailsRequest;
	}
	public void setGetBoardingDetailsRequest(GetBoardingDetailsRequestType value) {
		this.GetBoardingDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetBoardingDetailsReq>");
		if( GetBoardingDetailsRequest != null ) {
			sb.append("<urn:GetBoardingDetailsRequest>");
			sb.append(GetBoardingDetailsRequest.toXMLString());
			sb.append("</urn:GetBoardingDetailsRequest>");
		}
sb.append("</urn:GetBoardingDetailsReq>");
		return sb.toString();
	}

}
