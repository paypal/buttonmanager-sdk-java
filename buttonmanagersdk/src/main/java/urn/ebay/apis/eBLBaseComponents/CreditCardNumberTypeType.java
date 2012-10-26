package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CreditCardTypeType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class CreditCardNumberTypeType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private CreditCardTypeType creditCardType;

	/**
	 * 	 
	 */ 
	private String creditCardNumber;

	

	/**
	 * Default Constructor
	 */
	public CreditCardNumberTypeType (){
	}	

	/**
	 * Getter for creditCardType
	 */
	 public CreditCardTypeType getCreditCardType() {
	 	return creditCardType;
	 }
	 
	/**
	 * Setter for creditCardType
	 */
	 public void setCreditCardType(CreditCardTypeType creditCardType) {
	 	this.creditCardType = creditCardType;
	 }
	 
	/**
	 * Getter for creditCardNumber
	 */
	 public String getCreditCardNumber() {
	 	return creditCardNumber;
	 }
	 
	/**
	 * Setter for creditCardNumber
	 */
	 public void setCreditCardNumber(String creditCardNumber) {
	 	this.creditCardNumber = creditCardNumber;
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
		if(creditCardType != null) {
			sb.append("<").append(preferredPrefix).append(":CreditCardType>").append(SDKUtil.escapeInvalidXmlCharsRegex(creditCardType.getValue()));
			sb.append("</").append(preferredPrefix).append(":CreditCardType>");
		}
		if(creditCardNumber != null) {
			sb.append("<").append(preferredPrefix).append(":CreditCardNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(creditCardNumber));
			sb.append("</").append(preferredPrefix).append(":CreditCardNumber>");
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