package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  User Withdrawal Limit Type Type 
 * 
 */
public enum  UserWithdrawalLimitTypeType {

	UNKNOWN("Unknown"),

	LIMITED("Limited"),

	UNLIMITED("Unlimited");

	private String value;

	private UserWithdrawalLimitTypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static UserWithdrawalLimitTypeType fromValue(String v) {
		for (UserWithdrawalLimitTypeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}