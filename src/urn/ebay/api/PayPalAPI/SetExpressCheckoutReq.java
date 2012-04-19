
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.SetExpressCheckoutRequestType;


/**
 */
public class SetExpressCheckoutReq {

	/**
	 */
	private SetExpressCheckoutRequestType SetExpressCheckoutRequest;
	public SetExpressCheckoutRequestType getSetExpressCheckoutRequest() {
		return SetExpressCheckoutRequest;
	}
	public void setSetExpressCheckoutRequest(SetExpressCheckoutRequestType value) {
		this.SetExpressCheckoutRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:SetExpressCheckoutReq>");
		if( SetExpressCheckoutRequest != null ) {
			sb.append("<urn:SetExpressCheckoutRequest>");
			sb.append(SetExpressCheckoutRequest.toXMLString());
			sb.append("</urn:SetExpressCheckoutRequest>");
		}
sb.append("</urn:SetExpressCheckoutReq>");
		return sb.toString();
	}

}
