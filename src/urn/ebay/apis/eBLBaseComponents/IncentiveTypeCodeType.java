package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  IncentiveType 
 *  This identifies the type of INCENTIVE for the redemption
 * code.
 * 
 */
public enum  IncentiveTypeCodeType {

	COUPON("Coupon"),

	EBAYGIFTCERTIFICATE("eBayGiftCertificate"),

	EBAYGIFTCARD("eBayGiftCard"),

	PAYPALREWARDVOUCHER("PayPalRewardVoucher"),

	MERCHANTGIFTCERTIFICATE("MerchantGiftCertificate"),

	EBAYREWARDVOUCHER("eBayRewardVoucher");

	private String value;

	private IncentiveTypeCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static IncentiveTypeCodeType fromValue(String v) {
		for (IncentiveTypeCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}