
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.SetMobileCheckoutRequestType;


/**
 */
public class SetMobileCheckoutReq {

	/**
	 */
	private SetMobileCheckoutRequestType SetMobileCheckoutRequest;
	public SetMobileCheckoutRequestType getSetMobileCheckoutRequest() {
		return SetMobileCheckoutRequest;
	}
	public void setSetMobileCheckoutRequest(SetMobileCheckoutRequestType value) {
		this.SetMobileCheckoutRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:SetMobileCheckoutReq>");
		if( SetMobileCheckoutRequest != null ) {
			sb.append("<urn:SetMobileCheckoutRequest>");
			sb.append(SetMobileCheckoutRequest.toXMLString());
			sb.append("</urn:SetMobileCheckoutRequest>");
		}
sb.append("</urn:SetMobileCheckoutReq>");
		return sb.toString();
	}

}
