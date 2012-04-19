
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 */
public class GetRecurringPaymentsProfileDetailsRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private String ProfileID;
	public String getProfileID() {
		return ProfileID;
	}
	public void setProfileID(String value) {
		this.ProfileID = value;
	}


	public GetRecurringPaymentsProfileDetailsRequestType(String ProfileID) {
		this.ProfileID = ProfileID;
	}
	public GetRecurringPaymentsProfileDetailsRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( ProfileID != null ) {
			sb.append("<urn:ProfileID>").append(ProfileID);
			sb.append("</urn:ProfileID>");
		}
		return sb.toString();
	}

}
