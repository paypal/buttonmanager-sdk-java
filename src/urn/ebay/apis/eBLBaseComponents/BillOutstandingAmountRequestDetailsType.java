package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;

/**
 * No Document Comments
 */
public class BillOutstandingAmountRequestDetailsType{


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private String ProfileID;

	/**
	 * No Document Comments	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * No Document Comments	 
	 */ 
	private String Note;

	

	/**
	 * Constructor with arguments
	 */
	public BillOutstandingAmountRequestDetailsType (String ProfileID){
		this.ProfileID = ProfileID;
	}	

	/**
	 * Default Constructor
	 */
	public BillOutstandingAmountRequestDetailsType (){
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
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
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
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(Note != null) {
			sb.append("<ebl:Note>").append(Note);
			sb.append("</ebl:Note>");
		}
		return sb.toString();
	}

}