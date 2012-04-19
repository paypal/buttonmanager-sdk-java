/**
 * Auto generated code
 * UserSelectedFundingSourceType
 * User Selected Funding Source (used by Express Checkout)
 */
package urn.ebay.apis.eBLBaseComponents;

public enum UserSelectedFundingSourceType {

 		ELV("ELV"),
 		CREDITCARD("CreditCard"),
 		CHINAUNIONPAY("ChinaUnionPay"),
 		BML("BML"),
		;
		private String value;
		UserSelectedFundingSourceType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static UserSelectedFundingSourceType fromValue(String v) {
			for (UserSelectedFundingSourceType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
