package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.EnhancedDataTypes.EnhancedInitiateRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class InitiateRecoupRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public InitiateRecoupRequestType (EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails){
		this.enhancedInitiateRecoupRequestDetails = enhancedInitiateRecoupRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public InitiateRecoupRequestType (){
	}	

	/**
	 * Getter for enhancedInitiateRecoupRequestDetails
	 */
	 public EnhancedInitiateRecoupRequestDetailsType getEnhancedInitiateRecoupRequestDetails() {
	 	return enhancedInitiateRecoupRequestDetails;
	 }
	 
	/**
	 * Setter for enhancedInitiateRecoupRequestDetails
	 */
	 public void setEnhancedInitiateRecoupRequestDetails(EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails) {
	 	this.enhancedInitiateRecoupRequestDetails = enhancedInitiateRecoupRequestDetails;
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
		if(enhancedInitiateRecoupRequestDetails != null) {
			sb.append(enhancedInitiateRecoupRequestDetails.toXMLString(null,"EnhancedInitiateRecoupRequestDetails"));
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