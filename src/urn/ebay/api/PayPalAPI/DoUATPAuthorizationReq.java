
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoUATPAuthorizationRequestType;


/**
 */
public class DoUATPAuthorizationReq {

	/**
	 */
	private DoUATPAuthorizationRequestType DoUATPAuthorizationRequest;
	public DoUATPAuthorizationRequestType getDoUATPAuthorizationRequest() {
		return DoUATPAuthorizationRequest;
	}
	public void setDoUATPAuthorizationRequest(DoUATPAuthorizationRequestType value) {
		this.DoUATPAuthorizationRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoUATPAuthorizationReq>");
		if( DoUATPAuthorizationRequest != null ) {
			sb.append("<urn:DoUATPAuthorizationRequest>");
			sb.append(DoUATPAuthorizationRequest.toXMLString());
			sb.append("</urn:DoUATPAuthorizationRequest>");
		}
sb.append("</urn:DoUATPAuthorizationReq>");
		return sb.toString();
	}

}
