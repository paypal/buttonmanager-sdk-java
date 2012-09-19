package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetBalanceRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetBalanceReq{


	/**
	 * 	 
	 */ 
	private GetBalanceRequestType GetBalanceRequest;

	

	/**
	 * Default Constructor
	 */
	public GetBalanceReq (){
	}	

	/**
	 * Getter for GetBalanceRequest
	 */
	 public GetBalanceRequestType getGetBalanceRequest() {
	 	return GetBalanceRequest;
	 }
	 
	/**
	 * Setter for GetBalanceRequest
	 */
	 public void setGetBalanceRequest(GetBalanceRequestType GetBalanceRequest) {
	 	this.GetBalanceRequest = GetBalanceRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetBalanceReq>");
		if(GetBalanceRequest != null) {
			sb.append("<urn:GetBalanceRequest>");
			sb.append(GetBalanceRequest.toXMLString());
			sb.append("</urn:GetBalanceRequest>");
		}
		sb.append("</urn:GetBalanceReq>");
		return sb.toString();
	}


}