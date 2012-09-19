package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreateBillingAgreementRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String Token;

	

	/**
	 * Constructor with arguments
	 */
	public CreateBillingAgreementRequestType (String Token){
		this.Token = Token;
	}	

	/**
	 * Default Constructor
	 */
	public CreateBillingAgreementRequestType (){
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
			sb.append("<urn:Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(Token));
			sb.append("</urn:Token>");
		}
		return sb.toString();
	}


}