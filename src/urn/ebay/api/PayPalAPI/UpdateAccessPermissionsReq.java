
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.UpdateAccessPermissionsRequestType;


/**
 */
public class UpdateAccessPermissionsReq {

	/**
	 */
	private UpdateAccessPermissionsRequestType UpdateAccessPermissionsRequest;
	public UpdateAccessPermissionsRequestType getUpdateAccessPermissionsRequest() {
		return UpdateAccessPermissionsRequest;
	}
	public void setUpdateAccessPermissionsRequest(UpdateAccessPermissionsRequestType value) {
		this.UpdateAccessPermissionsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:UpdateAccessPermissionsReq>");
		if( UpdateAccessPermissionsRequest != null ) {
			sb.append("<urn:UpdateAccessPermissionsRequest>");
			sb.append(UpdateAccessPermissionsRequest.toXMLString());
			sb.append("</urn:UpdateAccessPermissionsRequest>");
		}
sb.append("</urn:UpdateAccessPermissionsReq>");
		return sb.toString();
	}

}
