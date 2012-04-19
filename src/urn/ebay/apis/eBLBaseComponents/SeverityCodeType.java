/**
 * Auto generated code
 * SeverityCodeType
 * This code identifies the Severity code types in terms of whether
 * there is an API-level error or warning that needs to be communicated
 * to the client.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum SeverityCodeType {

 		WARNING("Warning"),
 		ERROR("Error"),
 		PARTIALSUCCESS("PartialSuccess"),
 		CUSTOMCODE("CustomCode"),
		;
		private String value;
		SeverityCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static SeverityCodeType fromValue(String v) {
			for (SeverityCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
