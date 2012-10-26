package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.SetDataRequestType;
import urn.ebay.apis.eBLBaseComponents.AuthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * On your first invocation of
 * ExecuteCheckoutOperationsRequest, the value of this token is
 * returned by ExecuteCheckoutOperationsResponse. Optional
 * Include this element and its value only if you want to
 * modify an existing checkout session with another invocation
 * of ExecuteCheckoutOperationsRequest; for example, if you
 * want the customer to edit his shipping address on PayPal.
 * Character length and limitations: 20 single-byte characters 
 */
public class ExecuteCheckoutOperationsRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * On your first invocation of
	 * ExecuteCheckoutOperationsRequest, the value of this token is
	 * returned by ExecuteCheckoutOperationsResponse. Optional
	 * Include this element and its value only if you want to
	 * modify an existing checkout session with another invocation
	 * of ExecuteCheckoutOperationsRequest; for example, if you
	 * want the customer to edit his shipping address on PayPal.
	 * Character length and limitations: 20 single-byte characters 	 
	 */ 
	private String token;

	/**
	 * All the Data required to initiate the checkout session is
	 * passed in this element. 	  
	 *@Required	 
	 */ 
	private SetDataRequestType setDataRequest;

	/**
	 * If auto authorization is required, this should be passed in
	 * with IsRequested set to yes. 	 
	 */ 
	private AuthorizationRequestType authorizationRequest;

	

	/**
	 * Constructor with arguments
	 */
	public ExecuteCheckoutOperationsRequestDetailsType (SetDataRequestType setDataRequest){
		this.setDataRequest = setDataRequest;
	}	

	/**
	 * Default Constructor
	 */
	public ExecuteCheckoutOperationsRequestDetailsType (){
	}	

	/**
	 * Getter for token
	 */
	 public String getToken() {
	 	return token;
	 }
	 
	/**
	 * Setter for token
	 */
	 public void setToken(String token) {
	 	this.token = token;
	 }
	 
	/**
	 * Getter for setDataRequest
	 */
	 public SetDataRequestType getSetDataRequest() {
	 	return setDataRequest;
	 }
	 
	/**
	 * Setter for setDataRequest
	 */
	 public void setSetDataRequest(SetDataRequestType setDataRequest) {
	 	this.setDataRequest = setDataRequest;
	 }
	 
	/**
	 * Getter for authorizationRequest
	 */
	 public AuthorizationRequestType getAuthorizationRequest() {
	 	return authorizationRequest;
	 }
	 
	/**
	 * Setter for authorizationRequest
	 */
	 public void setAuthorizationRequest(AuthorizationRequestType authorizationRequest) {
	 	this.authorizationRequest = authorizationRequest;
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
		if(token != null) {
			sb.append("<").append(preferredPrefix).append(":Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(token));
			sb.append("</").append(preferredPrefix).append(":Token>");
		}
		if(setDataRequest != null) {
			sb.append(setDataRequest.toXMLString(preferredPrefix,"SetDataRequest"));
		}
		if(authorizationRequest != null) {
			sb.append(authorizationRequest.toXMLString(preferredPrefix,"AuthorizationRequest"));
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