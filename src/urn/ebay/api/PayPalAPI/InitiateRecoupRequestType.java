package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.EnhancedDataTypes.EnhancedInitiateRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class InitiateRecoupRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private EnhancedInitiateRecoupRequestDetailsType EnhancedInitiateRecoupRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public InitiateRecoupRequestType (EnhancedInitiateRecoupRequestDetailsType EnhancedInitiateRecoupRequestDetails){
		this.EnhancedInitiateRecoupRequestDetails = EnhancedInitiateRecoupRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public InitiateRecoupRequestType (){
	}	

	/**
	 * Getter for EnhancedInitiateRecoupRequestDetails
	 */
	 public EnhancedInitiateRecoupRequestDetailsType getEnhancedInitiateRecoupRequestDetails() {
	 	return EnhancedInitiateRecoupRequestDetails;
	 }
	 
	/**
	 * Setter for EnhancedInitiateRecoupRequestDetails
	 */
	 public void setEnhancedInitiateRecoupRequestDetails(EnhancedInitiateRecoupRequestDetailsType EnhancedInitiateRecoupRequestDetails) {
	 	this.EnhancedInitiateRecoupRequestDetails = EnhancedInitiateRecoupRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(EnhancedInitiateRecoupRequestDetails != null) {
			sb.append("<ed:EnhancedInitiateRecoupRequestDetails>");
			sb.append(EnhancedInitiateRecoupRequestDetails.toXMLString());
			sb.append("</ed:EnhancedInitiateRecoupRequestDetails>");
		}
		return sb.toString();
	}

}