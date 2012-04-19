
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.TransactionSearchRequestType;


/**
 */
public class TransactionSearchReq {

	/**
	 */
	private TransactionSearchRequestType TransactionSearchRequest;
	public TransactionSearchRequestType getTransactionSearchRequest() {
		return TransactionSearchRequest;
	}
	public void setTransactionSearchRequest(TransactionSearchRequestType value) {
		this.TransactionSearchRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:TransactionSearchReq>");
		if( TransactionSearchRequest != null ) {
			sb.append("<urn:TransactionSearchRequest>");
			sb.append(TransactionSearchRequest.toXMLString());
			sb.append("</urn:TransactionSearchRequest>");
		}
sb.append("</urn:TransactionSearchReq>");
		return sb.toString();
	}

}
