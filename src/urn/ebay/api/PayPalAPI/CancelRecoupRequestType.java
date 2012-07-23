package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.EnhancedDataTypes.EnhancedCancelRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class CancelRecoupRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private EnhancedCancelRecoupRequestDetailsType EnhancedCancelRecoupRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public CancelRecoupRequestType (EnhancedCancelRecoupRequestDetailsType EnhancedCancelRecoupRequestDetails){
		this.EnhancedCancelRecoupRequestDetails = EnhancedCancelRecoupRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CancelRecoupRequestType (){
	}	

	/**
	 * Getter for EnhancedCancelRecoupRequestDetails
	 */
	 public EnhancedCancelRecoupRequestDetailsType getEnhancedCancelRecoupRequestDetails() {
	 	return EnhancedCancelRecoupRequestDetails;
	 }
	 
	/**
	 * Setter for EnhancedCancelRecoupRequestDetails
	 */
	 public void setEnhancedCancelRecoupRequestDetails(EnhancedCancelRecoupRequestDetailsType EnhancedCancelRecoupRequestDetails) {
	 	this.EnhancedCancelRecoupRequestDetails = EnhancedCancelRecoupRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(EnhancedCancelRecoupRequestDetails != null) {
			sb.append("<ed:EnhancedCancelRecoupRequestDetails>");
			sb.append(EnhancedCancelRecoupRequestDetails.toXMLString());
			sb.append("</ed:EnhancedCancelRecoupRequestDetails>");
		}
		return sb.toString();
	}

}