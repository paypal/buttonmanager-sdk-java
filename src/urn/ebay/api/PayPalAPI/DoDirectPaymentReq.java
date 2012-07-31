package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoDirectPaymentRequestType;

/**
 * 
 */
public class DoDirectPaymentReq{


	/**
	 * 	 
	 */ 
	private DoDirectPaymentRequestType DoDirectPaymentRequest;

	

	/**
	 * Default Constructor
	 */
	public DoDirectPaymentReq (){
	}	

	/**
	 * Getter for DoDirectPaymentRequest
	 */
	 public DoDirectPaymentRequestType getDoDirectPaymentRequest() {
	 	return DoDirectPaymentRequest;
	 }
	 
	/**
	 * Setter for DoDirectPaymentRequest
	 */
	 public void setDoDirectPaymentRequest(DoDirectPaymentRequestType DoDirectPaymentRequest) {
	 	this.DoDirectPaymentRequest = DoDirectPaymentRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:DoDirectPaymentReq>");
		if(DoDirectPaymentRequest != null) {
			sb.append("<urn:DoDirectPaymentRequest>");
			sb.append(DoDirectPaymentRequest.toXMLString());
			sb.append("</urn:DoDirectPaymentRequest>");
		}
		sb.append("</urn:DoDirectPaymentReq>");
		return sb.toString();
	}

}