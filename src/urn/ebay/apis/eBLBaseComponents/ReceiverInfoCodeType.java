package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  ReceiverInfoCodeType 
 *  Payee identifier type for MassPay API
 * 
 */
public enum  ReceiverInfoCodeType {

	EMAILADDRESS("EmailAddress"),

	USERID("UserID"),

	PHONENUMBER("PhoneNumber");

	private String value;

	private ReceiverInfoCodeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ReceiverInfoCodeType fromValue(String v) {
		for (ReceiverInfoCodeType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}