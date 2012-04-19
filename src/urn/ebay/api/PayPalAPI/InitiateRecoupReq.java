
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.InitiateRecoupRequestType;


/**
 */
public class InitiateRecoupReq {

	/**
	 */
	private InitiateRecoupRequestType InitiateRecoupRequest;
	public InitiateRecoupRequestType getInitiateRecoupRequest() {
		return InitiateRecoupRequest;
	}
	public void setInitiateRecoupRequest(InitiateRecoupRequestType value) {
		this.InitiateRecoupRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:InitiateRecoupReq>");
		if( InitiateRecoupRequest != null ) {
			sb.append("<urn:InitiateRecoupRequest>");
			sb.append(InitiateRecoupRequest.toXMLString());
			sb.append("</urn:InitiateRecoupRequest>");
		}
sb.append("</urn:InitiateRecoupReq>");
		return sb.toString();
	}

}
