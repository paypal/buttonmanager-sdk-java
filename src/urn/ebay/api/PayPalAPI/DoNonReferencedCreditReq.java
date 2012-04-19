
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoNonReferencedCreditRequestType;


/**
 */
public class DoNonReferencedCreditReq {

	/**
	 */
	private DoNonReferencedCreditRequestType DoNonReferencedCreditRequest;
	public DoNonReferencedCreditRequestType getDoNonReferencedCreditRequest() {
		return DoNonReferencedCreditRequest;
	}
	public void setDoNonReferencedCreditRequest(DoNonReferencedCreditRequestType value) {
		this.DoNonReferencedCreditRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoNonReferencedCreditReq>");
		if( DoNonReferencedCreditRequest != null ) {
			sb.append("<urn:DoNonReferencedCreditRequest>");
			sb.append(DoNonReferencedCreditRequest.toXMLString());
			sb.append("</urn:DoNonReferencedCreditRequest>");
		}
sb.append("</urn:DoNonReferencedCreditReq>");
		return sb.toString();
	}

}
