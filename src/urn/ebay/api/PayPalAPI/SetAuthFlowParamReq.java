package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetAuthFlowParamRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetAuthFlowParamReq{


	/**
	 * 	 
	 */ 
	private SetAuthFlowParamRequestType SetAuthFlowParamRequest;

	

	/**
	 * Default Constructor
	 */
	public SetAuthFlowParamReq (){
	}	

	/**
	 * Getter for SetAuthFlowParamRequest
	 */
	 public SetAuthFlowParamRequestType getSetAuthFlowParamRequest() {
	 	return SetAuthFlowParamRequest;
	 }
	 
	/**
	 * Setter for SetAuthFlowParamRequest
	 */
	 public void setSetAuthFlowParamRequest(SetAuthFlowParamRequestType SetAuthFlowParamRequest) {
	 	this.SetAuthFlowParamRequest = SetAuthFlowParamRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:SetAuthFlowParamReq>");
		if(SetAuthFlowParamRequest != null) {
			sb.append("<urn:SetAuthFlowParamRequest>");
			sb.append(SetAuthFlowParamRequest.toXMLString());
			sb.append("</urn:SetAuthFlowParamRequest>");
		}
		sb.append("</urn:SetAuthFlowParamReq>");
		return sb.toString();
	}

}