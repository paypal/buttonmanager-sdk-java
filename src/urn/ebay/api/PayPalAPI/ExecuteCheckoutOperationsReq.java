
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.ExecuteCheckoutOperationsRequestType;


/**
 */
public class ExecuteCheckoutOperationsReq {

	/**
	 */
	private ExecuteCheckoutOperationsRequestType ExecuteCheckoutOperationsRequest;
	public ExecuteCheckoutOperationsRequestType getExecuteCheckoutOperationsRequest() {
		return ExecuteCheckoutOperationsRequest;
	}
	public void setExecuteCheckoutOperationsRequest(ExecuteCheckoutOperationsRequestType value) {
		this.ExecuteCheckoutOperationsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:ExecuteCheckoutOperationsReq>");
		if( ExecuteCheckoutOperationsRequest != null ) {
			sb.append("<urn:ExecuteCheckoutOperationsRequest>");
			sb.append(ExecuteCheckoutOperationsRequest.toXMLString());
			sb.append("</urn:ExecuteCheckoutOperationsRequest>");
		}
sb.append("</urn:ExecuteCheckoutOperationsReq>");
		return sb.toString();
	}

}
