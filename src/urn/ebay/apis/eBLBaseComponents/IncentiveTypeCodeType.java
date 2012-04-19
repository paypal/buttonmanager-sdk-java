/**
 * Auto generated code
 * IncentiveType 
 * This identifies the type of INCENTIVE for the redemption code.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum IncentiveTypeCodeType {

 		COUPON("Coupon"),
 		EBAYGIFTCERTIFICATE("eBayGiftCertificate"),
 		EBAYGIFTCARD("eBayGiftCard"),
 		PAYPALREWARDVOUCHER("PayPalRewardVoucher"),
 		MERCHANTGIFTCERTIFICATE("MerchantGiftCertificate"),
 		EBAYREWARDVOUCHER("eBayRewardVoucher"),
		;
		private String value;
		IncentiveTypeCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static IncentiveTypeCodeType fromValue(String v) {
			for (IncentiveTypeCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
