package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ExecuteCheckoutOperationsRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ExecuteCheckoutOperationsRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ExecuteCheckoutOperationsRequestDetailsType ExecuteCheckoutOperationsRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public ExecuteCheckoutOperationsRequestType (ExecuteCheckoutOperationsRequestDetailsType ExecuteCheckoutOperationsRequestDetails){
		this.ExecuteCheckoutOperationsRequestDetails = ExecuteCheckoutOperationsRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public ExecuteCheckoutOperationsRequestType (){
	}	

	/**
	 * Getter for ExecuteCheckoutOperationsRequestDetails
	 */
	 public ExecuteCheckoutOperationsRequestDetailsType getExecuteCheckoutOperationsRequestDetails() {
	 	return ExecuteCheckoutOperationsRequestDetails;
	 }
	 
	/**
	 * Setter for ExecuteCheckoutOperationsRequestDetails
	 */
	 public void setExecuteCheckoutOperationsRequestDetails(ExecuteCheckoutOperationsRequestDetailsType ExecuteCheckoutOperationsRequestDetails) {
	 	this.ExecuteCheckoutOperationsRequestDetails = ExecuteCheckoutOperationsRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(ExecuteCheckoutOperationsRequestDetails != null) {
			sb.append("<ebl:ExecuteCheckoutOperationsRequestDetails>");
			sb.append(ExecuteCheckoutOperationsRequestDetails.toXMLString());
			sb.append("</ebl:ExecuteCheckoutOperationsRequestDetails>");
		}
		return sb.toString();
	}


}