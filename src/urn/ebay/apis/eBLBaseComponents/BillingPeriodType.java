/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum BillingPeriodType {

 		NOBILLINGPERIODTYPE("NoBillingPeriodType"),
 		DAY("Day"),
 		WEEK("Week"),
 		SEMIMONTH("SemiMonth"),
 		MONTH("Month"),
 		YEAR("Year"),
		;
		private String value;
		BillingPeriodType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static BillingPeriodType fromValue(String v) {
			for (BillingPeriodType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
