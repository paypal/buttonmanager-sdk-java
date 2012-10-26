package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CreateRecurringPaymentsProfileRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateRecurringPaymentsProfileReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private CreateRecurringPaymentsProfileRequestType createRecurringPaymentsProfileRequest;

	

	/**
	 * Default Constructor
	 */
	public CreateRecurringPaymentsProfileReq (){
	}	

	/**
	 * Getter for createRecurringPaymentsProfileRequest
	 */
	 public CreateRecurringPaymentsProfileRequestType getCreateRecurringPaymentsProfileRequest() {
	 	return createRecurringPaymentsProfileRequest;
	 }
	 
	/**
	 * Setter for createRecurringPaymentsProfileRequest
	 */
	 public void setCreateRecurringPaymentsProfileRequest(CreateRecurringPaymentsProfileRequestType createRecurringPaymentsProfileRequest) {
	 	this.createRecurringPaymentsProfileRequest = createRecurringPaymentsProfileRequest;
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
		if(createRecurringPaymentsProfileRequest != null) {
			sb.append(createRecurringPaymentsProfileRequest.toXMLString(null,"CreateRecurringPaymentsProfileRequest"));
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