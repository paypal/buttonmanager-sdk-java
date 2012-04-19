
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.CreateMobilePaymentRequestDetailsType;


/**
 */
public class CreateMobilePaymentRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private CreateMobilePaymentRequestDetailsType CreateMobilePaymentRequestDetails;
	public CreateMobilePaymentRequestDetailsType getCreateMobilePaymentRequestDetails() {
		return CreateMobilePaymentRequestDetails;
	}
	public void setCreateMobilePaymentRequestDetails(CreateMobilePaymentRequestDetailsType value) {
		this.CreateMobilePaymentRequestDetails = value;
	}


	public CreateMobilePaymentRequestType(CreateMobilePaymentRequestDetailsType CreateMobilePaymentRequestDetails) {
		this.CreateMobilePaymentRequestDetails = CreateMobilePaymentRequestDetails;
	}
	public CreateMobilePaymentRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( CreateMobilePaymentRequestDetails != null ) {
			sb.append("<ebl:CreateMobilePaymentRequestDetails>");
			sb.append(CreateMobilePaymentRequestDetails.toXMLString());
			sb.append("</ebl:CreateMobilePaymentRequestDetails>");
		}
		return sb.toString();
	}

}
