package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * The Session token returned during buyer authentication. 
 */
public class MobileIDInfoType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The Session token returned during buyer authentication.	 
	 */ 
	private String sessionToken;

	

	/**
	 * Default Constructor
	 */
	public MobileIDInfoType (){
	}	

	/**
	 * Getter for sessionToken
	 */
	 public String getSessionToken() {
	 	return sessionToken;
	 }
	 
	/**
	 * Setter for sessionToken
	 */
	 public void setSessionToken(String sessionToken) {
	 	this.sessionToken = sessionToken;
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
		if(sessionToken != null) {
			sb.append("<").append(preferredPrefix).append(":SessionToken>").append(SDKUtil.escapeInvalidXmlCharsRegex(sessionToken));
			sb.append("</").append(preferredPrefix).append(":SessionToken>");
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