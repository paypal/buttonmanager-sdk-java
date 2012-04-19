
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoUATPExpressCheckoutPaymentRequestType;


/**
 */
public class DoUATPExpressCheckoutPaymentReq {

	/**
	 */
	private DoUATPExpressCheckoutPaymentRequestType DoUATPExpressCheckoutPaymentRequest;
	public DoUATPExpressCheckoutPaymentRequestType getDoUATPExpressCheckoutPaymentRequest() {
		return DoUATPExpressCheckoutPaymentRequest;
	}
	public void setDoUATPExpressCheckoutPaymentRequest(DoUATPExpressCheckoutPaymentRequestType value) {
		this.DoUATPExpressCheckoutPaymentRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoUATPExpressCheckoutPaymentReq>");
		if( DoUATPExpressCheckoutPaymentRequest != null ) {
			sb.append("<urn:DoUATPExpressCheckoutPaymentRequest>");
			sb.append(DoUATPExpressCheckoutPaymentRequest.toXMLString());
			sb.append("</urn:DoUATPExpressCheckoutPaymentRequest>");
		}
sb.append("</urn:DoUATPExpressCheckoutPaymentReq>");
		return sb.toString();
	}

}
