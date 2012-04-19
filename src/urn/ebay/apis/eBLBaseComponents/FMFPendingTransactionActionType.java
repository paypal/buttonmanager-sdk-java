/**
 * Auto generated code
 * This is various actions that a merchant can take on a FMF Pending Transaction.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum FMFPendingTransactionActionType {

 		ACCEPT("Accept"),
 		DENY("Deny"),
		;
		private String value;
		FMFPendingTransactionActionType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static FMFPendingTransactionActionType fromValue(String v) {
			for (FMFPendingTransactionActionType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
