/**
 * Auto generated code
 * PaymentCodeType 
 * This is the type of PayPal payment which matches the output from IPN.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum PaymentCodeType {

 		NONE("none"),
 		ECHECK("echeck"),
 		INSTANT("instant"),
		;
		private String value;
		PaymentCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PaymentCodeType fromValue(String v) {
			for (PaymentCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
