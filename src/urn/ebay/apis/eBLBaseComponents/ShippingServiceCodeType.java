/**
 * Auto generated code
 * ShippingServiceCodeType
 * These are the possible codes to describe insurance option as part of shipping
 * service.
 */
package urn.ebay.apis.eBLBaseComponents;

public enum ShippingServiceCodeType {

 		UPSGROUND("UPSGround"),
 		UPSRDDAY("UPS3rdDay"),
 		UPSNDDAY("UPS2ndDay"),
 		UPSNEXTDAY("UPSNextDay"),
 		USPSPRIORITY("USPSPriority"),
 		USPSPARCEL("USPSParcel"),
 		USPSMEDIA("USPSMedia"),
 		USPSFIRSTCLASS("USPSFirstClass"),
 		SHIPPINGMETHODSTANDARD("ShippingMethodStandard"),
 		SHIPPINGMETHODEXPRESS("ShippingMethodExpress"),
 		SHIPPINGMETHODNEXTDAY("ShippingMethodNextDay"),
 		USPSEXPRESSMAIL("USPSExpressMail"),
 		USPSGROUND("USPSGround"),
 		DOWNLOAD("Download"),
 		WILLCALLORPICKUP("WillCall_Or_Pickup"),
 		CUSTOMCODE("CustomCode"),
		;
		private String value;
		ShippingServiceCodeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ShippingServiceCodeType fromValue(String v) {
			for (ShippingServiceCodeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
