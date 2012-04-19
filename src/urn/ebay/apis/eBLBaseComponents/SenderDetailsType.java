
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.DeviceDetailsType;


/**
 */
public class SenderDetailsType {

	/**
	 */
	private DeviceDetailsType DeviceDetails;
	public DeviceDetailsType getDeviceDetails() {
		return DeviceDetails;
	}
	public void setDeviceDetails(DeviceDetailsType value) {
		this.DeviceDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( DeviceDetails != null ) {
			sb.append("<ebl:DeviceDetails>");
			sb.append(DeviceDetails.toXMLString());
			sb.append("</ebl:DeviceDetails>");
		}
		return sb.toString();
	}

}
