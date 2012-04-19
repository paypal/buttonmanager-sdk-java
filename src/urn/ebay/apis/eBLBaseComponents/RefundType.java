/**
 * Auto generated code
 * RefundType - Type declaration to be used by other 
 * schema. This code identifies the types of refund transactions 
 * supported.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum RefundType {

 		OTHER("Other"),
 		FULL("Full"),
 		PARTIAL("Partial"),
 		EXTERNALDISPUTE("ExternalDispute"),
		;
		private String value;
		RefundType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static RefundType fromValue(String v) {
			for (RefundType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
