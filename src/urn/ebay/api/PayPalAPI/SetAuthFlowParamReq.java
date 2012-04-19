
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.SetAuthFlowParamRequestType;


/**
 */
public class SetAuthFlowParamReq {

	/**
	 */
	private SetAuthFlowParamRequestType SetAuthFlowParamRequest;
	public SetAuthFlowParamRequestType getSetAuthFlowParamRequest() {
		return SetAuthFlowParamRequest;
	}
	public void setSetAuthFlowParamRequest(SetAuthFlowParamRequestType value) {
		this.SetAuthFlowParamRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:SetAuthFlowParamReq>");
		if( SetAuthFlowParamRequest != null ) {
			sb.append("<urn:SetAuthFlowParamRequest>");
			sb.append(SetAuthFlowParamRequest.toXMLString());
			sb.append("</urn:SetAuthFlowParamRequest>");
		}
sb.append("</urn:SetAuthFlowParamReq>");
		return sb.toString();
	}

}
