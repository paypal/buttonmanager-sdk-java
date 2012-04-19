
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 */
public class IncentiveItemType {

	/**
	 */
	private String ItemId;
	public String getItemId() {
		return ItemId;
	}
	public void setItemId(String value) {
		this.ItemId = value;
	}

	/**
	 */
	private String PurchaseTime;
	public String getPurchaseTime() {
		return PurchaseTime;
	}
	public void setPurchaseTime(String value) {
		this.PurchaseTime = value;
	}

	/**
	 */
	private String ItemCategoryList;
	public String getItemCategoryList() {
		return ItemCategoryList;
	}
	public void setItemCategoryList(String value) {
		this.ItemCategoryList = value;
	}

	/**
	 */
	private BasicAmountType ItemPrice;
	public BasicAmountType getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(BasicAmountType value) {
		this.ItemPrice = value;
	}

	/**
	 */
	private Integer ItemQuantity;
	public Integer getItemQuantity() {
		return ItemQuantity;
	}
	public void setItemQuantity(Integer value) {
		this.ItemQuantity = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ItemId != null ) {
			sb.append("<ebl:ItemId>").append(ItemId);
			sb.append("</ebl:ItemId>");
		}
		if( PurchaseTime != null ) {
			sb.append("<ebl:PurchaseTime>").append(PurchaseTime);
			sb.append("</ebl:PurchaseTime>");
		}
		if( ItemCategoryList != null ) {
			sb.append("<ebl:ItemCategoryList>").append(ItemCategoryList);
			sb.append("</ebl:ItemCategoryList>");
		}
		if( ItemPrice != null ) {
			sb.append("<ebl:ItemPrice ");
			sb.append(ItemPrice.toXMLString());
			sb.append("</ebl:ItemPrice>");
		}
		if( ItemQuantity != null ) {
			sb.append("<ebl:ItemQuantity>").append(ItemQuantity);
			sb.append("</ebl:ItemQuantity>");
		}
		return sb.toString();
	}

}
