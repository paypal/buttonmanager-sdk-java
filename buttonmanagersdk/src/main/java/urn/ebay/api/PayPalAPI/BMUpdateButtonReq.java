package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMUpdateButtonRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMUpdateButtonReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BMUpdateButtonRequestType bMUpdateButtonRequest;

	

	/**
	 * Default Constructor
	 */
	public BMUpdateButtonReq (){
	}	

	/**
	 * Getter for bMUpdateButtonRequest
	 */
	 public BMUpdateButtonRequestType getBMUpdateButtonRequest() {
	 	return bMUpdateButtonRequest;
	 }
	 
	/**
	 * Setter for bMUpdateButtonRequest
	 */
	 public void setBMUpdateButtonRequest(BMUpdateButtonRequestType bMUpdateButtonRequest) {
	 	this.bMUpdateButtonRequest = bMUpdateButtonRequest;
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
		if(bMUpdateButtonRequest != null) {
			sb.append(bMUpdateButtonRequest.toXMLString(null,"BMUpdateButtonRequest"));
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