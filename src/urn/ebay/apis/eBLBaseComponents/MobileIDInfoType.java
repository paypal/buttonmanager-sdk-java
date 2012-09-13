package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * The Session token returned during buyer authentication. 
 */
public class MobileIDInfoType{


	/**
	 * The Session token returned during buyer authentication.	 
	 */ 
	private String SessionToken;

	

	/**
	 * Default Constructor
	 */
	public MobileIDInfoType (){
	}	

	/**
	 * Getter for SessionToken
	 */
	 public String getSessionToken() {
	 	return SessionToken;
	 }
	 
	/**
	 * Setter for SessionToken
	 */
	 public void setSessionToken(String SessionToken) {
	 	this.SessionToken = SessionToken;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(SessionToken != null) {
			sb.append("<ebl:SessionToken>").append(SDKUtil.escapeInvalidXmlCharsRegex(SessionToken));
			sb.append("</ebl:SessionToken>");
		}
		return sb.toString();
	}

}