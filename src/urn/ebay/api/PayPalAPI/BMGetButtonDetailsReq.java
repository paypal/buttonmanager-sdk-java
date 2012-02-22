
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BMGetButtonDetailsRequestType;


/**
 */
public class BMGetButtonDetailsReq {

	/**
	 */
	private BMGetButtonDetailsRequestType BMGetButtonDetailsRequest;
	public BMGetButtonDetailsRequestType getBMGetButtonDetailsRequest() {
		return BMGetButtonDetailsRequest;
	}
	public void setBMGetButtonDetailsRequest(BMGetButtonDetailsRequestType value) {
		this.BMGetButtonDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BMGetButtonDetailsReq>");
		if( BMGetButtonDetailsRequest != null ) {
			sb.append("<urn:BMGetButtonDetailsRequest>");
			sb.append(BMGetButtonDetailsRequest.toXMLString());
			sb.append("</urn:BMGetButtonDetailsRequest>");
		}
sb.append("</urn:BMGetButtonDetailsReq>");
		return sb.toString();
	}

}
