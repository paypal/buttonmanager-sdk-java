package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ManageRecurringPaymentsProfileStatusRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * 
 */
public class ManageRecurringPaymentsProfileStatusRequestType extends AbstractRequestType {


	/**
	 * 	 
	 */ 
	private ManageRecurringPaymentsProfileStatusRequestDetailsType ManageRecurringPaymentsProfileStatusRequestDetails;

	

	/**
	 * Default Constructor
	 */
	public ManageRecurringPaymentsProfileStatusRequestType (){
	}	

	/**
	 * Getter for ManageRecurringPaymentsProfileStatusRequestDetails
	 */
	 public ManageRecurringPaymentsProfileStatusRequestDetailsType getManageRecurringPaymentsProfileStatusRequestDetails() {
	 	return ManageRecurringPaymentsProfileStatusRequestDetails;
	 }
	 
	/**
	 * Setter for ManageRecurringPaymentsProfileStatusRequestDetails
	 */
	 public void setManageRecurringPaymentsProfileStatusRequestDetails(ManageRecurringPaymentsProfileStatusRequestDetailsType ManageRecurringPaymentsProfileStatusRequestDetails) {
	 	this.ManageRecurringPaymentsProfileStatusRequestDetails = ManageRecurringPaymentsProfileStatusRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(ManageRecurringPaymentsProfileStatusRequestDetails != null) {
			sb.append("<ebl:ManageRecurringPaymentsProfileStatusRequestDetails>");
			sb.append(ManageRecurringPaymentsProfileStatusRequestDetails.toXMLString());
			sb.append("</ebl:ManageRecurringPaymentsProfileStatusRequestDetails>");
		}
		return sb.toString();
	}

}