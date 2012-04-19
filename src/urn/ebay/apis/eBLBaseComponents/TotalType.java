/**
 * Auto generated code
 * TotalType - Type declaration for the label to be displayed
 * in MiniCart for UX.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum TotalType {

 		TOTAL("Total"),
 		ESTIMATEDTOTAL("EstimatedTotal"),
		;
		private String value;
		TotalType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static TotalType fromValue(String v) {
			for (TotalType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
