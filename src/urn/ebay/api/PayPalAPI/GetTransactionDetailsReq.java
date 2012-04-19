
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetTransactionDetailsRequestType;


/**
 */
public class GetTransactionDetailsReq {

	/**
	 */
	private GetTransactionDetailsRequestType GetTransactionDetailsRequest;
	public GetTransactionDetailsRequestType getGetTransactionDetailsRequest() {
		return GetTransactionDetailsRequest;
	}
	public void setGetTransactionDetailsRequest(GetTransactionDetailsRequestType value) {
		this.GetTransactionDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetTransactionDetailsReq>");
		if( GetTransactionDetailsRequest != null ) {
			sb.append("<urn:GetTransactionDetailsRequest>");
			sb.append(GetTransactionDetailsRequest.toXMLString());
			sb.append("</urn:GetTransactionDetailsRequest>");
		}
sb.append("</urn:GetTransactionDetailsReq>");
		return sb.toString();
	}

}
