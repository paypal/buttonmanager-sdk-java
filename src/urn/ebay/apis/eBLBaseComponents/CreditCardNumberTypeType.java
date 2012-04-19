
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.CreditCardTypeType;


/**
 */
public class CreditCardNumberTypeType {

	/**
	 */
	private CreditCardTypeType CreditCardType;
	public CreditCardTypeType getCreditCardType() {
		return CreditCardType;
	}
	public void setCreditCardType(CreditCardTypeType value) {
		this.CreditCardType = value;
	}

	/**
	 */
	private String CreditCardNumber;
	public String getCreditCardNumber() {
		return CreditCardNumber;
	}
	public void setCreditCardNumber(String value) {
		this.CreditCardNumber = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( CreditCardType != null ) {
			sb.append("<ebl:CreditCardType>").append( CreditCardType.getValue());
			sb.append("</ebl:CreditCardType>");
		}
		if( CreditCardNumber != null ) {
			sb.append("<ebl:CreditCardNumber>").append(CreditCardNumber);
			sb.append("</ebl:CreditCardNumber>");
		}
		return sb.toString();
	}

}
