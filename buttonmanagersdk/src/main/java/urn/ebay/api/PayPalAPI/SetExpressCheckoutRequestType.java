package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetExpressCheckoutRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetExpressCheckoutRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private SetExpressCheckoutRequestDetailsType setExpressCheckoutRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetExpressCheckoutRequestType (SetExpressCheckoutRequestDetailsType setExpressCheckoutRequestDetails){
		this.setExpressCheckoutRequestDetails = setExpressCheckoutRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetExpressCheckoutRequestType (){
	}	

	/**
	 * Getter for setExpressCheckoutRequestDetails
	 */
	 public SetExpressCheckoutRequestDetailsType getSetExpressCheckoutRequestDetails() {
	 	return setExpressCheckoutRequestDetails;
	 }
	 
	/**
	 * Setter for setExpressCheckoutRequestDetails
	 */
	 public void setSetExpressCheckoutRequestDetails(SetExpressCheckoutRequestDetailsType setExpressCheckoutRequestDetails) {
	 	this.setExpressCheckoutRequestDetails = setExpressCheckoutRequestDetails;
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
		if(setExpressCheckoutRequestDetails != null) {
			sb.append(setExpressCheckoutRequestDetails.toXMLString(null,"SetExpressCheckoutRequestDetails"));
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