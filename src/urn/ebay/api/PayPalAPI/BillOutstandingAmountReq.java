package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BillOutstandingAmountRequestType;

/**
 * No Document Comments
 */
public class BillOutstandingAmountReq{


	/**
	 * No Document Comments	 
	 */ 
	private BillOutstandingAmountRequestType BillOutstandingAmountRequest;

	

	/**
	 * Default Constructor
	 */
	public BillOutstandingAmountReq (){
	}	

	/**
	 * Getter for BillOutstandingAmountRequest
	 */
	 public BillOutstandingAmountRequestType getBillOutstandingAmountRequest() {
	 	return BillOutstandingAmountRequest;
	 }
	 
	/**
	 * Setter for BillOutstandingAmountRequest
	 */
	 public void setBillOutstandingAmountRequest(BillOutstandingAmountRequestType BillOutstandingAmountRequest) {
	 	this.BillOutstandingAmountRequest = BillOutstandingAmountRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:BillOutstandingAmountReq>");
		if(BillOutstandingAmountRequest != null) {
			sb.append("<urn:BillOutstandingAmountRequest>");
			sb.append(BillOutstandingAmountRequest.toXMLString());
			sb.append("</urn:BillOutstandingAmountRequest>");
		}
		sb.append("</urn:BillOutstandingAmountReq>");
		return sb.toString();
	}

}