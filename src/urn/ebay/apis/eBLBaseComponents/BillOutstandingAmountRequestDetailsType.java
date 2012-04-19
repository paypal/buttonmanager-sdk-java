
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 */
public class BillOutstandingAmountRequestDetailsType {

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

	/**
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}


	public BillOutstandingAmountRequestDetailsType(String ProfileID) {
		this.ProfileID = ProfileID;
	}
	public BillOutstandingAmountRequestDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ProfileID != null ) {
			sb.append("<ebl:ProfileID>").append(ProfileID);
			sb.append("</ebl:ProfileID>");
		}
		if( Amount != null ) {
			sb.append("<ebl:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if( Note != null ) {
			sb.append("<ebl:Note>").append(Note);
			sb.append("</ebl:Note>");
		}
		return sb.toString();
	}

}
