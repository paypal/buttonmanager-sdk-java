/**
 * Auto generated code
 * Boarding Status 
 */
package urn.ebay.apis.eBLBaseComponents;

public enum BoardingStatusType {

 		UNKNOWN("Unknown"),
 		COMPLETED("Completed"),
 		CANCELLED("Cancelled"),
 		PENDING("Pending"),
		;
		private String value;
		BoardingStatusType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static BoardingStatusType fromValue(String v) {
			for (BoardingStatusType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
