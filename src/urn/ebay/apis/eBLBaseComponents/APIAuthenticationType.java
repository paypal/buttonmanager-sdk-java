/**
 * Auto generated code
 * API Authentication Type 
 */
package urn.ebay.apis.eBLBaseComponents;

public enum APIAuthenticationType {

 		AUTHNONE("Auth-None"),
 		CERT("Cert"),
 		SIGN("Sign"),
		;
		private String value;
		APIAuthenticationType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static APIAuthenticationType fromValue(String v) {
			for (APIAuthenticationType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
