package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.RefundTransactionRequestType;

/**
 * No Document Comments
 */
public class RefundTransactionReq{


	/**
	 * No Document Comments	 
	 */ 
	private RefundTransactionRequestType RefundTransactionRequest;

	

	/**
	 * Default Constructor
	 */
	public RefundTransactionReq (){
	}	

	/**
	 * Getter for RefundTransactionRequest
	 */
	 public RefundTransactionRequestType getRefundTransactionRequest() {
	 	return RefundTransactionRequest;
	 }
	 
	/**
	 * Setter for RefundTransactionRequest
	 */
	 public void setRefundTransactionRequest(RefundTransactionRequestType RefundTransactionRequest) {
	 	this.RefundTransactionRequest = RefundTransactionRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:RefundTransactionReq>");
		if(RefundTransactionRequest != null) {
			sb.append("<urn:RefundTransactionRequest>");
			sb.append(RefundTransactionRequest.toXMLString());
			sb.append("</urn:RefundTransactionRequest>");
		}
		sb.append("</urn:RefundTransactionReq>");
		return sb.toString();
	}

}