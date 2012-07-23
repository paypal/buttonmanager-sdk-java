package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BMButtonSearchRequestType;

/**
 * No Document Comments
 */
public class BMButtonSearchReq{


	/**
	 * No Document Comments	 
	 */ 
	private BMButtonSearchRequestType BMButtonSearchRequest;

	

	/**
	 * Default Constructor
	 */
	public BMButtonSearchReq (){
	}	

	/**
	 * Getter for BMButtonSearchRequest
	 */
	 public BMButtonSearchRequestType getBMButtonSearchRequest() {
	 	return BMButtonSearchRequest;
	 }
	 
	/**
	 * Setter for BMButtonSearchRequest
	 */
	 public void setBMButtonSearchRequest(BMButtonSearchRequestType BMButtonSearchRequest) {
	 	this.BMButtonSearchRequest = BMButtonSearchRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BMButtonSearchReq>");
		if(BMButtonSearchRequest != null) {
			sb.append("<urn:BMButtonSearchRequest>");
			sb.append(BMButtonSearchRequest.toXMLString());
			sb.append("</urn:BMButtonSearchRequest>");
		}
		sb.append("</urn:BMButtonSearchReq>");
		return sb.toString();
	}

}