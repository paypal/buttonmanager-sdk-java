
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BMManageButtonStatusRequestType;


/**
 */
public class BMManageButtonStatusReq {

	/**
	 */
	private BMManageButtonStatusRequestType BMManageButtonStatusRequest;
	public BMManageButtonStatusRequestType getBMManageButtonStatusRequest() {
		return BMManageButtonStatusRequest;
	}
	public void setBMManageButtonStatusRequest(BMManageButtonStatusRequestType value) {
		this.BMManageButtonStatusRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BMManageButtonStatusReq>");
		if( BMManageButtonStatusRequest != null ) {
			sb.append("<urn:BMManageButtonStatusRequest>");
			sb.append(BMManageButtonStatusRequest.toXMLString());
			sb.append("</urn:BMManageButtonStatusRequest>");
		}
sb.append("</urn:BMManageButtonStatusReq>");
		return sb.toString();
	}

}
