package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetMobileStatusRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetMobileStatusReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetMobileStatusRequestType getMobileStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public GetMobileStatusReq (){
	}	

	/**
	 * Getter for getMobileStatusRequest
	 */
	 public GetMobileStatusRequestType getGetMobileStatusRequest() {
	 	return getMobileStatusRequest;
	 }
	 
	/**
	 * Setter for getMobileStatusRequest
	 */
	 public void setGetMobileStatusRequest(GetMobileStatusRequestType getMobileStatusRequest) {
	 	this.getMobileStatusRequest = getMobileStatusRequest;
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
		if(getMobileStatusRequest != null) {
			sb.append(getMobileStatusRequest.toXMLString(null,"GetMobileStatusRequest"));
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