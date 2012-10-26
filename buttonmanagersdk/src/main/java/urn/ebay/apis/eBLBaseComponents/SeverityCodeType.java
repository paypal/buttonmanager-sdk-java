package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *     SeverityCodeType
 *     This code identifies the Severity code types in terms of
 * whether
 *     there is an API-level error or warning that needs to be
 * communicated
 *     to the client.
 * 
 */
public enum  SeverityCodeType {

	WARNING("Warning"),

	ERROR("Error"),

	PARTIALSUCCESS("PartialSuccess"),

	CUSTOMCODE("CustomCode");

	private String value;

	private SeverityCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static SeverityCodeType fromValue(String v) {
		for (SeverityCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}