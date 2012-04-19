
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoExpressCheckoutPaymentRequestType;


/**
 */
public class DoExpressCheckoutPaymentReq {

	/**
	 */
	private DoExpressCheckoutPaymentRequestType DoExpressCheckoutPaymentRequest;
	public DoExpressCheckoutPaymentRequestType getDoExpressCheckoutPaymentRequest() {
		return DoExpressCheckoutPaymentRequest;
	}
	public void setDoExpressCheckoutPaymentRequest(DoExpressCheckoutPaymentRequestType value) {
		this.DoExpressCheckoutPaymentRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoExpressCheckoutPaymentReq>");
		if( DoExpressCheckoutPaymentRequest != null ) {
			sb.append("<urn:DoExpressCheckoutPaymentRequest>");
			sb.append(DoExpressCheckoutPaymentRequest.toXMLString());
			sb.append("</urn:DoExpressCheckoutPaymentRequest>");
		}
sb.append("</urn:DoExpressCheckoutPaymentReq>");
		return sb.toString();
	}

}
