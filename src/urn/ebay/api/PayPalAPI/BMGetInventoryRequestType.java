
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 * Hosted Button ID of the button to return inventory for.
 * Required
 * Character length and limitations: 10 single-byte numeric characters
 */
public class BMGetInventoryRequestType extends AbstractRequestType{

	/**
	 * Hosted Button ID of the button to return inventory for.
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


	public BMGetInventoryRequestType(String HostedButtonID) {
		this.HostedButtonID = HostedButtonID;
	}
	public BMGetInventoryRequestType() {
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
