package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMGetInventoryRequestType;

/**
 * No Document Comments
 */
public class BMGetInventoryReq{


	/**
	 * No Document Comments	 
	 */ 
	private BMGetInventoryRequestType BMGetInventoryRequest;

	

	/**
	 * Default Constructor
	 */
	public BMGetInventoryReq (){
	}	

	/**
	 * Getter for BMGetInventoryRequest
	 */
	 public BMGetInventoryRequestType getBMGetInventoryRequest() {
	 	return BMGetInventoryRequest;
	 }
	 
	/**
	 * Setter for BMGetInventoryRequest
	 */
	 public void setBMGetInventoryRequest(BMGetInventoryRequestType BMGetInventoryRequest) {
	 	this.BMGetInventoryRequest = BMGetInventoryRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BMGetInventoryReq>");
		if(BMGetInventoryRequest != null) {
			sb.append("<urn:BMGetInventoryRequest>");
			sb.append(BMGetInventoryRequest.toXMLString());
			sb.append("</urn:BMGetInventoryRequest>");
		}
		sb.append("</urn:BMGetInventoryReq>");
		return sb.toString();
	}

}