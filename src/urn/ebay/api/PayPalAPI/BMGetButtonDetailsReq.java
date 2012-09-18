package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMGetButtonDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMGetButtonDetailsReq{


	/**
	 * 	 
	 */ 
	private BMGetButtonDetailsRequestType BMGetButtonDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public BMGetButtonDetailsReq (){
	}	

	/**
	 * Getter for BMGetButtonDetailsRequest
	 */
	 public BMGetButtonDetailsRequestType getBMGetButtonDetailsRequest() {
	 	return BMGetButtonDetailsRequest;
	 }
	 
	/**
	 * Setter for BMGetButtonDetailsRequest
	 */
	 public void setBMGetButtonDetailsRequest(BMGetButtonDetailsRequestType BMGetButtonDetailsRequest) {
	 	this.BMGetButtonDetailsRequest = BMGetButtonDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BMGetButtonDetailsReq>");
		if(BMGetButtonDetailsRequest != null) {
			sb.append("<urn:BMGetButtonDetailsRequest>");
			sb.append(BMGetButtonDetailsRequest.toXMLString());
			sb.append("</urn:BMGetButtonDetailsRequest>");
		}
		sb.append("</urn:BMGetButtonDetailsReq>");
		return sb.toString();
	}

}