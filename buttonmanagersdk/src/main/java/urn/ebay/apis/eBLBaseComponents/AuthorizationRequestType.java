package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class AuthorizationRequestType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private Boolean IsRequested;

	

	/**
	 * Constructor with arguments
	 */
	public AuthorizationRequestType (Boolean IsRequested){
		this.IsRequested = IsRequested;
	}	

	/**
	 * Default Constructor
	 */
	public AuthorizationRequestType (){
	}	

	/**
	 * Getter for IsRequested
	 */
	 public Boolean getIsRequested() {
	 	return IsRequested;
	 }
	 
	/**
	 * Setter for IsRequested
	 */
	 public void setIsRequested(Boolean IsRequested) {
	 	this.IsRequested = IsRequested;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(IsRequested != null) {
			sb.append("<ebl:IsRequested>").append(SDKUtil.escapeInvalidXmlCharsRegex(IsRequested));
			sb.append("</ebl:IsRequested>");
		}
		return sb.toString();
	}


}