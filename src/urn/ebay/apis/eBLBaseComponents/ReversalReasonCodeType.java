/**
 * Auto generated code
 * ReversalReasonCodeType 
 * Reason for a reversal on a PayPal transaction which matches the output from IPN
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ReversalReasonCodeType {

 		NONE("none"),
 		CHARGEBACK("chargeback"),
 		GUARANTEE("guarantee"),
 		BUYERCOMPLAINT("buyer-complaint"),
 		REFUND("refund"),
 		OTHER("other"),
		;
		private String value;
		ReversalReasonCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ReversalReasonCodeType fromValue(String v) {
			for (ReversalReasonCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
