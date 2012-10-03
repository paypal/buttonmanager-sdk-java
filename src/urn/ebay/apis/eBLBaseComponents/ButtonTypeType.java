package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  Types of buttons
 * 
 */
public enum  ButtonTypeType {

	BUYNOW("BUYNOW"),

	CART("CART"),

	GIFTCERTIFICATE("GIFTCERTIFICATE"),

	SUBSCRIBE("SUBSCRIBE"),

	DONATE("DONATE"),

	UNSUBSCRIBE("UNSUBSCRIBE"),

	VIEWCART("VIEWCART"),

	PAYMENTPLAN("PAYMENTPLAN"),

	AUTOBILLING("AUTOBILLING"),

	PAYMENT("PAYMENT");

	private String value;

	private ButtonTypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ButtonTypeType fromValue(String v) {
		for (ButtonTypeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}