package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ManageRecurringPaymentsProfileStatusRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ManageRecurringPaymentsProfileStatusReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private ManageRecurringPaymentsProfileStatusRequestType manageRecurringPaymentsProfileStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public ManageRecurringPaymentsProfileStatusReq (){
	}	

	/**
	 * Getter for manageRecurringPaymentsProfileStatusRequest
	 */
	 public ManageRecurringPaymentsProfileStatusRequestType getManageRecurringPaymentsProfileStatusRequest() {
	 	return manageRecurringPaymentsProfileStatusRequest;
	 }
	 
	/**
	 * Setter for manageRecurringPaymentsProfileStatusRequest
	 */
	 public void setManageRecurringPaymentsProfileStatusRequest(ManageRecurringPaymentsProfileStatusRequestType manageRecurringPaymentsProfileStatusRequest) {
	 	this.manageRecurringPaymentsProfileStatusRequest = manageRecurringPaymentsProfileStatusRequest;
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
		if(manageRecurringPaymentsProfileStatusRequest != null) {
			sb.append(manageRecurringPaymentsProfileStatusRequest.toXMLString(null,"ManageRecurringPaymentsProfileStatusRequest"));
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