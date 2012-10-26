package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetMobileCheckoutRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetMobileCheckoutRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private SetMobileCheckoutRequestDetailsType setMobileCheckoutRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetMobileCheckoutRequestType (SetMobileCheckoutRequestDetailsType setMobileCheckoutRequestDetails){
		this.setMobileCheckoutRequestDetails = setMobileCheckoutRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetMobileCheckoutRequestType (){
	}	

	/**
	 * Getter for setMobileCheckoutRequestDetails
	 */
	 public SetMobileCheckoutRequestDetailsType getSetMobileCheckoutRequestDetails() {
	 	return setMobileCheckoutRequestDetails;
	 }
	 
	/**
	 * Setter for setMobileCheckoutRequestDetails
	 */
	 public void setSetMobileCheckoutRequestDetails(SetMobileCheckoutRequestDetailsType setMobileCheckoutRequestDetails) {
	 	this.setMobileCheckoutRequestDetails = setMobileCheckoutRequestDetails;
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
		if(setMobileCheckoutRequestDetails != null) {
			sb.append(setMobileCheckoutRequestDetails.toXMLString(null,"SetMobileCheckoutRequestDetails"));
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