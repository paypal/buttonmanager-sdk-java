
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoVoidRequestType;


/**
 */
public class DoVoidReq {

	/**
	 */
	private DoVoidRequestType DoVoidRequest;
	public DoVoidRequestType getDoVoidRequest() {
		return DoVoidRequest;
	}
	public void setDoVoidRequest(DoVoidRequestType value) {
		this.DoVoidRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoVoidReq>");
		if( DoVoidRequest != null ) {
			sb.append("<urn:DoVoidRequest>");
			sb.append(DoVoidRequest.toXMLString());
			sb.append("</urn:DoVoidRequest>");
		}
sb.append("</urn:DoVoidReq>");
		return sb.toString();
	}

}
