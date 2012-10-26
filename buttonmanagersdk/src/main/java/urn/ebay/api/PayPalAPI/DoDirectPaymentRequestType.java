package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoDirectPaymentRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class DoDirectPaymentRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private DoDirectPaymentRequestDetailsType doDirectPaymentRequestDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer returnFMFDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoDirectPaymentRequestType (DoDirectPaymentRequestDetailsType doDirectPaymentRequestDetails){
		this.doDirectPaymentRequestDetails = doDirectPaymentRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentRequestType (){
	}	

	/**
	 * Getter for doDirectPaymentRequestDetails
	 */
	 public DoDirectPaymentRequestDetailsType getDoDirectPaymentRequestDetails() {
	 	return doDirectPaymentRequestDetails;
	 }
	 
	/**
	 * Setter for doDirectPaymentRequestDetails
	 */
	 public void setDoDirectPaymentRequestDetails(DoDirectPaymentRequestDetailsType doDirectPaymentRequestDetails) {
	 	this.doDirectPaymentRequestDetails = doDirectPaymentRequestDetails;
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
		if(doDirectPaymentRequestDetails != null) {
			sb.append(doDirectPaymentRequestDetails.toXMLString(null,"DoDirectPaymentRequestDetails"));
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