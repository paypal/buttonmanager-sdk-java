package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BillOutstandingAmountRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String profileID;

	/**
	 * 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * 	 
	 */ 
	private String note;

	

	/**
	 * Constructor with arguments
	 */
	public BillOutstandingAmountRequestDetailsType (String profileID){
		this.profileID = profileID;
	}	

	/**
	 * Default Constructor
	 */
	public BillOutstandingAmountRequestDetailsType (){
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
	 * Getter for amount
	 */
	 public BasicAmountType getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(BasicAmountType amount) {
	 	this.amount = amount;
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
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
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