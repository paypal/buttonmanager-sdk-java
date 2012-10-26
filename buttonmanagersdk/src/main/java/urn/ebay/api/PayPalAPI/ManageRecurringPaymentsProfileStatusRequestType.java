package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ManageRecurringPaymentsProfileStatusRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ManageRecurringPaymentsProfileStatusRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private ManageRecurringPaymentsProfileStatusRequestDetailsType manageRecurringPaymentsProfileStatusRequestDetails;

	

	/**
	 * Default Constructor
	 */
	public ManageRecurringPaymentsProfileStatusRequestType (){
	}	

	/**
	 * Getter for manageRecurringPaymentsProfileStatusRequestDetails
	 */
	 public ManageRecurringPaymentsProfileStatusRequestDetailsType getManageRecurringPaymentsProfileStatusRequestDetails() {
	 	return manageRecurringPaymentsProfileStatusRequestDetails;
	 }
	 
	/**
	 * Setter for manageRecurringPaymentsProfileStatusRequestDetails
	 */
	 public void setManageRecurringPaymentsProfileStatusRequestDetails(ManageRecurringPaymentsProfileStatusRequestDetailsType manageRecurringPaymentsProfileStatusRequestDetails) {
	 	this.manageRecurringPaymentsProfileStatusRequestDetails = manageRecurringPaymentsProfileStatusRequestDetails;
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
		if(manageRecurringPaymentsProfileStatusRequestDetails != null) {
			sb.append(manageRecurringPaymentsProfileStatusRequestDetails.toXMLString(null,"ManageRecurringPaymentsProfileStatusRequestDetails"));
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