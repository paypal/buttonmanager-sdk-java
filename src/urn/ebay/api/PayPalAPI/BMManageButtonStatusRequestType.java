
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ButtonStatusType;


/**
 * Button ID of Hosted button.
 * Required
 * Character length and limitations: 10 single-byte numeric characters
 */
public class BMManageButtonStatusRequestType extends AbstractRequestType{

	/**
	 * Button ID of Hosted button.
	 * Required
	 * Character length and limitations: 10 single-byte numeric characters
	 */
	private String HostedButtonID;
	public String getHostedButtonID() {
		return HostedButtonID;
	}
	public void setHostedButtonID(String value) {
		this.HostedButtonID = value;
	}

	/**
	 * Requested Status change for hosted button.
	 * Required
	 * Character length and limitations: 1 single-byte alphanumeric characters
	 */
	private ButtonStatusType ButtonStatus;
	public ButtonStatusType getButtonStatus() {
		return ButtonStatus;
	}
	public void setButtonStatus(ButtonStatusType value) {
		this.ButtonStatus = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( HostedButtonID != null ) {
			sb.append("<urn:HostedButtonID>").append(HostedButtonID);
			sb.append("</urn:HostedButtonID>");
		}
		if( ButtonStatus != null ) {
			sb.append("<urn:ButtonStatus>").append( ButtonStatus.getValue());
			sb.append("</urn:ButtonStatus>");
		}
		return sb.toString();
	}

}
