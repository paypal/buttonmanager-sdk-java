package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.CreateRecurringPaymentsProfileRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class CreateRecurringPaymentsProfileRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	 
	 */ 
	private CreateRecurringPaymentsProfileRequestDetailsType CreateRecurringPaymentsProfileRequestDetails;

	

	/**
	 * Default Constructor
	 */
	public CreateRecurringPaymentsProfileRequestType (){
	}	

	/**
	 * Getter for CreateRecurringPaymentsProfileRequestDetails
	 */
	 public CreateRecurringPaymentsProfileRequestDetailsType getCreateRecurringPaymentsProfileRequestDetails() {
	 	return CreateRecurringPaymentsProfileRequestDetails;
	 }
	 
	/**
	 * Setter for CreateRecurringPaymentsProfileRequestDetails
	 */
	 public void setCreateRecurringPaymentsProfileRequestDetails(CreateRecurringPaymentsProfileRequestDetailsType CreateRecurringPaymentsProfileRequestDetails) {
	 	this.CreateRecurringPaymentsProfileRequestDetails = CreateRecurringPaymentsProfileRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(CreateRecurringPaymentsProfileRequestDetails != null) {
			sb.append("<ebl:CreateRecurringPaymentsProfileRequestDetails>");
			sb.append(CreateRecurringPaymentsProfileRequestDetails.toXMLString());
			sb.append("</ebl:CreateRecurringPaymentsProfileRequestDetails>");
		}
		return sb.toString();
	}

}