package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMCreateButtonRequestType;

/**
 * 
 */
public class BMCreateButtonReq{


	/**
	 * 	 
	 */ 
	private BMCreateButtonRequestType BMCreateButtonRequest;

	

	/**
	 * Default Constructor
	 */
	public BMCreateButtonReq (){
	}	

	/**
	 * Getter for BMCreateButtonRequest
	 */
	 public BMCreateButtonRequestType getBMCreateButtonRequest() {
	 	return BMCreateButtonRequest;
	 }
	 
	/**
	 * Setter for BMCreateButtonRequest
	 */
	 public void setBMCreateButtonRequest(BMCreateButtonRequestType BMCreateButtonRequest) {
	 	this.BMCreateButtonRequest = BMCreateButtonRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BMCreateButtonReq>");
		if(BMCreateButtonRequest != null) {
			sb.append("<urn:BMCreateButtonRequest>");
			sb.append(BMCreateButtonRequest.toXMLString());
			sb.append("</urn:BMCreateButtonRequest>");
		}
		sb.append("</urn:BMCreateButtonReq>");
		return sb.toString();
	}

}