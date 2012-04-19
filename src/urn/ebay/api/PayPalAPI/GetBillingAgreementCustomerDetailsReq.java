
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetBillingAgreementCustomerDetailsRequestType;


/**
 */
public class GetBillingAgreementCustomerDetailsReq {

	/**
	 */
	private GetBillingAgreementCustomerDetailsRequestType GetBillingAgreementCustomerDetailsRequest;
	public GetBillingAgreementCustomerDetailsRequestType getGetBillingAgreementCustomerDetailsRequest() {
		return GetBillingAgreementCustomerDetailsRequest;
	}
	public void setGetBillingAgreementCustomerDetailsRequest(GetBillingAgreementCustomerDetailsRequestType value) {
		this.GetBillingAgreementCustomerDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetBillingAgreementCustomerDetailsReq>");
		if( GetBillingAgreementCustomerDetailsRequest != null ) {
			sb.append("<urn:GetBillingAgreementCustomerDetailsRequest>");
			sb.append(GetBillingAgreementCustomerDetailsRequest.toXMLString());
			sb.append("</urn:GetBillingAgreementCustomerDetailsRequest>");
		}
sb.append("</urn:GetBillingAgreementCustomerDetailsReq>");
		return sb.toString();
	}

}
