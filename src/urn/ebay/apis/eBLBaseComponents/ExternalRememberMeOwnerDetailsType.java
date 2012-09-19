package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * E-mail address or secure merchant account ID of merchant to
 * associate with new external remember-me. 
 */
public class ExternalRememberMeOwnerDetailsType{


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
	private String ExternalRememberMeOwnerIDType;

	/**
	 * When opting in to bypass login via remember me, this
	 * parameter specifies the merchant account associated with the
	 * remembered login. Currentl, the owner must be either the API
	 * actor or omitted/none. In the future, we may allow the owner
	 * to be a 3rd party merchant account. If the Owner ID Type
	 * field is not present or "None", this parameter is ignored. 	 
	 */ 
	private String ExternalRememberMeOwnerID;

	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOwnerDetailsType (){
	}	

	/**
	 * Getter for ExternalRememberMeOwnerIDType
	 */
	 public String getExternalRememberMeOwnerIDType() {
	 	return ExternalRememberMeOwnerIDType;
	 }
	 
	/**
	 * Setter for ExternalRememberMeOwnerIDType
	 */
	 public void setExternalRememberMeOwnerIDType(String ExternalRememberMeOwnerIDType) {
	 	this.ExternalRememberMeOwnerIDType = ExternalRememberMeOwnerIDType;
	 }
	 
	/**
	 * Getter for ExternalRememberMeOwnerID
	 */
	 public String getExternalRememberMeOwnerID() {
	 	return ExternalRememberMeOwnerID;
	 }
	 
	/**
	 * Setter for ExternalRememberMeOwnerID
	 */
	 public void setExternalRememberMeOwnerID(String ExternalRememberMeOwnerID) {
	 	this.ExternalRememberMeOwnerID = ExternalRememberMeOwnerID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ExternalRememberMeOwnerIDType != null) {
			sb.append("<ebl:ExternalRememberMeOwnerIDType>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExternalRememberMeOwnerIDType));
			sb.append("</ebl:ExternalRememberMeOwnerIDType>");
		}
		if(ExternalRememberMeOwnerID != null) {
			sb.append("<ebl:ExternalRememberMeOwnerID>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExternalRememberMeOwnerID));
			sb.append("</ebl:ExternalRememberMeOwnerID>");
		}
		return sb.toString();
	}


}