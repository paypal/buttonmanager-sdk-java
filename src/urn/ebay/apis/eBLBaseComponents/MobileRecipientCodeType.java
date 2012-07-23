package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  MobileRecipientCodeType 
 *  These are the accepted types of recipients for
 * mobile-originated transactions
 * 
 */
public enum  MobileRecipientCodeType {

	PHONENUMBER("PhoneNumber"),

	EMAILADDRESS("EmailAddress");

	private String value;

	private MobileRecipientCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static MobileRecipientCodeType fromValue(String v) {
		for (MobileRecipientCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}