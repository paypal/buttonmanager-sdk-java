package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMCreateButtonRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMCreateButtonReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BMCreateButtonRequestType bMCreateButtonRequest;

	

	/**
	 * Default Constructor
	 */
	public BMCreateButtonReq (){
	}	

	/**
	 * Getter for bMCreateButtonRequest
	 */
	 public BMCreateButtonRequestType getBMCreateButtonRequest() {
	 	return bMCreateButtonRequest;
	 }
	 
	/**
	 * Setter for bMCreateButtonRequest
	 */
	 public void setBMCreateButtonRequest(BMCreateButtonRequestType bMCreateButtonRequest) {
	 	this.bMCreateButtonRequest = bMCreateButtonRequest;
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
		if(bMCreateButtonRequest != null) {
			sb.append(bMCreateButtonRequest.toXMLString(null,"BMCreateButtonRequest"));
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