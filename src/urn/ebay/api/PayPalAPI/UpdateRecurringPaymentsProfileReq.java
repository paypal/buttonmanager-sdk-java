
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.UpdateRecurringPaymentsProfileRequestType;


/**
 */
public class UpdateRecurringPaymentsProfileReq {

	/**
	 */
	private UpdateRecurringPaymentsProfileRequestType UpdateRecurringPaymentsProfileRequest;
	public UpdateRecurringPaymentsProfileRequestType getUpdateRecurringPaymentsProfileRequest() {
		return UpdateRecurringPaymentsProfileRequest;
	}
	public void setUpdateRecurringPaymentsProfileRequest(UpdateRecurringPaymentsProfileRequestType value) {
		this.UpdateRecurringPaymentsProfileRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:UpdateRecurringPaymentsProfileReq>");
		if( UpdateRecurringPaymentsProfileRequest != null ) {
			sb.append("<urn:UpdateRecurringPaymentsProfileRequest>");
			sb.append(UpdateRecurringPaymentsProfileRequest.toXMLString());
			sb.append("</urn:UpdateRecurringPaymentsProfileRequest>");
		}
sb.append("</urn:UpdateRecurringPaymentsProfileReq>");
		return sb.toString();
	}

}
