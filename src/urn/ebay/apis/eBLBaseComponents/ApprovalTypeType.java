/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ApprovalTypeType {

 		BILLINGAGREEMENT("BillingAgreement"),
 		PROFILE("Profile"),
		;
		private String value;
		ApprovalTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ApprovalTypeType fromValue(String v) {
			for (ApprovalTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
