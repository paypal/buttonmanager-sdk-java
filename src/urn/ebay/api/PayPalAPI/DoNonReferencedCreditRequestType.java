
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.DoNonReferencedCreditRequestDetailsType;


/**
 */
public class DoNonReferencedCreditRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private DoNonReferencedCreditRequestDetailsType DoNonReferencedCreditRequestDetails;
	public DoNonReferencedCreditRequestDetailsType getDoNonReferencedCreditRequestDetails() {
		return DoNonReferencedCreditRequestDetails;
	}
	public void setDoNonReferencedCreditRequestDetails(DoNonReferencedCreditRequestDetailsType value) {
		this.DoNonReferencedCreditRequestDetails = value;
	}


	public DoNonReferencedCreditRequestType(DoNonReferencedCreditRequestDetailsType DoNonReferencedCreditRequestDetails) {
		this.DoNonReferencedCreditRequestDetails = DoNonReferencedCreditRequestDetails;
	}
	public DoNonReferencedCreditRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( DoNonReferencedCreditRequestDetails != null ) {
			sb.append("<ebl:DoNonReferencedCreditRequestDetails>");
			sb.append(DoNonReferencedCreditRequestDetails.toXMLString());
			sb.append("</ebl:DoNonReferencedCreditRequestDetails>");
		}
		return sb.toString();
	}

}
