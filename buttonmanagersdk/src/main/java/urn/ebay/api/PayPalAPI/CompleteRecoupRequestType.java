package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.EnhancedDataTypes.EnhancedCompleteRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CompleteRecoupRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private EnhancedCompleteRecoupRequestDetailsType EnhancedCompleteRecoupRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public CompleteRecoupRequestType (EnhancedCompleteRecoupRequestDetailsType EnhancedCompleteRecoupRequestDetails){
		this.EnhancedCompleteRecoupRequestDetails = EnhancedCompleteRecoupRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CompleteRecoupRequestType (){
	}	

	/**
	 * Getter for EnhancedCompleteRecoupRequestDetails
	 */
	 public EnhancedCompleteRecoupRequestDetailsType getEnhancedCompleteRecoupRequestDetails() {
	 	return EnhancedCompleteRecoupRequestDetails;
	 }
	 
	/**
	 * Setter for EnhancedCompleteRecoupRequestDetails
	 */
	 public void setEnhancedCompleteRecoupRequestDetails(EnhancedCompleteRecoupRequestDetailsType EnhancedCompleteRecoupRequestDetails) {
	 	this.EnhancedCompleteRecoupRequestDetails = EnhancedCompleteRecoupRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(EnhancedCompleteRecoupRequestDetails != null) {
			sb.append("<ed:EnhancedCompleteRecoupRequestDetails>");
			sb.append(EnhancedCompleteRecoupRequestDetails.toXMLString());
			sb.append("</ed:EnhancedCompleteRecoupRequestDetails>");
		}
		return sb.toString();
	}


}