/**
 * Auto generated code
 * MatchStatusCodeType 
 * This is the PayPal (street/zip) match code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum MatchStatusCodeType {

 		NONE("None"),
 		MATCHED("Matched"),
 		UNMATCHED("Unmatched"),
		;
		private String value;
		MatchStatusCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static MatchStatusCodeType fromValue(String v) {
			for (MatchStatusCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
