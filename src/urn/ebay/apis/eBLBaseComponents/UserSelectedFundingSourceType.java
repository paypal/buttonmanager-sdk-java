package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  UserSelectedFundingSourceType
 *  User Selected Funding Source (used by Express Checkout)
 * 
 */
public enum  UserSelectedFundingSourceType {

	ELV("ELV"),

	CREDITCARD("CreditCard"),

	CHINAUNIONPAY("ChinaUnionPay"),

	BML("BML");

	private String value;

	private UserSelectedFundingSourceType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static UserSelectedFundingSourceType fromValue(String v) {
		for (UserSelectedFundingSourceType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}