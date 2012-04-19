
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.ReverseTransactionRequestType;


/**
 */
public class ReverseTransactionReq {

	/**
	 */
	private ReverseTransactionRequestType ReverseTransactionRequest;
	public ReverseTransactionRequestType getReverseTransactionRequest() {
		return ReverseTransactionRequest;
	}
	public void setReverseTransactionRequest(ReverseTransactionRequestType value) {
		this.ReverseTransactionRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:ReverseTransactionReq>");
		if( ReverseTransactionRequest != null ) {
			sb.append("<urn:ReverseTransactionRequest>");
			sb.append(ReverseTransactionRequest.toXMLString());
			sb.append("</urn:ReverseTransactionRequest>");
		}
sb.append("</urn:ReverseTransactionReq>");
		return sb.toString();
	}

}
