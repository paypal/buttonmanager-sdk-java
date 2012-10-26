package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ReverseTransactionRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ReverseTransactionRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private ReverseTransactionRequestDetailsType reverseTransactionRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public ReverseTransactionRequestType (ReverseTransactionRequestDetailsType reverseTransactionRequestDetails){
		this.reverseTransactionRequestDetails = reverseTransactionRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public ReverseTransactionRequestType (){
	}	

	/**
	 * Getter for reverseTransactionRequestDetails
	 */
	 public ReverseTransactionRequestDetailsType getReverseTransactionRequestDetails() {
	 	return reverseTransactionRequestDetails;
	 }
	 
	/**
	 * Setter for reverseTransactionRequestDetails
	 */
	 public void setReverseTransactionRequestDetails(ReverseTransactionRequestDetailsType reverseTransactionRequestDetails) {
	 	this.reverseTransactionRequestDetails = reverseTransactionRequestDetails;
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
		if(reverseTransactionRequestDetails != null) {
			sb.append(reverseTransactionRequestDetails.toXMLString(null,"ReverseTransactionRequestDetails"));
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