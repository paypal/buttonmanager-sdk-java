
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.GetIncentiveEvaluationRequestType;


/**
 */
public class GetIncentiveEvaluationReq {

	/**
	 */
	private GetIncentiveEvaluationRequestType GetIncentiveEvaluationRequest;
	public GetIncentiveEvaluationRequestType getGetIncentiveEvaluationRequest() {
		return GetIncentiveEvaluationRequest;
	}
	public void setGetIncentiveEvaluationRequest(GetIncentiveEvaluationRequestType value) {
		this.GetIncentiveEvaluationRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetIncentiveEvaluationReq>");
		if( GetIncentiveEvaluationRequest != null ) {
			sb.append("<urn:GetIncentiveEvaluationRequest>");
			sb.append(GetIncentiveEvaluationRequest.toXMLString());
			sb.append("</urn:GetIncentiveEvaluationRequest>");
		}
sb.append("</urn:GetIncentiveEvaluationReq>");
		return sb.toString();
	}

}
