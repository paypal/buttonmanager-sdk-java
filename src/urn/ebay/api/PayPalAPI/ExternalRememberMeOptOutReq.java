
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.ExternalRememberMeOptOutRequestType;


/**
 */
public class ExternalRememberMeOptOutReq {

	/**
	 */
	private ExternalRememberMeOptOutRequestType ExternalRememberMeOptOutRequest;
	public ExternalRememberMeOptOutRequestType getExternalRememberMeOptOutRequest() {
		return ExternalRememberMeOptOutRequest;
	}
	public void setExternalRememberMeOptOutRequest(ExternalRememberMeOptOutRequestType value) {
		this.ExternalRememberMeOptOutRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:ExternalRememberMeOptOutReq>");
		if( ExternalRememberMeOptOutRequest != null ) {
			sb.append("<urn:ExternalRememberMeOptOutRequest>");
			sb.append(ExternalRememberMeOptOutRequest.toXMLString());
			sb.append("</urn:ExternalRememberMeOptOutRequest>");
		}
sb.append("</urn:ExternalRememberMeOptOutReq>");
		return sb.toString();
	}

}
