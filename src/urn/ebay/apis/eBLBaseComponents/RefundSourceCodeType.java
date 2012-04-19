/**
 * Auto generated code
 * RefundSourceCodeType
 * This is the type of PayPal funding source that can be used for auto refund.
 * any - Means Merchant doesn't have any preference. PayPal can use any available funding source (Balance or eCheck)
 * default - Means merchant's preferred funding source as configured in his profile. (Balance or eCheck)
 * instant - Only Balance
 * echeck - Merchant prefers echeck. If PayPal balance can cover the refund amount, we will use PayPal balance. (balance or eCheck)
 */
package urn.ebay.apis.eBLBaseComponents;

public enum RefundSourceCodeType {

 		ANY("any"),
 		DEFAULT("default"),
 		INSTANT("instant"),
 		ECHECK("echeck"),
		;
		private String value;
		RefundSourceCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static RefundSourceCodeType fromValue(String v) {
			for (RefundSourceCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
