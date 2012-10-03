package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PaymentTransactionCodeType 
 *  This is the type of a PayPal of which matches the output
 * from IPN
 * 
 */
public enum  PaymentTransactionCodeType {

	NONE("none"),

	WEBACCEPT("web-accept"),

	CART("cart"),

	SENDMONEY("send-money"),

	SUBSCRFAILED("subscr-failed"),

	SUBSCRCANCEL("subscr-cancel"),

	SUBSCRPAYMENT("subscr-payment"),

	SUBSCRSIGNUP("subscr-signup"),

	SUBSCREOT("subscr-eot"),

	SUBSCRMODIFY("subscr-modify"),

	MERCHTPMT("mercht-pmt"),

	MASSPAY("mass-pay"),

	VIRTUALTERMINAL("virtual-terminal"),

	INTEGRALEVOLUTION("integral-evolution"),

	EXPRESSCHECKOUT("express-checkout"),

	PROHOSTED("pro-hosted"),

	PROAPI("pro-api"),

	CREDIT("credit");

	private String value;

	private PaymentTransactionCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentTransactionCodeType fromValue(String v) {
		for (PaymentTransactionCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}