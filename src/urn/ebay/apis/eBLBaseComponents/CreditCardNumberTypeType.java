package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CreditCardTypeType;

/**
 * No Document Comments
 */
public class CreditCardNumberTypeType{


	/**
	 * No Document Comments	 
	 */ 
	private CreditCardTypeType CreditCardType;

	/**
	 * No Document Comments	 
	 */ 
	private String CreditCardNumber;

	

	/**
	 * Default Constructor
	 */
	public CreditCardNumberTypeType (){
	}	

	/**
	 * Getter for CreditCardType
	 */
	 public CreditCardTypeType getCreditCardType() {
	 	return CreditCardType;
	 }
	 
	/**
	 * Setter for CreditCardType
	 */
	 public void setCreditCardType(CreditCardTypeType CreditCardType) {
	 	this.CreditCardType = CreditCardType;
	 }
	 
	/**
	 * Getter for CreditCardNumber
	 */
	 public String getCreditCardNumber() {
	 	return CreditCardNumber;
	 }
	 
	/**
	 * Setter for CreditCardNumber
	 */
	 public void setCreditCardNumber(String CreditCardNumber) {
	 	this.CreditCardNumber = CreditCardNumber;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(CreditCardType != null) {
			sb.append("<ebl:CreditCardType>").append(CreditCardType.getValue());
			sb.append("</ebl:CreditCardType>");
		}
		if(CreditCardNumber != null) {
			sb.append("<ebl:CreditCardNumber>").append(CreditCardNumber);
			sb.append("</ebl:CreditCardNumber>");
		}
		return sb.toString();
	}

}