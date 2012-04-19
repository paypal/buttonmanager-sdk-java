/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum RecurringPaymentsProfileStatusType {

 		ACTIVEPROFILE("ActiveProfile"),
 		PENDINGPROFILE("PendingProfile"),
 		CANCELLEDPROFILE("CancelledProfile"),
 		EXPIREDPROFILE("ExpiredProfile"),
 		SUSPENDEDPROFILE("SuspendedProfile"),
		;
		private String value;
		RecurringPaymentsProfileStatusType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static RecurringPaymentsProfileStatusType fromValue(String v) {
			for (RecurringPaymentsProfileStatusType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
