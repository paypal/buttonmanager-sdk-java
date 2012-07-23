package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 */
public enum  FailedPaymentActionType {

	CANCELONFAILURE("CancelOnFailure"),

	CONTINUEONFAILURE("ContinueOnFailure");

	private String value;

	private FailedPaymentActionType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static FailedPaymentActionType fromValue(String v) {
		for (FailedPaymentActionType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}