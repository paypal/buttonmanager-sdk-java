
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.SetCustomerBillingAgreementRequestDetailsType;


/**
 */
public class SetCustomerBillingAgreementRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private SetCustomerBillingAgreementRequestDetailsType SetCustomerBillingAgreementRequestDetails;
	public SetCustomerBillingAgreementRequestDetailsType getSetCustomerBillingAgreementRequestDetails() {
		return SetCustomerBillingAgreementRequestDetails;
	}
	public void setSetCustomerBillingAgreementRequestDetails(SetCustomerBillingAgreementRequestDetailsType value) {
		this.SetCustomerBillingAgreementRequestDetails = value;
	}


	public SetCustomerBillingAgreementRequestType(SetCustomerBillingAgreementRequestDetailsType SetCustomerBillingAgreementRequestDetails) {
		this.SetCustomerBillingAgreementRequestDetails = SetCustomerBillingAgreementRequestDetails;
	}
	public SetCustomerBillingAgreementRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( SetCustomerBillingAgreementRequestDetails != null ) {
			sb.append("<ebl:SetCustomerBillingAgreementRequestDetails>");
			sb.append(SetCustomerBillingAgreementRequestDetails.toXMLString());
			sb.append("</ebl:SetCustomerBillingAgreementRequestDetails>");
		}
		return sb.toString();
	}

}
