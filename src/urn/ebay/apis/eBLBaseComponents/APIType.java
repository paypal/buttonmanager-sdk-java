/**
 * Auto generated code
Supported API Types for DoCancel operation */
package urn.ebay.apis.eBLBaseComponents;

public enum APIType {

 		CHECKOUTAUTHORIZATION("CHECKOUT_AUTHORIZATION"),
 		CHECKOUTSALE("CHECKOUT_SALE"),
		;
		private String value;
		APIType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static APIType fromValue(String v) {
			for (APIType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
