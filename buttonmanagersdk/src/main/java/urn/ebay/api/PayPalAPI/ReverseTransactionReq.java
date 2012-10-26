package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ReverseTransactionRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ReverseTransactionReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private ReverseTransactionRequestType reverseTransactionRequest;

	

	/**
	 * Default Constructor
	 */
	public ReverseTransactionReq (){
	}	

	/**
	 * Getter for reverseTransactionRequest
	 */
	 public ReverseTransactionRequestType getReverseTransactionRequest() {
	 	return reverseTransactionRequest;
	 }
	 
	/**
	 * Setter for reverseTransactionRequest
	 */
	 public void setReverseTransactionRequest(ReverseTransactionRequestType reverseTransactionRequest) {
	 	this.reverseTransactionRequest = reverseTransactionRequest;
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
		if(reverseTransactionRequest != null) {
			sb.append(reverseTransactionRequest.toXMLString(null,"ReverseTransactionRequest"));
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