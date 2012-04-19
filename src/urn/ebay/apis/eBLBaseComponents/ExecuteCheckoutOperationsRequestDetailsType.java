
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.AuthorizationRequestType;
import urn.ebay.apis.eBLBaseComponents.SetDataRequestType;


/**
 * On your first invocation of ExecuteCheckoutOperationsRequest, the value of this token is returned by ExecuteCheckoutOperationsResponse.
 * Optional
 * Include this element and its value only if you want to modify an existing checkout session with another invocation of ExecuteCheckoutOperationsRequest; for example, if you want the customer to edit his shipping address on PayPal.
 * Character length and limitations: 20 single-byte characters
 */
public class ExecuteCheckoutOperationsRequestDetailsType {

	/**
	 * On your first invocation of ExecuteCheckoutOperationsRequest, the value of this token is returned by ExecuteCheckoutOperationsResponse.
	 * Optional
	 * Include this element and its value only if you want to modify an existing checkout session with another invocation of ExecuteCheckoutOperationsRequest; for example, if you want the customer to edit his shipping address on PayPal.
	 * Character length and limitations: 20 single-byte characters
	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
	}

	/**
	 * All the Data required to initiate the checkout session is passed in this element.
	 *
	 * @Required
	 */
	private SetDataRequestType SetDataRequest;
	public SetDataRequestType getSetDataRequest() {
		return SetDataRequest;
	}
	public void setSetDataRequest(SetDataRequestType value) {
		this.SetDataRequest = value;
	}

	/**
	 * If auto authorization is required, this should be passed in with IsRequested set to yes.
	 */
	private AuthorizationRequestType AuthorizationRequest;
	public AuthorizationRequestType getAuthorizationRequest() {
		return AuthorizationRequest;
	}
	public void setAuthorizationRequest(AuthorizationRequestType value) {
		this.AuthorizationRequest = value;
	}


	public ExecuteCheckoutOperationsRequestDetailsType(SetDataRequestType SetDataRequest) {
		this.SetDataRequest = SetDataRequest;
	}
	public ExecuteCheckoutOperationsRequestDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Token != null ) {
			sb.append("<ebl:Token>").append(Token);
			sb.append("</ebl:Token>");
		}
		if( SetDataRequest != null ) {
			sb.append("<ebl:SetDataRequest>");
			sb.append(SetDataRequest.toXMLString());
			sb.append("</ebl:SetDataRequest>");
		}
		if( AuthorizationRequest != null ) {
			sb.append("<ebl:AuthorizationRequest>");
			sb.append(AuthorizationRequest.toXMLString());
			sb.append("</ebl:AuthorizationRequest>");
		}
		return sb.toString();
	}

}
