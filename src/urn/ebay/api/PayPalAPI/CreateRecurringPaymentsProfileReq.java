
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.CreateRecurringPaymentsProfileRequestType;


/**
 */
public class CreateRecurringPaymentsProfileReq {

	/**
	 */
	private CreateRecurringPaymentsProfileRequestType CreateRecurringPaymentsProfileRequest;
	public CreateRecurringPaymentsProfileRequestType getCreateRecurringPaymentsProfileRequest() {
		return CreateRecurringPaymentsProfileRequest;
	}
	public void setCreateRecurringPaymentsProfileRequest(CreateRecurringPaymentsProfileRequestType value) {
		this.CreateRecurringPaymentsProfileRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:CreateRecurringPaymentsProfileReq>");
		if( CreateRecurringPaymentsProfileRequest != null ) {
			sb.append("<urn:CreateRecurringPaymentsProfileRequest>");
			sb.append(CreateRecurringPaymentsProfileRequest.toXMLString());
			sb.append("</urn:CreateRecurringPaymentsProfileRequest>");
		}
sb.append("</urn:CreateRecurringPaymentsProfileReq>");
		return sb.toString();
	}

}
