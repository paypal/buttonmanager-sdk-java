/**
 * Auto generated code
 * MobilePaymentCodeType 
 * These are the accepted types of mobile payments
 */
package urn.ebay.apis.eBLBaseComponents;

public enum MobilePaymentCodeType {

 		PP("P2P"),
 		HARDGOODS("HardGoods"),
 		DONATION("Donation"),
 		TOPUP("TopUp"),
		;
		private String value;
		MobilePaymentCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static MobilePaymentCodeType fromValue(String v) {
			for (MobilePaymentCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
