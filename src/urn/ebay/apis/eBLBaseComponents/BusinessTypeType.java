/**
 * Auto generated code
 * BusinessTypeType
 */
package urn.ebay.apis.eBLBaseComponents;

public enum BusinessTypeType {

 		UNKNOWN("Unknown"),
 		INDIVIDUAL("Individual"),
 		PROPRIETORSHIP("Proprietorship"),
 		PARTNERSHIP("Partnership"),
 		CORPORATION("Corporation"),
 		NONPROFIT("Nonprofit"),
 		GOVERNMENT("Government"),
		;
		private String value;
		BusinessTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static BusinessTypeType fromValue(String v) {
			for (BusinessTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
