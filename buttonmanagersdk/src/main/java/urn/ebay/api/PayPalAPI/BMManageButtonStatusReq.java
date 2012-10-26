package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMManageButtonStatusReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BMManageButtonStatusRequestType bMManageButtonStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public BMManageButtonStatusReq (){
	}	

	/**
	 * Getter for bMManageButtonStatusRequest
	 */
	 public BMManageButtonStatusRequestType getBMManageButtonStatusRequest() {
	 	return bMManageButtonStatusRequest;
	 }
	 
	/**
	 * Setter for bMManageButtonStatusRequest
	 */
	 public void setBMManageButtonStatusRequest(BMManageButtonStatusRequestType bMManageButtonStatusRequest) {
	 	this.bMManageButtonStatusRequest = bMManageButtonStatusRequest;
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
		if(bMManageButtonStatusRequest != null) {
			sb.append(bMManageButtonStatusRequest.toXMLString(null,"BMManageButtonStatusRequest"));
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