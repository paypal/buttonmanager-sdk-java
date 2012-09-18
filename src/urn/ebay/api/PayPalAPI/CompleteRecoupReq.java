package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CompleteRecoupRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CompleteRecoupReq{


	/**
	 * 	 
	 */ 
	private CompleteRecoupRequestType CompleteRecoupRequest;

	

	/**
	 * Default Constructor
	 */
	public CompleteRecoupReq (){
	}	

	/**
	 * Getter for CompleteRecoupRequest
	 */
	 public CompleteRecoupRequestType getCompleteRecoupRequest() {
	 	return CompleteRecoupRequest;
	 }
	 
	/**
	 * Setter for CompleteRecoupRequest
	 */
	 public void setCompleteRecoupRequest(CompleteRecoupRequestType CompleteRecoupRequest) {
	 	this.CompleteRecoupRequest = CompleteRecoupRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:CompleteRecoupReq>");
		if(CompleteRecoupRequest != null) {
			sb.append("<urn:CompleteRecoupRequest>");
			sb.append(CompleteRecoupRequest.toXMLString());
			sb.append("</urn:CompleteRecoupRequest>");
		}
		sb.append("</urn:CompleteRecoupReq>");
		return sb.toString();
	}

}