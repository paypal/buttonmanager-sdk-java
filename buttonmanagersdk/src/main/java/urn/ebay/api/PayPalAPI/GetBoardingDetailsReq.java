package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetBoardingDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetBoardingDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetBoardingDetailsRequestType getBoardingDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetBoardingDetailsReq (){
	}	

	/**
	 * Getter for getBoardingDetailsRequest
	 */
	 public GetBoardingDetailsRequestType getGetBoardingDetailsRequest() {
	 	return getBoardingDetailsRequest;
	 }
	 
	/**
	 * Setter for getBoardingDetailsRequest
	 */
	 public void setGetBoardingDetailsRequest(GetBoardingDetailsRequestType getBoardingDetailsRequest) {
	 	this.getBoardingDetailsRequest = getBoardingDetailsRequest;
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
		if(getBoardingDetailsRequest != null) {
			sb.append(getBoardingDetailsRequest.toXMLString(null,"GetBoardingDetailsRequest"));
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