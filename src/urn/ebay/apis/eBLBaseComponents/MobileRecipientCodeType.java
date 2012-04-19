/**
 * Auto generated code
 * MobileRecipientCodeType 
 * These are the accepted types of recipients for mobile-originated transactions
 */
package urn.ebay.apis.eBLBaseComponents;

public enum MobileRecipientCodeType {

 		PHONENUMBER("PhoneNumber"),
 		EMAILADDRESS("EmailAddress"),
		;
		private String value;
		MobileRecipientCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static MobileRecipientCodeType fromValue(String v) {
			for (MobileRecipientCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
