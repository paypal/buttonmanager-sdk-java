/**
 * Auto generated code
 * Types of button images
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ButtonImageType {

 		REG("REG"),
 		SML("SML"),
 		CC("CC"),
		;
		private String value;
		ButtonImageType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ButtonImageType fromValue(String v) {
			for (ButtonImageType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
