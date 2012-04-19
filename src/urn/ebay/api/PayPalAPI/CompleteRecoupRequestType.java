
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.EnhancedDataTypes.EnhancedCompleteRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 */
public class CompleteRecoupRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private EnhancedCompleteRecoupRequestDetailsType EnhancedCompleteRecoupRequestDetails;
	public EnhancedCompleteRecoupRequestDetailsType getEnhancedCompleteRecoupRequestDetails() {
		return EnhancedCompleteRecoupRequestDetails;
	}
	public void setEnhancedCompleteRecoupRequestDetails(EnhancedCompleteRecoupRequestDetailsType value) {
		this.EnhancedCompleteRecoupRequestDetails = value;
	}


	public CompleteRecoupRequestType(EnhancedCompleteRecoupRequestDetailsType EnhancedCompleteRecoupRequestDetails) {
		this.EnhancedCompleteRecoupRequestDetails = EnhancedCompleteRecoupRequestDetails;
	}
	public CompleteRecoupRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( EnhancedCompleteRecoupRequestDetails != null ) {
			sb.append("<ed:EnhancedCompleteRecoupRequestDetails>");
			sb.append(EnhancedCompleteRecoupRequestDetails.toXMLString());
			sb.append("</ed:EnhancedCompleteRecoupRequestDetails>");
		}
		return sb.toString();
	}

}
