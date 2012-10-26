package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  TotalType - Type declaration for the label to be displayed
 *  in MiniCart for UX.
 * 
 */
public enum  TotalType {

	TOTAL("Total"),

	ESTIMATEDTOTAL("EstimatedTotal");

	private String value;

	private TotalType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static TotalType fromValue(String v) {
		for (TotalType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}