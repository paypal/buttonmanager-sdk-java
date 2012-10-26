package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetAuthDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetAuthDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetAuthDetailsRequestType getAuthDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetAuthDetailsReq (){
	}	

	/**
	 * Getter for getAuthDetailsRequest
	 */
	 public GetAuthDetailsRequestType getGetAuthDetailsRequest() {
	 	return getAuthDetailsRequest;
	 }
	 
	/**
	 * Setter for getAuthDetailsRequest
	 */
	 public void setGetAuthDetailsRequest(GetAuthDetailsRequestType getAuthDetailsRequest) {
	 	this.getAuthDetailsRequest = getAuthDetailsRequest;
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
		if(getAuthDetailsRequest != null) {
			sb.append(getAuthDetailsRequest.toXMLString(null,"GetAuthDetailsRequest"));
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