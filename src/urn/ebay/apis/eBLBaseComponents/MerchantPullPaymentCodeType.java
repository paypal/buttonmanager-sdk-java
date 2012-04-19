/**
 * Auto generated code
 * MerchantPullPaymentCodeType 
 * Type of Payment to be initiated by the merchant
 */
package urn.ebay.apis.eBLBaseComponents;

public enum MerchantPullPaymentCodeType {

 		ANY("Any"),
 		INSTANTONLY("InstantOnly"),
 		ECHECKONLY("EcheckOnly"),
		;
		private String value;
		MerchantPullPaymentCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static MerchantPullPaymentCodeType fromValue(String v) {
			for (MerchantPullPaymentCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
