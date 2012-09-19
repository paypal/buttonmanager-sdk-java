package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Identity Access token from merchant 
 */
public class IdentityTokenInfoType{


	/**
	 * Identity Access token from merchant	  
	 *@Required	 
	 */ 
	private String AccessToken;

	

	/**
	 * Constructor with arguments
	 */
	public IdentityTokenInfoType (String AccessToken){
		this.AccessToken = AccessToken;
	}	

	/**
	 * Default Constructor
	 */
	public IdentityTokenInfoType (){
	}	

	/**
	 * Getter for AccessToken
	 */
	 public String getAccessToken() {
	 	return AccessToken;
	 }
	 
	/**
	 * Setter for AccessToken
	 */
	 public void setAccessToken(String AccessToken) {
	 	this.AccessToken = AccessToken;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(AccessToken != null) {
			sb.append("<ebl:AccessToken>").append(SDKUtil.escapeInvalidXmlCharsRegex(AccessToken));
			sb.append("</ebl:AccessToken>");
		}
		return sb.toString();
	}


}