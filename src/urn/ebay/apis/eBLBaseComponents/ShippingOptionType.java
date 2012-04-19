
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 * Fallback shipping options type.
 */
public class ShippingOptionType {

	/**
	 */
	private String ShippingOptionIsDefault;
	public String getShippingOptionIsDefault() {
		return ShippingOptionIsDefault;
	}
	public void setShippingOptionIsDefault(String value) {
		this.ShippingOptionIsDefault = value;
	}

	/**
	 */
	private BasicAmountType ShippingOptionAmount;
	public BasicAmountType getShippingOptionAmount() {
		return ShippingOptionAmount;
	}
	public void setShippingOptionAmount(BasicAmountType value) {
		this.ShippingOptionAmount = value;
	}

	/**
	 */
	private String ShippingOptionName;
	public String getShippingOptionName() {
		return ShippingOptionName;
	}
	public void setShippingOptionName(String value) {
		this.ShippingOptionName = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ShippingOptionIsDefault != null ) {
			sb.append("<ebl:ShippingOptionIsDefault>").append(ShippingOptionIsDefault);
			sb.append("</ebl:ShippingOptionIsDefault>");
		}
		if( ShippingOptionAmount != null ) {
			sb.append("<ebl:ShippingOptionAmount ");
			sb.append(ShippingOptionAmount.toXMLString());
			sb.append("</ebl:ShippingOptionAmount>");
		}
		if( ShippingOptionName != null ) {
			sb.append("<ebl:ShippingOptionName>").append(ShippingOptionName);
			sb.append("</ebl:ShippingOptionName>");
		}
		return sb.toString();
	}

}
