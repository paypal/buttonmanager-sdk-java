
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.DoReferenceTransactionRequestType;


/**
 */
public class DoReferenceTransactionReq {

	/**
	 */
	private DoReferenceTransactionRequestType DoReferenceTransactionRequest;
	public DoReferenceTransactionRequestType getDoReferenceTransactionRequest() {
		return DoReferenceTransactionRequest;
	}
	public void setDoReferenceTransactionRequest(DoReferenceTransactionRequestType value) {
		this.DoReferenceTransactionRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:DoReferenceTransactionReq>");
		if( DoReferenceTransactionRequest != null ) {
			sb.append("<urn:DoReferenceTransactionRequest>");
			sb.append(DoReferenceTransactionRequest.toXMLString());
			sb.append("</urn:DoReferenceTransactionRequest>");
		}
sb.append("</urn:DoReferenceTransactionReq>");
		return sb.toString();
	}

}
