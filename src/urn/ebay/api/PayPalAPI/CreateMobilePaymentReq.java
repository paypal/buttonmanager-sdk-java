package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CreateMobilePaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateMobilePaymentReq{


	/**
	 * 	 
	 */ 
	private CreateMobilePaymentRequestType CreateMobilePaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public CreateMobilePaymentReq (){
	}	

	/**
	 * Getter for CreateMobilePaymentRequest
	 */
	 public CreateMobilePaymentRequestType getCreateMobilePaymentRequest() {
	 	return CreateMobilePaymentRequest;
	 }
	 
	/**
	 * Setter for CreateMobilePaymentRequest
	 */
	 public void setCreateMobilePaymentRequest(CreateMobilePaymentRequestType CreateMobilePaymentRequest) {
	 	this.CreateMobilePaymentRequest = CreateMobilePaymentRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:CreateMobilePaymentReq>");
		if(CreateMobilePaymentRequest != null) {
			sb.append("<urn:CreateMobilePaymentRequest>");
			sb.append(CreateMobilePaymentRequest.toXMLString());
			sb.append("</urn:CreateMobilePaymentRequest>");
		}
		sb.append("</urn:CreateMobilePaymentReq>");
		return sb.toString();
	}

}