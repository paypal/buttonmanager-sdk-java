package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  values for subscribe button text
 * 
 */
public enum  ButtonStatusType {

	DELETE("DELETE");

	private String value;

	private ButtonStatusType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ButtonStatusType fromValue(String v) {
		for (ButtonStatusType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}