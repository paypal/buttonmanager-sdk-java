package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoAuthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoAuthorizationReq{


	/**
	 * 	 
	 */ 
	private DoAuthorizationRequestType DoAuthorizationRequest;

	

	/**
	 * Default Constructor
	 */
	public DoAuthorizationReq (){
	}	

	/**
	 * Getter for DoAuthorizationRequest
	 */
	 public DoAuthorizationRequestType getDoAuthorizationRequest() {
	 	return DoAuthorizationRequest;
	 }
	 
	/**
	 * Setter for DoAuthorizationRequest
	 */
	 public void setDoAuthorizationRequest(DoAuthorizationRequestType DoAuthorizationRequest) {
	 	this.DoAuthorizationRequest = DoAuthorizationRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoAuthorizationReq>");
		if(DoAuthorizationRequest != null) {
			sb.append("<urn:DoAuthorizationRequest>");
			sb.append(DoAuthorizationRequest.toXMLString());
			sb.append("</urn:DoAuthorizationRequest>");
		}
		sb.append("</urn:DoAuthorizationReq>");
		return sb.toString();
	}

}