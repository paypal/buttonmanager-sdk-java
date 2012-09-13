package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class IncentiveItemType{


	/**
	 * 	 
	 */ 
	private String ItemId;

	/**
	 * 	 
	 */ 
	private String PurchaseTime;

	/**
	 * 	 
	 */ 
	private String ItemCategoryList;

	/**
	 * 	 
	 */ 
	private BasicAmountType ItemPrice;

	/**
	 * 	 
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
			sb.append("<ebl:ItemId>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemId));
			sb.append("</ebl:ItemId>");
		}
		if(PurchaseTime != null) {
			sb.append("<ebl:PurchaseTime>").append(SDKUtil.escapeInvalidXmlCharsRegex(PurchaseTime));
			sb.append("</ebl:PurchaseTime>");
		}
		if(ItemCategoryList != null) {
			sb.append("<ebl:ItemCategoryList>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemCategoryList));
			sb.append("</ebl:ItemCategoryList>");
		}
		if(ItemPrice != null) {
			sb.append("<ebl:ItemPrice");
			sb.append(ItemPrice.toXMLString());
			sb.append("</ebl:ItemPrice>");
		}
		if(ItemQuantity != null) {
			sb.append("<ebl:ItemQuantity>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemQuantity));
			sb.append("</ebl:ItemQuantity>");
		}
		return sb.toString();
	}

}