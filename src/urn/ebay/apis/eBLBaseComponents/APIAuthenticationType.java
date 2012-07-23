package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 *  API Authentication Type 
 * 
 */
public enum  APIAuthenticationType {

	AUTHNONE("Auth-None"),

	CERT("Cert"),

	SIGN("Sign");

	private String value;

	private APIAuthenticationType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static APIAuthenticationType fromValue(String v) {
		for (APIAuthenticationType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}