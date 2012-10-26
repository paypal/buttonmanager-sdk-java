package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ButtonStatusType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Button ID of Hosted button.  Required Character length and
 * limitations: 10 single-byte numeric characters  
 */
public class BMManageButtonStatusRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Button ID of Hosted button.  Required Character length and
	 * limitations: 10 single-byte numeric characters 	 
	 */ 
	private String hostedButtonID;

	/**
	 * Requested Status change for hosted button.  Required
	 * Character length and limitations: 1 single-byte alphanumeric
	 * characters 	 
	 */ 
	private ButtonStatusType buttonStatus;

	

	/**
	 * Default Constructor
	 */
	public BMManageButtonStatusRequestType (){
	}	

	/**
	 * Getter for hostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return hostedButtonID;
	 }
	 
	/**
	 * Setter for hostedButtonID
	 */
	 public void setHostedButtonID(String hostedButtonID) {
	 	this.hostedButtonID = hostedButtonID;
	 }
	 
	/**
	 * Getter for buttonStatus
	 */
	 public ButtonStatusType getButtonStatus() {
	 	return buttonStatus;
	 }
	 
	/**
	 * Setter for buttonStatus
	 */
	 public void setButtonStatus(ButtonStatusType buttonStatus) {
	 	this.buttonStatus = buttonStatus;
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
		sb.append(super.toXMLString(prefix, null));
		if(hostedButtonID != null) {
			sb.append("<").append(preferredPrefix).append(":HostedButtonID>").append(SDKUtil.escapeInvalidXmlCharsRegex(hostedButtonID));
			sb.append("</").append(preferredPrefix).append(":HostedButtonID>");
		}
		if(buttonStatus != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonStatus.getValue()));
			sb.append("</").append(preferredPrefix).append(":ButtonStatus>");
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