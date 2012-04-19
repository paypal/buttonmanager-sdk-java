
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.CreateRecurringPaymentsProfileRequestDetailsType;


/**
 */
public class CreateRecurringPaymentsProfileRequestType extends AbstractRequestType{

	/**
	 */
	private CreateRecurringPaymentsProfileRequestDetailsType CreateRecurringPaymentsProfileRequestDetails;
	public CreateRecurringPaymentsProfileRequestDetailsType getCreateRecurringPaymentsProfileRequestDetails() {
		return CreateRecurringPaymentsProfileRequestDetails;
	}
	public void setCreateRecurringPaymentsProfileRequestDetails(CreateRecurringPaymentsProfileRequestDetailsType value) {
		this.CreateRecurringPaymentsProfileRequestDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( CreateRecurringPaymentsProfileRequestDetails != null ) {
			sb.append("<ebl:CreateRecurringPaymentsProfileRequestDetails>");
			sb.append(CreateRecurringPaymentsProfileRequestDetails.toXMLString());
			sb.append("</ebl:CreateRecurringPaymentsProfileRequestDetails>");
		}
		return sb.toString();
	}

}
