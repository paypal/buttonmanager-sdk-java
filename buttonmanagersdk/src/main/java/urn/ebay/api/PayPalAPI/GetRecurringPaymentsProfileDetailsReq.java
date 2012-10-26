package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetRecurringPaymentsProfileDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetRecurringPaymentsProfileDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetRecurringPaymentsProfileDetailsRequestType getRecurringPaymentsProfileDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetRecurringPaymentsProfileDetailsReq (){
	}	

	/**
	 * Getter for getRecurringPaymentsProfileDetailsRequest
	 */
	 public GetRecurringPaymentsProfileDetailsRequestType getGetRecurringPaymentsProfileDetailsRequest() {
	 	return getRecurringPaymentsProfileDetailsRequest;
	 }
	 
	/**
	 * Setter for getRecurringPaymentsProfileDetailsRequest
	 */
	 public void setGetRecurringPaymentsProfileDetailsRequest(GetRecurringPaymentsProfileDetailsRequestType getRecurringPaymentsProfileDetailsRequest) {
	 	this.getRecurringPaymentsProfileDetailsRequest = getRecurringPaymentsProfileDetailsRequest;
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
		if(getRecurringPaymentsProfileDetailsRequest != null) {
			sb.append(getRecurringPaymentsProfileDetailsRequest.toXMLString(null,"GetRecurringPaymentsProfileDetailsRequest"));
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