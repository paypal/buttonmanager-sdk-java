/**
 * Auto generated code
 * IncentiveRequestType 
 * This identifies the type of request for the API call. The type of request may be used to determine whether the request is for evaluating incentives in pre-checkout or in-checkout phase.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum IncentiveRequestCodeType {

 		INCHECKOUT("InCheckout"),
 		PRECHECKOUT("PreCheckout"),
		;
		private String value;
		IncentiveRequestCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static IncentiveRequestCodeType fromValue(String v) {
			for (IncentiveRequestCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
