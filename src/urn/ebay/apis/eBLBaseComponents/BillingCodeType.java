package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 */
public enum  BillingCodeType {

	NONE("None"),

	MERCHANTINITIATEDBILLING("MerchantInitiatedBilling"),

	RECURRINGPAYMENTS("RecurringPayments"),

	MERCHANTINITIATEDBILLINGSINGLEAGREEMENT("MerchantInitiatedBillingSingleAgreement"),

	CHANNELINITIATEDBILLING("ChannelInitiatedBilling");

	private String value;

	private BillingCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static BillingCodeType fromValue(String v) {
		for (BillingCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}