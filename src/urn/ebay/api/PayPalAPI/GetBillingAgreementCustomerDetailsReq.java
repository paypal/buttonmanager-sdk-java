package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetBillingAgreementCustomerDetailsRequestType;

/**
 * 
 */
public class GetBillingAgreementCustomerDetailsReq{


	/**
	 * 	 
	 */ 
	private GetBillingAgreementCustomerDetailsRequestType GetBillingAgreementCustomerDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetBillingAgreementCustomerDetailsReq (){
	}	

	/**
	 * Getter for GetBillingAgreementCustomerDetailsRequest
	 */
	 public GetBillingAgreementCustomerDetailsRequestType getGetBillingAgreementCustomerDetailsRequest() {
	 	return GetBillingAgreementCustomerDetailsRequest;
	 }
	 
	/**
	 * Setter for GetBillingAgreementCustomerDetailsRequest
	 */
	 public void setGetBillingAgreementCustomerDetailsRequest(GetBillingAgreementCustomerDetailsRequestType GetBillingAgreementCustomerDetailsRequest) {
	 	this.GetBillingAgreementCustomerDetailsRequest = GetBillingAgreementCustomerDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetBillingAgreementCustomerDetailsReq>");
		if(GetBillingAgreementCustomerDetailsRequest != null) {
			sb.append("<urn:GetBillingAgreementCustomerDetailsRequest>");
			sb.append(GetBillingAgreementCustomerDetailsRequest.toXMLString());
			sb.append("</urn:GetBillingAgreementCustomerDetailsRequest>");
		}
		sb.append("</urn:GetBillingAgreementCustomerDetailsReq>");
		return sb.toString();
	}

}