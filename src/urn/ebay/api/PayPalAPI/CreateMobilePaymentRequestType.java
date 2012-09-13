package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.CreateMobilePaymentRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateMobilePaymentRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private CreateMobilePaymentRequestDetailsType CreateMobilePaymentRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public CreateMobilePaymentRequestType (CreateMobilePaymentRequestDetailsType CreateMobilePaymentRequestDetails){
		this.CreateMobilePaymentRequestDetails = CreateMobilePaymentRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CreateMobilePaymentRequestType (){
	}	

	/**
	 * Getter for CreateMobilePaymentRequestDetails
	 */
	 public CreateMobilePaymentRequestDetailsType getCreateMobilePaymentRequestDetails() {
	 	return CreateMobilePaymentRequestDetails;
	 }
	 
	/**
	 * Setter for CreateMobilePaymentRequestDetails
	 */
	 public void setCreateMobilePaymentRequestDetails(CreateMobilePaymentRequestDetailsType CreateMobilePaymentRequestDetails) {
	 	this.CreateMobilePaymentRequestDetails = CreateMobilePaymentRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(CreateMobilePaymentRequestDetails != null) {
			sb.append("<ebl:CreateMobilePaymentRequestDetails>");
			sb.append(CreateMobilePaymentRequestDetails.toXMLString());
			sb.append("</ebl:CreateMobilePaymentRequestDetails>");
		}
		return sb.toString();
	}

}