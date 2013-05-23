package urn.ebay.apis.eBLBaseComponents;

/**
 * Supported API Types for DoCancel operation
 */
public enum  APIType {

	CHECKOUTAUTHORIZATION("CHECKOUT_AUTHORIZATION"),

	CHECKOUTSALE("CHECKOUT_SALE");

	private String value;

	private APIType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static APIType fromValue(String v) {
		for (APIType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}