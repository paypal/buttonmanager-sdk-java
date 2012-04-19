/**
 * Auto generated code
 * SolutionTypeType 
 * This is the PayPal payment Solution details type (used by Express Checkout)
 */
package urn.ebay.apis.eBLBaseComponents;

public enum SolutionTypeType {

 		MARK("Mark"),
 		SOLE("Sole"),
		;
		private String value;
		SolutionTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static SolutionTypeType fromValue(String v) {
			for (SolutionTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
