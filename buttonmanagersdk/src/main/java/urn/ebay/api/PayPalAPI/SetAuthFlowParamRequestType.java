package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetAuthFlowParamRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetAuthFlowParamRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private SetAuthFlowParamRequestDetailsType setAuthFlowParamRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetAuthFlowParamRequestType (SetAuthFlowParamRequestDetailsType setAuthFlowParamRequestDetails){
		this.setAuthFlowParamRequestDetails = setAuthFlowParamRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetAuthFlowParamRequestType (){
	}	

	/**
	 * Getter for setAuthFlowParamRequestDetails
	 */
	 public SetAuthFlowParamRequestDetailsType getSetAuthFlowParamRequestDetails() {
	 	return setAuthFlowParamRequestDetails;
	 }
	 
	/**
	 * Setter for setAuthFlowParamRequestDetails
	 */
	 public void setSetAuthFlowParamRequestDetails(SetAuthFlowParamRequestDetailsType setAuthFlowParamRequestDetails) {
	 	this.setAuthFlowParamRequestDetails = setAuthFlowParamRequestDetails;
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
		if(setAuthFlowParamRequestDetails != null) {
			sb.append(setAuthFlowParamRequestDetails.toXMLString(null,"SetAuthFlowParamRequestDetails"));
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