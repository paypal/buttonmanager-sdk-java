
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.EnterBoardingRequestDetailsType;


/**
 */
public class EnterBoardingRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private EnterBoardingRequestDetailsType EnterBoardingRequestDetails;
	public EnterBoardingRequestDetailsType getEnterBoardingRequestDetails() {
		return EnterBoardingRequestDetails;
	}
	public void setEnterBoardingRequestDetails(EnterBoardingRequestDetailsType value) {
		this.EnterBoardingRequestDetails = value;
	}


	public EnterBoardingRequestType(EnterBoardingRequestDetailsType EnterBoardingRequestDetails) {
		this.EnterBoardingRequestDetails = EnterBoardingRequestDetails;
	}
	public EnterBoardingRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( EnterBoardingRequestDetails != null ) {
			sb.append("<ebl:EnterBoardingRequestDetails>");
			sb.append(EnterBoardingRequestDetails.toXMLString());
			sb.append("</ebl:EnterBoardingRequestDetails>");
		}
		return sb.toString();
	}

}
