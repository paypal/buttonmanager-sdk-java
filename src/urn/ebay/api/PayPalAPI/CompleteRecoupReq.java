
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.CompleteRecoupRequestType;


/**
 */
public class CompleteRecoupReq {

	/**
	 */
	private CompleteRecoupRequestType CompleteRecoupRequest;
	public CompleteRecoupRequestType getCompleteRecoupRequest() {
		return CompleteRecoupRequest;
	}
	public void setCompleteRecoupRequest(CompleteRecoupRequestType value) {
		this.CompleteRecoupRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:CompleteRecoupReq>");
		if( CompleteRecoupRequest != null ) {
			sb.append("<urn:CompleteRecoupRequest>");
			sb.append(CompleteRecoupRequest.toXMLString());
			sb.append("</urn:CompleteRecoupRequest>");
		}
sb.append("</urn:CompleteRecoupReq>");
		return sb.toString();
	}

}
