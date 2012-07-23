package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  Types of button sub types
 * 
 */
public enum  ButtonSubTypeType {

	PRODUCTS("PRODUCTS"),

	SERVICES("SERVICES");

	private String value;

	private ButtonSubTypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ButtonSubTypeType fromValue(String v) {
		for (ButtonSubTypeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}