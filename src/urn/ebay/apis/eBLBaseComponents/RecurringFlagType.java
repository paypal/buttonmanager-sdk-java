/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum RecurringFlagType {

 		Y1("Y"),
 		Y2("y"),
		;
		private String value;
		RecurringFlagType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static RecurringFlagType fromValue(String v) {
			for (RecurringFlagType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
