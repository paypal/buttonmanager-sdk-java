package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  MerchantPullPaymentCodeType 
 *  Type of Payment to be initiated by the merchant
 * 
 */
public enum  MerchantPullPaymentCodeType {

	ANY("Any"),

	INSTANTONLY("InstantOnly"),

	ECHECKONLY("EcheckOnly");

	private String value;

	private MerchantPullPaymentCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static MerchantPullPaymentCodeType fromValue(String v) {
		for (MerchantPullPaymentCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}