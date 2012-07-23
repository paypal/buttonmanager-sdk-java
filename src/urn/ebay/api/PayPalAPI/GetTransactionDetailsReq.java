package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetTransactionDetailsRequestType;

/**
 * No Document Comments
 */
public class GetTransactionDetailsReq{


	/**
	 * No Document Comments	 
	 */ 
	private GetTransactionDetailsRequestType GetTransactionDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetTransactionDetailsReq (){
	}	

	/**
	 * Getter for GetTransactionDetailsRequest
	 */
	 public GetTransactionDetailsRequestType getGetTransactionDetailsRequest() {
	 	return GetTransactionDetailsRequest;
	 }
	 
	/**
	 * Setter for GetTransactionDetailsRequest
	 */
	 public void setGetTransactionDetailsRequest(GetTransactionDetailsRequestType GetTransactionDetailsRequest) {
	 	this.GetTransactionDetailsRequest = GetTransactionDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetTransactionDetailsReq>");
		if(GetTransactionDetailsRequest != null) {
			sb.append("<urn:GetTransactionDetailsRequest>");
			sb.append(GetTransactionDetailsRequest.toXMLString());
			sb.append("</urn:GetTransactionDetailsRequest>");
		}
		sb.append("</urn:GetTransactionDetailsReq>");
		return sb.toString();
	}

}