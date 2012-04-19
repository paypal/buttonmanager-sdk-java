/**
 * Auto generated code
 * DetailLevelCodeType   
 */
package urn.ebay.apis.eBLBaseComponents;

public enum DetailLevelCodeType {

 		RETURNALL("ReturnAll"),
 		ITEMRETURNDESCRIPTION("ItemReturnDescription"),
 		ITEMRETURNATTRIBUTES("ItemReturnAttributes"),
		;
		private String value;
		DetailLevelCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static DetailLevelCodeType fromValue(String v) {
			for (DetailLevelCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
