
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeOwnerDetailsType;


/**
 * The merchant passes in the ExternalRememberMeID to identify the user to opt out.  This is a 17-character
 * alphanumeric (encrypted) string that identifies the buyer's remembered login with a merchant and has
 * meaning only to the merchant.
 * Required
 */
public class ExternalRememberMeOptOutRequestType extends AbstractRequestType{

	/**
	 * The merchant passes in the ExternalRememberMeID to identify the user to opt out.  This is a 17-character
	 * alphanumeric (encrypted) string that identifies the buyer's remembered login with a merchant and has
	 * meaning only to the merchant.
	 * Required
	 *
	 * @Required
	 */
	private String ExternalRememberMeID;
	public String getExternalRememberMeID() {
		return ExternalRememberMeID;
	}
	public void setExternalRememberMeID(String value) {
		this.ExternalRememberMeID = value;
	}

	/**
	 * E-mail address or secure merchant account ID of merchant to associate with
	 * external remember-me.
	 */
	private ExternalRememberMeOwnerDetailsType ExternalRememberMeOwnerDetails;
	public ExternalRememberMeOwnerDetailsType getExternalRememberMeOwnerDetails() {
		return ExternalRememberMeOwnerDetails;
	}
	public void setExternalRememberMeOwnerDetails(ExternalRememberMeOwnerDetailsType value) {
		this.ExternalRememberMeOwnerDetails = value;
	}


	public ExternalRememberMeOptOutRequestType(String ExternalRememberMeID) {
		this.ExternalRememberMeID = ExternalRememberMeID;
	}
	public ExternalRememberMeOptOutRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( ExternalRememberMeID != null ) {
			sb.append("<urn:ExternalRememberMeID>").append(ExternalRememberMeID);
			sb.append("</urn:ExternalRememberMeID>");
		}
		if( ExternalRememberMeOwnerDetails != null ) {
			sb.append("<urn:ExternalRememberMeOwnerDetails>");
			sb.append(ExternalRememberMeOwnerDetails.toXMLString());
			sb.append("</urn:ExternalRememberMeOwnerDetails>");
		}
		return sb.toString();
	}

}
