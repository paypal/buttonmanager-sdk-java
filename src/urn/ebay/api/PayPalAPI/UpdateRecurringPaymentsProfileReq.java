package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.UpdateRecurringPaymentsProfileRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class UpdateRecurringPaymentsProfileReq{


	/**
	 * 	 
	 */ 
	private UpdateRecurringPaymentsProfileRequestType UpdateRecurringPaymentsProfileRequest;

	

	/**
	 * Default Constructor
	 */
	public UpdateRecurringPaymentsProfileReq (){
	}	

	/**
	 * Getter for UpdateRecurringPaymentsProfileRequest
	 */
	 public UpdateRecurringPaymentsProfileRequestType getUpdateRecurringPaymentsProfileRequest() {
	 	return UpdateRecurringPaymentsProfileRequest;
	 }
	 
	/**
	 * Setter for UpdateRecurringPaymentsProfileRequest
	 */
	 public void setUpdateRecurringPaymentsProfileRequest(UpdateRecurringPaymentsProfileRequestType UpdateRecurringPaymentsProfileRequest) {
	 	this.UpdateRecurringPaymentsProfileRequest = UpdateRecurringPaymentsProfileRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:UpdateRecurringPaymentsProfileReq>");
		if(UpdateRecurringPaymentsProfileRequest != null) {
			sb.append("<urn:UpdateRecurringPaymentsProfileRequest>");
			sb.append(UpdateRecurringPaymentsProfileRequest.toXMLString());
			sb.append("</urn:UpdateRecurringPaymentsProfileRequest>");
		}
		sb.append("</urn:UpdateRecurringPaymentsProfileReq>");
		return sb.toString();
	}

}