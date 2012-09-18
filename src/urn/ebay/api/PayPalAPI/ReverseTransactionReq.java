package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ReverseTransactionRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ReverseTransactionReq{


	/**
	 * 	 
	 */ 
	private ReverseTransactionRequestType ReverseTransactionRequest;

	

	/**
	 * Default Constructor
	 */
	public ReverseTransactionReq (){
	}	

	/**
	 * Getter for ReverseTransactionRequest
	 */
	 public ReverseTransactionRequestType getReverseTransactionRequest() {
	 	return ReverseTransactionRequest;
	 }
	 
	/**
	 * Setter for ReverseTransactionRequest
	 */
	 public void setReverseTransactionRequest(ReverseTransactionRequestType ReverseTransactionRequest) {
	 	this.ReverseTransactionRequest = ReverseTransactionRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:ReverseTransactionReq>");
		if(ReverseTransactionRequest != null) {
			sb.append("<urn:ReverseTransactionRequest>");
			sb.append(ReverseTransactionRequest.toXMLString());
			sb.append("</urn:ReverseTransactionRequest>");
		}
		sb.append("</urn:ReverseTransactionReq>");
		return sb.toString();
	}

}