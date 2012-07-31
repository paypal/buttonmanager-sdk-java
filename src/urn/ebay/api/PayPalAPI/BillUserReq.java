package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BillUserRequestType;

/**
 * 
 */
public class BillUserReq{


	/**
	 * 	 
	 */ 
	private BillUserRequestType BillUserRequest;

	

	/**
	 * Default Constructor
	 */
	public BillUserReq (){
	}	

	/**
	 * Getter for BillUserRequest
	 */
	 public BillUserRequestType getBillUserRequest() {
	 	return BillUserRequest;
	 }
	 
	/**
	 * Setter for BillUserRequest
	 */
	 public void setBillUserRequest(BillUserRequestType BillUserRequest) {
	 	this.BillUserRequest = BillUserRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BillUserReq>");
		if(BillUserRequest != null) {
			sb.append("<urn:BillUserRequest>");
			sb.append(BillUserRequest.toXMLString());
			sb.append("</urn:BillUserRequest>");
		}
		sb.append("</urn:BillUserReq>");
		return sb.toString();
	}

}