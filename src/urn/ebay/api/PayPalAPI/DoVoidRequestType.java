
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 * The value of the original authorization identification number returned by a PayPal product. 
 * If you are voiding a transaction that has been reauthorized, use the ID from the original authorization, and not the reauthorization.
 * Required
 * Character length and limits: 19 single-byte characters
 */
public class DoVoidRequestType extends AbstractRequestType{

	/**
The value of the original authorization identification number returned by a PayPal product. 
	 * If you are voiding a transaction that has been reauthorized, use the ID from the original authorization, and not the reauthorization.
	 * Required
	 * Character length and limits: 19 single-byte characters
	 *
	 * @Required
	 */
	private String AuthorizationID;
	public String getAuthorizationID() {
		return AuthorizationID;
	}
	public void setAuthorizationID(String value) {
		this.AuthorizationID = value;
	}

	/**
An informational note about this settlement that is displayed to the payer in email and in  transaction history. 
	 * Optional
	 * Character length and limits: 255 single-byte characters
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}


	public DoVoidRequestType(String AuthorizationID) {
		this.AuthorizationID = AuthorizationID;
	}
	public DoVoidRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( AuthorizationID != null ) {
			sb.append("<urn:AuthorizationID>").append(AuthorizationID);
			sb.append("</urn:AuthorizationID>");
		}
		if( Note != null ) {
			sb.append("<urn:Note>").append(Note);
			sb.append("</urn:Note>");
		}
		return sb.toString();
	}

}
