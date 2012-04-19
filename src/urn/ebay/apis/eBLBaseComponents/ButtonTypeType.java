/**
 * Auto generated code
 * Types of buttons
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ButtonTypeType {

 		BUYNOW("BUYNOW"),
 		CART("CART"),
 		GIFTCERTIFICATE("GIFTCERTIFICATE"),
 		SUBSCRIBE("SUBSCRIBE"),
 		DONATE("DONATE"),
 		UNSUBSCRIBE("UNSUBSCRIBE"),
 		VIEWCART("VIEWCART"),
 		PAYMENTPLAN("PAYMENTPLAN"),
 		AUTOBILLING("AUTOBILLING"),
 		PAYMENT("PAYMENT"),
		;
		private String value;
		ButtonTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ButtonTypeType fromValue(String v) {
			for (ButtonTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
