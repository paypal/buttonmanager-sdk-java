
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.SetAccessPermissionsRequestType;


/**
 */
public class SetAccessPermissionsReq {

	/**
	 */
	private SetAccessPermissionsRequestType SetAccessPermissionsRequest;
	public SetAccessPermissionsRequestType getSetAccessPermissionsRequest() {
		return SetAccessPermissionsRequest;
	}
	public void setSetAccessPermissionsRequest(SetAccessPermissionsRequestType value) {
		this.SetAccessPermissionsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:SetAccessPermissionsReq>");
		if( SetAccessPermissionsRequest != null ) {
			sb.append("<urn:SetAccessPermissionsRequest>");
			sb.append(SetAccessPermissionsRequest.toXMLString());
			sb.append("</urn:SetAccessPermissionsRequest>");
		}
sb.append("</urn:SetAccessPermissionsReq>");
		return sb.toString();
	}

}
