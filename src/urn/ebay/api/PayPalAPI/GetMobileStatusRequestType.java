
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.GetMobileStatusRequestDetailsType;


/**
 */
public class GetMobileStatusRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private GetMobileStatusRequestDetailsType GetMobileStatusRequestDetails;
	public GetMobileStatusRequestDetailsType getGetMobileStatusRequestDetails() {
		return GetMobileStatusRequestDetails;
	}
	public void setGetMobileStatusRequestDetails(GetMobileStatusRequestDetailsType value) {
		this.GetMobileStatusRequestDetails = value;
	}


	public GetMobileStatusRequestType(GetMobileStatusRequestDetailsType GetMobileStatusRequestDetails) {
		this.GetMobileStatusRequestDetails = GetMobileStatusRequestDetails;
	}
	public GetMobileStatusRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( GetMobileStatusRequestDetails != null ) {
			sb.append("<ebl:GetMobileStatusRequestDetails>");
			sb.append(GetMobileStatusRequestDetails.toXMLString());
			sb.append("</ebl:GetMobileStatusRequestDetails>");
		}
		return sb.toString();
	}

}
