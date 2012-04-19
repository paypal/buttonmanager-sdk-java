
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BillUserRequestType;


/**
 */
public class BillUserReq {

	/**
	 */
	private BillUserRequestType BillUserRequest;
	public BillUserRequestType getBillUserRequest() {
		return BillUserRequest;
	}
	public void setBillUserRequest(BillUserRequestType value) {
		this.BillUserRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BillUserReq>");
		if( BillUserRequest != null ) {
			sb.append("<urn:BillUserRequest>");
			sb.append(BillUserRequest.toXMLString());
			sb.append("</urn:BillUserRequest>");
		}
sb.append("</urn:BillUserReq>");
		return sb.toString();
	}

}
