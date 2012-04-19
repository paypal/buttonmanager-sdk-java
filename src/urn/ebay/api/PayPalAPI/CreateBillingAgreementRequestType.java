
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 */
public class CreateBillingAgreementRequestType extends AbstractRequestType{

	/**
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


	public CreateBillingAgreementRequestType(String Token) {
		this.Token = Token;
	}
	public CreateBillingAgreementRequestType() {
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
