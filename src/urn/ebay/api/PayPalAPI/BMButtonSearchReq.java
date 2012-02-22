
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BMButtonSearchRequestType;


/**
 */
public class BMButtonSearchReq {

	/**
	 */
	private BMButtonSearchRequestType BMButtonSearchRequest;
	public BMButtonSearchRequestType getBMButtonSearchRequest() {
		return BMButtonSearchRequest;
	}
	public void setBMButtonSearchRequest(BMButtonSearchRequestType value) {
		this.BMButtonSearchRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BMButtonSearchReq>");
		if( BMButtonSearchRequest != null ) {
			sb.append("<urn:BMButtonSearchRequest>");
			sb.append(BMButtonSearchRequest.toXMLString());
			sb.append("</urn:BMButtonSearchRequest>");
		}
sb.append("</urn:BMButtonSearchReq>");
		return sb.toString();
	}

}
