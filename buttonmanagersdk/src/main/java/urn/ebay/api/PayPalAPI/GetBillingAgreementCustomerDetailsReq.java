package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetBillingAgreementCustomerDetailsRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetBillingAgreementCustomerDetailsReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetBillingAgreementCustomerDetailsRequestType getBillingAgreementCustomerDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetBillingAgreementCustomerDetailsReq (){
	}	

	/**
	 * Getter for getBillingAgreementCustomerDetailsRequest
	 */
	 public GetBillingAgreementCustomerDetailsRequestType getGetBillingAgreementCustomerDetailsRequest() {
	 	return getBillingAgreementCustomerDetailsRequest;
	 }
	 
	/**
	 * Setter for getBillingAgreementCustomerDetailsRequest
	 */
	 public void setGetBillingAgreementCustomerDetailsRequest(GetBillingAgreementCustomerDetailsRequestType getBillingAgreementCustomerDetailsRequest) {
	 	this.getBillingAgreementCustomerDetailsRequest = getBillingAgreementCustomerDetailsRequest;
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
		if(getBillingAgreementCustomerDetailsRequest != null) {
			sb.append(getBillingAgreementCustomerDetailsRequest.toXMLString(null,"GetBillingAgreementCustomerDetailsRequest"));
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