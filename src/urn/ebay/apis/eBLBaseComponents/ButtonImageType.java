package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  Types of button images
 * 
 */
public enum  ButtonImageType {

	REG("REG"),

	SML("SML"),

	CC("CC");

	private String value;

	private ButtonImageType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ButtonImageType fromValue(String v) {
		for (ButtonImageType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}