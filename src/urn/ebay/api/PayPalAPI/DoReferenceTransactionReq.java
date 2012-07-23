package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoReferenceTransactionRequestType;

/**
 * No Document Comments
 */
public class DoReferenceTransactionReq{


	/**
	 * No Document Comments	 
	 */ 
	private DoReferenceTransactionRequestType DoReferenceTransactionRequest;

	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionReq (){
	}	

	/**
	 * Getter for DoReferenceTransactionRequest
	 */
	 public DoReferenceTransactionRequestType getDoReferenceTransactionRequest() {
	 	return DoReferenceTransactionRequest;
	 }
	 
	/**
	 * Setter for DoReferenceTransactionRequest
	 */
	 public void setDoReferenceTransactionRequest(DoReferenceTransactionRequestType DoReferenceTransactionRequest) {
	 	this.DoReferenceTransactionRequest = DoReferenceTransactionRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoReferenceTransactionReq>");
		if(DoReferenceTransactionRequest != null) {
			sb.append("<urn:DoReferenceTransactionRequest>");
			sb.append(DoReferenceTransactionRequest.toXMLString());
			sb.append("</urn:DoReferenceTransactionRequest>");
		}
		sb.append("</urn:DoReferenceTransactionReq>");
		return sb.toString();
	}

}