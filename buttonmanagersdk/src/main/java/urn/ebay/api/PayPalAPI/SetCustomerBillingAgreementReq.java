package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetCustomerBillingAgreementRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetCustomerBillingAgreementReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private SetCustomerBillingAgreementRequestType setCustomerBillingAgreementRequest;

	

	/**
	 * Default Constructor
	 */
	public SetCustomerBillingAgreementReq (){
	}	

	/**
	 * Getter for setCustomerBillingAgreementRequest
	 */
	 public SetCustomerBillingAgreementRequestType getSetCustomerBillingAgreementRequest() {
	 	return setCustomerBillingAgreementRequest;
	 }
	 
	/**
	 * Setter for setCustomerBillingAgreementRequest
	 */
	 public void setSetCustomerBillingAgreementRequest(SetCustomerBillingAgreementRequestType setCustomerBillingAgreementRequest) {
	 	this.setCustomerBillingAgreementRequest = setCustomerBillingAgreementRequest;
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
		if(setCustomerBillingAgreementRequest != null) {
			sb.append(setCustomerBillingAgreementRequest.toXMLString(null,"SetCustomerBillingAgreementRequest"));
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