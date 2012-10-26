package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoReauthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoReauthorizationReq{


	/**
	 * 	 
	 */ 
	private DoReauthorizationRequestType DoReauthorizationRequest;

	

	/**
	 * Default Constructor
	 */
	public DoReauthorizationReq (){
	}	

	/**
	 * Getter for DoReauthorizationRequest
	 */
	 public DoReauthorizationRequestType getDoReauthorizationRequest() {
	 	return DoReauthorizationRequest;
	 }
	 
	/**
	 * Setter for DoReauthorizationRequest
	 */
	 public void setDoReauthorizationRequest(DoReauthorizationRequestType DoReauthorizationRequest) {
	 	this.DoReauthorizationRequest = DoReauthorizationRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoReauthorizationReq>");
		if(DoReauthorizationRequest != null) {
			sb.append("<urn:DoReauthorizationRequest>");
			sb.append(DoReauthorizationRequest.toXMLString());
			sb.append("</urn:DoReauthorizationRequest>");
		}
		sb.append("</urn:DoReauthorizationReq>");
		return sb.toString();
	}


}