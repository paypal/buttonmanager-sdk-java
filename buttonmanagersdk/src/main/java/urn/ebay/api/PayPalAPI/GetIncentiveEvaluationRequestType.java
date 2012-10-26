package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.GetIncentiveEvaluationRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetIncentiveEvaluationRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private GetIncentiveEvaluationRequestDetailsType getIncentiveEvaluationRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public GetIncentiveEvaluationRequestType (GetIncentiveEvaluationRequestDetailsType getIncentiveEvaluationRequestDetails){
		this.getIncentiveEvaluationRequestDetails = getIncentiveEvaluationRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public GetIncentiveEvaluationRequestType (){
	}	

	/**
	 * Getter for getIncentiveEvaluationRequestDetails
	 */
	 public GetIncentiveEvaluationRequestDetailsType getGetIncentiveEvaluationRequestDetails() {
	 	return getIncentiveEvaluationRequestDetails;
	 }
	 
	/**
	 * Setter for getIncentiveEvaluationRequestDetails
	 */
	 public void setGetIncentiveEvaluationRequestDetails(GetIncentiveEvaluationRequestDetailsType getIncentiveEvaluationRequestDetails) {
	 	this.getIncentiveEvaluationRequestDetails = getIncentiveEvaluationRequestDetails;
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
		sb.append(super.toXMLString(prefix, null));
		if(getIncentiveEvaluationRequestDetails != null) {
			sb.append(getIncentiveEvaluationRequestDetails.toXMLString(null,"GetIncentiveEvaluationRequestDetails"));
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