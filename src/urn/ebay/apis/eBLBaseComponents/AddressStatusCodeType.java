/**
 * Auto generated code
 * AddressStatusCodeType 
 * This is the PayPal address status
 */
package urn.ebay.apis.eBLBaseComponents;

public enum AddressStatusCodeType {

 		NONE("None"),
 		CONFIRMED("Confirmed"),
 		UNCONFIRMED("Unconfirmed"),
		;
		private String value;
		AddressStatusCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static AddressStatusCodeType fromValue(String v) {
			for (AddressStatusCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
