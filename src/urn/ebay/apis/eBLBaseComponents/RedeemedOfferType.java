package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 */
public enum  RedeemedOfferType {

	MERCHANTCOUPON("MERCHANT_COUPON"),

	LOYALTYCARD("LOYALTY_CARD"),

	MANUFACTURERCOUPON("MANUFACTURER_COUPON"),

	RESERVED("RESERVED");

	private String value;

	private RedeemedOfferType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static RedeemedOfferType fromValue(String v) {
		for (RedeemedOfferType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}