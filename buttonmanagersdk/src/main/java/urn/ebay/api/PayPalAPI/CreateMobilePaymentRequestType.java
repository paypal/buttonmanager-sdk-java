package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.CreateMobilePaymentRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateMobilePaymentRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private CreateMobilePaymentRequestDetailsType createMobilePaymentRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public CreateMobilePaymentRequestType (CreateMobilePaymentRequestDetailsType createMobilePaymentRequestDetails){
		this.createMobilePaymentRequestDetails = createMobilePaymentRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CreateMobilePaymentRequestType (){
	}	

	/**
	 * Getter for createMobilePaymentRequestDetails
	 */
	 public CreateMobilePaymentRequestDetailsType getCreateMobilePaymentRequestDetails() {
	 	return createMobilePaymentRequestDetails;
	 }
	 
	/**
	 * Setter for createMobilePaymentRequestDetails
	 */
	 public void setCreateMobilePaymentRequestDetails(CreateMobilePaymentRequestDetailsType createMobilePaymentRequestDetails) {
	 	this.createMobilePaymentRequestDetails = createMobilePaymentRequestDetails;
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
		sb.append(super.toXMLString(prefix, null));
		if(createMobilePaymentRequestDetails != null) {
			sb.append(createMobilePaymentRequestDetails.toXMLString(null,"CreateMobilePaymentRequestDetails"));
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