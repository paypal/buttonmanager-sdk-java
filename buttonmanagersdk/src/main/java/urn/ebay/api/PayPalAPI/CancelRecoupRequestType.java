package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.EnhancedDataTypes.EnhancedCancelRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CancelRecoupRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private EnhancedCancelRecoupRequestDetailsType enhancedCancelRecoupRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public CancelRecoupRequestType (EnhancedCancelRecoupRequestDetailsType enhancedCancelRecoupRequestDetails){
		this.enhancedCancelRecoupRequestDetails = enhancedCancelRecoupRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CancelRecoupRequestType (){
	}	

	/**
	 * Getter for enhancedCancelRecoupRequestDetails
	 */
	 public EnhancedCancelRecoupRequestDetailsType getEnhancedCancelRecoupRequestDetails() {
	 	return enhancedCancelRecoupRequestDetails;
	 }
	 
	/**
	 * Setter for enhancedCancelRecoupRequestDetails
	 */
	 public void setEnhancedCancelRecoupRequestDetails(EnhancedCancelRecoupRequestDetailsType enhancedCancelRecoupRequestDetails) {
	 	this.enhancedCancelRecoupRequestDetails = enhancedCancelRecoupRequestDetails;
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
		if(enhancedCancelRecoupRequestDetails != null) {
			sb.append(enhancedCancelRecoupRequestDetails.toXMLString(null,"EnhancedCancelRecoupRequestDetails"));
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