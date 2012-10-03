package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  ChannelType - Type declaration to be used by other schemas.
 *  This is the PayPal Channel type (used by Express Checkout)
 * 
 */
public enum  ChannelType {

	MERCHANT("Merchant"),

	EBAYITEM("eBayItem");

	private String value;

	private ChannelType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ChannelType fromValue(String v) {
		for (ChannelType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}