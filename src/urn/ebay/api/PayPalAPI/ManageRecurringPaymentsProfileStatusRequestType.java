
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ManageRecurringPaymentsProfileStatusRequestDetailsType;


/**
 */
public class ManageRecurringPaymentsProfileStatusRequestType extends AbstractRequestType{

	/**
	 */
	private ManageRecurringPaymentsProfileStatusRequestDetailsType ManageRecurringPaymentsProfileStatusRequestDetails;
	public ManageRecurringPaymentsProfileStatusRequestDetailsType getManageRecurringPaymentsProfileStatusRequestDetails() {
		return ManageRecurringPaymentsProfileStatusRequestDetails;
	}
	public void setManageRecurringPaymentsProfileStatusRequestDetails(ManageRecurringPaymentsProfileStatusRequestDetailsType value) {
		this.ManageRecurringPaymentsProfileStatusRequestDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( ManageRecurringPaymentsProfileStatusRequestDetails != null ) {
			sb.append("<ebl:ManageRecurringPaymentsProfileStatusRequestDetails>");
			sb.append(ManageRecurringPaymentsProfileStatusRequestDetails.toXMLString());
			sb.append("</ebl:ManageRecurringPaymentsProfileStatusRequestDetails>");
		}
		return sb.toString();
	}

}
