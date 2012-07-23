package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMSetInventoryRequestType;

/**
 * No Document Comments
 */
public class BMSetInventoryReq{


	/**
	 * No Document Comments	 
	 */ 
	private BMSetInventoryRequestType BMSetInventoryRequest;

	

	/**
	 * Default Constructor
	 */
	public BMSetInventoryReq (){
	}	

	/**
	 * Getter for BMSetInventoryRequest
	 */
	 public BMSetInventoryRequestType getBMSetInventoryRequest() {
	 	return BMSetInventoryRequest;
	 }
	 
	/**
	 * Setter for BMSetInventoryRequest
	 */
	 public void setBMSetInventoryRequest(BMSetInventoryRequestType BMSetInventoryRequest) {
	 	this.BMSetInventoryRequest = BMSetInventoryRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BMSetInventoryReq>");
		if(BMSetInventoryRequest != null) {
			sb.append("<urn:BMSetInventoryRequest>");
			sb.append(BMSetInventoryRequest.toXMLString());
			sb.append("</urn:BMSetInventoryRequest>");
		}
		sb.append("</urn:BMSetInventoryReq>");
		return sb.toString();
	}

}