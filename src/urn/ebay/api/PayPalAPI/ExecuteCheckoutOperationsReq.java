package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ExecuteCheckoutOperationsRequestType;

/**
 * No Document Comments
 */
public class ExecuteCheckoutOperationsReq{


	/**
	 * No Document Comments	 
	 */ 
	private ExecuteCheckoutOperationsRequestType ExecuteCheckoutOperationsRequest;

	

	/**
	 * Default Constructor
	 */
	public ExecuteCheckoutOperationsReq (){
	}	

	/**
	 * Getter for ExecuteCheckoutOperationsRequest
	 */
	 public ExecuteCheckoutOperationsRequestType getExecuteCheckoutOperationsRequest() {
	 	return ExecuteCheckoutOperationsRequest;
	 }
	 
	/**
	 * Setter for ExecuteCheckoutOperationsRequest
	 */
	 public void setExecuteCheckoutOperationsRequest(ExecuteCheckoutOperationsRequestType ExecuteCheckoutOperationsRequest) {
	 	this.ExecuteCheckoutOperationsRequest = ExecuteCheckoutOperationsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:ExecuteCheckoutOperationsReq>");
		if(ExecuteCheckoutOperationsRequest != null) {
			sb.append("<urn:ExecuteCheckoutOperationsRequest>");
			sb.append(ExecuteCheckoutOperationsRequest.toXMLString());
			sb.append("</urn:ExecuteCheckoutOperationsRequest>");
		}
		sb.append("</urn:ExecuteCheckoutOperationsReq>");
		return sb.toString();
	}

}