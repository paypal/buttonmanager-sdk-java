package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * An optional set of values related to flow-specific details. 
 */
public class FlowControlDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The URL to redirect to for an unpayable transaction. This
	 * field is currently used only for the inline checkout flow. 	 
	 */ 
	private String errorURL;

	/**
	 * The URL to redirect to after a user clicks the "Pay" or
	 * "Continue" button on the merchant's site. This field is
	 * currently used only for the inline checkout flow. 	 
	 */ 
	private String inContextReturnURL;

	

	/**
	 * Default Constructor
	 */
	public FlowControlDetailsType (){
	}	

	/**
	 * Getter for errorURL
	 */
	 public String getErrorURL() {
	 	return errorURL;
	 }
	 
	/**
	 * Setter for errorURL
	 */
	 public void setErrorURL(String errorURL) {
	 	this.errorURL = errorURL;
	 }
	 
	/**
	 * Getter for inContextReturnURL
	 */
	 public String getInContextReturnURL() {
	 	return inContextReturnURL;
	 }
	 
	/**
	 * Setter for inContextReturnURL
	 */
	 public void setInContextReturnURL(String inContextReturnURL) {
	 	this.inContextReturnURL = inContextReturnURL;
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
		if(errorURL != null) {
			sb.append("<").append(preferredPrefix).append(":ErrorURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(errorURL));
			sb.append("</").append(preferredPrefix).append(":ErrorURL>");
		}
		if(inContextReturnURL != null) {
			sb.append("<").append(preferredPrefix).append(":InContextReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(inContextReturnURL));
			sb.append("</").append(preferredPrefix).append(":InContextReturnURL>");
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