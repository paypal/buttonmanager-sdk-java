package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PaymentStatusCodeType 
 *  This is the status of a PayPal Payment which matches the
 * output from IPN
 * 
 */
public enum  PaymentStatusCodeType {

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

	DELAYED("Delayed");

	private String value;

	private PaymentStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentStatusCodeType fromValue(String v) {
		for (PaymentStatusCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}