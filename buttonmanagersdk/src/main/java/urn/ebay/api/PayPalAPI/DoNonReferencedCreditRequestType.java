package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.DoNonReferencedCreditRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoNonReferencedCreditRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private DoNonReferencedCreditRequestDetailsType doNonReferencedCreditRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoNonReferencedCreditRequestType (DoNonReferencedCreditRequestDetailsType doNonReferencedCreditRequestDetails){
		this.doNonReferencedCreditRequestDetails = doNonReferencedCreditRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoNonReferencedCreditRequestType (){
	}	

	/**
	 * Getter for doNonReferencedCreditRequestDetails
	 */
	 public DoNonReferencedCreditRequestDetailsType getDoNonReferencedCreditRequestDetails() {
	 	return doNonReferencedCreditRequestDetails;
	 }
	 
	/**
	 * Setter for doNonReferencedCreditRequestDetails
	 */
	 public void setDoNonReferencedCreditRequestDetails(DoNonReferencedCreditRequestDetailsType doNonReferencedCreditRequestDetails) {
	 	this.doNonReferencedCreditRequestDetails = doNonReferencedCreditRequestDetails;
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
		if(doNonReferencedCreditRequestDetails != null) {
			sb.append(doNonReferencedCreditRequestDetails.toXMLString(null,"DoNonReferencedCreditRequestDetails"));
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