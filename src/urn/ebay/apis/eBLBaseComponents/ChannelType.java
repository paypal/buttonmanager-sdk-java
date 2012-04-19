/**
 * Auto generated code
 * ChannelType - Type declaration to be used by other schemas.
 * This is the PayPal Channel type (used by Express Checkout)
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ChannelType {

 		MERCHANT("Merchant"),
 		EBAYITEM("eBayItem"),
		;
		private String value;
		ChannelType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ChannelType fromValue(String v) {
			for (ChannelType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
