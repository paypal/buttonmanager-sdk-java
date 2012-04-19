
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.SetCustomerBillingAgreementRequestType;


/**
 */
public class SetCustomerBillingAgreementReq {

	/**
	 */
	private SetCustomerBillingAgreementRequestType SetCustomerBillingAgreementRequest;
	public SetCustomerBillingAgreementRequestType getSetCustomerBillingAgreementRequest() {
		return SetCustomerBillingAgreementRequest;
	}
	public void setSetCustomerBillingAgreementRequest(SetCustomerBillingAgreementRequestType value) {
		this.SetCustomerBillingAgreementRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:SetCustomerBillingAgreementReq>");
		if( SetCustomerBillingAgreementRequest != null ) {
			sb.append("<urn:SetCustomerBillingAgreementRequest>");
			sb.append(SetCustomerBillingAgreementRequest.toXMLString());
			sb.append("</urn:SetCustomerBillingAgreementRequest>");
		}
sb.append("</urn:SetCustomerBillingAgreementReq>");
		return sb.toString();
	}

}
