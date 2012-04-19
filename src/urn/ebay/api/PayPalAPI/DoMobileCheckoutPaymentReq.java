
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoMobileCheckoutPaymentRequestType;


/**
 */
public class DoMobileCheckoutPaymentReq {

	/**
	 */
	private DoMobileCheckoutPaymentRequestType DoMobileCheckoutPaymentRequest;
	public DoMobileCheckoutPaymentRequestType getDoMobileCheckoutPaymentRequest() {
		return DoMobileCheckoutPaymentRequest;
	}
	public void setDoMobileCheckoutPaymentRequest(DoMobileCheckoutPaymentRequestType value) {
		this.DoMobileCheckoutPaymentRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoMobileCheckoutPaymentReq>");
		if( DoMobileCheckoutPaymentRequest != null ) {
			sb.append("<urn:DoMobileCheckoutPaymentRequest>");
			sb.append(DoMobileCheckoutPaymentRequest.toXMLString());
			sb.append("</urn:DoMobileCheckoutPaymentRequest>");
		}
sb.append("</urn:DoMobileCheckoutPaymentReq>");
		return sb.toString();
	}

}
