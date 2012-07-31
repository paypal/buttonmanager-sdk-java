package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoCancelRequestType;

/**
 * 
 */
public class DoCancelReq{


	/**
	 * 	 
	 */ 
	private DoCancelRequestType DoCancelRequest;

	

	/**
	 * Default Constructor
	 */
	public DoCancelReq (){
	}	

	/**
	 * Getter for DoCancelRequest
	 */
	 public DoCancelRequestType getDoCancelRequest() {
	 	return DoCancelRequest;
	 }
	 
	/**
	 * Setter for DoCancelRequest
	 */
	 public void setDoCancelRequest(DoCancelRequestType DoCancelRequest) {
	 	this.DoCancelRequest = DoCancelRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoCancelReq>");
		if(DoCancelRequest != null) {
			sb.append("<urn:DoCancelRequest>");
			sb.append(DoCancelRequest.toXMLString());
			sb.append("</urn:DoCancelRequest>");
		}
		sb.append("</urn:DoCancelReq>");
		return sb.toString();
	}

}