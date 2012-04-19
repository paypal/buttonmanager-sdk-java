
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.CreateBillingAgreementRequestType;


/**
 */
public class CreateBillingAgreementReq {

	/**
	 */
	private CreateBillingAgreementRequestType CreateBillingAgreementRequest;
	public CreateBillingAgreementRequestType getCreateBillingAgreementRequest() {
		return CreateBillingAgreementRequest;
	}
	public void setCreateBillingAgreementRequest(CreateBillingAgreementRequestType value) {
		this.CreateBillingAgreementRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:CreateBillingAgreementReq>");
		if( CreateBillingAgreementRequest != null ) {
			sb.append("<urn:CreateBillingAgreementRequest>");
			sb.append(CreateBillingAgreementRequest.toXMLString());
			sb.append("</urn:CreateBillingAgreementRequest>");
		}
sb.append("</urn:CreateBillingAgreementReq>");
		return sb.toString();
	}

}
