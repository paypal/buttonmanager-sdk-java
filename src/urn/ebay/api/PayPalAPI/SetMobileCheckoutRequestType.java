package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetMobileCheckoutRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * 
 */
public class SetMobileCheckoutRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private SetMobileCheckoutRequestDetailsType SetMobileCheckoutRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetMobileCheckoutRequestType (SetMobileCheckoutRequestDetailsType SetMobileCheckoutRequestDetails){
		this.SetMobileCheckoutRequestDetails = SetMobileCheckoutRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetMobileCheckoutRequestType (){
	}	

	/**
	 * Getter for SetMobileCheckoutRequestDetails
	 */
	 public SetMobileCheckoutRequestDetailsType getSetMobileCheckoutRequestDetails() {
	 	return SetMobileCheckoutRequestDetails;
	 }
	 
	/**
	 * Setter for SetMobileCheckoutRequestDetails
	 */
	 public void setSetMobileCheckoutRequestDetails(SetMobileCheckoutRequestDetailsType SetMobileCheckoutRequestDetails) {
	 	this.SetMobileCheckoutRequestDetails = SetMobileCheckoutRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(SetMobileCheckoutRequestDetails != null) {
			sb.append("<ebl:SetMobileCheckoutRequestDetails>");
			sb.append(SetMobileCheckoutRequestDetails.toXMLString());
			sb.append("</ebl:SetMobileCheckoutRequestDetails>");
		}
		return sb.toString();
	}

}