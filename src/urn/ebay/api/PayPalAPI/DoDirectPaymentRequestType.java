package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoDirectPaymentRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class DoDirectPaymentRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private DoDirectPaymentRequestDetailsType DoDirectPaymentRequestDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer ReturnFMFDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoDirectPaymentRequestType (DoDirectPaymentRequestDetailsType DoDirectPaymentRequestDetails){
		this.DoDirectPaymentRequestDetails = DoDirectPaymentRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentRequestType (){
	}	

	/**
	 * Getter for DoDirectPaymentRequestDetails
	 */
	 public DoDirectPaymentRequestDetailsType getDoDirectPaymentRequestDetails() {
	 	return DoDirectPaymentRequestDetails;
	 }
	 
	/**
	 * Setter for DoDirectPaymentRequestDetails
	 */
	 public void setDoDirectPaymentRequestDetails(DoDirectPaymentRequestDetailsType DoDirectPaymentRequestDetails) {
	 	this.DoDirectPaymentRequestDetails = DoDirectPaymentRequestDetails;
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
		if(DoDirectPaymentRequestDetails != null) {
			sb.append("<ebl:DoDirectPaymentRequestDetails>");
			sb.append(DoDirectPaymentRequestDetails.toXMLString());
			sb.append("</ebl:DoDirectPaymentRequestDetails>");
		}
		if(ReturnFMFDetails != null) {
			sb.append("<urn:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}