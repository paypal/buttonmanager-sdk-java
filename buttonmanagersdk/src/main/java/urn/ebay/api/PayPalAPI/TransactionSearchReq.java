package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.TransactionSearchRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class TransactionSearchReq{


	/**
	 * 	 
	 */ 
	private TransactionSearchRequestType TransactionSearchRequest;

	

	/**
	 * Default Constructor
	 */
	public TransactionSearchReq (){
	}	

	/**
	 * Getter for TransactionSearchRequest
	 */
	 public TransactionSearchRequestType getTransactionSearchRequest() {
	 	return TransactionSearchRequest;
	 }
	 
	/**
	 * Setter for TransactionSearchRequest
	 */
	 public void setTransactionSearchRequest(TransactionSearchRequestType TransactionSearchRequest) {
	 	this.TransactionSearchRequest = TransactionSearchRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:TransactionSearchReq>");
		if(TransactionSearchRequest != null) {
			sb.append("<urn:TransactionSearchRequest>");
			sb.append(TransactionSearchRequest.toXMLString());
			sb.append("</urn:TransactionSearchRequest>");
		}
		sb.append("</urn:TransactionSearchReq>");
		return sb.toString();
	}


}