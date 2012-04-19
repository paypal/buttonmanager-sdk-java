
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoDirectPaymentRequestType;


/**
 */
public class DoDirectPaymentReq {

	/**
	 */
	private DoDirectPaymentRequestType DoDirectPaymentRequest;
	public DoDirectPaymentRequestType getDoDirectPaymentRequest() {
		return DoDirectPaymentRequest;
	}
	public void setDoDirectPaymentRequest(DoDirectPaymentRequestType value) {
		this.DoDirectPaymentRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoDirectPaymentReq>");
		if( DoDirectPaymentRequest != null ) {
			sb.append("<urn:DoDirectPaymentRequest>");
			sb.append(DoDirectPaymentRequest.toXMLString());
			sb.append("</urn:DoDirectPaymentRequest>");
		}
sb.append("</urn:DoDirectPaymentReq>");
		return sb.toString();
	}

}
