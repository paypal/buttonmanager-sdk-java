package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  BusinessTypeType
 * 
 */
public enum  BusinessTypeType {

	UNKNOWN("Unknown"),

	INDIVIDUAL("Individual"),

	PROPRIETORSHIP("Proprietorship"),

	PARTNERSHIP("Partnership"),

	CORPORATION("Corporation"),

	NONPROFIT("Nonprofit"),

	GOVERNMENT("Government");

	private String value;

	private BusinessTypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static BusinessTypeType fromValue(String v) {
		for (BusinessTypeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}