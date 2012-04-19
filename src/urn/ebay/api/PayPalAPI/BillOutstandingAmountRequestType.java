
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.BillOutstandingAmountRequestDetailsType;


/**
 */
public class BillOutstandingAmountRequestType extends AbstractRequestType{

	/**
	 */
	private BillOutstandingAmountRequestDetailsType BillOutstandingAmountRequestDetails;
	public BillOutstandingAmountRequestDetailsType getBillOutstandingAmountRequestDetails() {
		return BillOutstandingAmountRequestDetails;
	}
	public void setBillOutstandingAmountRequestDetails(BillOutstandingAmountRequestDetailsType value) {
		this.BillOutstandingAmountRequestDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( BillOutstandingAmountRequestDetails != null ) {
			sb.append("<ebl:BillOutstandingAmountRequestDetails>");
			sb.append(BillOutstandingAmountRequestDetails.toXMLString());
			sb.append("</ebl:BillOutstandingAmountRequestDetails>");
		}
		return sb.toString();
	}

}
