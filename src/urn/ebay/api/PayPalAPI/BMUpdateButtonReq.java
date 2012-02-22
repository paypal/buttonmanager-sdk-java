
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BMUpdateButtonRequestType;


/**
 */
public class BMUpdateButtonReq {

	/**
	 */
	private BMUpdateButtonRequestType BMUpdateButtonRequest;
	public BMUpdateButtonRequestType getBMUpdateButtonRequest() {
		return BMUpdateButtonRequest;
	}
	public void setBMUpdateButtonRequest(BMUpdateButtonRequestType value) {
		this.BMUpdateButtonRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BMUpdateButtonReq>");
		if( BMUpdateButtonRequest != null ) {
			sb.append("<urn:BMUpdateButtonRequest>");
			sb.append(BMUpdateButtonRequest.toXMLString());
			sb.append("</urn:BMUpdateButtonRequest>");
		}
sb.append("</urn:BMUpdateButtonReq>");
		return sb.toString();
	}

}
