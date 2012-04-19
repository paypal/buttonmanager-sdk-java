/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum BillingCodeType {

 		NONE("None"),
 		MERCHANTINITIATEDBILLING("MerchantInitiatedBilling"),
 		RECURRINGPAYMENTS("RecurringPayments"),
 		MERCHANTINITIATEDBILLINGSINGLEAGREEMENT("MerchantInitiatedBillingSingleAgreement"),
 		CHANNELINITIATEDBILLING("ChannelInitiatedBilling"),
		;
		private String value;
		BillingCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static BillingCodeType fromValue(String v) {
			for (BillingCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
