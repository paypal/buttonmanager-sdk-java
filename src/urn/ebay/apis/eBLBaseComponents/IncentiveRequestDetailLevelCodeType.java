/**
 * Auto generated code
 * IncentiveRequestDetailLevelType 
 * This identifies the granularity of information requested by the client application. This information will be used to define the contents and details of the response.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum IncentiveRequestDetailLevelCodeType {

 		AGGREGATED("Aggregated"),
 		DETAIL("Detail"),
		;
		private String value;
		IncentiveRequestDetailLevelCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static IncentiveRequestDetailLevelCodeType fromValue(String v) {
			for (IncentiveRequestDetailLevelCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
