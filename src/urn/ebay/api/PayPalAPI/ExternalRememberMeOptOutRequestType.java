package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeOwnerDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * The merchant passes in the ExternalRememberMeID to identify
 * the user to opt out. This is a 17-character alphanumeric
 * (encrypted) string that identifies the buyer's remembered
 * login with a merchant and has meaning only to the merchant.
 * Required 
 */
public class ExternalRememberMeOptOutRequestType extends AbstractRequestType {


	/**
	 * The merchant passes in the ExternalRememberMeID to identify
	 * the user to opt out. This is a 17-character alphanumeric
	 * (encrypted) string that identifies the buyer's remembered
	 * login with a merchant and has meaning only to the merchant.
	 * Required 	  
	 *@Required	 
	 */ 
	private String ExternalRememberMeID;

	/**
	 * E-mail address or secure merchant account ID of merchant to
	 * associate with external remember-me. 	 
	 */ 
	private ExternalRememberMeOwnerDetailsType ExternalRememberMeOwnerDetails;

	

	/**
	 * Constructor with arguments
	 */
	public ExternalRememberMeOptOutRequestType (String ExternalRememberMeID){
		this.ExternalRememberMeID = ExternalRememberMeID;
	}	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOptOutRequestType (){
	}	

	/**
	 * Getter for ExternalRememberMeID
	 */
	 public String getExternalRememberMeID() {
	 	return ExternalRememberMeID;
	 }
	 
	/**
	 * Setter for ExternalRememberMeID
	 */
	 public void setExternalRememberMeID(String ExternalRememberMeID) {
	 	this.ExternalRememberMeID = ExternalRememberMeID;
	 }
	 
	/**
	 * Getter for ExternalRememberMeOwnerDetails
	 */
	 public ExternalRememberMeOwnerDetailsType getExternalRememberMeOwnerDetails() {
	 	return ExternalRememberMeOwnerDetails;
	 }
	 
	/**
	 * Setter for ExternalRememberMeOwnerDetails
	 */
	 public void setExternalRememberMeOwnerDetails(ExternalRememberMeOwnerDetailsType ExternalRememberMeOwnerDetails) {
	 	this.ExternalRememberMeOwnerDetails = ExternalRememberMeOwnerDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(ExternalRememberMeID != null) {
			sb.append("<urn:ExternalRememberMeID>").append(ExternalRememberMeID);
			sb.append("</urn:ExternalRememberMeID>");
		}
		if(ExternalRememberMeOwnerDetails != null) {
			sb.append("<urn:ExternalRememberMeOwnerDetails>");
			sb.append(ExternalRememberMeOwnerDetails.toXMLString());
			sb.append("</urn:ExternalRememberMeOwnerDetails>");
		}
		return sb.toString();
	}

}