/**
 * Auto generated code
 * Based on NRF-ARTS Specification for Units of Measure
 */
package urn.ebay.apis.eBLBaseComponents;

public enum UnitOfMeasure {

 		EA("EA"),
 		HOURS("Hours"),
 		DAYS("Days"),
 		SECONDS("Seconds"),
 		CRATEOF("CrateOf12"),
 		PACK("6Pack"),
 		GLI("GLI"),
 		GLL("GLL"),
 		LTR("LTR"),
 		INH("INH"),
 		FOT("FOT"),
 		MMT("MMT"),
 		CMQ("CMQ"),
 		MTR("MTR"),
 		MTK("MTK"),
 		MTQ("MTQ"),
 		GRM("GRM"),
 		KGM("KGM"),
 		KG("KG"),
 		LBR("LBR"),
 		ANN("ANN"),
 		CEL("CEL"),
 		FAH("FAH"),
 		RESERVED("RESERVED"),
		;
		private String value;
		UnitOfMeasure(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static UnitOfMeasure fromValue(String v) {
			for (UnitOfMeasure c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
