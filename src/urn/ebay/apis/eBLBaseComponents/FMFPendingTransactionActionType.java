package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  This is various actions that a merchant can take on a FMF
 * Pending Transaction.
 * 
 */
public enum  FMFPendingTransactionActionType {

	ACCEPT("Accept"),

	DENY("Deny");

	private String value;

	private FMFPendingTransactionActionType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static FMFPendingTransactionActionType fromValue(String v) {
		for (FMFPendingTransactionActionType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}