package urn.ebay.apis.eBLBaseComponents;

/**
 * Normalization Status of the Address
 *  
 */
public enum  AddressNormalizationStatusCodeType {

	NONE("None"),

	NORMALIZED("Normalized"),

	UNNORMALIZED("Unnormalized"),

	USERPREFERRED("UserPreferred");

	private String value;

	private AddressNormalizationStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static AddressNormalizationStatusCodeType fromValue(String v) {
		for (AddressNormalizationStatusCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}