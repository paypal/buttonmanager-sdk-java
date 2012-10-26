package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.BillOutstandingAmountRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BillOutstandingAmountRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BillOutstandingAmountRequestDetailsType billOutstandingAmountRequestDetails;

	

	/**
	 * Default Constructor
	 */
	public BillOutstandingAmountRequestType (){
	}	

	/**
	 * Getter for billOutstandingAmountRequestDetails
	 */
	 public BillOutstandingAmountRequestDetailsType getBillOutstandingAmountRequestDetails() {
	 	return billOutstandingAmountRequestDetails;
	 }
	 
	/**
	 * Setter for billOutstandingAmountRequestDetails
	 */
	 public void setBillOutstandingAmountRequestDetails(BillOutstandingAmountRequestDetailsType billOutstandingAmountRequestDetails) {
	 	this.billOutstandingAmountRequestDetails = billOutstandingAmountRequestDetails;
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
		if(billOutstandingAmountRequestDetails != null) {
			sb.append(billOutstandingAmountRequestDetails.toXMLString(null,"BillOutstandingAmountRequestDetails"));
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