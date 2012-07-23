package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PayPalUserStatusCodeType 
 *  PayPal status of a user Address
 * 
 */
public enum  PayPalUserStatusCodeType {

	VERIFIED("verified"),

	UNVERIFIED("unverified");

	private String value;

	private PayPalUserStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PayPalUserStatusCodeType fromValue(String v) {
		for (PayPalUserStatusCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}