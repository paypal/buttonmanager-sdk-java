
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BMCreateButtonRequestType;


/**
 */
public class BMCreateButtonReq {

	/**
	 */
	private BMCreateButtonRequestType BMCreateButtonRequest;
	public BMCreateButtonRequestType getBMCreateButtonRequest() {
		return BMCreateButtonRequest;
	}
	public void setBMCreateButtonRequest(BMCreateButtonRequestType value) {
		this.BMCreateButtonRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BMCreateButtonReq>");
		if( BMCreateButtonRequest != null ) {
			sb.append("<urn:BMCreateButtonRequest>");
			sb.append(BMCreateButtonRequest.toXMLString());
			sb.append("</urn:BMCreateButtonRequest>");
		}
sb.append("</urn:BMCreateButtonReq>");
		return sb.toString();
	}

}
