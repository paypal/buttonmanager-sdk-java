
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoReauthorizationRequestType;


/**
 */
public class DoReauthorizationReq {

	/**
	 */
	private DoReauthorizationRequestType DoReauthorizationRequest;
	public DoReauthorizationRequestType getDoReauthorizationRequest() {
		return DoReauthorizationRequest;
	}
	public void setDoReauthorizationRequest(DoReauthorizationRequestType value) {
		this.DoReauthorizationRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoReauthorizationReq>");
		if( DoReauthorizationRequest != null ) {
			sb.append("<urn:DoReauthorizationRequest>");
			sb.append(DoReauthorizationRequest.toXMLString());
			sb.append("</urn:DoReauthorizationRequest>");
		}
sb.append("</urn:DoReauthorizationReq>");
		return sb.toString();
	}

}
