
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ExecuteCheckoutOperationsRequestDetailsType;


/**
 */
public class ExecuteCheckoutOperationsRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private ExecuteCheckoutOperationsRequestDetailsType ExecuteCheckoutOperationsRequestDetails;
	public ExecuteCheckoutOperationsRequestDetailsType getExecuteCheckoutOperationsRequestDetails() {
		return ExecuteCheckoutOperationsRequestDetails;
	}
	public void setExecuteCheckoutOperationsRequestDetails(ExecuteCheckoutOperationsRequestDetailsType value) {
		this.ExecuteCheckoutOperationsRequestDetails = value;
	}


	public ExecuteCheckoutOperationsRequestType(ExecuteCheckoutOperationsRequestDetailsType ExecuteCheckoutOperationsRequestDetails) {
		this.ExecuteCheckoutOperationsRequestDetails = ExecuteCheckoutOperationsRequestDetails;
	}
	public ExecuteCheckoutOperationsRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( ExecuteCheckoutOperationsRequestDetails != null ) {
			sb.append("<ebl:ExecuteCheckoutOperationsRequestDetails>");
			sb.append(ExecuteCheckoutOperationsRequestDetails.toXMLString());
			sb.append("</ebl:ExecuteCheckoutOperationsRequestDetails>");
		}
		return sb.toString();
	}

}
