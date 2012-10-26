package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeOwnerDetailsType;
import com.paypal.core.SDKUtil;

/**
 * This element contains information that allows the merchant
 * to request to opt into external remember me on behalf of the
 * buyer or to request login bypass using external remember me.
 * 
 */
public class ExternalRememberMeOptInDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 1 = opt in to external remember me. 0 or omitted = no opt-in
	 * Other values are invalid 	 
	 */ 
	private String externalRememberMeOptIn;

	/**
	 * E-mail address or secure merchant account ID of merchant to
	 * associate with new external remember-me. Currently, the
	 * owner must be either the API actor or omitted/none. In the
	 * future, we may allow the owner to be a 3rd party merchant
	 * account. 	 
	 */ 
	private ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails;

	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOptInDetailsType (){
	}	

	/**
	 * Getter for externalRememberMeOptIn
	 */
	 public String getExternalRememberMeOptIn() {
	 	return externalRememberMeOptIn;
	 }
	 
	/**
	 * Setter for externalRememberMeOptIn
	 */
	 public void setExternalRememberMeOptIn(String externalRememberMeOptIn) {
	 	this.externalRememberMeOptIn = externalRememberMeOptIn;
	 }
	 
	/**
	 * Getter for externalRememberMeOwnerDetails
	 */
	 public ExternalRememberMeOwnerDetailsType getExternalRememberMeOwnerDetails() {
	 	return externalRememberMeOwnerDetails;
	 }
	 
	/**
	 * Setter for externalRememberMeOwnerDetails
	 */
	 public void setExternalRememberMeOwnerDetails(ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails) {
	 	this.externalRememberMeOwnerDetails = externalRememberMeOwnerDetails;
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
		if(externalRememberMeOptIn != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalRememberMeOptIn>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalRememberMeOptIn));
			sb.append("</").append(preferredPrefix).append(":ExternalRememberMeOptIn>");
		}
		if(externalRememberMeOwnerDetails != null) {
			sb.append(externalRememberMeOwnerDetails.toXMLString(preferredPrefix,"ExternalRememberMeOwnerDetails"));
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