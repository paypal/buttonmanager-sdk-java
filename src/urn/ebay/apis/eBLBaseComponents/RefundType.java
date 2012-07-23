package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  RefundType - Type declaration to be used by other 
 *  schema. This code identifies the types of refund
 * transactions 
 *  supported.
 * 
 */
public enum  RefundType {

	OTHER("Other"),

	FULL("Full"),

	PARTIAL("Partial"),

	EXTERNALDISPUTE("ExternalDispute");

	private String value;

	private RefundType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static RefundType fromValue(String v) {
		for (RefundType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}