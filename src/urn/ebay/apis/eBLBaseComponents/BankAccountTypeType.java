/**
 * Auto generated code
 * BankAccountTypeType 
 */
package urn.ebay.apis.eBLBaseComponents;

public enum BankAccountTypeType {

 		CHECKING("Checking"),
 		SAVINGS("Savings"),
		;
		private String value;
		BankAccountTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static BankAccountTypeType fromValue(String v) {
			for (BankAccountTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
