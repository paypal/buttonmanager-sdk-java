package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoExpressCheckoutPaymentRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class DoExpressCheckoutPaymentRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private DoExpressCheckoutPaymentRequestDetailsType DoExpressCheckoutPaymentRequestDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer ReturnFMFDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoExpressCheckoutPaymentRequestType (DoExpressCheckoutPaymentRequestDetailsType DoExpressCheckoutPaymentRequestDetails){
		this.DoExpressCheckoutPaymentRequestDetails = DoExpressCheckoutPaymentRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentRequestType (){
	}	

	/**
	 * Getter for DoExpressCheckoutPaymentRequestDetails
	 */
	 public DoExpressCheckoutPaymentRequestDetailsType getDoExpressCheckoutPaymentRequestDetails() {
	 	return DoExpressCheckoutPaymentRequestDetails;
	 }
	 
	/**
	 * Setter for DoExpressCheckoutPaymentRequestDetails
	 */
	 public void setDoExpressCheckoutPaymentRequestDetails(DoExpressCheckoutPaymentRequestDetailsType DoExpressCheckoutPaymentRequestDetails) {
	 	this.DoExpressCheckoutPaymentRequestDetails = DoExpressCheckoutPaymentRequestDetails;
	 }
	 
	/**
	 * Getter for ReturnFMFDetails
	 */
	 public Integer getReturnFMFDetails() {
	 	return ReturnFMFDetails;
	 }
	 
	/**
	 * Setter for ReturnFMFDetails
	 */
	 public void setReturnFMFDetails(Integer ReturnFMFDetails) {
	 	this.ReturnFMFDetails = ReturnFMFDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(DoExpressCheckoutPaymentRequestDetails != null) {
			sb.append("<ebl:DoExpressCheckoutPaymentRequestDetails>");
			sb.append(DoExpressCheckoutPaymentRequestDetails.toXMLString());
			sb.append("</ebl:DoExpressCheckoutPaymentRequestDetails>");
		}
		if(ReturnFMFDetails != null) {
			sb.append("<urn:ReturnFMFDetails>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReturnFMFDetails));
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}