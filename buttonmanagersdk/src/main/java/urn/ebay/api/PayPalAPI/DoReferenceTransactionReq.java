package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoReferenceTransactionRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoReferenceTransactionReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoReferenceTransactionRequestType doReferenceTransactionRequest;

	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionReq (){
	}	

	/**
	 * Getter for doReferenceTransactionRequest
	 */
	 public DoReferenceTransactionRequestType getDoReferenceTransactionRequest() {
	 	return doReferenceTransactionRequest;
	 }
	 
	/**
	 * Setter for doReferenceTransactionRequest
	 */
	 public void setDoReferenceTransactionRequest(DoReferenceTransactionRequestType doReferenceTransactionRequest) {
	 	this.doReferenceTransactionRequest = doReferenceTransactionRequest;
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
		if(doReferenceTransactionRequest != null) {
			sb.append(doReferenceTransactionRequest.toXMLString(null,"DoReferenceTransactionRequest"));
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