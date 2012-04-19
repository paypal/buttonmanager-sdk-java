
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.SetAuthFlowParamRequestDetailsType;


/**
 */
public class SetAuthFlowParamRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private SetAuthFlowParamRequestDetailsType SetAuthFlowParamRequestDetails;
	public SetAuthFlowParamRequestDetailsType getSetAuthFlowParamRequestDetails() {
		return SetAuthFlowParamRequestDetails;
	}
	public void setSetAuthFlowParamRequestDetails(SetAuthFlowParamRequestDetailsType value) {
		this.SetAuthFlowParamRequestDetails = value;
	}


	public SetAuthFlowParamRequestType(SetAuthFlowParamRequestDetailsType SetAuthFlowParamRequestDetails) {
		this.SetAuthFlowParamRequestDetails = SetAuthFlowParamRequestDetails;
	}
	public SetAuthFlowParamRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( SetAuthFlowParamRequestDetails != null ) {
			sb.append("<ebl:SetAuthFlowParamRequestDetails>");
			sb.append(SetAuthFlowParamRequestDetails.toXMLString());
			sb.append("</ebl:SetAuthFlowParamRequestDetails>");
		}
		return sb.toString();
	}

}
