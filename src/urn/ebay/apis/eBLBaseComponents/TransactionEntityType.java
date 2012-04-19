/**
 * Auto generated code
 * TransactionEntityType 
 * This is the PayPal DoAuthorization TransactionEntityType code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum TransactionEntityType {

 		NONE("None"),
 		AUTH("Auth"),
 		REAUTH("Reauth"),
 		ORDER("Order"),
 		PAYMENT("Payment"),
		;
		private String value;
		TransactionEntityType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static TransactionEntityType fromValue(String v) {
			for (TransactionEntityType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
