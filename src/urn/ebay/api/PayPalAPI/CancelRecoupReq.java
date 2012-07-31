package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CancelRecoupRequestType;

/**
 * 
 */
public class CancelRecoupReq{


	/**
	 * 	 
	 */ 
	private CancelRecoupRequestType CancelRecoupRequest;

	

	/**
	 * Default Constructor
	 */
	public CancelRecoupReq (){
	}	

	/**
	 * Getter for CancelRecoupRequest
	 */
	 public CancelRecoupRequestType getCancelRecoupRequest() {
	 	return CancelRecoupRequest;
	 }
	 
	/**
	 * Setter for CancelRecoupRequest
	 */
	 public void setCancelRecoupRequest(CancelRecoupRequestType CancelRecoupRequest) {
	 	this.CancelRecoupRequest = CancelRecoupRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:CancelRecoupReq>");
		if(CancelRecoupRequest != null) {
			sb.append("<urn:CancelRecoupRequest>");
			sb.append(CancelRecoupRequest.toXMLString());
			sb.append("</urn:CancelRecoupRequest>");
		}
		sb.append("</urn:CancelRecoupReq>");
		return sb.toString();
	}

}