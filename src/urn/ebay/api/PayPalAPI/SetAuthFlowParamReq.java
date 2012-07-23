package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetAuthFlowParamRequestType;

/**
 * No Document Comments
 */
public class SetAuthFlowParamReq{


	/**
	 * No Document Comments	 
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