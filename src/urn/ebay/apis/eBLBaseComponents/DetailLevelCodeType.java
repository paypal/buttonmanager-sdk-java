package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *       DetailLevelCodeType   
 * 
 */
public enum  DetailLevelCodeType {

	RETURNALL("ReturnAll"),

	ITEMRETURNDESCRIPTION("ItemReturnDescription"),

	ITEMRETURNATTRIBUTES("ItemReturnAttributes");

	private String value;

	private DetailLevelCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static DetailLevelCodeType fromValue(String v) {
		for (DetailLevelCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}