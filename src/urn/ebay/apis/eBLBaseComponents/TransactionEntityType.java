package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  TransactionEntityType 
 *  This is the PayPal DoAuthorization TransactionEntityType
 * code
 * 
 */
public enum  TransactionEntityType {

	NONE("None"),

	AUTH("Auth"),

	REAUTH("Reauth"),

	ORDER("Order"),

	PAYMENT("Payment");

	private String value;

	private TransactionEntityType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static TransactionEntityType fromValue(String v) {
		for (TransactionEntityType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}