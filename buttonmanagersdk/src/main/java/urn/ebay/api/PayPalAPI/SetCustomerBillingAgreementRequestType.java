package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetCustomerBillingAgreementRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetCustomerBillingAgreementRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private SetCustomerBillingAgreementRequestDetailsType setCustomerBillingAgreementRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetCustomerBillingAgreementRequestType (SetCustomerBillingAgreementRequestDetailsType setCustomerBillingAgreementRequestDetails){
		this.setCustomerBillingAgreementRequestDetails = setCustomerBillingAgreementRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetCustomerBillingAgreementRequestType (){
	}	

	/**
	 * Getter for setCustomerBillingAgreementRequestDetails
	 */
	 public SetCustomerBillingAgreementRequestDetailsType getSetCustomerBillingAgreementRequestDetails() {
	 	return setCustomerBillingAgreementRequestDetails;
	 }
	 
	/**
	 * Setter for setCustomerBillingAgreementRequestDetails
	 */
	 public void setSetCustomerBillingAgreementRequestDetails(SetCustomerBillingAgreementRequestDetailsType setCustomerBillingAgreementRequestDetails) {
	 	this.setCustomerBillingAgreementRequestDetails = setCustomerBillingAgreementRequestDetails;
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
		if(setCustomerBillingAgreementRequestDetails != null) {
			sb.append(setCustomerBillingAgreementRequestDetails.toXMLString(null,"SetCustomerBillingAgreementRequestDetails"));
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