
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.DoDirectPaymentRequestDetailsType;


/**
 * This flag indicates that the response should include FMFDetails
 */
public class DoDirectPaymentRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private DoDirectPaymentRequestDetailsType DoDirectPaymentRequestDetails;
	public DoDirectPaymentRequestDetailsType getDoDirectPaymentRequestDetails() {
		return DoDirectPaymentRequestDetails;
	}
	public void setDoDirectPaymentRequestDetails(DoDirectPaymentRequestDetailsType value) {
		this.DoDirectPaymentRequestDetails = value;
	}

	/**
This flag indicates that the response should include FMFDetails	 */
	private Integer ReturnFMFDetails;
	public Integer getReturnFMFDetails() {
		return ReturnFMFDetails;
	}
	public void setReturnFMFDetails(Integer value) {
		this.ReturnFMFDetails = value;
	}


	public DoDirectPaymentRequestType(DoDirectPaymentRequestDetailsType DoDirectPaymentRequestDetails) {
		this.DoDirectPaymentRequestDetails = DoDirectPaymentRequestDetails;
	}
	public DoDirectPaymentRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( DoDirectPaymentRequestDetails != null ) {
			sb.append("<ebl:DoDirectPaymentRequestDetails>");
			sb.append(DoDirectPaymentRequestDetails.toXMLString());
			sb.append("</ebl:DoDirectPaymentRequestDetails>");
		}
		if( ReturnFMFDetails != null ) {
			sb.append("<urn:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}
