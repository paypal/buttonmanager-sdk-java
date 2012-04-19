/**
 * Auto generated code
 * PaymentTransactionStatusCodeType 
 * The status of the PayPal payment.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum PaymentTransactionStatusCodeType {

 		PENDING("Pending"),
 		PROCESSING("Processing"),
 		SUCCESS("Success"),
 		DENIED("Denied"),
 		REVERSED("Reversed"),
		;
		private String value;
		PaymentTransactionStatusCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PaymentTransactionStatusCodeType fromValue(String v) {
			for (PaymentTransactionStatusCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
