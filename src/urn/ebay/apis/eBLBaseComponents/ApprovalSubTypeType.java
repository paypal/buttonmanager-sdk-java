/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ApprovalSubTypeType {

 		NONE("None"),
 		MERCHANTINITIATEDBILLING("MerchantInitiatedBilling"),
		;
		private String value;
		ApprovalSubTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ApprovalSubTypeType fromValue(String v) {
			for (ApprovalSubTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
