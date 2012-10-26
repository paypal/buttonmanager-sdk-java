package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMSetInventoryRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMSetInventoryReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BMSetInventoryRequestType bMSetInventoryRequest;

	

	/**
	 * Default Constructor
	 */
	public BMSetInventoryReq (){
	}	

	/**
	 * Getter for bMSetInventoryRequest
	 */
	 public BMSetInventoryRequestType getBMSetInventoryRequest() {
	 	return bMSetInventoryRequest;
	 }
	 
	/**
	 * Setter for bMSetInventoryRequest
	 */
	 public void setBMSetInventoryRequest(BMSetInventoryRequestType bMSetInventoryRequest) {
	 	this.bMSetInventoryRequest = bMSetInventoryRequest;
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
		if(bMSetInventoryRequest != null) {
			sb.append(bMSetInventoryRequest.toXMLString(null,"BMSetInventoryRequest"));
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