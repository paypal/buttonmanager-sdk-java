package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.DeviceDetailsType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SenderDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private DeviceDetailsType deviceDetails;

	

	/**
	 * Default Constructor
	 */
	public SenderDetailsType (){
	}	

	/**
	 * Getter for deviceDetails
	 */
	 public DeviceDetailsType getDeviceDetails() {
	 	return deviceDetails;
	 }
	 
	/**
	 * Setter for deviceDetails
	 */
	 public void setDeviceDetails(DeviceDetailsType deviceDetails) {
	 	this.deviceDetails = deviceDetails;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(deviceDetails != null) {
			sb.append(deviceDetails.toXMLString(preferredPrefix,"DeviceDetails"));
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}