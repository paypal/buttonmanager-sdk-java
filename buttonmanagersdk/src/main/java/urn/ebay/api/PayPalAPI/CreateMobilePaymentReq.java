package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.CreateMobilePaymentRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateMobilePaymentReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private CreateMobilePaymentRequestType createMobilePaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public CreateMobilePaymentReq (){
	}	

	/**
	 * Getter for createMobilePaymentRequest
	 */
	 public CreateMobilePaymentRequestType getCreateMobilePaymentRequest() {
	 	return createMobilePaymentRequest;
	 }
	 
	/**
	 * Setter for createMobilePaymentRequest
	 */
	 public void setCreateMobilePaymentRequest(CreateMobilePaymentRequestType createMobilePaymentRequest) {
	 	this.createMobilePaymentRequest = createMobilePaymentRequest;
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
		if(createMobilePaymentRequest != null) {
			sb.append(createMobilePaymentRequest.toXMLString(null,"CreateMobilePaymentRequest"));
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