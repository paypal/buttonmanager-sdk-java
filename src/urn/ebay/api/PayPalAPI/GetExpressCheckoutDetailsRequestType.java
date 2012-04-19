
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
A timestamped token, the value of which was returned by SetExpressCheckoutResponse. 
 * Required
 * Character length and limitations: 20 single-byte characters
 */
public class GetExpressCheckoutDetailsRequestType extends AbstractRequestType{

	/**
A timestamped token, the value of which was returned by SetExpressCheckoutResponse. 
	 * Required
	 * Character length and limitations: 20 single-byte characters
	 *
	 * @Required
	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
	}


	public GetExpressCheckoutDetailsRequestType(String Token) {
		this.Token = Token;
	}
	public GetExpressCheckoutDetailsRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( Token != null ) {
			sb.append("<urn:Token>").append(Token);
			sb.append("</urn:Token>");
		}
		return sb.toString();
	}

}
