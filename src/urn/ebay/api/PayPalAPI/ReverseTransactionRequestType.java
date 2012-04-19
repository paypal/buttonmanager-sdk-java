
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.ReverseTransactionRequestDetailsType;


/**
 */
public class ReverseTransactionRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private ReverseTransactionRequestDetailsType ReverseTransactionRequestDetails;
	public ReverseTransactionRequestDetailsType getReverseTransactionRequestDetails() {
		return ReverseTransactionRequestDetails;
	}
	public void setReverseTransactionRequestDetails(ReverseTransactionRequestDetailsType value) {
		this.ReverseTransactionRequestDetails = value;
	}


	public ReverseTransactionRequestType(ReverseTransactionRequestDetailsType ReverseTransactionRequestDetails) {
		this.ReverseTransactionRequestDetails = ReverseTransactionRequestDetails;
	}
	public ReverseTransactionRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( ReverseTransactionRequestDetails != null ) {
			sb.append("<ebl:ReverseTransactionRequestDetails>");
			sb.append(ReverseTransactionRequestDetails.toXMLString());
			sb.append("</ebl:ReverseTransactionRequestDetails>");
		}
		return sb.toString();
	}

}
