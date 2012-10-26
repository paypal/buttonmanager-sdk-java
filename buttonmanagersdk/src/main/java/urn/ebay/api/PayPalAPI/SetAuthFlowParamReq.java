package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.SetAuthFlowParamRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetAuthFlowParamReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private SetAuthFlowParamRequestType setAuthFlowParamRequest;

	

	/**
	 * Default Constructor
	 */
	public SetAuthFlowParamReq (){
	}	

	/**
	 * Getter for setAuthFlowParamRequest
	 */
	 public SetAuthFlowParamRequestType getSetAuthFlowParamRequest() {
	 	return setAuthFlowParamRequest;
	 }
	 
	/**
	 * Setter for setAuthFlowParamRequest
	 */
	 public void setSetAuthFlowParamRequest(SetAuthFlowParamRequestType setAuthFlowParamRequest) {
	 	this.setAuthFlowParamRequest = setAuthFlowParamRequest;
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
		if(setAuthFlowParamRequest != null) {
			sb.append(setAuthFlowParamRequest.toXMLString(null,"SetAuthFlowParamRequest"));
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