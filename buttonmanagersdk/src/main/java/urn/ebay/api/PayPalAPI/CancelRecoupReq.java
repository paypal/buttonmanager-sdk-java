package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CancelRecoupRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CancelRecoupReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private CancelRecoupRequestType cancelRecoupRequest;

	

	/**
	 * Default Constructor
	 */
	public CancelRecoupReq (){
	}	

	/**
	 * Getter for cancelRecoupRequest
	 */
	 public CancelRecoupRequestType getCancelRecoupRequest() {
	 	return cancelRecoupRequest;
	 }
	 
	/**
	 * Setter for cancelRecoupRequest
	 */
	 public void setCancelRecoupRequest(CancelRecoupRequestType cancelRecoupRequest) {
	 	this.cancelRecoupRequest = cancelRecoupRequest;
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
		if(cancelRecoupRequest != null) {
			sb.append(cancelRecoupRequest.toXMLString(null,"CancelRecoupRequest"));
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