
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BAUpdateRequestType;


/**
 */
public class BillAgreementUpdateReq {

	/**
	 */
	private BAUpdateRequestType BAUpdateRequest;
	public BAUpdateRequestType getBAUpdateRequest() {
		return BAUpdateRequest;
	}
	public void setBAUpdateRequest(BAUpdateRequestType value) {
		this.BAUpdateRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BillAgreementUpdateReq>");
		if( BAUpdateRequest != null ) {
			sb.append("<urn:BAUpdateRequest>");
			sb.append(BAUpdateRequest.toXMLString());
			sb.append("</urn:BAUpdateRequest>");
		}
sb.append("</urn:BillAgreementUpdateReq>");
		return sb.toString();
	}

}
