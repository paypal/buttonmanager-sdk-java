package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *     AddressOwnerCodeType
 *     This code identifies the AddressOwner code types which
 * indicates
 *     who owns the user'a address.
 * 
 */
public enum  AddressOwnerCodeType {

	PAYPAL("PayPal"),

	EBAY("eBay"),

	CUSTOMCODE("CustomCode");

	private String value;

	private AddressOwnerCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static AddressOwnerCodeType fromValue(String v) {
		for (AddressOwnerCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}