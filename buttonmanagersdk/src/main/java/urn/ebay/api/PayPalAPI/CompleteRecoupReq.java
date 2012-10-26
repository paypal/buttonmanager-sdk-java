package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CompleteRecoupRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CompleteRecoupReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private CompleteRecoupRequestType completeRecoupRequest;

	

	/**
	 * Default Constructor
	 */
	public CompleteRecoupReq (){
	}	

	/**
	 * Getter for completeRecoupRequest
	 */
	 public CompleteRecoupRequestType getCompleteRecoupRequest() {
	 	return completeRecoupRequest;
	 }
	 
	/**
	 * Setter for completeRecoupRequest
	 */
	 public void setCompleteRecoupRequest(CompleteRecoupRequestType completeRecoupRequest) {
	 	this.completeRecoupRequest = completeRecoupRequest;
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
		if(completeRecoupRequest != null) {
			sb.append(completeRecoupRequest.toXMLString(null,"CompleteRecoupRequest"));
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