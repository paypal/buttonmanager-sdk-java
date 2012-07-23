package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetExpressCheckoutRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class SetExpressCheckoutRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private SetExpressCheckoutRequestDetailsType SetExpressCheckoutRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetExpressCheckoutRequestType (SetExpressCheckoutRequestDetailsType SetExpressCheckoutRequestDetails){
		this.SetExpressCheckoutRequestDetails = SetExpressCheckoutRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetExpressCheckoutRequestType (){
	}	

	/**
	 * Getter for SetExpressCheckoutRequestDetails
	 */
	 public SetExpressCheckoutRequestDetailsType getSetExpressCheckoutRequestDetails() {
	 	return SetExpressCheckoutRequestDetails;
	 }
	 
	/**
	 * Setter for SetExpressCheckoutRequestDetails
	 */
	 public void setSetExpressCheckoutRequestDetails(SetExpressCheckoutRequestDetailsType SetExpressCheckoutRequestDetails) {
	 	this.SetExpressCheckoutRequestDetails = SetExpressCheckoutRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(SetExpressCheckoutRequestDetails != null) {
			sb.append("<ebl:SetExpressCheckoutRequestDetails>");
			sb.append(SetExpressCheckoutRequestDetails.toXMLString());
			sb.append("</ebl:SetExpressCheckoutRequestDetails>");
		}
		return sb.toString();
	}

}