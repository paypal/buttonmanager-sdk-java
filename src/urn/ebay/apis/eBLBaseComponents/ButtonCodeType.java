package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  Types of button coding
 * 
 */
public enum  ButtonCodeType {

	HOSTED("HOSTED"),

	ENCRYPTED("ENCRYPTED"),

	CLEARTEXT("CLEARTEXT"),

	TOKEN("TOKEN");

	private String value;

	private ButtonCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ButtonCodeType fromValue(String v) {
		for (ButtonCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}