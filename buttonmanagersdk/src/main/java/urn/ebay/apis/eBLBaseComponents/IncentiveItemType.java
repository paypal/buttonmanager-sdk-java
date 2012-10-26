package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class IncentiveItemType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String itemId;

	/**
	 * 	 
	 */ 
	private String purchaseTime;

	/**
	 * 	 
	 */ 
	private String itemCategoryList;

	/**
	 * 	 
	 */ 
	private BasicAmountType itemPrice;

	/**
	 * 	 
	 */ 
	private Integer itemQuantity;

	

	/**
	 * Default Constructor
	 */
	public IncentiveItemType (){
	}	

	/**
	 * Getter for itemId
	 */
	 public String getItemId() {
	 	return itemId;
	 }
	 
	/**
	 * Setter for itemId
	 */
	 public void setItemId(String itemId) {
	 	this.itemId = itemId;
	 }
	 
	/**
	 * Getter for purchaseTime
	 */
	 public String getPurchaseTime() {
	 	return purchaseTime;
	 }
	 
	/**
	 * Setter for purchaseTime
	 */
	 public void setPurchaseTime(String purchaseTime) {
	 	this.purchaseTime = purchaseTime;
	 }
	 
	/**
	 * Getter for itemCategoryList
	 */
	 public String getItemCategoryList() {
	 	return itemCategoryList;
	 }
	 
	/**
	 * Setter for itemCategoryList
	 */
	 public void setItemCategoryList(String itemCategoryList) {
	 	this.itemCategoryList = itemCategoryList;
	 }
	 
	/**
	 * Getter for itemPrice
	 */
	 public BasicAmountType getItemPrice() {
	 	return itemPrice;
	 }
	 
	/**
	 * Setter for itemPrice
	 */
	 public void setItemPrice(BasicAmountType itemPrice) {
	 	this.itemPrice = itemPrice;
	 }
	 
	/**
	 * Getter for itemQuantity
	 */
	 public Integer getItemQuantity() {
	 	return itemQuantity;
	 }
	 
	/**
	 * Setter for itemQuantity
	 */
	 public void setItemQuantity(Integer itemQuantity) {
	 	this.itemQuantity = itemQuantity;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(itemId != null) {
			sb.append("<").append(preferredPrefix).append(":ItemId>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemId));
			sb.append("</").append(preferredPrefix).append(":ItemId>");
		}
		if(purchaseTime != null) {
			sb.append("<").append(preferredPrefix).append(":PurchaseTime>").append(SDKUtil.escapeInvalidXmlCharsRegex(purchaseTime));
			sb.append("</").append(preferredPrefix).append(":PurchaseTime>");
		}
		if(itemCategoryList != null) {
			sb.append("<").append(preferredPrefix).append(":ItemCategoryList>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemCategoryList));
			sb.append("</").append(preferredPrefix).append(":ItemCategoryList>");
		}
		if(itemPrice != null) {
			sb.append(itemPrice.toXMLString(preferredPrefix,"ItemPrice"));
		}
		if(itemQuantity != null) {
			sb.append("<").append(preferredPrefix).append(":ItemQuantity>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemQuantity));
			sb.append("</").append(preferredPrefix).append(":ItemQuantity>");
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}