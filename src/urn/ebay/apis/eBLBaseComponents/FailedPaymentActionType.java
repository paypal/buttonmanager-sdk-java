/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum FailedPaymentActionType {

 		CANCELONFAILURE("CancelOnFailure"),
 		CONTINUEONFAILURE("ContinueOnFailure"),
		;
		private String value;
		FailedPaymentActionType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static FailedPaymentActionType fromValue(String v) {
			for (FailedPaymentActionType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
