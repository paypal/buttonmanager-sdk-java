package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CreateBillingAgreementRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateBillingAgreementReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private CreateBillingAgreementRequestType createBillingAgreementRequest;

	

	/**
	 * Default Constructor
	 */
	public CreateBillingAgreementReq (){
	}	

	/**
	 * Getter for createBillingAgreementRequest
	 */
	 public CreateBillingAgreementRequestType getCreateBillingAgreementRequest() {
	 	return createBillingAgreementRequest;
	 }
	 
	/**
	 * Setter for createBillingAgreementRequest
	 */
	 public void setCreateBillingAgreementRequest(CreateBillingAgreementRequestType createBillingAgreementRequest) {
	 	this.createBillingAgreementRequest = createBillingAgreementRequest;
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
		if(createBillingAgreementRequest != null) {
			sb.append(createBillingAgreementRequest.toXMLString(null,"CreateBillingAgreementRequest"));
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