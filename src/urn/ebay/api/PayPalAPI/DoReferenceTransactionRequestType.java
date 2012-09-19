package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoReferenceTransactionRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class DoReferenceTransactionRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private DoReferenceTransactionRequestDetailsType DoReferenceTransactionRequestDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer ReturnFMFDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoReferenceTransactionRequestType (DoReferenceTransactionRequestDetailsType DoReferenceTransactionRequestDetails){
		this.DoReferenceTransactionRequestDetails = DoReferenceTransactionRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionRequestType (){
	}	

	/**
	 * Getter for DoReferenceTransactionRequestDetails
	 */
	 public DoReferenceTransactionRequestDetailsType getDoReferenceTransactionRequestDetails() {
	 	return DoReferenceTransactionRequestDetails;
	 }
	 
	/**
	 * Setter for DoReferenceTransactionRequestDetails
	 */
	 public void setDoReferenceTransactionRequestDetails(DoReferenceTransactionRequestDetailsType DoReferenceTransactionRequestDetails) {
	 	this.DoReferenceTransactionRequestDetails = DoReferenceTransactionRequestDetails;
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
		if(DoReferenceTransactionRequestDetails != null) {
			sb.append("<ebl:DoReferenceTransactionRequestDetails>");
			sb.append(DoReferenceTransactionRequestDetails.toXMLString());
			sb.append("</ebl:DoReferenceTransactionRequestDetails>");
		}
		if(ReturnFMFDetails != null) {
			sb.append("<urn:ReturnFMFDetails>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReturnFMFDetails));
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}


}