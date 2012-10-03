package urn.ebay.apis.eBLBaseComponents;

/**
 *  Defines couple relationship type between buckets 
 */
public enum  CoupleType {

	LIFETIME("LifeTime");

	private String value;

	private CoupleType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static CoupleType fromValue(String v) {
		for (CoupleType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}