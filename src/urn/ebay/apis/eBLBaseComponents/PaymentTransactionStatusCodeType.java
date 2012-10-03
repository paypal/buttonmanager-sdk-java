package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PaymentTransactionStatusCodeType 
 *  The status of the PayPal payment.
 * 
 */
public enum  PaymentTransactionStatusCodeType {

	PENDING("Pending"),

	PROCESSING("Processing"),

	SUCCESS("Success"),

	DENIED("Denied"),

	REVERSED("Reversed");

	private String value;

	private PaymentTransactionStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentTransactionStatusCodeType fromValue(String v) {
		for (PaymentTransactionStatusCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}