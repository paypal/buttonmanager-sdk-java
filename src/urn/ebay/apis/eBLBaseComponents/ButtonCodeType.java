/**
 * Auto generated code
 * Types of button coding
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ButtonCodeType {

 		HOSTED("HOSTED"),
 		ENCRYPTED("ENCRYPTED"),
 		CLEARTEXT("CLEARTEXT"),
 		TOKEN("TOKEN"),
		;
		private String value;
		ButtonCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ButtonCodeType fromValue(String v) {
			for (ButtonCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
