
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.BankAccountTypeType;


/**
 * BankAccountDetailsType 
 */
public class BankAccountDetailsType {

	/**
	 * Name of bank
	 * Character length and limitations: 192 alphanumeric characters	 */
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String value) {
		this.Name = value;
	}

	/**
	 * Type of bank account: Checking or Savings	 */
	private BankAccountTypeType Type;
	public BankAccountTypeType getType() {
		return Type;
	}
	public void setType(BankAccountTypeType value) {
		this.Type = value;
	}

	/**
	 * Merchant’s bank routing number
	 * Character length and limitations: 23 alphanumeric characters	 */
	private String RoutingNumber;
	public String getRoutingNumber() {
		return RoutingNumber;
	}
	public void setRoutingNumber(String value) {
		this.RoutingNumber = value;
	}

	/**
	 * Merchant’s bank account number
	 * Character length and limitations: 256 alphanumeric characters	 */
	private String AccountNumber;
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String value) {
		this.AccountNumber = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Name != null ) {
			sb.append("<ebl:Name>").append(Name);
			sb.append("</ebl:Name>");
		}
		if( Type != null ) {
			sb.append("<ebl:Type>").append( Type.getValue());
			sb.append("</ebl:Type>");
		}
		if( RoutingNumber != null ) {
			sb.append("<ebl:RoutingNumber>").append(RoutingNumber);
			sb.append("</ebl:RoutingNumber>");
		}
		if( AccountNumber != null ) {
			sb.append("<ebl:AccountNumber>").append(AccountNumber);
			sb.append("</ebl:AccountNumber>");
		}
		return sb.toString();
	}

}
