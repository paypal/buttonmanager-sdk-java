package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  PaymentReasonType
 *  This is the Payment Reason type (used by DoRT and SetEC for
 * Refund of PI transaction, eBay return shipment, external
 * dispute)
 * 
 */
public enum  PaymentReasonType {

	NONE("None"),

	REFUND("Refund"),

	RETURNSHIPMENT("ReturnShipment");

	private String value;

	private PaymentReasonType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentReasonType fromValue(String v) {
		for (PaymentReasonType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}