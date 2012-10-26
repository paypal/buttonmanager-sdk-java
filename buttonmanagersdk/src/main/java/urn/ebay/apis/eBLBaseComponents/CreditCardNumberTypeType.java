package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CreditCardTypeType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreditCardNumberTypeType{


	/**
	 * 	 
	 */ 
	private CreditCardTypeType CreditCardType;

	/**
	 * 	 
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
			sb.append("<ebl:CreditCardType>").append(SDKUtil.escapeInvalidXmlCharsRegex(CreditCardType.getValue()));
			sb.append("</ebl:CreditCardType>");
		}
		if(CreditCardNumber != null) {
			sb.append("<ebl:CreditCardNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(CreditCardNumber));
			sb.append("</ebl:CreditCardNumber>");
		}
		return sb.toString();
	}


}