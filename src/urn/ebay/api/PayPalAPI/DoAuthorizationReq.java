
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoAuthorizationRequestType;


/**
 */
public class DoAuthorizationReq {

	/**
	 */
	private DoAuthorizationRequestType DoAuthorizationRequest;
	public DoAuthorizationRequestType getDoAuthorizationRequest() {
		return DoAuthorizationRequest;
	}
	public void setDoAuthorizationRequest(DoAuthorizationRequestType value) {
		this.DoAuthorizationRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoAuthorizationReq>");
		if( DoAuthorizationRequest != null ) {
			sb.append("<urn:DoAuthorizationRequest>");
			sb.append(DoAuthorizationRequest.toXMLString());
			sb.append("</urn:DoAuthorizationRequest>");
		}
sb.append("</urn:DoAuthorizationReq>");
		return sb.toString();
	}

}
