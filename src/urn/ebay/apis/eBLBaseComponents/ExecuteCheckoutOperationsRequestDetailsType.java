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
	private String Token;

	/**
	 * All the Data required to initiate the checkout session is
	 * passed in this element. 	  
	 *@Required	 
	 */ 
	private SetDataRequestType SetDataRequest;

	/**
	 * If auto authorization is required, this should be passed in
	 * with IsRequested set to yes. 	 
	 */ 
	private AuthorizationRequestType AuthorizationRequest;

	

	/**
	 * Constructor with arguments
	 */
	public ExecuteCheckoutOperationsRequestDetailsType (SetDataRequestType SetDataRequest){
		this.SetDataRequest = SetDataRequest;
	}	

	/**
	 * Default Constructor
	 */
	public ExecuteCheckoutOperationsRequestDetailsType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
	 }
	 
	/**
	 * Getter for SetDataRequest
	 */
	 public SetDataRequestType getSetDataRequest() {
	 	return SetDataRequest;
	 }
	 
	/**
	 * Setter for SetDataRequest
	 */
	 public void setSetDataRequest(SetDataRequestType SetDataRequest) {
	 	this.SetDataRequest = SetDataRequest;
	 }
	 
	/**
	 * Getter for AuthorizationRequest
	 */
	 public AuthorizationRequestType getAuthorizationRequest() {
	 	return AuthorizationRequest;
	 }
	 
	/**
	 * Setter for AuthorizationRequest
	 */
	 public void setAuthorizationRequest(AuthorizationRequestType AuthorizationRequest) {
	 	this.AuthorizationRequest = AuthorizationRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Token != null) {
			sb.append("<ebl:Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(Token));
			sb.append("</ebl:Token>");
		}
		if(SetDataRequest != null) {
			sb.append("<ebl:SetDataRequest>");
			sb.append(SetDataRequest.toXMLString());
			sb.append("</ebl:SetDataRequest>");
		}
		if(AuthorizationRequest != null) {
			sb.append("<ebl:AuthorizationRequest>");
			sb.append(AuthorizationRequest.toXMLString());
			sb.append("</ebl:AuthorizationRequest>");
		}
		return sb.toString();
	}


}