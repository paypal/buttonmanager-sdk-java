
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Device ID Optional
 * Character length and limits: 256 single-byte characters 
 * DeviceID length morethan 256 is truncated
 */
public class DeviceDetailsType {

	/**
Device ID Optional
	 * Character length and limits: 256 single-byte characters 
	 * DeviceID length morethan 256 is truncated
	 */
	private String DeviceID;
	public String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(String value) {
		this.DeviceID = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( DeviceID != null ) {
			sb.append("<ebl:DeviceID>").append(DeviceID);
			sb.append("</ebl:DeviceID>");
		}
		return sb.toString();
	}

}
