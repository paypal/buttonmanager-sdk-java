package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *                 This defines if the incentive is applied on
 * Ebay or PayPal.
 * 
 */
public enum  IncentiveSiteAppliedOnType {

	INCENTIVESITEAPPLIEDONUNKNOWN("INCENTIVE-SITE-APPLIED-ON-UNKNOWN"),

	INCENTIVESITEAPPLIEDONMERCHANT("INCENTIVE-SITE-APPLIED-ON-MERCHANT"),

	INCENTIVESITEAPPLIEDONPAYPAL("INCENTIVE-SITE-APPLIED-ON-PAYPAL");

	private String value;

	private IncentiveSiteAppliedOnType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static IncentiveSiteAppliedOnType fromValue(String v) {
		for (IncentiveSiteAppliedOnType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}