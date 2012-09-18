package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMManageButtonStatusRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BMManageButtonStatusReq{


	/**
	 * 	 
	 */ 
	private BMManageButtonStatusRequestType BMManageButtonStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public BMManageButtonStatusReq (){
	}	

	/**
	 * Getter for BMManageButtonStatusRequest
	 */
	 public BMManageButtonStatusRequestType getBMManageButtonStatusRequest() {
	 	return BMManageButtonStatusRequest;
	 }
	 
	/**
	 * Setter for BMManageButtonStatusRequest
	 */
	 public void setBMManageButtonStatusRequest(BMManageButtonStatusRequestType BMManageButtonStatusRequest) {
	 	this.BMManageButtonStatusRequest = BMManageButtonStatusRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BMManageButtonStatusReq>");
		if(BMManageButtonStatusRequest != null) {
			sb.append("<urn:BMManageButtonStatusRequest>");
			sb.append(BMManageButtonStatusRequest.toXMLString());
			sb.append("</urn:BMManageButtonStatusRequest>");
		}
		sb.append("</urn:BMManageButtonStatusReq>");
		return sb.toString();
	}

}