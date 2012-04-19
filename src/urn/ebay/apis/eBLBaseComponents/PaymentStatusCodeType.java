/**
 * Auto generated code
 * PaymentStatusCodeType 
 * This is the status of a PayPal Payment which matches the output from IPN
 */
package urn.ebay.apis.eBLBaseComponents;

public enum PaymentStatusCodeType {

 		NONE("None"),
 		COMPLETED("Completed"),
 		FAILED("Failed"),
 		PENDING("Pending"),
 		DENIED("Denied"),
 		REFUNDED("Refunded"),
 		REVERSED("Reversed"),
 		CANCELEDREVERSAL("Canceled-Reversal"),
 		PROCESSED("Processed"),
 		PARTIALLYREFUNDED("Partially-Refunded"),
 		VOIDED("Voided"),
 		EXPIRED("Expired"),
 		INPROGRESS("In-Progress"),
 		CREATED("Created"),
 		COMPLETEDFUNDSHELD("Completed-Funds-Held"),
 		INSTANT("Instant"),
 		DELAYED("Delayed"),
		;
		private String value;
		PaymentStatusCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PaymentStatusCodeType fromValue(String v) {
			for (PaymentStatusCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
