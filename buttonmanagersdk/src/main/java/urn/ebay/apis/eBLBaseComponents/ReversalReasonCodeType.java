package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  ReversalReasonCodeType 
 *  Reason for a reversal on a PayPal transaction which matches
 * the output from IPN
 * 
 */
public enum  ReversalReasonCodeType {

	NONE("none"),

	CHARGEBACK("chargeback"),

	GUARANTEE("guarantee"),

	BUYERCOMPLAINT("buyer-complaint"),

	REFUND("refund"),

	OTHER("other");

	private String value;

	private ReversalReasonCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ReversalReasonCodeType fromValue(String v) {
		for (ReversalReasonCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}