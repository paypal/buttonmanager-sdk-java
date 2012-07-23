package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeOwnerDetailsType;

/**
 * This element contains information that allows the merchant
 * to request to opt into external remember me on behalf of the
 * buyer or to request login bypass using external remember me.
 * 
 */
public class ExternalRememberMeOptInDetailsType{


	/**
	 * 1 = opt in to external remember me. 0 or omitted = no opt-in
	 * Other values are invalid 	 
	 */ 
	private String ExternalRememberMeOptIn;

	/**
	 * E-mail address or secure merchant account ID of merchant to
	 * associate with new external remember-me. Currently, the
	 * owner must be either the API actor or omitted/none. In the
	 * future, we may allow the owner to be a 3rd party merchant
	 * account. 	 
	 */ 
	private ExternalRememberMeOwnerDetailsType ExternalRememberMeOwnerDetails;

	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOptInDetailsType (){
	}	

	/**
	 * Getter for ExternalRememberMeOptIn
	 */
	 public String getExternalRememberMeOptIn() {
	 	return ExternalRememberMeOptIn;
	 }
	 
	/**
	 * Setter for ExternalRememberMeOptIn
	 */
	 public void setExternalRememberMeOptIn(String ExternalRememberMeOptIn) {
	 	this.ExternalRememberMeOptIn = ExternalRememberMeOptIn;
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
		if(ExternalRememberMeOptIn != null) {
			sb.append("<ebl:ExternalRememberMeOptIn>").append(ExternalRememberMeOptIn);
			sb.append("</ebl:ExternalRememberMeOptIn>");
		}
		if(ExternalRememberMeOwnerDetails != null) {
			sb.append("<ebl:ExternalRememberMeOwnerDetails>");
			sb.append(ExternalRememberMeOwnerDetails.toXMLString());
			sb.append("</ebl:ExternalRememberMeOwnerDetails>");
		}
		return sb.toString();
	}

}