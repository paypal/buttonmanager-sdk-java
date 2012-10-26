package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * E-mail address or secure merchant account ID of merchant to
 * associate with new external remember-me. 
 */
public class ExternalRememberMeOwnerDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * A discriminant that tells SetEC what kind of data the
	 * ExternalRememberMeOwnerID parameter contains. Currently, the
	 * owner must be either the API actor or omitted/none. In the
	 * future, we may allow the owner to be a 3rd party merchant
	 * account. Possible values are: None, ignore the
	 * ExternalRememberMeOwnerID. An empty value for this field
	 * also signifies None. Email, the owner ID is an email address
	 * SecureMerchantAccountID, the owner id is a string
	 * representing the secure merchant account ID 	 
	 */ 
	private String externalRememberMeOwnerIDType;

	/**
	 * When opting in to bypass login via remember me, this
	 * parameter specifies the merchant account associated with the
	 * remembered login. Currentl, the owner must be either the API
	 * actor or omitted/none. In the future, we may allow the owner
	 * to be a 3rd party merchant account. If the Owner ID Type
	 * field is not present or "None", this parameter is ignored. 	 
	 */ 
	private String externalRememberMeOwnerID;

	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOwnerDetailsType (){
	}	

	/**
	 * Getter for externalRememberMeOwnerIDType
	 */
	 public String getExternalRememberMeOwnerIDType() {
	 	return externalRememberMeOwnerIDType;
	 }
	 
	/**
	 * Setter for externalRememberMeOwnerIDType
	 */
	 public void setExternalRememberMeOwnerIDType(String externalRememberMeOwnerIDType) {
	 	this.externalRememberMeOwnerIDType = externalRememberMeOwnerIDType;
	 }
	 
	/**
	 * Getter for externalRememberMeOwnerID
	 */
	 public String getExternalRememberMeOwnerID() {
	 	return externalRememberMeOwnerID;
	 }
	 
	/**
	 * Setter for externalRememberMeOwnerID
	 */
	 public void setExternalRememberMeOwnerID(String externalRememberMeOwnerID) {
	 	this.externalRememberMeOwnerID = externalRememberMeOwnerID;
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
		if(externalRememberMeOwnerIDType != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalRememberMeOwnerIDType>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalRememberMeOwnerIDType));
			sb.append("</").append(preferredPrefix).append(":ExternalRememberMeOwnerIDType>");
		}
		if(externalRememberMeOwnerID != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalRememberMeOwnerID>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalRememberMeOwnerID));
			sb.append("</").append(preferredPrefix).append(":ExternalRememberMeOwnerID>");
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