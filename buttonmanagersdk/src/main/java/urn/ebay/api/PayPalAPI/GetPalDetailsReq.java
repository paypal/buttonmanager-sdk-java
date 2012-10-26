package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetPalDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetPalDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetPalDetailsRequestType getPalDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetPalDetailsReq (){
	}	

	/**
	 * Getter for getPalDetailsRequest
	 */
	 public GetPalDetailsRequestType getGetPalDetailsRequest() {
	 	return getPalDetailsRequest;
	 }
	 
	/**
	 * Setter for getPalDetailsRequest
	 */
	 public void setGetPalDetailsRequest(GetPalDetailsRequestType getPalDetailsRequest) {
	 	this.getPalDetailsRequest = getPalDetailsRequest;
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
		if(getPalDetailsRequest != null) {
			sb.append(getPalDetailsRequest.toXMLString(null,"GetPalDetailsRequest"));
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