package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * A unique token returned by the EnterBoarding API call that
 * identifies this boarding session. RequiredCharacter length
 * and limitations: 64 alphanumeric characters. The token has
 * the following format:OB-61characterstring
 */
public class GetBoardingDetailsRequestType extends AbstractRequestType {


	/**
	 * A unique token returned by the EnterBoarding API call that
	 * identifies this boarding session. RequiredCharacter length
	 * and limitations: 64 alphanumeric characters. The token has
	 * the following format:OB-61characterstring	  
	 *@Required	 
	 */ 
	private String Token;

	

	/**
	 * Constructor with arguments
	 */
	public GetBoardingDetailsRequestType (String Token){
		this.Token = Token;
	}	

	/**
	 * Default Constructor
	 */
	public GetBoardingDetailsRequestType (){
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