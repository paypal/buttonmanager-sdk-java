package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  values for buynow button text
 * 
 */
public enum  BuyNowTextType {

	BUYNOW("BUYNOW"),

	PAYNOW("PAYNOW");

	private String value;

	private BuyNowTextType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static BuyNowTextType fromValue(String v) {
		for (BuyNowTextType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}