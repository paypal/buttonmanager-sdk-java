package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.InitiateRecoupRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class InitiateRecoupReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private InitiateRecoupRequestType initiateRecoupRequest;

	

	/**
	 * Default Constructor
	 */
	public InitiateRecoupReq (){
	}	

	/**
	 * Getter for initiateRecoupRequest
	 */
	 public InitiateRecoupRequestType getInitiateRecoupRequest() {
	 	return initiateRecoupRequest;
	 }
	 
	/**
	 * Setter for initiateRecoupRequest
	 */
	 public void setInitiateRecoupRequest(InitiateRecoupRequestType initiateRecoupRequest) {
	 	this.initiateRecoupRequest = initiateRecoupRequest;
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
		if(initiateRecoupRequest != null) {
			sb.append(initiateRecoupRequest.toXMLString(null,"InitiateRecoupRequest"));
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