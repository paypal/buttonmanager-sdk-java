package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ManageRecurringPaymentsProfileStatusRequestType;

/**
 * No Document Comments
 */
public class ManageRecurringPaymentsProfileStatusReq{


	/**
	 * No Document Comments	 
	 */ 
	private ManageRecurringPaymentsProfileStatusRequestType ManageRecurringPaymentsProfileStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public ManageRecurringPaymentsProfileStatusReq (){
	}	

	/**
	 * Getter for ManageRecurringPaymentsProfileStatusRequest
	 */
	 public ManageRecurringPaymentsProfileStatusRequestType getManageRecurringPaymentsProfileStatusRequest() {
	 	return ManageRecurringPaymentsProfileStatusRequest;
	 }
	 
	/**
	 * Setter for ManageRecurringPaymentsProfileStatusRequest
	 */
	 public void setManageRecurringPaymentsProfileStatusRequest(ManageRecurringPaymentsProfileStatusRequestType ManageRecurringPaymentsProfileStatusRequest) {
	 	this.ManageRecurringPaymentsProfileStatusRequest = ManageRecurringPaymentsProfileStatusRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:ManageRecurringPaymentsProfileStatusReq>");
		if(ManageRecurringPaymentsProfileStatusRequest != null) {
			sb.append("<urn:ManageRecurringPaymentsProfileStatusRequest>");
			sb.append(ManageRecurringPaymentsProfileStatusRequest.toXMLString());
			sb.append("</urn:ManageRecurringPaymentsProfileStatusRequest>");
		}
		sb.append("</urn:ManageRecurringPaymentsProfileStatusReq>");
		return sb.toString();
	}

}