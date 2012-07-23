package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoNonReferencedCreditRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class DoNonReferencedCreditRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private DoNonReferencedCreditRequestDetailsType DoNonReferencedCreditRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoNonReferencedCreditRequestType (DoNonReferencedCreditRequestDetailsType DoNonReferencedCreditRequestDetails){
		this.DoNonReferencedCreditRequestDetails = DoNonReferencedCreditRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoNonReferencedCreditRequestType (){
	}	

	/**
	 * Getter for DoNonReferencedCreditRequestDetails
	 */
	 public DoNonReferencedCreditRequestDetailsType getDoNonReferencedCreditRequestDetails() {
	 	return DoNonReferencedCreditRequestDetails;
	 }
	 
	/**
	 * Setter for DoNonReferencedCreditRequestDetails
	 */
	 public void setDoNonReferencedCreditRequestDetails(DoNonReferencedCreditRequestDetailsType DoNonReferencedCreditRequestDetails) {
	 	this.DoNonReferencedCreditRequestDetails = DoNonReferencedCreditRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(DoNonReferencedCreditRequestDetails != null) {
			sb.append("<ebl:DoNonReferencedCreditRequestDetails>");
			sb.append(DoNonReferencedCreditRequestDetails.toXMLString());
			sb.append("</ebl:DoNonReferencedCreditRequestDetails>");
		}
		return sb.toString();
	}

}