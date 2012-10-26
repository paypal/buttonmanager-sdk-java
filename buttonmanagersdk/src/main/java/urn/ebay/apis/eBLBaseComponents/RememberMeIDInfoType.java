package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * External remember-me ID returned by
 * GetExpressCheckoutDetails on successful opt-in. The
 * ExternalRememberMeID is a 17-character alphanumeric
 * (encrypted) string that identifies the buyer's remembered
 * login with a merchant and has meaning only to the merchant.
 * If present, requests that the web flow attempt bypass of
 * login. 
 */
public class RememberMeIDInfoType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * External remember-me ID returned by
	 * GetExpressCheckoutDetails on successful opt-in. The
	 * ExternalRememberMeID is a 17-character alphanumeric
	 * (encrypted) string that identifies the buyer's remembered
	 * login with a merchant and has meaning only to the merchant.
	 * If present, requests that the web flow attempt bypass of
	 * login. 	 
	 */ 
	private String externalRememberMeID;

	

	/**
	 * Default Constructor
	 */
	public RememberMeIDInfoType (){
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
		if(externalRememberMeID != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalRememberMeID>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalRememberMeID));
			sb.append("</").append(preferredPrefix).append(":ExternalRememberMeID>");
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