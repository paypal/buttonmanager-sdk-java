package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.DeviceDetailsType;

/**
 * No Document Comments
 */
public class SenderDetailsType{


	/**
	 * No Document Comments	 
	 */ 
	private DeviceDetailsType DeviceDetails;

	

	/**
	 * Default Constructor
	 */
	public SenderDetailsType (){
	}	

	/**
	 * Getter for DeviceDetails
	 */
	 public DeviceDetailsType getDeviceDetails() {
	 	return DeviceDetails;
	 }
	 
	/**
	 * Setter for DeviceDetails
	 */
	 public void setDeviceDetails(DeviceDetailsType DeviceDetails) {
	 	this.DeviceDetails = DeviceDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(DeviceDetails != null) {
			sb.append("<ebl:DeviceDetails>");
			sb.append(DeviceDetails.toXMLString());
			sb.append("</ebl:DeviceDetails>");
		}
		return sb.toString();
	}

}