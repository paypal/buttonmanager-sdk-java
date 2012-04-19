
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.RefundTransactionRequestType;


/**
 */
public class RefundTransactionReq {

	/**
	 */
	private RefundTransactionRequestType RefundTransactionRequest;
	public RefundTransactionRequestType getRefundTransactionRequest() {
		return RefundTransactionRequest;
	}
	public void setRefundTransactionRequest(RefundTransactionRequestType value) {
		this.RefundTransactionRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:RefundTransactionReq>");
		if( RefundTransactionRequest != null ) {
			sb.append("<urn:RefundTransactionRequest>");
			sb.append(RefundTransactionRequest.toXMLString());
			sb.append("</urn:RefundTransactionRequest>");
		}
sb.append("</urn:RefundTransactionReq>");
		return sb.toString();
	}

}
