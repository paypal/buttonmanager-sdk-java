
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.StatusChangeActionType;


/**
 */
public class ManageRecurringPaymentsProfileStatusRequestDetailsType {

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
	 *
	 * @Required
	 */
	private StatusChangeActionType Action;
	public StatusChangeActionType getAction() {
		return Action;
	}
	public void setAction(StatusChangeActionType value) {
		this.Action = value;
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


	public ManageRecurringPaymentsProfileStatusRequestDetailsType(String ProfileID, StatusChangeActionType Action) {
		this.ProfileID = ProfileID;
		this.Action = Action;
	}
	public ManageRecurringPaymentsProfileStatusRequestDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ProfileID != null ) {
			sb.append("<ebl:ProfileID>").append(ProfileID);
			sb.append("</ebl:ProfileID>");
		}
		if( Action != null ) {
			sb.append("<ebl:Action>").append( Action.getValue());
			sb.append("</ebl:Action>");
		}
		if( Note != null ) {
			sb.append("<ebl:Note>").append(Note);
			sb.append("</ebl:Note>");
		}
		return sb.toString();
	}

}
