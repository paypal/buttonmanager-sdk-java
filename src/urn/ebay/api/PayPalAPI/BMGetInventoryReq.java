
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BMGetInventoryRequestType;


/**
 */
public class BMGetInventoryReq {

	/**
	 */
	private BMGetInventoryRequestType BMGetInventoryRequest;
	public BMGetInventoryRequestType getBMGetInventoryRequest() {
		return BMGetInventoryRequest;
	}
	public void setBMGetInventoryRequest(BMGetInventoryRequestType value) {
		this.BMGetInventoryRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BMGetInventoryReq>");
		if( BMGetInventoryRequest != null ) {
			sb.append("<urn:BMGetInventoryRequest>");
			sb.append(BMGetInventoryRequest.toXMLString());
			sb.append("</urn:BMGetInventoryRequest>");
		}
sb.append("</urn:BMGetInventoryReq>");
		return sb.toString();
	}

}
