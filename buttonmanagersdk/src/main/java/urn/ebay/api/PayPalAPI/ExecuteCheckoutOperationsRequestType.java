package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ExecuteCheckoutOperationsRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ExecuteCheckoutOperationsRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private ExecuteCheckoutOperationsRequestDetailsType executeCheckoutOperationsRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public ExecuteCheckoutOperationsRequestType (ExecuteCheckoutOperationsRequestDetailsType executeCheckoutOperationsRequestDetails){
		this.executeCheckoutOperationsRequestDetails = executeCheckoutOperationsRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public ExecuteCheckoutOperationsRequestType (){
	}	

	/**
	 * Getter for executeCheckoutOperationsRequestDetails
	 */
	 public ExecuteCheckoutOperationsRequestDetailsType getExecuteCheckoutOperationsRequestDetails() {
	 	return executeCheckoutOperationsRequestDetails;
	 }
	 
	/**
	 * Setter for executeCheckoutOperationsRequestDetails
	 */
	 public void setExecuteCheckoutOperationsRequestDetails(ExecuteCheckoutOperationsRequestDetailsType executeCheckoutOperationsRequestDetails) {
	 	this.executeCheckoutOperationsRequestDetails = executeCheckoutOperationsRequestDetails;
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
		if(executeCheckoutOperationsRequestDetails != null) {
			sb.append(executeCheckoutOperationsRequestDetails.toXMLString(null,"ExecuteCheckoutOperationsRequestDetails"));
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