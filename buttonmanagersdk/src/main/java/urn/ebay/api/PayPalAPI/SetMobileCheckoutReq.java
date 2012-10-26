package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetMobileCheckoutRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetMobileCheckoutReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private SetMobileCheckoutRequestType setMobileCheckoutRequest;

	

	/**
	 * Default Constructor
	 */
	public SetMobileCheckoutReq (){
	}	

	/**
	 * Getter for setMobileCheckoutRequest
	 */
	 public SetMobileCheckoutRequestType getSetMobileCheckoutRequest() {
	 	return setMobileCheckoutRequest;
	 }
	 
	/**
	 * Setter for setMobileCheckoutRequest
	 */
	 public void setSetMobileCheckoutRequest(SetMobileCheckoutRequestType setMobileCheckoutRequest) {
	 	this.setMobileCheckoutRequest = setMobileCheckoutRequest;
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
		if(setMobileCheckoutRequest != null) {
			sb.append(setMobileCheckoutRequest.toXMLString(null,"SetMobileCheckoutRequest"));
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