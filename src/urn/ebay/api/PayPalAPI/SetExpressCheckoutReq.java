package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetExpressCheckoutRequestType;

/**
 * 
 */
public class SetExpressCheckoutReq{


	/**
	 * 	 
	 */ 
	private SetExpressCheckoutRequestType SetExpressCheckoutRequest;

	

	/**
	 * Default Constructor
	 */
	public SetExpressCheckoutReq (){
	}	

	/**
	 * Getter for SetExpressCheckoutRequest
	 */
	 public SetExpressCheckoutRequestType getSetExpressCheckoutRequest() {
	 	return SetExpressCheckoutRequest;
	 }
	 
	/**
	 * Setter for SetExpressCheckoutRequest
	 */
	 public void setSetExpressCheckoutRequest(SetExpressCheckoutRequestType SetExpressCheckoutRequest) {
	 	this.SetExpressCheckoutRequest = SetExpressCheckoutRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:SetExpressCheckoutReq>");
		if(SetExpressCheckoutRequest != null) {
			sb.append("<urn:SetExpressCheckoutRequest>");
			sb.append(SetExpressCheckoutRequest.toXMLString());
			sb.append("</urn:SetExpressCheckoutRequest>");
		}
		sb.append("</urn:SetExpressCheckoutReq>");
		return sb.toString();
	}

}