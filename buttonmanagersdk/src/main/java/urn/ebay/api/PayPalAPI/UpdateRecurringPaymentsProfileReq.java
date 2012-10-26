package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.UpdateRecurringPaymentsProfileRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class UpdateRecurringPaymentsProfileReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private UpdateRecurringPaymentsProfileRequestType updateRecurringPaymentsProfileRequest;

	

	/**
	 * Default Constructor
	 */
	public UpdateRecurringPaymentsProfileReq (){
	}	

	/**
	 * Getter for updateRecurringPaymentsProfileRequest
	 */
	 public UpdateRecurringPaymentsProfileRequestType getUpdateRecurringPaymentsProfileRequest() {
	 	return updateRecurringPaymentsProfileRequest;
	 }
	 
	/**
	 * Setter for updateRecurringPaymentsProfileRequest
	 */
	 public void setUpdateRecurringPaymentsProfileRequest(UpdateRecurringPaymentsProfileRequestType updateRecurringPaymentsProfileRequest) {
	 	this.updateRecurringPaymentsProfileRequest = updateRecurringPaymentsProfileRequest;
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
		if(updateRecurringPaymentsProfileRequest != null) {
			sb.append(updateRecurringPaymentsProfileRequest.toXMLString(null,"UpdateRecurringPaymentsProfileRequest"));
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