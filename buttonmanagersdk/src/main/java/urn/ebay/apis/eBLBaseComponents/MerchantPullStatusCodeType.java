package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  MerchantPullStatusCodeType 
 *  Status of the merchant pull
 * 
 */
public enum  MerchantPullStatusCodeType {

	ACTIVE("Active"),

	CANCELED("Canceled");

	private String value;

	private MerchantPullStatusCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static MerchantPullStatusCodeType fromValue(String v) {
		for (MerchantPullStatusCodeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}