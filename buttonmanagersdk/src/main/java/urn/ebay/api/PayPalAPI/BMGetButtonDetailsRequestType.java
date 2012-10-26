package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Button ID of button to return.  Required Character length
 * and limitations: 10 single-byte numeric characters  
 */
public class BMGetButtonDetailsRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Button ID of button to return.  Required Character length
	 * and limitations: 10 single-byte numeric characters 	  
	 *@Required	 
	 */ 
	private String hostedButtonID;

	

	/**
	 * Constructor with arguments
	 */
	public BMGetButtonDetailsRequestType (String hostedButtonID){
		this.hostedButtonID = hostedButtonID;
	}	

	/**
	 * Default Constructor
	 */
	public BMGetButtonDetailsRequestType (){
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