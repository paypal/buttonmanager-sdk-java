package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMButtonSearchRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMButtonSearchReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BMButtonSearchRequestType bMButtonSearchRequest;

	

	/**
	 * Default Constructor
	 */
	public BMButtonSearchReq (){
	}	

	/**
	 * Getter for bMButtonSearchRequest
	 */
	 public BMButtonSearchRequestType getBMButtonSearchRequest() {
	 	return bMButtonSearchRequest;
	 }
	 
	/**
	 * Setter for bMButtonSearchRequest
	 */
	 public void setBMButtonSearchRequest(BMButtonSearchRequestType bMButtonSearchRequest) {
	 	this.bMButtonSearchRequest = bMButtonSearchRequest;
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
		if(bMButtonSearchRequest != null) {
			sb.append(bMButtonSearchRequest.toXMLString(null,"BMButtonSearchRequest"));
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