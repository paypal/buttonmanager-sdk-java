
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.EnterBoardingRequestType;


/**
 */
public class EnterBoardingReq {

	/**
	 */
	private EnterBoardingRequestType EnterBoardingRequest;
	public EnterBoardingRequestType getEnterBoardingRequest() {
		return EnterBoardingRequest;
	}
	public void setEnterBoardingRequest(EnterBoardingRequestType value) {
		this.EnterBoardingRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:EnterBoardingReq>");
		if( EnterBoardingRequest != null ) {
			sb.append("<urn:EnterBoardingRequest>");
			sb.append(EnterBoardingRequest.toXMLString());
			sb.append("</urn:EnterBoardingRequest>");
		}
sb.append("</urn:EnterBoardingReq>");
		return sb.toString();
	}

}
