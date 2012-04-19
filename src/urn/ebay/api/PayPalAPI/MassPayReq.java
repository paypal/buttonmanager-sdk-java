
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.MassPayRequestType;


/**
 */
public class MassPayReq {

	/**
	 */
	private MassPayRequestType MassPayRequest;
	public MassPayRequestType getMassPayRequest() {
		return MassPayRequest;
	}
	public void setMassPayRequest(MassPayRequestType value) {
		this.MassPayRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:MassPayReq>");
		if( MassPayRequest != null ) {
			sb.append("<urn:MassPayRequest>");
			sb.append(MassPayRequest.toXMLString());
			sb.append("</urn:MassPayRequest>");
		}
sb.append("</urn:MassPayReq>");
		return sb.toString();
	}

}
