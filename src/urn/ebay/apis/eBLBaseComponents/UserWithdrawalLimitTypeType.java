/**
 * Auto generated code
 * User Withdrawal Limit Type Type 
 */
package urn.ebay.apis.eBLBaseComponents;

public enum UserWithdrawalLimitTypeType {

 		UNKNOWN("Unknown"),
 		LIMITED("Limited"),
 		UNLIMITED("Unlimited"),
		;
		private String value;
		UserWithdrawalLimitTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static UserWithdrawalLimitTypeType fromValue(String v) {
			for (UserWithdrawalLimitTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
