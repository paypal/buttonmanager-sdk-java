
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.UpdateRecurringPaymentsProfileRequestDetailsType;


/**
 */
public class UpdateRecurringPaymentsProfileRequestType extends AbstractRequestType{

	/**
	 */
	private UpdateRecurringPaymentsProfileRequestDetailsType UpdateRecurringPaymentsProfileRequestDetails;
	public UpdateRecurringPaymentsProfileRequestDetailsType getUpdateRecurringPaymentsProfileRequestDetails() {
		return UpdateRecurringPaymentsProfileRequestDetails;
	}
	public void setUpdateRecurringPaymentsProfileRequestDetails(UpdateRecurringPaymentsProfileRequestDetailsType value) {
		this.UpdateRecurringPaymentsProfileRequestDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( UpdateRecurringPaymentsProfileRequestDetails != null ) {
			sb.append("<ebl:UpdateRecurringPaymentsProfileRequestDetails>");
			sb.append(UpdateRecurringPaymentsProfileRequestDetails.toXMLString());
			sb.append("</ebl:UpdateRecurringPaymentsProfileRequestDetails>");
		}
		return sb.toString();
	}

}
