/**
 * Auto generated code
 * SalesVenueType 
 */
package urn.ebay.apis.eBLBaseComponents;

public enum SalesVenueType {

 		VENUEUNSPECIFIED("Venue-Unspecified"),
 		EBAY("eBay"),
 		ANOTHERMARKETPLACE("AnotherMarketPlace"),
 		OWNWEBSITE("OwnWebsite"),
 		OTHER("Other"),
		;
		private String value;
		SalesVenueType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static SalesVenueType fromValue(String v) {
			for (SalesVenueType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
