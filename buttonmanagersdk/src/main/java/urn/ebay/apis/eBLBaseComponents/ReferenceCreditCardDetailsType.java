package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CreditCardNumberTypeType;
import urn.ebay.apis.eBLBaseComponents.PersonNameType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import com.paypal.core.SDKUtil;

/**
 * CreditCardDetailsType for DCC Reference Transaction
 * Information about a Credit Card. 
 */
public class ReferenceCreditCardDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private CreditCardNumberTypeType creditCardNumberType;

	/**
	 * 	 
	 */ 
	private Integer expMonth;

	/**
	 * 	 
	 */ 
	private Integer expYear;

	/**
	 * 	 
	 */ 
	private PersonNameType cardOwnerName;

	/**
	 * 	 
	 */ 
	private AddressType billingAddress;

	/**
	 * 	 
	 */ 
	private String cVV2;

	/**
	 * 	 
	 */ 
	private Integer startMonth;

	/**
	 * 	 
	 */ 
	private Integer startYear;

	/**
	 * 	 
	 */ 
	private String issueNumber;

	

	/**
	 * Default Constructor
	 */
	public ReferenceCreditCardDetailsType (){
	}	

	/**
	 * Getter for creditCardNumberType
	 */
	 public CreditCardNumberTypeType getCreditCardNumberType() {
	 	return creditCardNumberType;
	 }
	 
	/**
	 * Setter for creditCardNumberType
	 */
	 public void setCreditCardNumberType(CreditCardNumberTypeType creditCardNumberType) {
	 	this.creditCardNumberType = creditCardNumberType;
	 }
	 
	/**
	 * Getter for expMonth
	 */
	 public Integer getExpMonth() {
	 	return expMonth;
	 }
	 
	/**
	 * Setter for expMonth
	 */
	 public void setExpMonth(Integer expMonth) {
	 	this.expMonth = expMonth;
	 }
	 
	/**
	 * Getter for expYear
	 */
	 public Integer getExpYear() {
	 	return expYear;
	 }
	 
	/**
	 * Setter for expYear
	 */
	 public void setExpYear(Integer expYear) {
	 	this.expYear = expYear;
	 }
	 
	/**
	 * Getter for cardOwnerName
	 */
	 public PersonNameType getCardOwnerName() {
	 	return cardOwnerName;
	 }
	 
	/**
	 * Setter for cardOwnerName
	 */
	 public void setCardOwnerName(PersonNameType cardOwnerName) {
	 	this.cardOwnerName = cardOwnerName;
	 }
	 
	/**
	 * Getter for billingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return billingAddress;
	 }
	 
	/**
	 * Setter for billingAddress
	 */
	 public void setBillingAddress(AddressType billingAddress) {
	 	this.billingAddress = billingAddress;
	 }
	 
	/**
	 * Getter for cVV2
	 */
	 public String getCVV2() {
	 	return cVV2;
	 }
	 
	/**
	 * Setter for cVV2
	 */
	 public void setCVV2(String cVV2) {
	 	this.cVV2 = cVV2;
	 }
	 
	/**
	 * Getter for startMonth
	 */
	 public Integer getStartMonth() {
	 	return startMonth;
	 }
	 
	/**
	 * Setter for startMonth
	 */
	 public void setStartMonth(Integer startMonth) {
	 	this.startMonth = startMonth;
	 }
	 
	/**
	 * Getter for startYear
	 */
	 public Integer getStartYear() {
	 	return startYear;
	 }
	 
	/**
	 * Setter for startYear
	 */
	 public void setStartYear(Integer startYear) {
	 	this.startYear = startYear;
	 }
	 
	/**
	 * Getter for issueNumber
	 */
	 public String getIssueNumber() {
	 	return issueNumber;
	 }
	 
	/**
	 * Setter for issueNumber
	 */
	 public void setIssueNumber(String issueNumber) {
	 	this.issueNumber = issueNumber;
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
		if(creditCardNumberType != null) {
			sb.append(creditCardNumberType.toXMLString(preferredPrefix,"CreditCardNumberType"));
		}
		if(expMonth != null) {
			sb.append("<").append(preferredPrefix).append(":ExpMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(expMonth));
			sb.append("</").append(preferredPrefix).append(":ExpMonth>");
		}
		if(expYear != null) {
			sb.append("<").append(preferredPrefix).append(":ExpYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(expYear));
			sb.append("</").append(preferredPrefix).append(":ExpYear>");
		}
		if(cardOwnerName != null) {
			sb.append(cardOwnerName.toXMLString(preferredPrefix,"CardOwnerName"));
		}
		if(billingAddress != null) {
			sb.append(billingAddress.toXMLString(preferredPrefix,"BillingAddress"));
		}
		if(cVV2 != null) {
			sb.append("<").append(preferredPrefix).append(":CVV2>").append(SDKUtil.escapeInvalidXmlCharsRegex(cVV2));
			sb.append("</").append(preferredPrefix).append(":CVV2>");
		}
		if(startMonth != null) {
			sb.append("<").append(preferredPrefix).append(":StartMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(startMonth));
			sb.append("</").append(preferredPrefix).append(":StartMonth>");
		}
		if(startYear != null) {
			sb.append("<").append(preferredPrefix).append(":StartYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(startYear));
			sb.append("</").append(preferredPrefix).append(":StartYear>");
		}
		if(issueNumber != null) {
			sb.append("<").append(preferredPrefix).append(":IssueNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(issueNumber));
			sb.append("</").append(preferredPrefix).append(":IssueNumber>");
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