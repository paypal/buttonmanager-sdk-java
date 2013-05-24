package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 */
public enum  StatusChangeActionType {

	CANCEL("Cancel"),

	SUSPEND("Suspend"),

	REACTIVATE("Reactivate");

	private String value;

	private StatusChangeActionType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static StatusChangeActionType fromValue(String v) {
		for (StatusChangeActionType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}