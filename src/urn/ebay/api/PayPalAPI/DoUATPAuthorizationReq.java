package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoUATPAuthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoUATPAuthorizationReq{


	/**
	 * 	 
	 */ 
	private DoUATPAuthorizationRequestType DoUATPAuthorizationRequest;

	

	/**
	 * Default Constructor
	 */
	public DoUATPAuthorizationReq (){
	}	

	/**
	 * Getter for DoUATPAuthorizationRequest
	 */
	 public DoUATPAuthorizationRequestType getDoUATPAuthorizationRequest() {
	 	return DoUATPAuthorizationRequest;
	 }
	 
	/**
	 * Setter for DoUATPAuthorizationRequest
	 */
	 public void setDoUATPAuthorizationRequest(DoUATPAuthorizationRequestType DoUATPAuthorizationRequest) {
	 	this.DoUATPAuthorizationRequest = DoUATPAuthorizationRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoUATPAuthorizationReq>");
		if(DoUATPAuthorizationRequest != null) {
			sb.append("<urn:DoUATPAuthorizationRequest>");
			sb.append(DoUATPAuthorizationRequest.toXMLString());
			sb.append("</urn:DoUATPAuthorizationRequest>");
		}
		sb.append("</urn:DoUATPAuthorizationReq>");
		return sb.toString();
	}


}