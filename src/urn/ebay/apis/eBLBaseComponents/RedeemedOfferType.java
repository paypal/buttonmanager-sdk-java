/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum RedeemedOfferType {

 		MERCHANTCOUPON("MERCHANT_COUPON"),
 		LOYALTYCARD("LOYALTY_CARD"),
 		MANUFACTURERCOUPON("MANUFACTURER_COUPON"),
 		RESERVED("RESERVED"),
		;
		private String value;
		RedeemedOfferType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static RedeemedOfferType fromValue(String v) {
			for (RedeemedOfferType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
