package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * Button ID of button to return.  Required Character length
 * and limitations: 10 single-byte numeric characters  
 */
public class BMGetButtonDetailsRequestType extends AbstractRequestType {


	/**
	 * Button ID of button to return.  Required Character length
	 * and limitations: 10 single-byte numeric characters 	  
	 *@Required	 
	 */ 
	private String HostedButtonID;

	

	/**
	 * Constructor with arguments
	 */
	public BMGetButtonDetailsRequestType (String HostedButtonID){
		this.HostedButtonID = HostedButtonID;
	}	

	/**
	 * Default Constructor
	 */
	public BMGetButtonDetailsRequestType (){
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
			sb.append("<urn:HostedButtonID>").append(HostedButtonID);
			sb.append("</urn:HostedButtonID>");
		}
		return sb.toString();
	}

}