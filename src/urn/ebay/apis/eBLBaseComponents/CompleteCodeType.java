/**
 * Auto generated code
 * CompleteCodeType 
 * This is the PayPal DoCapture CompleteType code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum CompleteCodeType {

 		NOTCOMPLETE("NotComplete"),
 		COMPLETE("Complete"),
		;
		private String value;
		CompleteCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static CompleteCodeType fromValue(String v) {
			for (CompleteCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
