package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  AddressStatusCodeType 
 *  This is the PayPal address status
 * 
 */
public enum  AddressStatusCodeType {

	NONE("None"),

	CONFIRMED("Confirmed"),

	UNCONFIRMED("Unconfirmed");

	private String value;

	private AddressStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static AddressStatusCodeType fromValue(String v) {
		for (AddressStatusCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}