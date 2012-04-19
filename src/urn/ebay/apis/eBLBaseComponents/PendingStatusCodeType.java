/**
 * Auto generated code
 * PendingStatusCodeType 
 * The pending status for a PayPal Payment transaction which matches the output from IPN
 */
package urn.ebay.apis.eBLBaseComponents;

public enum PendingStatusCodeType {

 		NONE("none"),
 		ECHECK("echeck"),
 		INTL("intl"),
 		VERIFY("verify"),
 		ADDRESS("address"),
 		UNILATERAL("unilateral"),
 		OTHER("other"),
 		UPGRADE("upgrade"),
 		MULTICURRENCY("multi-currency"),
 		AUTHORIZATION("authorization"),
 		ORDER("order"),
 		PAYMENTREVIEW("payment-review"),
		;
		private String value;
		PendingStatusCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PendingStatusCodeType fromValue(String v) {
			for (PendingStatusCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
