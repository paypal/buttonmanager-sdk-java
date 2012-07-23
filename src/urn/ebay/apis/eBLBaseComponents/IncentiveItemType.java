package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;

/**
 * No Document Comments
 */
public class IncentiveItemType{


	/**
	 * No Document Comments	 
	 */ 
	private String ItemId;

	/**
	 * No Document Comments	 
	 */ 
	private String PurchaseTime;

	/**
	 * No Document Comments	 
	 */ 
	private String ItemCategoryList;

	/**
	 * No Document Comments	 
	 */ 
	private BasicAmountType ItemPrice;

	/**
	 * No Document Comments	 
	 */ 
	private Integer ItemQuantity;

	

	/**
	 * Default Constructor
	 */
	public IncentiveItemType (){
	}	

	/**
	 * Getter for ItemId
	 */
	 public String getItemId() {
	 	return ItemId;
	 }
	 
	/**
	 * Setter for ItemId
	 */
	 public void setItemId(String ItemId) {
	 	this.ItemId = ItemId;
	 }
	 
	/**
	 * Getter for PurchaseTime
	 */
	 public String getPurchaseTime() {
	 	return PurchaseTime;
	 }
	 
	/**
	 * Setter for PurchaseTime
	 */
	 public void setPurchaseTime(String PurchaseTime) {
	 	this.PurchaseTime = PurchaseTime;
	 }
	 
	/**
	 * Getter for ItemCategoryList
	 */
	 public String getItemCategoryList() {
	 	return ItemCategoryList;
	 }
	 
	/**
	 * Setter for ItemCategoryList
	 */
	 public void setItemCategoryList(String ItemCategoryList) {
	 	this.ItemCategoryList = ItemCategoryList;
	 }
	 
	/**
	 * Getter for ItemPrice
	 */
	 public BasicAmountType getItemPrice() {
	 	return ItemPrice;
	 }
	 
	/**
	 * Setter for ItemPrice
	 */
	 public void setItemPrice(BasicAmountType ItemPrice) {
	 	this.ItemPrice = ItemPrice;
	 }
	 
	/**
	 * Getter for ItemQuantity
	 */
	 public Integer getItemQuantity() {
	 	return ItemQuantity;
	 }
	 
	/**
	 * Setter for ItemQuantity
	 */
	 public void setItemQuantity(Integer ItemQuantity) {
	 	this.ItemQuantity = ItemQuantity;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ItemId != null) {
			sb.append("<ebl:ItemId>").append(ItemId);
			sb.append("</ebl:ItemId>");
		}
		if(PurchaseTime != null) {
			sb.append("<ebl:PurchaseTime>").append(PurchaseTime);
			sb.append("</ebl:PurchaseTime>");
		}
		if(ItemCategoryList != null) {
			sb.append("<ebl:ItemCategoryList>").append(ItemCategoryList);
			sb.append("</ebl:ItemCategoryList>");
		}
		if(ItemPrice != null) {
			sb.append("<ebl:ItemPrice");
			sb.append(ItemPrice.toXMLString());
			sb.append("</ebl:ItemPrice>");
		}
		if(ItemQuantity != null) {
			sb.append("<ebl:ItemQuantity>").append(ItemQuantity);
			sb.append("</ebl:ItemQuantity>");
		}
		return sb.toString();
	}

}