package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.EnterBoardingRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class EnterBoardingReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private EnterBoardingRequestType enterBoardingRequest;

	

	/**
	 * Default Constructor
	 */
	public EnterBoardingReq (){
	}	

	/**
	 * Getter for enterBoardingRequest
	 */
	 public EnterBoardingRequestType getEnterBoardingRequest() {
	 	return enterBoardingRequest;
	 }
	 
	/**
	 * Setter for enterBoardingRequest
	 */
	 public void setEnterBoardingRequest(EnterBoardingRequestType enterBoardingRequest) {
	 	this.enterBoardingRequest = enterBoardingRequest;
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
		if(enterBoardingRequest != null) {
			sb.append(enterBoardingRequest.toXMLString(null,"EnterBoardingRequest"));
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