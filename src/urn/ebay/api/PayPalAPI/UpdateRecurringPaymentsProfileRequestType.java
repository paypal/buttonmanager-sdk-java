package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.UpdateRecurringPaymentsProfileRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class UpdateRecurringPaymentsProfileRequestType extends AbstractRequestType {


	/**
	 * 	 
	 */ 
	private UpdateRecurringPaymentsProfileRequestDetailsType UpdateRecurringPaymentsProfileRequestDetails;

	

	/**
	 * Default Constructor
	 */
	public UpdateRecurringPaymentsProfileRequestType (){
	}	

	/**
	 * Getter for UpdateRecurringPaymentsProfileRequestDetails
	 */
	 public UpdateRecurringPaymentsProfileRequestDetailsType getUpdateRecurringPaymentsProfileRequestDetails() {
	 	return UpdateRecurringPaymentsProfileRequestDetails;
	 }
	 
	/**
	 * Setter for UpdateRecurringPaymentsProfileRequestDetails
	 */
	 public void setUpdateRecurringPaymentsProfileRequestDetails(UpdateRecurringPaymentsProfileRequestDetailsType UpdateRecurringPaymentsProfileRequestDetails) {
	 	this.UpdateRecurringPaymentsProfileRequestDetails = UpdateRecurringPaymentsProfileRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(UpdateRecurringPaymentsProfileRequestDetails != null) {
			sb.append("<ebl:UpdateRecurringPaymentsProfileRequestDetails>");
			sb.append(UpdateRecurringPaymentsProfileRequestDetails.toXMLString());
			sb.append("</ebl:UpdateRecurringPaymentsProfileRequestDetails>");
		}
		return sb.toString();
	}

}