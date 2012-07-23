package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMUpdateButtonRequestType;

/**
 * No Document Comments
 */
public class BMUpdateButtonReq{


	/**
	 * No Document Comments	 
	 */ 
	private BMUpdateButtonRequestType BMUpdateButtonRequest;

	

	/**
	 * Default Constructor
	 */
	public BMUpdateButtonReq (){
	}	

	/**
	 * Getter for BMUpdateButtonRequest
	 */
	 public BMUpdateButtonRequestType getBMUpdateButtonRequest() {
	 	return BMUpdateButtonRequest;
	 }
	 
	/**
	 * Setter for BMUpdateButtonRequest
	 */
	 public void setBMUpdateButtonRequest(BMUpdateButtonRequestType BMUpdateButtonRequest) {
	 	this.BMUpdateButtonRequest = BMUpdateButtonRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BMUpdateButtonReq>");
		if(BMUpdateButtonRequest != null) {
			sb.append("<urn:BMUpdateButtonRequest>");
			sb.append(BMUpdateButtonRequest.toXMLString());
			sb.append("</urn:BMUpdateButtonRequest>");
		}
		sb.append("</urn:BMUpdateButtonReq>");
		return sb.toString();
	}

}