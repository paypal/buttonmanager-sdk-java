package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ButtonStatusType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Button ID of Hosted button.  Required Character length and
 * limitations: 10 single-byte numeric characters  
 */
public class BMManageButtonStatusRequestType extends AbstractRequestType {


	/**
	 * Button ID of Hosted button.  Required Character length and
	 * limitations: 10 single-byte numeric characters 	 
	 */ 
	private String HostedButtonID;

	/**
	 * Requested Status change for hosted button.  Required
	 * Character length and limitations: 1 single-byte alphanumeric
	 * characters 	 
	 */ 
	private ButtonStatusType ButtonStatus;

	

	/**
	 * Default Constructor
	 */
	public BMManageButtonStatusRequestType (){
	}	

	/**
	 * Getter for HostedButtonID
	 */
	 public String getHostedButtonID() {
	 	return HostedButtonID;
	 }
	 
	/**
	 * Setter for HostedButtonID
	 */
	 public void setHostedButtonID(String HostedButtonID) {
	 	this.HostedButtonID = HostedButtonID;
	 }
	 
	/**
	 * Getter for ButtonStatus
	 */
	 public ButtonStatusType getButtonStatus() {
	 	return ButtonStatus;
	 }
	 
	/**
	 * Setter for ButtonStatus
	 */
	 public void setButtonStatus(ButtonStatusType ButtonStatus) {
	 	this.ButtonStatus = ButtonStatus;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(HostedButtonID != null) {
			sb.append("<urn:HostedButtonID>").append(SDKUtil.escapeInvalidXmlCharsRegex(HostedButtonID));
			sb.append("</urn:HostedButtonID>");
		}
		if(ButtonStatus != null) {
			sb.append("<urn:ButtonStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(ButtonStatus.getValue()));
			sb.append("</urn:ButtonStatus>");
		}
		return sb.toString();
	}


}