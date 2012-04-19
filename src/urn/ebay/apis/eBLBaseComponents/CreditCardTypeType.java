/**
 * Auto generated code
 * Type declaration to be used by other schemas.
 * This is the credit card type
 */
package urn.ebay.apis.eBLBaseComponents;

public enum CreditCardTypeType {

 		VISA("Visa"),
 		MASTERCARD("MasterCard"),
 		DISCOVER("Discover"),
 		AMEX("Amex"),
 		SWITCH("Switch"),
 		SOLO("Solo"),
 		MAESTRO("Maestro"),
		;
		private String value;
		CreditCardTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static CreditCardTypeType fromValue(String v) {
			for (CreditCardTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
