package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetBalanceRequestType extends AbstractRequestType {


	/**
	 * 	 
	 */ 
	private String ReturnAllCurrencies;

	

	/**
	 * Default Constructor
	 */
	public GetBalanceRequestType (){
	}	

	/**
	 * Getter for ReturnAllCurrencies
	 */
	 public String getReturnAllCurrencies() {
	 	return ReturnAllCurrencies;
	 }
	 
	/**
	 * Setter for ReturnAllCurrencies
	 */
	 public void setReturnAllCurrencies(String ReturnAllCurrencies) {
	 	this.ReturnAllCurrencies = ReturnAllCurrencies;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(ReturnAllCurrencies != null) {
			sb.append("<urn:ReturnAllCurrencies>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReturnAllCurrencies));
			sb.append("</urn:ReturnAllCurrencies>");
		}
		return sb.toString();
	}


}