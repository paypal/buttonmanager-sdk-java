package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.StatusChangeActionType;

/**
 * No Document Comments
 */
public class ManageRecurringPaymentsProfileStatusRequestDetailsType{


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private String ProfileID;

	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private StatusChangeActionType Action;

	/**
	 * No Document Comments	 
	 */ 
	private String Note;

	

	/**
	 * Constructor with arguments
	 */
	public ManageRecurringPaymentsProfileStatusRequestDetailsType (String ProfileID, StatusChangeActionType Action){
		this.ProfileID = ProfileID;
		this.Action = Action;
	}	

	/**
	 * Default Constructor
	 */
	public ManageRecurringPaymentsProfileStatusRequestDetailsType (){
	}	

	/**
	 * Getter for ProfileID
	 */
	 public String getProfileID() {
	 	return ProfileID;
	 }
	 
	/**
	 * Setter for ProfileID
	 */
	 public void setProfileID(String ProfileID) {
	 	this.ProfileID = ProfileID;
	 }
	 
	/**
	 * Getter for Action
	 */
	 public StatusChangeActionType getAction() {
	 	return Action;
	 }
	 
	/**
	 * Setter for Action
	 */
	 public void setAction(StatusChangeActionType Action) {
	 	this.Action = Action;
	 }
	 
	/**
	 * Getter for Note
	 */
	 public String getNote() {
	 	return Note;
	 }
	 
	/**
	 * Setter for Note
	 */
	 public void setNote(String Note) {
	 	this.Note = Note;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ProfileID != null) {
			sb.append("<ebl:ProfileID>").append(ProfileID);
			sb.append("</ebl:ProfileID>");
		}
		if(Action != null) {
			sb.append("<ebl:Action>").append(Action.getValue());
			sb.append("</ebl:Action>");
		}
		if(Note != null) {
			sb.append("<ebl:Note>").append(Note);
			sb.append("</ebl:Note>");
		}
		return sb.toString();
	}

}