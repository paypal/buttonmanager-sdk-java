package urn.ebay.apis.eBLBaseComponents;

/**
 * It defines the enumerated types of the user channels defined
 * in  biz/User/value_object/Channel.oml
 *  
 */
public enum  UserChannelCodeType {

	WEB("WEB"),

	MOBILE("MOBILE"),

	POS("POS"),

	KIOSK("KIOSK"),

	IHSTB("IHSTB"),

	IVR("IVR"),

	ADMIN("ADMIN"),

	CSOPS("CSOPS");

	private String value;

	private UserChannelCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static UserChannelCodeType fromValue(String v) {
		for (UserChannelCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}