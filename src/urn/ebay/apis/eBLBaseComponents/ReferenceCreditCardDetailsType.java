
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.CreditCardNumberTypeType;
import urn.ebay.apis.eBLBaseComponents.PersonNameType;


/**
 * CreditCardDetailsType for DCC Reference Transaction
 * Information about a Credit Card.
 */
public class ReferenceCreditCardDetailsType {

	/**
	 */
	private CreditCardNumberTypeType CreditCardNumberType;
	public CreditCardNumberTypeType getCreditCardNumberType() {
		return CreditCardNumberType;
	}
	public void setCreditCardNumberType(CreditCardNumberTypeType value) {
		this.CreditCardNumberType = value;
	}

	/**
	 */
	private Integer ExpMonth;
	public Integer getExpMonth() {
		return ExpMonth;
	}
	public void setExpMonth(Integer value) {
		this.ExpMonth = value;
	}

	/**
	 */
	private Integer ExpYear;
	public Integer getExpYear() {
		return ExpYear;
	}
	public void setExpYear(Integer value) {
		this.ExpYear = value;
	}

	/**
	 */
	private PersonNameType CardOwnerName;
	public PersonNameType getCardOwnerName() {
		return CardOwnerName;
	}
	public void setCardOwnerName(PersonNameType value) {
		this.CardOwnerName = value;
	}

	/**
	 */
	private AddressType BillingAddress;
	public AddressType getBillingAddress() {
		return BillingAddress;
	}
	public void setBillingAddress(AddressType value) {
		this.BillingAddress = value;
	}

	/**
	 */
	private String CVV2;
	public String getCVV2() {
		return CVV2;
	}
	public void setCVV2(String value) {
		this.CVV2 = value;
	}

	/**
	 */
	private Integer StartMonth;
	public Integer getStartMonth() {
		return StartMonth;
	}
	public void setStartMonth(Integer value) {
		this.StartMonth = value;
	}

	/**
	 */
	private Integer StartYear;
	public Integer getStartYear() {
		return StartYear;
	}
	public void setStartYear(Integer value) {
		this.StartYear = value;
	}

	/**
	 */
	private String IssueNumber;
	public String getIssueNumber() {
		return IssueNumber;
	}
	public void setIssueNumber(String value) {
		this.IssueNumber = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( CreditCardNumberType != null ) {
			sb.append("<ebl:CreditCardNumberType>");
			sb.append(CreditCardNumberType.toXMLString());
			sb.append("</ebl:CreditCardNumberType>");
		}
		if( ExpMonth != null ) {
			sb.append("<ebl:ExpMonth>").append(ExpMonth);
			sb.append("</ebl:ExpMonth>");
		}
		if( ExpYear != null ) {
			sb.append("<ebl:ExpYear>").append(ExpYear);
			sb.append("</ebl:ExpYear>");
		}
		if( CardOwnerName != null ) {
			sb.append("<ebl:CardOwnerName>");
			sb.append(CardOwnerName.toXMLString());
			sb.append("</ebl:CardOwnerName>");
		}
		if( BillingAddress != null ) {
			sb.append("<ebl:BillingAddress>");
			sb.append(BillingAddress.toXMLString());
			sb.append("</ebl:BillingAddress>");
		}
		if( CVV2 != null ) {
			sb.append("<ebl:CVV2>").append(CVV2);
			sb.append("</ebl:CVV2>");
		}
		if( StartMonth != null ) {
			sb.append("<ebl:StartMonth>").append(StartMonth);
			sb.append("</ebl:StartMonth>");
		}
		if( StartYear != null ) {
			sb.append("<ebl:StartYear>").append(StartYear);
			sb.append("</ebl:StartYear>");
		}
		if( IssueNumber != null ) {
			sb.append("<ebl:IssueNumber>").append(IssueNumber);
			sb.append("</ebl:IssueNumber>");
		}
		return sb.toString();
	}

}
