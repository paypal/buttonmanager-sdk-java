package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  LandingPageType 
 *  This is the PayPal payment Landing Page details type (used
 * by Express Checkout)
 * 
 */
public enum  LandingPageType {

	NONE("None"),

	LOGIN("Login"),

	BILLING("Billing");

	private String value;

	private LandingPageType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static LandingPageType fromValue(String v) {
		for (LandingPageType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}