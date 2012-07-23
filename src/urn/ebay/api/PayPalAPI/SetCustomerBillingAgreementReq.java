package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetCustomerBillingAgreementRequestType;

/**
 * No Document Comments
 */
public class SetCustomerBillingAgreementReq{


	/**
	 * No Document Comments	 
	 */ 
	private SetCustomerBillingAgreementRequestType SetCustomerBillingAgreementRequest;

	

	/**
	 * Default Constructor
	 */
	public SetCustomerBillingAgreementReq (){
	}	

	/**
	 * Getter for SetCustomerBillingAgreementRequest
	 */
	 public SetCustomerBillingAgreementRequestType getSetCustomerBillingAgreementRequest() {
	 	return SetCustomerBillingAgreementRequest;
	 }
	 
	/**
	 * Setter for SetCustomerBillingAgreementRequest
	 */
	 public void setSetCustomerBillingAgreementRequest(SetCustomerBillingAgreementRequestType SetCustomerBillingAgreementRequest) {
	 	this.SetCustomerBillingAgreementRequest = SetCustomerBillingAgreementRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:SetCustomerBillingAgreementReq>");
		if(SetCustomerBillingAgreementRequest != null) {
			sb.append("<urn:SetCustomerBillingAgreementRequest>");
			sb.append(SetCustomerBillingAgreementRequest.toXMLString());
			sb.append("</urn:SetCustomerBillingAgreementRequest>");
		}
		sb.append("</urn:SetCustomerBillingAgreementReq>");
		return sb.toString();
	}

}