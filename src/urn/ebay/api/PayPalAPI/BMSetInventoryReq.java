
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BMSetInventoryRequestType;


/**
 */
public class BMSetInventoryReq {

	/**
	 */
	private BMSetInventoryRequestType BMSetInventoryRequest;
	public BMSetInventoryRequestType getBMSetInventoryRequest() {
		return BMSetInventoryRequest;
	}
	public void setBMSetInventoryRequest(BMSetInventoryRequestType value) {
		this.BMSetInventoryRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BMSetInventoryReq>");
		if( BMSetInventoryRequest != null ) {
			sb.append("<urn:BMSetInventoryRequest>");
			sb.append(BMSetInventoryRequest.toXMLString());
			sb.append("</urn:BMSetInventoryRequest>");
		}
sb.append("</urn:BMSetInventoryReq>");
		return sb.toString();
	}

}
