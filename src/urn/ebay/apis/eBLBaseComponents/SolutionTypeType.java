package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  SolutionTypeType 
 *  This is the PayPal payment Solution details type (used by
 * Express Checkout)
 * 
 */
public enum  SolutionTypeType {

	MARK("Mark"),

	SOLE("Sole");

	private String value;

	private SolutionTypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static SolutionTypeType fromValue(String v) {
		for (SolutionTypeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}