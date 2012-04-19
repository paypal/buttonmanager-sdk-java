
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoCaptureRequestType;


/**
 */
public class DoCaptureReq {

	/**
	 */
	private DoCaptureRequestType DoCaptureRequest;
	public DoCaptureRequestType getDoCaptureRequest() {
		return DoCaptureRequest;
	}
	public void setDoCaptureRequest(DoCaptureRequestType value) {
		this.DoCaptureRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoCaptureReq>");
		if( DoCaptureRequest != null ) {
			sb.append("<urn:DoCaptureRequest>");
			sb.append(DoCaptureRequest.toXMLString());
			sb.append("</urn:DoCaptureRequest>");
		}
sb.append("</urn:DoCaptureReq>");
		return sb.toString();
	}

}
