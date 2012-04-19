
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetBalanceRequestType;


/**
 */
public class GetBalanceReq {

	/**
	 */
	private GetBalanceRequestType GetBalanceRequest;
	public GetBalanceRequestType getGetBalanceRequest() {
		return GetBalanceRequest;
	}
	public void setGetBalanceRequest(GetBalanceRequestType value) {
		this.GetBalanceRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetBalanceReq>");
		if( GetBalanceRequest != null ) {
			sb.append("<urn:GetBalanceRequest>");
			sb.append(GetBalanceRequest.toXMLString());
			sb.append("</urn:GetBalanceRequest>");
		}
sb.append("</urn:GetBalanceReq>");
		return sb.toString();
	}

}
