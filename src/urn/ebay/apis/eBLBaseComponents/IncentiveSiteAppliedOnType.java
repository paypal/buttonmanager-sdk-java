/**
 * Auto generated code
 * This defines if the incentive is applied on Ebay or PayPal.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum IncentiveSiteAppliedOnType {

 		INCENTIVESITEAPPLIEDONUNKNOWN("INCENTIVE-SITE-APPLIED-ON-UNKNOWN"),
 		INCENTIVESITEAPPLIEDONMERCHANT("INCENTIVE-SITE-APPLIED-ON-MERCHANT"),
 		INCENTIVESITEAPPLIEDONPAYPAL("INCENTIVE-SITE-APPLIED-ON-PAYPAL"),
		;
		private String value;
		IncentiveSiteAppliedOnType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static IncentiveSiteAppliedOnType fromValue(String v) {
			for (IncentiveSiteAppliedOnType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
