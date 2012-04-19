
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.EnhancedDataTypes.EnhancedInitiateRecoupRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 */
public class InitiateRecoupRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private EnhancedInitiateRecoupRequestDetailsType EnhancedInitiateRecoupRequestDetails;
	public EnhancedInitiateRecoupRequestDetailsType getEnhancedInitiateRecoupRequestDetails() {
		return EnhancedInitiateRecoupRequestDetails;
	}
	public void setEnhancedInitiateRecoupRequestDetails(EnhancedInitiateRecoupRequestDetailsType value) {
		this.EnhancedInitiateRecoupRequestDetails = value;
	}


	public InitiateRecoupRequestType(EnhancedInitiateRecoupRequestDetailsType EnhancedInitiateRecoupRequestDetails) {
		this.EnhancedInitiateRecoupRequestDetails = EnhancedInitiateRecoupRequestDetails;
	}
	public InitiateRecoupRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( EnhancedInitiateRecoupRequestDetails != null ) {
			sb.append("<ed:EnhancedInitiateRecoupRequestDetails>");
			sb.append(EnhancedInitiateRecoupRequestDetails.toXMLString());
			sb.append("</ed:EnhancedInitiateRecoupRequestDetails>");
		}
		return sb.toString();
	}

}
