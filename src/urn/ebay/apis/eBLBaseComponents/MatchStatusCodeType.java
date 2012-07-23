package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  MatchStatusCodeType 
 *  This is the PayPal (street/zip) match code
 * 
 */
public enum  MatchStatusCodeType {

	NONE("None"),

	MATCHED("Matched"),

	UNMATCHED("Unmatched");

	private String value;

	private MatchStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static MatchStatusCodeType fromValue(String v) {
		for (MatchStatusCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}