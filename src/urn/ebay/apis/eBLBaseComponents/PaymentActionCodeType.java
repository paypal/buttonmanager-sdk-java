/**
 * Auto generated code
 * PaymentDetailsCodeType 
 * This is the PayPal payment details type (used by DCC and Express Checkout)
 */
package urn.ebay.apis.eBLBaseComponents;

public enum PaymentActionCodeType {

 		NONE("None"),
 		AUTHORIZATION("Authorization"),
 		SALE("Sale"),
 		ORDER("Order"),
		;
		private String value;
		PaymentActionCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PaymentActionCodeType fromValue(String v) {
			for (PaymentActionCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
