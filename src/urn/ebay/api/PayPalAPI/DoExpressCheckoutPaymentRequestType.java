
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.DoExpressCheckoutPaymentRequestDetailsType;


/**
 * This flag indicates that the response should include FMFDetails
 */
public class DoExpressCheckoutPaymentRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private DoExpressCheckoutPaymentRequestDetailsType DoExpressCheckoutPaymentRequestDetails;
	public DoExpressCheckoutPaymentRequestDetailsType getDoExpressCheckoutPaymentRequestDetails() {
		return DoExpressCheckoutPaymentRequestDetails;
	}
	public void setDoExpressCheckoutPaymentRequestDetails(DoExpressCheckoutPaymentRequestDetailsType value) {
		this.DoExpressCheckoutPaymentRequestDetails = value;
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


	public DoExpressCheckoutPaymentRequestType(DoExpressCheckoutPaymentRequestDetailsType DoExpressCheckoutPaymentRequestDetails) {
		this.DoExpressCheckoutPaymentRequestDetails = DoExpressCheckoutPaymentRequestDetails;
	}
	public DoExpressCheckoutPaymentRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( DoExpressCheckoutPaymentRequestDetails != null ) {
			sb.append("<ebl:DoExpressCheckoutPaymentRequestDetails>");
			sb.append(DoExpressCheckoutPaymentRequestDetails.toXMLString());
			sb.append("</ebl:DoExpressCheckoutPaymentRequestDetails>");
		}
		if( ReturnFMFDetails != null ) {
			sb.append("<urn:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}
