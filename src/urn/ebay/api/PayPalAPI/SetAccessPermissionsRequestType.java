
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.SetAccessPermissionsRequestDetailsType;


/**
 */
public class SetAccessPermissionsRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private SetAccessPermissionsRequestDetailsType SetAccessPermissionsRequestDetails;
	public SetAccessPermissionsRequestDetailsType getSetAccessPermissionsRequestDetails() {
		return SetAccessPermissionsRequestDetails;
	}
	public void setSetAccessPermissionsRequestDetails(SetAccessPermissionsRequestDetailsType value) {
		this.SetAccessPermissionsRequestDetails = value;
	}


	public SetAccessPermissionsRequestType(SetAccessPermissionsRequestDetailsType SetAccessPermissionsRequestDetails) {
		this.SetAccessPermissionsRequestDetails = SetAccessPermissionsRequestDetails;
	}
	public SetAccessPermissionsRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( SetAccessPermissionsRequestDetails != null ) {
			sb.append("<ebl:SetAccessPermissionsRequestDetails>");
			sb.append(SetAccessPermissionsRequestDetails.toXMLString());
			sb.append("</ebl:SetAccessPermissionsRequestDetails>");
		}
		return sb.toString();
	}

}
