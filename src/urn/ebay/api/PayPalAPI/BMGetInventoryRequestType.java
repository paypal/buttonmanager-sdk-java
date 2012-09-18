package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Hosted Button ID of the button to return inventory for. 
 * Required Character length and limitations: 10 single-byte
 * numeric characters  
 */
public class BMGetInventoryRequestType extends AbstractRequestType {


	/**
	 * Hosted Button ID of the button to return inventory for. 
	 * Required Character length and limitations: 10 single-byte
	 * numeric characters 	  
	 *@Required	 
	 */ 
	private String HostedButtonID;

	

	/**
	 * Constructor with arguments
	 */
	public BMGetInventoryRequestType (String HostedButtonID){
		this.HostedButtonID = HostedButtonID;
	}	

	/**
	 * Default Constructor
	 */
	public BMGetInventoryRequestType (){
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
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(HostedButtonID != null) {
			sb.append("<urn:HostedButtonID>").append(SDKUtil.escapeInvalidXmlCharsRegex(HostedButtonID));
			sb.append("</urn:HostedButtonID>");
		}
		return sb.toString();
	}

}