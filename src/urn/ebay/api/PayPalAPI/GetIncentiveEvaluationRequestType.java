package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.GetIncentiveEvaluationRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * 
 */
public class GetIncentiveEvaluationRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private GetIncentiveEvaluationRequestDetailsType GetIncentiveEvaluationRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public GetIncentiveEvaluationRequestType (GetIncentiveEvaluationRequestDetailsType GetIncentiveEvaluationRequestDetails){
		this.GetIncentiveEvaluationRequestDetails = GetIncentiveEvaluationRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public GetIncentiveEvaluationRequestType (){
	}	

	/**
	 * Getter for GetIncentiveEvaluationRequestDetails
	 */
	 public GetIncentiveEvaluationRequestDetailsType getGetIncentiveEvaluationRequestDetails() {
	 	return GetIncentiveEvaluationRequestDetails;
	 }
	 
	/**
	 * Setter for GetIncentiveEvaluationRequestDetails
	 */
	 public void setGetIncentiveEvaluationRequestDetails(GetIncentiveEvaluationRequestDetailsType GetIncentiveEvaluationRequestDetails) {
	 	this.GetIncentiveEvaluationRequestDetails = GetIncentiveEvaluationRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(GetIncentiveEvaluationRequestDetails != null) {
			sb.append("<ebl:GetIncentiveEvaluationRequestDetails>");
			sb.append(GetIncentiveEvaluationRequestDetails.toXMLString());
			sb.append("</ebl:GetIncentiveEvaluationRequestDetails>");
		}
		return sb.toString();
	}

}