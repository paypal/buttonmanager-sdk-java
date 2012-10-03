package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  CompleteCodeType 
 *  This is the PayPal DoCapture CompleteType code
 * 
 */
public enum  CompleteCodeType {

	NOTCOMPLETE("NotComplete"),

	COMPLETE("Complete");

	private String value;

	private CompleteCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static CompleteCodeType fromValue(String v) {
		for (CompleteCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}