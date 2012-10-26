package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMGetInventoryRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMGetInventoryReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BMGetInventoryRequestType bMGetInventoryRequest;

	

	/**
	 * Default Constructor
	 */
	public BMGetInventoryReq (){
	}	

	/**
	 * Getter for bMGetInventoryRequest
	 */
	 public BMGetInventoryRequestType getBMGetInventoryRequest() {
	 	return bMGetInventoryRequest;
	 }
	 
	/**
	 * Setter for bMGetInventoryRequest
	 */
	 public void setBMGetInventoryRequest(BMGetInventoryRequestType bMGetInventoryRequest) {
	 	this.bMGetInventoryRequest = bMGetInventoryRequest;
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
		if(bMGetInventoryRequest != null) {
			sb.append(bMGetInventoryRequest.toXMLString(null,"BMGetInventoryRequest"));
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