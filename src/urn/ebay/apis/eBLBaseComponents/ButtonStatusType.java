/**
 * Auto generated code
 * values for subscribe button text
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ButtonStatusType {

 		DELETE("DELETE"),
		;
		private String value;
		ButtonStatusType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ButtonStatusType fromValue(String v) {
			for (ButtonStatusType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
