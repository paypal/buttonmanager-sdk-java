package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoReferenceTransactionRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class DoReferenceTransactionRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private DoReferenceTransactionRequestDetailsType doReferenceTransactionRequestDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer returnFMFDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoReferenceTransactionRequestType (DoReferenceTransactionRequestDetailsType doReferenceTransactionRequestDetails){
		this.doReferenceTransactionRequestDetails = doReferenceTransactionRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionRequestType (){
	}	

	/**
	 * Getter for doReferenceTransactionRequestDetails
	 */
	 public DoReferenceTransactionRequestDetailsType getDoReferenceTransactionRequestDetails() {
	 	return doReferenceTransactionRequestDetails;
	 }
	 
	/**
	 * Setter for doReferenceTransactionRequestDetails
	 */
	 public void setDoReferenceTransactionRequestDetails(DoReferenceTransactionRequestDetailsType doReferenceTransactionRequestDetails) {
	 	this.doReferenceTransactionRequestDetails = doReferenceTransactionRequestDetails;
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
		if(doReferenceTransactionRequestDetails != null) {
			sb.append(doReferenceTransactionRequestDetails.toXMLString(null,"DoReferenceTransactionRequestDetails"));
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