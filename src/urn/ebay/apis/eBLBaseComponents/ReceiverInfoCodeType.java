/**
 * Auto generated code
 * ReceiverInfoCodeType 
 * Payee identifier type for MassPay API
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ReceiverInfoCodeType {

 		EMAILADDRESS("EmailAddress"),
 		USERID("UserID"),
 		PHONENUMBER("PhoneNumber"),
		;
		private String value;
		ReceiverInfoCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ReceiverInfoCodeType fromValue(String v) {
			for (ReceiverInfoCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
