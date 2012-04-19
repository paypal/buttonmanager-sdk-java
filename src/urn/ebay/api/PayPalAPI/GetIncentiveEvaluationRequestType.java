
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.GetIncentiveEvaluationRequestDetailsType;


/**
 */
public class GetIncentiveEvaluationRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private GetIncentiveEvaluationRequestDetailsType GetIncentiveEvaluationRequestDetails;
	public GetIncentiveEvaluationRequestDetailsType getGetIncentiveEvaluationRequestDetails() {
		return GetIncentiveEvaluationRequestDetails;
	}
	public void setGetIncentiveEvaluationRequestDetails(GetIncentiveEvaluationRequestDetailsType value) {
		this.GetIncentiveEvaluationRequestDetails = value;
	}


	public GetIncentiveEvaluationRequestType(GetIncentiveEvaluationRequestDetailsType GetIncentiveEvaluationRequestDetails) {
		this.GetIncentiveEvaluationRequestDetails = GetIncentiveEvaluationRequestDetails;
	}
	public GetIncentiveEvaluationRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( GetIncentiveEvaluationRequestDetails != null ) {
			sb.append("<ebl:GetIncentiveEvaluationRequestDetails>");
			sb.append(GetIncentiveEvaluationRequestDetails.toXMLString());
			sb.append("</ebl:GetIncentiveEvaluationRequestDetails>");
		}
		return sb.toString();
	}

}
