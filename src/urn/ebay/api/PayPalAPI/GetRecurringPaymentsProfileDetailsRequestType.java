package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class GetRecurringPaymentsProfileDetailsRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private String ProfileID;

	

	/**
	 * Constructor with arguments
	 */
	public GetRecurringPaymentsProfileDetailsRequestType (String ProfileID){
		this.ProfileID = ProfileID;
	}	

	/**
	 * Default Constructor
	 */
	public GetRecurringPaymentsProfileDetailsRequestType (){
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
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(ProfileID != null) {
			sb.append("<urn:ProfileID>").append(ProfileID);
			sb.append("</urn:ProfileID>");
		}
		return sb.toString();
	}

}