/**
 * Auto generated code
 * AddressOwnerCodeType
 * This code identifies the AddressOwner code types which indicates
 * who owns the user'a address.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum AddressOwnerCodeType {

 		PAYPAL("PayPal"),
 		EBAY("eBay"),
 		CUSTOMCODE("CustomCode"),
		;
		private String value;
		AddressOwnerCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static AddressOwnerCodeType fromValue(String v) {
			for (AddressOwnerCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
