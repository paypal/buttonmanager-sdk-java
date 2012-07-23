package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BAUpdateRequestType;

/**
 * No Document Comments
 */
public class BillAgreementUpdateReq{


	/**
	 * No Document Comments	 
	 */ 
	private BAUpdateRequestType BAUpdateRequest;

	

	/**
	 * Default Constructor
	 */
	public BillAgreementUpdateReq (){
	}	

	/**
	 * Getter for BAUpdateRequest
	 */
	 public BAUpdateRequestType getBAUpdateRequest() {
	 	return BAUpdateRequest;
	 }
	 
	/**
	 * Setter for BAUpdateRequest
	 */
	 public void setBAUpdateRequest(BAUpdateRequestType BAUpdateRequest) {
	 	this.BAUpdateRequest = BAUpdateRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BillAgreementUpdateReq>");
		if(BAUpdateRequest != null) {
			sb.append("<urn:BAUpdateRequest>");
			sb.append(BAUpdateRequest.toXMLString());
			sb.append("</urn:BAUpdateRequest>");
		}
		sb.append("</urn:BillAgreementUpdateReq>");
		return sb.toString();
	}

}