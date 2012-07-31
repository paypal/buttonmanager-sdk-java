package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.InitiateRecoupRequestType;

/**
 * 
 */
public class InitiateRecoupReq{


	/**
	 * 	 
	 */ 
	private InitiateRecoupRequestType InitiateRecoupRequest;

	

	/**
	 * Default Constructor
	 */
	public InitiateRecoupReq (){
	}	

	/**
	 * Getter for InitiateRecoupRequest
	 */
	 public InitiateRecoupRequestType getInitiateRecoupRequest() {
	 	return InitiateRecoupRequest;
	 }
	 
	/**
	 * Setter for InitiateRecoupRequest
	 */
	 public void setInitiateRecoupRequest(InitiateRecoupRequestType InitiateRecoupRequest) {
	 	this.InitiateRecoupRequest = InitiateRecoupRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:InitiateRecoupReq>");
		if(InitiateRecoupRequest != null) {
			sb.append("<urn:InitiateRecoupRequest>");
			sb.append(InitiateRecoupRequest.toXMLString());
			sb.append("</urn:InitiateRecoupRequest>");
		}
		sb.append("</urn:InitiateRecoupReq>");
		return sb.toString();
	}

}