package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  MobilePaymentCodeType 
 *  These are the accepted types of mobile payments
 * 
 */
public enum  MobilePaymentCodeType {

	PP("P2P"),

	HARDGOODS("HardGoods"),

	DONATION("Donation"),

	TOPUP("TopUp");

	private String value;

	private MobilePaymentCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static MobilePaymentCodeType fromValue(String v) {
		for (MobilePaymentCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}