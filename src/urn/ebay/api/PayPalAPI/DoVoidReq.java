package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoVoidRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoVoidReq{


	/**
	 * 	 
	 */ 
	private DoVoidRequestType DoVoidRequest;

	

	/**
	 * Default Constructor
	 */
	public DoVoidReq (){
	}	

	/**
	 * Getter for DoVoidRequest
	 */
	 public DoVoidRequestType getDoVoidRequest() {
	 	return DoVoidRequest;
	 }
	 
	/**
	 * Setter for DoVoidRequest
	 */
	 public void setDoVoidRequest(DoVoidRequestType DoVoidRequest) {
	 	this.DoVoidRequest = DoVoidRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoVoidReq>");
		if(DoVoidRequest != null) {
			sb.append("<urn:DoVoidRequest>");
			sb.append(DoVoidRequest.toXMLString());
			sb.append("</urn:DoVoidRequest>");
		}
		sb.append("</urn:DoVoidReq>");
		return sb.toString();
	}


}