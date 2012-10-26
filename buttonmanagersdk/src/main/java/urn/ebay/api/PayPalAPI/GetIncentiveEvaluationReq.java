package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetIncentiveEvaluationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetIncentiveEvaluationReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetIncentiveEvaluationRequestType getIncentiveEvaluationRequest;

	

	/**
	 * Default Constructor
	 */
	public GetIncentiveEvaluationReq (){
	}	

	/**
	 * Getter for getIncentiveEvaluationRequest
	 */
	 public GetIncentiveEvaluationRequestType getGetIncentiveEvaluationRequest() {
	 	return getIncentiveEvaluationRequest;
	 }
	 
	/**
	 * Setter for getIncentiveEvaluationRequest
	 */
	 public void setGetIncentiveEvaluationRequest(GetIncentiveEvaluationRequestType getIncentiveEvaluationRequest) {
	 	this.getIncentiveEvaluationRequest = getIncentiveEvaluationRequest;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(getIncentiveEvaluationRequest != null) {
			sb.append(getIncentiveEvaluationRequest.toXMLString(null,"GetIncentiveEvaluationRequest"));
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}