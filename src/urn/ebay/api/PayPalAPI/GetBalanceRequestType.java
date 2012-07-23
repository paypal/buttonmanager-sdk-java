package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * No Document Comments
 */
public class GetBalanceRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	 
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
			sb.append("<urn:ReturnAllCurrencies>").append(ReturnAllCurrencies);
			sb.append("</urn:ReturnAllCurrencies>");
		}
		return sb.toString();
	}

}