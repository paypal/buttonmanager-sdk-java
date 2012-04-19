
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.SetMobileCheckoutRequestDetailsType;


/**
 */
public class SetMobileCheckoutRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private SetMobileCheckoutRequestDetailsType SetMobileCheckoutRequestDetails;
	public SetMobileCheckoutRequestDetailsType getSetMobileCheckoutRequestDetails() {
		return SetMobileCheckoutRequestDetails;
	}
	public void setSetMobileCheckoutRequestDetails(SetMobileCheckoutRequestDetailsType value) {
		this.SetMobileCheckoutRequestDetails = value;
	}


	public SetMobileCheckoutRequestType(SetMobileCheckoutRequestDetailsType SetMobileCheckoutRequestDetails) {
		this.SetMobileCheckoutRequestDetails = SetMobileCheckoutRequestDetails;
	}
	public SetMobileCheckoutRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( SetMobileCheckoutRequestDetails != null ) {
			sb.append("<ebl:SetMobileCheckoutRequestDetails>");
			sb.append(SetMobileCheckoutRequestDetails.toXMLString());
			sb.append("</ebl:SetMobileCheckoutRequestDetails>");
		}
		return sb.toString();
	}

}
