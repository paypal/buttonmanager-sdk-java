package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  SalesVenueType 
 * 
 */
public enum  SalesVenueType {

	VENUEUNSPECIFIED("Venue-Unspecified"),

	EBAY("eBay"),

	ANOTHERMARKETPLACE("AnotherMarketPlace"),

	OWNWEBSITE("OwnWebsite"),

	OTHER("Other");

	private String value;

	private SalesVenueType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static SalesVenueType fromValue(String v) {
		for (SalesVenueType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}