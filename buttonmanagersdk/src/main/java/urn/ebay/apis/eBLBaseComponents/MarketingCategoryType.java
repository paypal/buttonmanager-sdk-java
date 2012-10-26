package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *                         MarketingCategoryType 
 * 
 */
public enum  MarketingCategoryType {

	MARKETINGCATEGORYDEFAULT("Marketing-Category-Default"),

	MARKETINGCATEGORY1("Marketing-Category1"),

	MARKETINGCATEGORY2("Marketing-Category2"),

	MARKETINGCATEGORY3("Marketing-Category3"),

	MARKETINGCATEGORY4("Marketing-Category4"),

	MARKETINGCATEGORY5("Marketing-Category5"),

	MARKETINGCATEGORY6("Marketing-Category6"),

	MARKETINGCATEGORY7("Marketing-Category7"),

	MARKETINGCATEGORY8("Marketing-Category8"),

	MARKETINGCATEGORY9("Marketing-Category9"),

	MARKETINGCATEGORY10("Marketing-Category10"),

	MARKETINGCATEGORY11("Marketing-Category11"),

	MARKETINGCATEGORY12("Marketing-Category12"),

	MARKETINGCATEGORY13("Marketing-Category13"),

	MARKETINGCATEGORY14("Marketing-Category14"),

	MARKETINGCATEGORY15("Marketing-Category15"),

	MARKETINGCATEGORY16("Marketing-Category16"),

	MARKETINGCATEGORY17("Marketing-Category17"),

	MARKETINGCATEGORY18("Marketing-Category18"),

	MARKETINGCATEGORY19("Marketing-Category19"),

	MARKETINGCATEGORY20("Marketing-Category20");

	private String value;

	private MarketingCategoryType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static MarketingCategoryType fromValue(String v) {
		for (MarketingCategoryType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}