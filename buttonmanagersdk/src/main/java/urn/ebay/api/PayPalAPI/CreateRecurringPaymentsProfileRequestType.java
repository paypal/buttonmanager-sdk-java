package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.CreateRecurringPaymentsProfileRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateRecurringPaymentsProfileRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private CreateRecurringPaymentsProfileRequestDetailsType createRecurringPaymentsProfileRequestDetails;

	

	/**
	 * Default Constructor
	 */
	public CreateRecurringPaymentsProfileRequestType (){
	}	

	/**
	 * Getter for createRecurringPaymentsProfileRequestDetails
	 */
	 public CreateRecurringPaymentsProfileRequestDetailsType getCreateRecurringPaymentsProfileRequestDetails() {
	 	return createRecurringPaymentsProfileRequestDetails;
	 }
	 
	/**
	 * Setter for createRecurringPaymentsProfileRequestDetails
	 */
	 public void setCreateRecurringPaymentsProfileRequestDetails(CreateRecurringPaymentsProfileRequestDetailsType createRecurringPaymentsProfileRequestDetails) {
	 	this.createRecurringPaymentsProfileRequestDetails = createRecurringPaymentsProfileRequestDetails;
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
		if(createRecurringPaymentsProfileRequestDetails != null) {
			sb.append(createRecurringPaymentsProfileRequestDetails.toXMLString(null,"CreateRecurringPaymentsProfileRequestDetails"));
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