package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 */
public enum  ItemCategoryType {

	PHYSICAL("Physical"),

	DIGITAL("Digital");

	private String value;

	private ItemCategoryType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ItemCategoryType fromValue(String v) {
		for (ItemCategoryType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}