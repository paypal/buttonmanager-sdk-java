package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  values for subscribe button text
 * 
 */
public enum  SubscribeTextType {

	BUYNOW("BUYNOW"),

	SUBSCRIBE("SUBSCRIBE");

	private String value;

	private SubscribeTextType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static SubscribeTextType fromValue(String v) {
		for (SubscribeTextType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}