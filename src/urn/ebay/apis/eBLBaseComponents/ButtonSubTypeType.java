/**
 * Auto generated code
 * Types of button sub types
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ButtonSubTypeType {

 		PRODUCTS("PRODUCTS"),
 		SERVICES("SERVICES"),
		;
		private String value;
		ButtonSubTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ButtonSubTypeType fromValue(String v) {
			for (ButtonSubTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
