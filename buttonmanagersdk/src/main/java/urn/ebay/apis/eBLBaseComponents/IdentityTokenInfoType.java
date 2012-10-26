package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Identity Access token from merchant 
 */
public class IdentityTokenInfoType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Identity Access token from merchant	  
	 *@Required	 
	 */ 
	private String accessToken;

	

	/**
	 * Constructor with arguments
	 */
	public IdentityTokenInfoType (String accessToken){
		this.accessToken = accessToken;
	}	

	/**
	 * Default Constructor
	 */
	public IdentityTokenInfoType (){
	}	

	/**
	 * Getter for accessToken
	 */
	 public String getAccessToken() {
	 	return accessToken;
	 }
	 
	/**
	 * Setter for accessToken
	 */
	 public void setAccessToken(String accessToken) {
	 	this.accessToken = accessToken;
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
		if(accessToken != null) {
			sb.append("<").append(preferredPrefix).append(":AccessToken>").append(SDKUtil.escapeInvalidXmlCharsRegex(accessToken));
			sb.append("</").append(preferredPrefix).append(":AccessToken>");
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