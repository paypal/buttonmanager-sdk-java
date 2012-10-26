package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ExecuteCheckoutOperationsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ExecuteCheckoutOperationsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private ExecuteCheckoutOperationsRequestType executeCheckoutOperationsRequest;

	

	/**
	 * Default Constructor
	 */
	public ExecuteCheckoutOperationsReq (){
	}	

	/**
	 * Getter for executeCheckoutOperationsRequest
	 */
	 public ExecuteCheckoutOperationsRequestType getExecuteCheckoutOperationsRequest() {
	 	return executeCheckoutOperationsRequest;
	 }
	 
	/**
	 * Setter for executeCheckoutOperationsRequest
	 */
	 public void setExecuteCheckoutOperationsRequest(ExecuteCheckoutOperationsRequestType executeCheckoutOperationsRequest) {
	 	this.executeCheckoutOperationsRequest = executeCheckoutOperationsRequest;
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
		if(executeCheckoutOperationsRequest != null) {
			sb.append(executeCheckoutOperationsRequest.toXMLString(null,"ExecuteCheckoutOperationsRequest"));
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