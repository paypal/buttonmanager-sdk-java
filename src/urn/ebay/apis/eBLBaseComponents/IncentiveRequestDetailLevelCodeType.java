package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  IncentiveRequestDetailLevelType 
 *  This identifies the granularity of information requested by
 * the client application. This information will be used to
 * define the contents and details of the response.
 * 
 */
public enum  IncentiveRequestDetailLevelCodeType {

	AGGREGATED("Aggregated"),

	DETAIL("Detail");

	private String value;

	private IncentiveRequestDetailLevelCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static IncentiveRequestDetailLevelCodeType fromValue(String v) {
		for (IncentiveRequestDetailLevelCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}