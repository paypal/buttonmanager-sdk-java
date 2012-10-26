package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.RefundTransactionRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class RefundTransactionReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private RefundTransactionRequestType refundTransactionRequest;

	

	/**
	 * Default Constructor
	 */
	public RefundTransactionReq (){
	}	

	/**
	 * Getter for refundTransactionRequest
	 */
	 public RefundTransactionRequestType getRefundTransactionRequest() {
	 	return refundTransactionRequest;
	 }
	 
	/**
	 * Setter for refundTransactionRequest
	 */
	 public void setRefundTransactionRequest(RefundTransactionRequestType refundTransactionRequest) {
	 	this.refundTransactionRequest = refundTransactionRequest;
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
		if(refundTransactionRequest != null) {
			sb.append(refundTransactionRequest.toXMLString(null,"RefundTransactionRequest"));
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