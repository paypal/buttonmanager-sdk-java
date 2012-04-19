/**
 * Auto generated code
 * MerchantPullStatusCodeType 
 * Status of the merchant pull
 */
package urn.ebay.apis.eBLBaseComponents;

public enum MerchantPullStatusCodeType {

 		ACTIVE("Active"),
 		CANCELED("Canceled"),
		;
		private String value;
		MerchantPullStatusCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static MerchantPullStatusCodeType fromValue(String v) {
			for (MerchantPullStatusCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
