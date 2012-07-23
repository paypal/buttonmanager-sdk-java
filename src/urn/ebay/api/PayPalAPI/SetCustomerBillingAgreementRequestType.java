package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetCustomerBillingAgreementRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class SetCustomerBillingAgreementRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private SetCustomerBillingAgreementRequestDetailsType SetCustomerBillingAgreementRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetCustomerBillingAgreementRequestType (SetCustomerBillingAgreementRequestDetailsType SetCustomerBillingAgreementRequestDetails){
		this.SetCustomerBillingAgreementRequestDetails = SetCustomerBillingAgreementRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetCustomerBillingAgreementRequestType (){
	}	

	/**
	 * Getter for SetCustomerBillingAgreementRequestDetails
	 */
	 public SetCustomerBillingAgreementRequestDetailsType getSetCustomerBillingAgreementRequestDetails() {
	 	return SetCustomerBillingAgreementRequestDetails;
	 }
	 
	/**
	 * Setter for SetCustomerBillingAgreementRequestDetails
	 */
	 public void setSetCustomerBillingAgreementRequestDetails(SetCustomerBillingAgreementRequestDetailsType SetCustomerBillingAgreementRequestDetails) {
	 	this.SetCustomerBillingAgreementRequestDetails = SetCustomerBillingAgreementRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(SetCustomerBillingAgreementRequestDetails != null) {
			sb.append("<ebl:SetCustomerBillingAgreementRequestDetails>");
			sb.append(SetCustomerBillingAgreementRequestDetails.toXMLString());
			sb.append("</ebl:SetCustomerBillingAgreementRequestDetails>");
		}
		return sb.toString();
	}

}