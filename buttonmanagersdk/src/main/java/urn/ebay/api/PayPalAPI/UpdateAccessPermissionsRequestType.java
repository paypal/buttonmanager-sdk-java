package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Unique PayPal customer account number, the value of which
 * was returned by GetAuthDetails Response. Required Character
 * length and limitations: 20 single-byte characters 
 */
public class UpdateAccessPermissionsRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Unique PayPal customer account number, the value of which
	 * was returned by GetAuthDetails Response. Required Character
	 * length and limitations: 20 single-byte characters 	  
	 *@Required	 
	 */ 
	private String payerID;

	

	/**
	 * Constructor with arguments
	 */
	public UpdateAccessPermissionsRequestType (String payerID){
		this.payerID = payerID;
	}	

	/**
	 * Default Constructor
	 */
	public UpdateAccessPermissionsRequestType (){
	}	

	/**
	 * Getter for payerID
	 */
	 public String getPayerID() {
	 	return payerID;
	 }
	 
	/**
	 * Setter for payerID
	 */
	 public void setPayerID(String payerID) {
	 	this.payerID = payerID;
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
		if(payerID != null) {
			sb.append("<").append(preferredPrefix).append(":PayerID>").append(SDKUtil.escapeInvalidXmlCharsRegex(payerID));
			sb.append("</").append(preferredPrefix).append(":PayerID>");
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