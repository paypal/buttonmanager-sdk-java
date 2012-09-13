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


	/**
	 * 	 
	 */ 
	private CreditCardNumberTypeType CreditCardNumberType;

	/**
	 * 	 
	 */ 
	private Integer ExpMonth;

	/**
	 * 	 
	 */ 
	private Integer ExpYear;

	/**
	 * 	 
	 */ 
	private PersonNameType CardOwnerName;

	/**
	 * 	 
	 */ 
	private AddressType BillingAddress;

	/**
	 * 	 
	 */ 
	private String CVV2;

	/**
	 * 	 
	 */ 
	private Integer StartMonth;

	/**
	 * 	 
	 */ 
	private Integer StartYear;

	/**
	 * 	 
	 */ 
	private String IssueNumber;

	

	/**
	 * Default Constructor
	 */
	public ReferenceCreditCardDetailsType (){
	}	

	/**
	 * Getter for CreditCardNumberType
	 */
	 public CreditCardNumberTypeType getCreditCardNumberType() {
	 	return CreditCardNumberType;
	 }
	 
	/**
	 * Setter for CreditCardNumberType
	 */
	 public void setCreditCardNumberType(CreditCardNumberTypeType CreditCardNumberType) {
	 	this.CreditCardNumberType = CreditCardNumberType;
	 }
	 
	/**
	 * Getter for ExpMonth
	 */
	 public Integer getExpMonth() {
	 	return ExpMonth;
	 }
	 
	/**
	 * Setter for ExpMonth
	 */
	 public void setExpMonth(Integer ExpMonth) {
	 	this.ExpMonth = ExpMonth;
	 }
	 
	/**
	 * Getter for ExpYear
	 */
	 public Integer getExpYear() {
	 	return ExpYear;
	 }
	 
	/**
	 * Setter for ExpYear
	 */
	 public void setExpYear(Integer ExpYear) {
	 	this.ExpYear = ExpYear;
	 }
	 
	/**
	 * Getter for CardOwnerName
	 */
	 public PersonNameType getCardOwnerName() {
	 	return CardOwnerName;
	 }
	 
	/**
	 * Setter for CardOwnerName
	 */
	 public void setCardOwnerName(PersonNameType CardOwnerName) {
	 	this.CardOwnerName = CardOwnerName;
	 }
	 
	/**
	 * Getter for BillingAddress
	 */
	 public AddressType getBillingAddress() {
	 	return BillingAddress;
	 }
	 
	/**
	 * Setter for BillingAddress
	 */
	 public void setBillingAddress(AddressType BillingAddress) {
	 	this.BillingAddress = BillingAddress;
	 }
	 
	/**
	 * Getter for CVV2
	 */
	 public String getCVV2() {
	 	return CVV2;
	 }
	 
	/**
	 * Setter for CVV2
	 */
	 public void setCVV2(String CVV2) {
	 	this.CVV2 = CVV2;
	 }
	 
	/**
	 * Getter for StartMonth
	 */
	 public Integer getStartMonth() {
	 	return StartMonth;
	 }
	 
	/**
	 * Setter for StartMonth
	 */
	 public void setStartMonth(Integer StartMonth) {
	 	this.StartMonth = StartMonth;
	 }
	 
	/**
	 * Getter for StartYear
	 */
	 public Integer getStartYear() {
	 	return StartYear;
	 }
	 
	/**
	 * Setter for StartYear
	 */
	 public void setStartYear(Integer StartYear) {
	 	this.StartYear = StartYear;
	 }
	 
	/**
	 * Getter for IssueNumber
	 */
	 public String getIssueNumber() {
	 	return IssueNumber;
	 }
	 
	/**
	 * Setter for IssueNumber
	 */
	 public void setIssueNumber(String IssueNumber) {
	 	this.IssueNumber = IssueNumber;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(CreditCardNumberType != null) {
			sb.append("<ebl:CreditCardNumberType>");
			sb.append(CreditCardNumberType.toXMLString());
			sb.append("</ebl:CreditCardNumberType>");
		}
		if(ExpMonth != null) {
			sb.append("<ebl:ExpMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExpMonth));
			sb.append("</ebl:ExpMonth>");
		}
		if(ExpYear != null) {
			sb.append("<ebl:ExpYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExpYear));
			sb.append("</ebl:ExpYear>");
		}
		if(CardOwnerName != null) {
			sb.append("<ebl:CardOwnerName>");
			sb.append(CardOwnerName.toXMLString());
			sb.append("</ebl:CardOwnerName>");
		}
		if(BillingAddress != null) {
			sb.append("<ebl:BillingAddress>");
			sb.append(BillingAddress.toXMLString());
			sb.append("</ebl:BillingAddress>");
		}
		if(CVV2 != null) {
			sb.append("<ebl:CVV2>").append(SDKUtil.escapeInvalidXmlCharsRegex(CVV2));
			sb.append("</ebl:CVV2>");
		}
		if(StartMonth != null) {
			sb.append("<ebl:StartMonth>").append(SDKUtil.escapeInvalidXmlCharsRegex(StartMonth));
			sb.append("</ebl:StartMonth>");
		}
		if(StartYear != null) {
			sb.append("<ebl:StartYear>").append(SDKUtil.escapeInvalidXmlCharsRegex(StartYear));
			sb.append("</ebl:StartYear>");
		}
		if(IssueNumber != null) {
			sb.append("<ebl:IssueNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(IssueNumber));
			sb.append("</ebl:IssueNumber>");
		}
		return sb.toString();
	}

}