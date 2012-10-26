package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ExternalRememberMeOwnerDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The merchant passes in the ExternalRememberMeID to identify
 * the user to opt out. This is a 17-character alphanumeric
 * (encrypted) string that identifies the buyer's remembered
 * login with a merchant and has meaning only to the merchant.
 * Required 
 */
public class ExternalRememberMeOptOutRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The merchant passes in the ExternalRememberMeID to identify
	 * the user to opt out. This is a 17-character alphanumeric
	 * (encrypted) string that identifies the buyer's remembered
	 * login with a merchant and has meaning only to the merchant.
	 * Required 	  
	 *@Required	 
	 */ 
	private String externalRememberMeID;

	/**
	 * E-mail address or secure merchant account ID of merchant to
	 * associate with external remember-me. 	 
	 */ 
	private ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails;

	

	/**
	 * Constructor with arguments
	 */
	public ExternalRememberMeOptOutRequestType (String externalRememberMeID){
		this.externalRememberMeID = externalRememberMeID;
	}	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOptOutRequestType (){
	}	

	/**
	 * Getter for externalRememberMeID
	 */
	 public String getExternalRememberMeID() {
	 	return externalRememberMeID;
	 }
	 
	/**
	 * Setter for externalRememberMeID
	 */
	 public void setExternalRememberMeID(String externalRememberMeID) {
	 	this.externalRememberMeID = externalRememberMeID;
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
		sb.append(super.toXMLString(prefix, null));
		if(externalRememberMeID != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalRememberMeID>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalRememberMeID));
			sb.append("</").append(preferredPrefix).append(":ExternalRememberMeID>");
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