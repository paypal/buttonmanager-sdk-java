package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PercentageRevenueFromOnlineSalesType
 * 
 *  Enumeration
 *  Meaning
 * 
 *  PercentageRevenueFromOnlineSales-Not-Applicable 
 * 
 *  PercentageRevenueFromOnlineSales-Range1
 *  Less than 25%
 * 
 *  PercentageRevenueFromOnlineSales-Range2
 *  25% to 50%
 * 
 *  PercentageRevenueFromOnlineSales-Range3
 *  50% to 75%
 * 
 *  PercentageRevenueFromOnlineSales-Range4
 *  75% to 100%
 * 
 */
public enum  PercentageRevenueFromOnlineSalesType {

	PERCENTAGEREVENUEFROMONLINESALESNOTAPPLICABLE("PercentageRevenueFromOnlineSales-Not-Applicable"),

	PERCENTAGEREVENUEFROMONLINESALESRANGE1("PercentageRevenueFromOnlineSales-Range1"),

	PERCENTAGEREVENUEFROMONLINESALESRANGE2("PercentageRevenueFromOnlineSales-Range2"),

	PERCENTAGEREVENUEFROMONLINESALESRANGE3("PercentageRevenueFromOnlineSales-Range3"),

	PERCENTAGEREVENUEFROMONLINESALESRANGE4("PercentageRevenueFromOnlineSales-Range4");

	private String value;

	private PercentageRevenueFromOnlineSalesType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PercentageRevenueFromOnlineSalesType fromValue(String v) {
		for (PercentageRevenueFromOnlineSalesType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}