package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  POSTransactionCodeType
 *  POS Transaction Code Type. F for Forced Post Transaction
 * and S for Single Call Checkout
 * 
 */
public enum  POSTransactionCodeType {

	F("F"),

	S("S");

	private String value;

	private POSTransactionCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static POSTransactionCodeType fromValue(String v) {
		for (POSTransactionCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}