package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  AverageMonthlyVolumeType 
 * 
 *  Enumeration
 *  Meaning
 * 
 *  AverageMonthlyVolume-Not-Applicable
 * 
 *  AverageMonthlyVolume-Range1
 *  Less than $1,000 USD
 * 
 *  AverageMonthlyVolume-Range2
 *  $1,000 USD to $5,000 USD
 * 
 *  AverageMonthlyVolume-Range3
 *  $5,000 USD to $25,000 USD
 * 
 *  AverageMonthlyVolume-Range4
 *  $25,000 USD to $100,000 USD
 * 
 *  AverageMonthlyVolume-Range5
 *  $100,000 USD to $1,000,000 USD
 * 
 *  AverageMonthlyVolume-Range6
 *  More than $1,000,000 USD
 * 
 */
public enum  AverageMonthlyVolumeType {

	AVERAGEMONTHLYVOLUMENOTAPPLICABLE("AverageMonthlyVolume-Not-Applicable"),

	AVERAGEMONTHLYVOLUMERANGE1("AverageMonthlyVolume-Range1"),

	AVERAGEMONTHLYVOLUMERANGE2("AverageMonthlyVolume-Range2"),

	AVERAGEMONTHLYVOLUMERANGE3("AverageMonthlyVolume-Range3"),

	AVERAGEMONTHLYVOLUMERANGE4("AverageMonthlyVolume-Range4"),

	AVERAGEMONTHLYVOLUMERANGE5("AverageMonthlyVolume-Range5"),

	AVERAGEMONTHLYVOLUMERANGE6("AverageMonthlyVolume-Range6");

	private String value;

	private AverageMonthlyVolumeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static AverageMonthlyVolumeType fromValue(String v) {
		for (AverageMonthlyVolumeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}