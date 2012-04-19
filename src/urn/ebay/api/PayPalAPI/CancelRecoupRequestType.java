
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.EnhancedDataTypes.EnhancedCancelRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 */
public class CancelRecoupRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private EnhancedCancelRecoupRequestDetailsType EnhancedCancelRecoupRequestDetails;
	public EnhancedCancelRecoupRequestDetailsType getEnhancedCancelRecoupRequestDetails() {
		return EnhancedCancelRecoupRequestDetails;
	}
	public void setEnhancedCancelRecoupRequestDetails(EnhancedCancelRecoupRequestDetailsType value) {
		this.EnhancedCancelRecoupRequestDetails = value;
	}


	public CancelRecoupRequestType(EnhancedCancelRecoupRequestDetailsType EnhancedCancelRecoupRequestDetails) {
		this.EnhancedCancelRecoupRequestDetails = EnhancedCancelRecoupRequestDetails;
	}
	public CancelRecoupRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( EnhancedCancelRecoupRequestDetails != null ) {
			sb.append("<ed:EnhancedCancelRecoupRequestDetails>");
			sb.append(EnhancedCancelRecoupRequestDetails.toXMLString());
			sb.append("</ed:EnhancedCancelRecoupRequestDetails>");
		}
		return sb.toString();
	}

}
