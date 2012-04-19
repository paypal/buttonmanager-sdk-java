
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * E-mail address or secure merchant account ID of merchant to associate with new external remember-me.
 */
public class ExternalRememberMeOwnerDetailsType {

	/**
	 * A discriminant that tells SetEC what kind of data the ExternalRememberMeOwnerID parameter contains.
	 * Currently, the owner must be either the API actor or omitted/none.  In the future, we may allow the
	 * owner to be a 3rd party merchant account.
	 * Possible values are:
	 * None, ignore the ExternalRememberMeOwnerID.  An empty value for this field also signifies None.
	 * Email, the owner ID is an email address
	 * SecureMerchantAccountID, the owner id is a string representing the secure merchant account ID
	 */
	private String ExternalRememberMeOwnerIDType;
	public String getExternalRememberMeOwnerIDType() {
		return ExternalRememberMeOwnerIDType;
	}
	public void setExternalRememberMeOwnerIDType(String value) {
		this.ExternalRememberMeOwnerIDType = value;
	}

	/**
	 * When opting in to bypass login via remember me, this parameter specifies the merchant account
	 * associated with the remembered login.  Currentl, the owner must be either the API actor or omitted/none.
	 * In the future, we may allow the owner to be a 3rd party merchant account.
	 * If the Owner ID Type field is not present or "None", this parameter is ignored.
	 */
	private String ExternalRememberMeOwnerID;
	public String getExternalRememberMeOwnerID() {
		return ExternalRememberMeOwnerID;
	}
	public void setExternalRememberMeOwnerID(String value) {
		this.ExternalRememberMeOwnerID = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ExternalRememberMeOwnerIDType != null ) {
			sb.append("<ebl:ExternalRememberMeOwnerIDType>").append(ExternalRememberMeOwnerIDType);
			sb.append("</ebl:ExternalRememberMeOwnerIDType>");
		}
		if( ExternalRememberMeOwnerID != null ) {
			sb.append("<ebl:ExternalRememberMeOwnerID>").append(ExternalRememberMeOwnerID);
			sb.append("</ebl:ExternalRememberMeOwnerID>");
		}
		return sb.toString();
	}

}
