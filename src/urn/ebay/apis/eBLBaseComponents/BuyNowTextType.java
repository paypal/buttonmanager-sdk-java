/**
 * Auto generated code
 * values for buynow button text
 */
package urn.ebay.apis.eBLBaseComponents;

public enum BuyNowTextType {

 		BUYNOW("BUYNOW"),
 		PAYNOW("PAYNOW"),
		;
		private String value;
		BuyNowTextType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static BuyNowTextType fromValue(String v) {
			for (BuyNowTextType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
