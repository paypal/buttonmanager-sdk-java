/**
 * Auto generated code
 * This defines if the incentive is applied successfully or not.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum IncentiveAppliedStatusType {

 		INCENTIVEAPPLIEDSTATUSSUCCESS("INCENTIVE-APPLIED-STATUS-SUCCESS"),
 		INCENTIVEAPPLIEDSTATUSERROR("INCENTIVE-APPLIED-STATUS-ERROR"),
		;
		private String value;
		IncentiveAppliedStatusType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static IncentiveAppliedStatusType fromValue(String v) {
			for (IncentiveAppliedStatusType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
