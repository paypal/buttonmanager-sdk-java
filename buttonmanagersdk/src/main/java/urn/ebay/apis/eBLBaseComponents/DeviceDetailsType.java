package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Device ID Optional  Character length and limits: 256
 * single-byte characters DeviceID length morethan 256 is
 * truncated  
 */
public class DeviceDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Device ID Optional  Character length and limits: 256
	 * single-byte characters DeviceID length morethan 256 is
	 * truncated  	 
	 */ 
	private String deviceID;

	

	/**
	 * Default Constructor
	 */
	public DeviceDetailsType (){
	}	

	/**
	 * Getter for deviceID
	 */
	 public String getDeviceID() {
	 	return deviceID;
	 }
	 
	/**
	 * Setter for deviceID
	 */
	 public void setDeviceID(String deviceID) {
	 	this.deviceID = deviceID;
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
		if(deviceID != null) {
			sb.append("<").append(preferredPrefix).append(":DeviceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(deviceID));
			sb.append("</").append(preferredPrefix).append(":DeviceID>");
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