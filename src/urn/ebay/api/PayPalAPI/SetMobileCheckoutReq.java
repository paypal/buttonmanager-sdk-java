package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetMobileCheckoutRequestType;

/**
 * No Document Comments
 */
public class SetMobileCheckoutReq{


	/**
	 * No Document Comments	 
	 */ 
	private SetMobileCheckoutRequestType SetMobileCheckoutRequest;

	

	/**
	 * Default Constructor
	 */
	public SetMobileCheckoutReq (){
	}	

	/**
	 * Getter for SetMobileCheckoutRequest
	 */
	 public SetMobileCheckoutRequestType getSetMobileCheckoutRequest() {
	 	return SetMobileCheckoutRequest;
	 }
	 
	/**
	 * Setter for SetMobileCheckoutRequest
	 */
	 public void setSetMobileCheckoutRequest(SetMobileCheckoutRequestType SetMobileCheckoutRequest) {
	 	this.SetMobileCheckoutRequest = SetMobileCheckoutRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:SetMobileCheckoutReq>");
		if(SetMobileCheckoutRequest != null) {
			sb.append("<urn:SetMobileCheckoutRequest>");
			sb.append(SetMobileCheckoutRequest.toXMLString());
			sb.append("</urn:SetMobileCheckoutRequest>");
		}
		sb.append("</urn:SetMobileCheckoutReq>");
		return sb.toString();
	}

}