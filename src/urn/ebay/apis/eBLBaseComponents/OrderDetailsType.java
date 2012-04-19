
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 * Description of the Order.
 */
public class OrderDetailsType {

	/**
Description of the Order.	 */
	private String Description;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String value) {
		this.Description = value;
	}

	/**
Expected maximum amount that the merchant may pull using DoReferenceTransaction	 */
	private BasicAmountType MaxAmount;
	public BasicAmountType getMaxAmount() {
		return MaxAmount;
	}
	public void setMaxAmount(BasicAmountType value) {
		this.MaxAmount = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Description != null ) {
			sb.append("<ebl:Description>").append(Description);
			sb.append("</ebl:Description>");
		}
		if( MaxAmount != null ) {
			sb.append("<ebl:MaxAmount ");
			sb.append(MaxAmount.toXMLString());
			sb.append("</ebl:MaxAmount>");
		}
		return sb.toString();
	}

}
