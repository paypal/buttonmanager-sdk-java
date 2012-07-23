package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * A timestamped token, the value of which was returned by
 * SetExpressCheckoutResponse. RequiredCharacter length and
 * limitations: 20 single-byte characters
 */
public class GetExpressCheckoutDetailsRequestType extends AbstractRequestType {


	/**
	 * A timestamped token, the value of which was returned by
	 * SetExpressCheckoutResponse. RequiredCharacter length and
	 * limitations: 20 single-byte characters	  
	 *@Required	 
	 */ 
	private String Token;

	

	/**
	 * Constructor with arguments
	 */
	public GetExpressCheckoutDetailsRequestType (String Token){
		this.Token = Token;
	}	

	/**
	 * Default Constructor
	 */
	public GetExpressCheckoutDetailsRequestType (){
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
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(Token != null) {
			sb.append("<urn:Token>").append(Token);
			sb.append("</urn:Token>");
		}
		return sb.toString();
	}

}