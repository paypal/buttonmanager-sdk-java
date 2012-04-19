/**
 * Auto generated code
 * LandingPageType 
 * This is the PayPal payment Landing Page details type (used by Express Checkout)
 */
package urn.ebay.apis.eBLBaseComponents;

public enum LandingPageType {

 		NONE("None"),
 		LOGIN("Login"),
 		BILLING("Billing"),
		;
		private String value;
		LandingPageType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static LandingPageType fromValue(String v) {
			for (LandingPageType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
