package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CreateBillingAgreementRequestType;

/**
 * No Document Comments
 */
public class CreateBillingAgreementReq{


	/**
	 * No Document Comments	 
	 */ 
	private CreateBillingAgreementRequestType CreateBillingAgreementRequest;

	

	/**
	 * Default Constructor
	 */
	public CreateBillingAgreementReq (){
	}	

	/**
	 * Getter for CreateBillingAgreementRequest
	 */
	 public CreateBillingAgreementRequestType getCreateBillingAgreementRequest() {
	 	return CreateBillingAgreementRequest;
	 }
	 
	/**
	 * Setter for CreateBillingAgreementRequest
	 */
	 public void setCreateBillingAgreementRequest(CreateBillingAgreementRequestType CreateBillingAgreementRequest) {
	 	this.CreateBillingAgreementRequest = CreateBillingAgreementRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:CreateBillingAgreementReq>");
		if(CreateBillingAgreementRequest != null) {
			sb.append("<urn:CreateBillingAgreementRequest>");
			sb.append(CreateBillingAgreementRequest.toXMLString());
			sb.append("</urn:CreateBillingAgreementRequest>");
		}
		sb.append("</urn:CreateBillingAgreementReq>");
		return sb.toString();
	}

}