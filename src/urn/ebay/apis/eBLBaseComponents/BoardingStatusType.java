package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  Boarding Status 
 * 
 */
public enum  BoardingStatusType {

	UNKNOWN("Unknown"),

	COMPLETED("Completed"),

	CANCELLED("Cancelled"),

	PENDING("Pending");

	private String value;

	private BoardingStatusType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static BoardingStatusType fromValue(String v) {
		for (BoardingStatusType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}