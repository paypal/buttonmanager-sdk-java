package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 */
public enum  WalletItemType {

	MERCHANTCOUPON("MERCHANT_COUPON"),

	LOYALTYCARD("LOYALTY_CARD"),

	MANUFACTURERCOUPON("MANUFACTURER_COUPON"),

	MERCHANTCLOSEDLOOPOFFER("MERCHANT_CLOSED_LOOP_OFFER");

	private String value;

	private WalletItemType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static WalletItemType fromValue(String v) {
		for (WalletItemType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}