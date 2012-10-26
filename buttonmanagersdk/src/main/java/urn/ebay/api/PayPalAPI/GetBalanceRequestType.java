package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetBalanceRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private String returnAllCurrencies;

	

	/**
	 * Default Constructor
	 */
	public GetBalanceRequestType (){
	}	

	/**
	 * Getter for returnAllCurrencies
	 */
	 public String getReturnAllCurrencies() {
	 	return returnAllCurrencies;
	 }
	 
	/**
	 * Setter for returnAllCurrencies
	 */
	 public void setReturnAllCurrencies(String returnAllCurrencies) {
	 	this.returnAllCurrencies = returnAllCurrencies;
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
		sb.append(super.toXMLString(prefix, null));
		if(returnAllCurrencies != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnAllCurrencies>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnAllCurrencies));
			sb.append("</").append(preferredPrefix).append(":ReturnAllCurrencies>");
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