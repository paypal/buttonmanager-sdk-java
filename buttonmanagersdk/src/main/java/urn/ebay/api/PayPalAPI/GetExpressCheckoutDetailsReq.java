package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetExpressCheckoutDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetExpressCheckoutDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetExpressCheckoutDetailsRequestType getExpressCheckoutDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetExpressCheckoutDetailsReq (){
	}	

	/**
	 * Getter for getExpressCheckoutDetailsRequest
	 */
	 public GetExpressCheckoutDetailsRequestType getGetExpressCheckoutDetailsRequest() {
	 	return getExpressCheckoutDetailsRequest;
	 }
	 
	/**
	 * Setter for getExpressCheckoutDetailsRequest
	 */
	 public void setGetExpressCheckoutDetailsRequest(GetExpressCheckoutDetailsRequestType getExpressCheckoutDetailsRequest) {
	 	this.getExpressCheckoutDetailsRequest = getExpressCheckoutDetailsRequest;
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
		if(getExpressCheckoutDetailsRequest != null) {
			sb.append(getExpressCheckoutDetailsRequest.toXMLString(null,"GetExpressCheckoutDetailsRequest"));
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