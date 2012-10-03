package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PendingStatusCodeType 
 *  The pending status for a PayPal Payment transaction which
 * matches the output from IPN
 * 
 */
public enum  PendingStatusCodeType {

	NONE("none"),

	ECHECK("echeck"),

	INTL("intl"),

	VERIFY("verify"),

	ADDRESS("address"),

	UNILATERAL("unilateral"),

	OTHER("other"),

	UPGRADE("upgrade"),

	MULTICURRENCY("multi-currency"),

	AUTHORIZATION("authorization"),

	ORDER("order"),

	PAYMENTREVIEW("payment-review");

	private String value;

	private PendingStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PendingStatusCodeType fromValue(String v) {
		for (PendingStatusCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}