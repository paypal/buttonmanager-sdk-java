package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetTransactionDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetTransactionDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetTransactionDetailsRequestType getTransactionDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetTransactionDetailsReq (){
	}	

	/**
	 * Getter for getTransactionDetailsRequest
	 */
	 public GetTransactionDetailsRequestType getGetTransactionDetailsRequest() {
	 	return getTransactionDetailsRequest;
	 }
	 
	/**
	 * Setter for getTransactionDetailsRequest
	 */
	 public void setGetTransactionDetailsRequest(GetTransactionDetailsRequestType getTransactionDetailsRequest) {
	 	this.getTransactionDetailsRequest = getTransactionDetailsRequest;
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
		if(getTransactionDetailsRequest != null) {
			sb.append(getTransactionDetailsRequest.toXMLString(null,"GetTransactionDetailsRequest"));
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