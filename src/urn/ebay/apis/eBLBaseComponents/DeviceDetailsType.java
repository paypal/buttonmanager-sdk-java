package urn.ebay.apis.eBLBaseComponents;

/**
 * Device ID Optional  Character length and limits: 256
 * single-byte characters DeviceID length morethan 256 is
 * truncated  
 */
public class DeviceDetailsType{


	/**
	 * Device ID Optional  Character length and limits: 256
	 * single-byte characters DeviceID length morethan 256 is
	 * truncated  	 
	 */ 
	private String DeviceID;

	

	/**
	 * Default Constructor
	 */
	public DeviceDetailsType (){
	}	

	/**
	 * Getter for DeviceID
	 */
	 public String getDeviceID() {
	 	return DeviceID;
	 }
	 
	/**
	 * Setter for DeviceID
	 */
	 public void setDeviceID(String DeviceID) {
	 	this.DeviceID = DeviceID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(DeviceID != null) {
			sb.append("<ebl:DeviceID>").append(DeviceID);
			sb.append("</ebl:DeviceID>");
		}
		return sb.toString();
	}

}