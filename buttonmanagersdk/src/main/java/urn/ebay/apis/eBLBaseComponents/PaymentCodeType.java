package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PaymentCodeType 
 *  This is the type of PayPal payment which matches the output
 * from IPN.
 * 
 */
public enum  PaymentCodeType {

	NONE("none"),

	ECHECK("echeck"),

	INSTANT("instant");

	private String value;

	private PaymentCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentCodeType fromValue(String v) {
		for (PaymentCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}