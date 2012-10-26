package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMGetButtonDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BMGetButtonDetailsRequestType bMGetButtonDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public BMGetButtonDetailsReq (){
	}	

	/**
	 * Getter for bMGetButtonDetailsRequest
	 */
	 public BMGetButtonDetailsRequestType getBMGetButtonDetailsRequest() {
	 	return bMGetButtonDetailsRequest;
	 }
	 
	/**
	 * Setter for bMGetButtonDetailsRequest
	 */
	 public void setBMGetButtonDetailsRequest(BMGetButtonDetailsRequestType bMGetButtonDetailsRequest) {
	 	this.bMGetButtonDetailsRequest = bMGetButtonDetailsRequest;
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
		if(bMGetButtonDetailsRequest != null) {
			sb.append(bMGetButtonDetailsRequest.toXMLString(null,"BMGetButtonDetailsRequest"));
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