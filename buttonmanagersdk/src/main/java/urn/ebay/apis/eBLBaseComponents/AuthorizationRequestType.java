package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class AuthorizationRequestType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private Boolean isRequested;

	

	/**
	 * Constructor with arguments
	 */
	public AuthorizationRequestType (Boolean isRequested){
		this.isRequested = isRequested;
	}	

	/**
	 * Default Constructor
	 */
	public AuthorizationRequestType (){
	}	

	/**
	 * Getter for isRequested
	 */
	 public Boolean getIsRequested() {
	 	return isRequested;
	 }
	 
	/**
	 * Setter for isRequested
	 */
	 public void setIsRequested(Boolean isRequested) {
	 	this.isRequested = isRequested;
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
		if(isRequested != null) {
			sb.append("<").append(preferredPrefix).append(":IsRequested>").append(SDKUtil.escapeInvalidXmlCharsRegex(isRequested));
			sb.append("</").append(preferredPrefix).append(":IsRequested>");
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