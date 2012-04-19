
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * External remember-me ID returned by GetExpressCheckoutDetails on successful opt-in. The
 * ExternalRememberMeID is a 17-character alphanumeric (encrypted) string that identifies
 * the buyer's remembered login with a merchant and has meaning only to the merchant.  If
 * present, requests that the web flow attempt bypass of login.
 */
public class RememberMeIDInfoType {

	/**
	 * External remember-me ID returned by GetExpressCheckoutDetails on successful opt-in. The
	 * ExternalRememberMeID is a 17-character alphanumeric (encrypted) string that identifies
	 * the buyer's remembered login with a merchant and has meaning only to the merchant.  If
	 * present, requests that the web flow attempt bypass of login.
	 */
	private String ExternalRememberMeID;
	public String getExternalRememberMeID() {
		return ExternalRememberMeID;
	}
	public void setExternalRememberMeID(String value) {
		this.ExternalRememberMeID = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ExternalRememberMeID != null ) {
			sb.append("<ebl:ExternalRememberMeID>").append(ExternalRememberMeID);
			sb.append("</ebl:ExternalRememberMeID>");
		}
		return sb.toString();
	}

}
