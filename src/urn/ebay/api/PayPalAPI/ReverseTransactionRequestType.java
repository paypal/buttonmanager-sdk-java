package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.ReverseTransactionRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ReverseTransactionRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ReverseTransactionRequestDetailsType ReverseTransactionRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public ReverseTransactionRequestType (ReverseTransactionRequestDetailsType ReverseTransactionRequestDetails){
		this.ReverseTransactionRequestDetails = ReverseTransactionRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public ReverseTransactionRequestType (){
	}	

	/**
	 * Getter for ReverseTransactionRequestDetails
	 */
	 public ReverseTransactionRequestDetailsType getReverseTransactionRequestDetails() {
	 	return ReverseTransactionRequestDetails;
	 }
	 
	/**
	 * Setter for ReverseTransactionRequestDetails
	 */
	 public void setReverseTransactionRequestDetails(ReverseTransactionRequestDetailsType ReverseTransactionRequestDetails) {
	 	this.ReverseTransactionRequestDetails = ReverseTransactionRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(ReverseTransactionRequestDetails != null) {
			sb.append("<ebl:ReverseTransactionRequestDetails>");
			sb.append(ReverseTransactionRequestDetails.toXMLString());
			sb.append("</ebl:ReverseTransactionRequestDetails>");
		}
		return sb.toString();
	}

}