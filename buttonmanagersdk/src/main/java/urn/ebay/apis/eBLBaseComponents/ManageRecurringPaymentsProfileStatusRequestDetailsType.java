package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.StatusChangeActionType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ManageRecurringPaymentsProfileStatusRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String profileID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private StatusChangeActionType action;

	/**
	 * 	 
	 */ 
	private String note;

	

	/**
	 * Constructor with arguments
	 */
	public ManageRecurringPaymentsProfileStatusRequestDetailsType (String profileID, StatusChangeActionType action){
		this.profileID = profileID;
		this.action = action;
	}	

	/**
	 * Default Constructor
	 */
	public ManageRecurringPaymentsProfileStatusRequestDetailsType (){
	}	

	/**
	 * Getter for profileID
	 */
	 public String getProfileID() {
	 	return profileID;
	 }
	 
	/**
	 * Setter for profileID
	 */
	 public void setProfileID(String profileID) {
	 	this.profileID = profileID;
	 }
	 
	/**
	 * Getter for action
	 */
	 public StatusChangeActionType getAction() {
	 	return action;
	 }
	 
	/**
	 * Setter for action
	 */
	 public void setAction(StatusChangeActionType action) {
	 	this.action = action;
	 }
	 
	/**
	 * Getter for note
	 */
	 public String getNote() {
	 	return note;
	 }
	 
	/**
	 * Setter for note
	 */
	 public void setNote(String note) {
	 	this.note = note;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(profileID != null) {
			sb.append("<").append(preferredPrefix).append(":ProfileID>").append(SDKUtil.escapeInvalidXmlCharsRegex(profileID));
			sb.append("</").append(preferredPrefix).append(":ProfileID>");
		}
		if(action != null) {
			sb.append("<").append(preferredPrefix).append(":Action>").append(SDKUtil.escapeInvalidXmlCharsRegex(action.getValue()));
			sb.append("</").append(preferredPrefix).append(":Action>");
		}
		if(note != null) {
			sb.append("<").append(preferredPrefix).append(":Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(note));
			sb.append("</").append(preferredPrefix).append(":Note>");
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}