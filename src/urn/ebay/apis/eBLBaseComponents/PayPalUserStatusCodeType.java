/**
 * Auto generated code
 * PayPalUserStatusCodeType 
 * PayPal status of a user Address
 */
package urn.ebay.apis.eBLBaseComponents;

public enum PayPalUserStatusCodeType {

 		VERIFIED("verified"),
 		UNVERIFIED("unverified"),
		;
		private String value;
		PayPalUserStatusCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PayPalUserStatusCodeType fromValue(String v) {
			for (PayPalUserStatusCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
