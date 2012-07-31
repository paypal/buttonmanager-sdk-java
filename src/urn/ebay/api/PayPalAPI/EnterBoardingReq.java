package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.EnterBoardingRequestType;

/**
 * 
 */
public class EnterBoardingReq{


	/**
	 * 	 
	 */ 
	private EnterBoardingRequestType EnterBoardingRequest;

	

	/**
	 * Default Constructor
	 */
	public EnterBoardingReq (){
	}	

	/**
	 * Getter for EnterBoardingRequest
	 */
	 public EnterBoardingRequestType getEnterBoardingRequest() {
	 	return EnterBoardingRequest;
	 }
	 
	/**
	 * Setter for EnterBoardingRequest
	 */
	 public void setEnterBoardingRequest(EnterBoardingRequestType EnterBoardingRequest) {
	 	this.EnterBoardingRequest = EnterBoardingRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:EnterBoardingReq>");
		if(EnterBoardingRequest != null) {
			sb.append("<urn:EnterBoardingRequest>");
			sb.append(EnterBoardingRequest.toXMLString());
			sb.append("</urn:EnterBoardingRequest>");
		}
		sb.append("</urn:EnterBoardingReq>");
		return sb.toString();
	}

}