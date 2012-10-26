package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BillOutstandingAmountRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BillOutstandingAmountReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BillOutstandingAmountRequestType billOutstandingAmountRequest;

	

	/**
	 * Default Constructor
	 */
	public BillOutstandingAmountReq (){
	}	

	/**
	 * Getter for billOutstandingAmountRequest
	 */
	 public BillOutstandingAmountRequestType getBillOutstandingAmountRequest() {
	 	return billOutstandingAmountRequest;
	 }
	 
	/**
	 * Setter for billOutstandingAmountRequest
	 */
	 public void setBillOutstandingAmountRequest(BillOutstandingAmountRequestType billOutstandingAmountRequest) {
	 	this.billOutstandingAmountRequest = billOutstandingAmountRequest;
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
		if(billOutstandingAmountRequest != null) {
			sb.append(billOutstandingAmountRequest.toXMLString(null,"BillOutstandingAmountRequest"));
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