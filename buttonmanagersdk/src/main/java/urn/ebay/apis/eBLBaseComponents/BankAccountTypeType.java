package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  BankAccountTypeType 
 * 
 */
public enum  BankAccountTypeType {

	CHECKING("Checking"),

	SAVINGS("Savings");

	private String value;

	private BankAccountTypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static BankAccountTypeType fromValue(String v) {
		for (BankAccountTypeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}