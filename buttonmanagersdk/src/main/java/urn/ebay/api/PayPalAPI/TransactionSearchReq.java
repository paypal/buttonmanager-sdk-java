package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.TransactionSearchRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class TransactionSearchReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private TransactionSearchRequestType transactionSearchRequest;

	

	/**
	 * Default Constructor
	 */
	public TransactionSearchReq (){
	}	

	/**
	 * Getter for transactionSearchRequest
	 */
	 public TransactionSearchRequestType getTransactionSearchRequest() {
	 	return transactionSearchRequest;
	 }
	 
	/**
	 * Setter for transactionSearchRequest
	 */
	 public void setTransactionSearchRequest(TransactionSearchRequestType transactionSearchRequest) {
	 	this.transactionSearchRequest = transactionSearchRequest;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(transactionSearchRequest != null) {
			sb.append(transactionSearchRequest.toXMLString(null,"TransactionSearchRequest"));
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}