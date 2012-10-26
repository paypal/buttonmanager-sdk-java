package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetExpressCheckoutRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetExpressCheckoutReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private SetExpressCheckoutRequestType setExpressCheckoutRequest;

	

	/**
	 * Default Constructor
	 */
	public SetExpressCheckoutReq (){
	}	

	/**
	 * Getter for setExpressCheckoutRequest
	 */
	 public SetExpressCheckoutRequestType getSetExpressCheckoutRequest() {
	 	return setExpressCheckoutRequest;
	 }
	 
	/**
	 * Setter for setExpressCheckoutRequest
	 */
	 public void setSetExpressCheckoutRequest(SetExpressCheckoutRequestType setExpressCheckoutRequest) {
	 	this.setExpressCheckoutRequest = setExpressCheckoutRequest;
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
		if(setExpressCheckoutRequest != null) {
			sb.append(setExpressCheckoutRequest.toXMLString(null,"SetExpressCheckoutRequest"));
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