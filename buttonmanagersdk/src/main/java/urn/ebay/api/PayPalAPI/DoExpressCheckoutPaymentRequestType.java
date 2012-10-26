package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoExpressCheckoutPaymentRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class DoExpressCheckoutPaymentRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private DoExpressCheckoutPaymentRequestDetailsType doExpressCheckoutPaymentRequestDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer returnFMFDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoExpressCheckoutPaymentRequestType (DoExpressCheckoutPaymentRequestDetailsType doExpressCheckoutPaymentRequestDetails){
		this.doExpressCheckoutPaymentRequestDetails = doExpressCheckoutPaymentRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoExpressCheckoutPaymentRequestType (){
	}	

	/**
	 * Getter for doExpressCheckoutPaymentRequestDetails
	 */
	 public DoExpressCheckoutPaymentRequestDetailsType getDoExpressCheckoutPaymentRequestDetails() {
	 	return doExpressCheckoutPaymentRequestDetails;
	 }
	 
	/**
	 * Setter for doExpressCheckoutPaymentRequestDetails
	 */
	 public void setDoExpressCheckoutPaymentRequestDetails(DoExpressCheckoutPaymentRequestDetailsType doExpressCheckoutPaymentRequestDetails) {
	 	this.doExpressCheckoutPaymentRequestDetails = doExpressCheckoutPaymentRequestDetails;
	 }
	 
	/**
	 * Getter for returnFMFDetails
	 */
	 public Integer getReturnFMFDetails() {
	 	return returnFMFDetails;
	 }
	 
	/**
	 * Setter for returnFMFDetails
	 */
	 public void setReturnFMFDetails(Integer returnFMFDetails) {
	 	this.returnFMFDetails = returnFMFDetails;
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
		if(doExpressCheckoutPaymentRequestDetails != null) {
			sb.append(doExpressCheckoutPaymentRequestDetails.toXMLString(null,"DoExpressCheckoutPaymentRequestDetails"));
		}
		if(returnFMFDetails != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnFMFDetails>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnFMFDetails));
			sb.append("</").append(preferredPrefix).append(":ReturnFMFDetails>");
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