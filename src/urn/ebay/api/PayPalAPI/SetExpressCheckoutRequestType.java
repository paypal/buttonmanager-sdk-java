
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.SetExpressCheckoutRequestDetailsType;


/**
 */
public class SetExpressCheckoutRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private SetExpressCheckoutRequestDetailsType SetExpressCheckoutRequestDetails;
	public SetExpressCheckoutRequestDetailsType getSetExpressCheckoutRequestDetails() {
		return SetExpressCheckoutRequestDetails;
	}
	public void setSetExpressCheckoutRequestDetails(SetExpressCheckoutRequestDetailsType value) {
		this.SetExpressCheckoutRequestDetails = value;
	}


	public SetExpressCheckoutRequestType(SetExpressCheckoutRequestDetailsType SetExpressCheckoutRequestDetails) {
		this.SetExpressCheckoutRequestDetails = SetExpressCheckoutRequestDetails;
	}
	public SetExpressCheckoutRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( SetExpressCheckoutRequestDetails != null ) {
			sb.append("<ebl:SetExpressCheckoutRequestDetails>");
			sb.append(SetExpressCheckoutRequestDetails.toXMLString());
			sb.append("</ebl:SetExpressCheckoutRequestDetails>");
		}
		return sb.toString();
	}

}
