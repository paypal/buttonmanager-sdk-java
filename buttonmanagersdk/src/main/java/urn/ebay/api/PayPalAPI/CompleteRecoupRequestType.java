package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.EnhancedDataTypes.EnhancedCompleteRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CompleteRecoupRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private EnhancedCompleteRecoupRequestDetailsType enhancedCompleteRecoupRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public CompleteRecoupRequestType (EnhancedCompleteRecoupRequestDetailsType enhancedCompleteRecoupRequestDetails){
		this.enhancedCompleteRecoupRequestDetails = enhancedCompleteRecoupRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CompleteRecoupRequestType (){
	}	

	/**
	 * Getter for enhancedCompleteRecoupRequestDetails
	 */
	 public EnhancedCompleteRecoupRequestDetailsType getEnhancedCompleteRecoupRequestDetails() {
	 	return enhancedCompleteRecoupRequestDetails;
	 }
	 
	/**
	 * Setter for enhancedCompleteRecoupRequestDetails
	 */
	 public void setEnhancedCompleteRecoupRequestDetails(EnhancedCompleteRecoupRequestDetailsType enhancedCompleteRecoupRequestDetails) {
	 	this.enhancedCompleteRecoupRequestDetails = enhancedCompleteRecoupRequestDetails;
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
		if(enhancedCompleteRecoupRequestDetails != null) {
			sb.append(enhancedCompleteRecoupRequestDetails.toXMLString(null,"EnhancedCompleteRecoupRequestDetails"));
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