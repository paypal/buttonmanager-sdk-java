
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 * Button ID of button to return.
 * Required
 * Character length and limitations: 10 single-byte numeric characters
 */
public class BMGetButtonDetailsRequestType extends AbstractRequestType{

	/**
	 * Button ID of button to return.
	 * Required
	 * Character length and limitations: 10 single-byte numeric characters
	 *
	 * @Required
	 */
	private String HostedButtonID;
	public String getHostedButtonID() {
		return HostedButtonID;
	}
	public void setHostedButtonID(String value) {
		this.HostedButtonID = value;
	}


	public BMGetButtonDetailsRequestType(String HostedButtonID) {
		this.HostedButtonID = HostedButtonID;
	}
	public BMGetButtonDetailsRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( HostedButtonID != null ) {
			sb.append("<urn:HostedButtonID>").append(HostedButtonID);
			sb.append("</urn:HostedButtonID>");
		}
		return sb.toString();
	}

}
