package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.SetAuthFlowParamRequestDetailsType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * 
 */
public class SetAuthFlowParamRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private SetAuthFlowParamRequestDetailsType SetAuthFlowParamRequestDetails;

	

	/**
	 * Constructor with arguments
	 */
	public SetAuthFlowParamRequestType (SetAuthFlowParamRequestDetailsType SetAuthFlowParamRequestDetails){
		this.SetAuthFlowParamRequestDetails = SetAuthFlowParamRequestDetails;
	}	

	/**
	 * Default Constructor
	 */
	public SetAuthFlowParamRequestType (){
	}	

	/**
	 * Getter for SetAuthFlowParamRequestDetails
	 */
	 public SetAuthFlowParamRequestDetailsType getSetAuthFlowParamRequestDetails() {
	 	return SetAuthFlowParamRequestDetails;
	 }
	 
	/**
	 * Setter for SetAuthFlowParamRequestDetails
	 */
	 public void setSetAuthFlowParamRequestDetails(SetAuthFlowParamRequestDetailsType SetAuthFlowParamRequestDetails) {
	 	this.SetAuthFlowParamRequestDetails = SetAuthFlowParamRequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(SetAuthFlowParamRequestDetails != null) {
			sb.append("<ebl:SetAuthFlowParamRequestDetails>");
			sb.append(SetAuthFlowParamRequestDetails.toXMLString());
			sb.append("</ebl:SetAuthFlowParamRequestDetails>");
		}
		return sb.toString();
	}

}