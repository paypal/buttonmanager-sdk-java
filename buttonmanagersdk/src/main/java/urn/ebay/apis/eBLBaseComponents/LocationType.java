package urn.ebay.apis.eBLBaseComponents;

/**
 * Location Type
 *  
 */
public enum  LocationType {

	CONSUMER("Consumer"),

	STORE("Store"),

	PICKUPDROPOFF("PickupDropoff");

	private String value;

	private LocationType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static LocationType fromValue(String v) {
		for (LocationType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}