/**
 * Auto generated code
 * values for subscribe button text
 */
package urn.ebay.apis.eBLBaseComponents;

public enum SubscribeTextType {

 		BUYNOW("BUYNOW"),
 		SUBSCRIBE("SUBSCRIBE"),
		;
		private String value;
		SubscribeTextType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static SubscribeTextType fromValue(String v) {
			for (SubscribeTextType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
