package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetIncentiveEvaluationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetIncentiveEvaluationReq{


	/**
	 * 	 
	 */ 
	private GetIncentiveEvaluationRequestType GetIncentiveEvaluationRequest;

	

	/**
	 * Default Constructor
	 */
	public GetIncentiveEvaluationReq (){
	}	

	/**
	 * Getter for GetIncentiveEvaluationRequest
	 */
	 public GetIncentiveEvaluationRequestType getGetIncentiveEvaluationRequest() {
	 	return GetIncentiveEvaluationRequest;
	 }
	 
	/**
	 * Setter for GetIncentiveEvaluationRequest
	 */
	 public void setGetIncentiveEvaluationRequest(GetIncentiveEvaluationRequestType GetIncentiveEvaluationRequest) {
	 	this.GetIncentiveEvaluationRequest = GetIncentiveEvaluationRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetIncentiveEvaluationReq>");
		if(GetIncentiveEvaluationRequest != null) {
			sb.append("<urn:GetIncentiveEvaluationRequest>");
			sb.append(GetIncentiveEvaluationRequest.toXMLString());
			sb.append("</urn:GetIncentiveEvaluationRequest>");
		}
		sb.append("</urn:GetIncentiveEvaluationReq>");
		return sb.toString();
	}


}