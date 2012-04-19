
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 */
public class GetBalanceRequestType extends AbstractRequestType{

	/**
	 */
	private String ReturnAllCurrencies;
	public String getReturnAllCurrencies() {
		return ReturnAllCurrencies;
	}
	public void setReturnAllCurrencies(String value) {
		this.ReturnAllCurrencies = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( ReturnAllCurrencies != null ) {
			sb.append("<urn:ReturnAllCurrencies>").append(ReturnAllCurrencies);
			sb.append("</urn:ReturnAllCurrencies>");
		}
		return sb.toString();
	}

}
