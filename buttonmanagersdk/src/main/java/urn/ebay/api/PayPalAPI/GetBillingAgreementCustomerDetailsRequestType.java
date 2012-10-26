package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetBillingAgreementCustomerDetailsRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String token;

	

	/**
	 * Constructor with arguments
	 */
	public GetBillingAgreementCustomerDetailsRequestType (String token){
		this.token = token;
	}	

	/**
	 * Default Constructor
	 */
	public GetBillingAgreementCustomerDetailsRequestType (){
	}	

	/**
	 * Getter for token
	 */
	 public String getToken() {
	 	return token;
	 }
	 
	/**
	 * Setter for token
	 */
	 public void setToken(String token) {
	 	this.token = token;
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
		sb.append(super.toXMLString(prefix, null));
		if(token != null) {
			sb.append("<").append(preferredPrefix).append(":Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(token));
			sb.append("</").append(preferredPrefix).append(":Token>");
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