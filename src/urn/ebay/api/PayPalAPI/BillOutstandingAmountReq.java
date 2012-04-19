
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.BillOutstandingAmountRequestType;


/**
 */
public class BillOutstandingAmountReq {

	/**
	 */
	private BillOutstandingAmountRequestType BillOutstandingAmountRequest;
	public BillOutstandingAmountRequestType getBillOutstandingAmountRequest() {
		return BillOutstandingAmountRequest;
	}
	public void setBillOutstandingAmountRequest(BillOutstandingAmountRequestType value) {
		this.BillOutstandingAmountRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:BillOutstandingAmountReq>");
		if( BillOutstandingAmountRequest != null ) {
			sb.append("<urn:BillOutstandingAmountRequest>");
			sb.append(BillOutstandingAmountRequest.toXMLString());
			sb.append("</urn:BillOutstandingAmountRequest>");
		}
sb.append("</urn:BillOutstandingAmountReq>");
		return sb.toString();
	}

}
