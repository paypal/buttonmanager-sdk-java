
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.CreateMobilePaymentRequestType;


/**
 */
public class CreateMobilePaymentReq {

	/**
	 */
	private CreateMobilePaymentRequestType CreateMobilePaymentRequest;
	public CreateMobilePaymentRequestType getCreateMobilePaymentRequest() {
		return CreateMobilePaymentRequest;
	}
	public void setCreateMobilePaymentRequest(CreateMobilePaymentRequestType value) {
		this.CreateMobilePaymentRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:CreateMobilePaymentReq>");
		if( CreateMobilePaymentRequest != null ) {
			sb.append("<urn:CreateMobilePaymentRequest>");
			sb.append(CreateMobilePaymentRequest.toXMLString());
			sb.append("</urn:CreateMobilePaymentRequest>");
		}
sb.append("</urn:CreateMobilePaymentReq>");
		return sb.toString();
	}

}
