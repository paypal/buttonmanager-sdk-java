package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  AllowedPaymentMethodType
 *  This is the payment Solution merchant needs to specify for
 * Autopay (used by Express Checkout)
 *  Optional
 *  Default indicates that its merchant supports all funding
 * source
 *  InstantPaymentOnly indicates that its merchant only
 * supports instant payment
 *  AnyFundingSource allow all funding methods to be chosen by
 * the buyer irrespective of merchant's profile setting
 *  InstantFundingSource allow only instant funding methods,
 * block echeck, meft, elevecheck. This will override any
 * merchant profile setting
 * 
 */
public enum  AllowedPaymentMethodType {

	DEFAULT("Default"),

	INSTANTPAYMENTONLY("InstantPaymentOnly"),

	ANYFUNDINGSOURCE("AnyFundingSource"),

	INSTANTFUNDINGSOURCE("InstantFundingSource");

	private String value;

	private AllowedPaymentMethodType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static AllowedPaymentMethodType fromValue(String v) {
		for (AllowedPaymentMethodType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}