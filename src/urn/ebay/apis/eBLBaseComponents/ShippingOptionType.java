package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;

/**
 * Fallback shipping options type. 
 */
public class ShippingOptionType{


	/**
	 * 	 
	 */ 
	private String ShippingOptionIsDefault;

	/**
	 * 	 
	 */ 
	private BasicAmountType ShippingOptionAmount;

	/**
	 * 	 
	 */ 
	private String ShippingOptionName;

	

	/**
	 * Default Constructor
	 */
	public ShippingOptionType (){
	}	

	/**
	 * Getter for ShippingOptionIsDefault
	 */
	 public String getShippingOptionIsDefault() {
	 	return ShippingOptionIsDefault;
	 }
	 
	/**
	 * Setter for ShippingOptionIsDefault
	 */
	 public void setShippingOptionIsDefault(String ShippingOptionIsDefault) {
	 	this.ShippingOptionIsDefault = ShippingOptionIsDefault;
	 }
	 
	/**
	 * Getter for ShippingOptionAmount
	 */
	 public BasicAmountType getShippingOptionAmount() {
	 	return ShippingOptionAmount;
	 }
	 
	/**
	 * Setter for ShippingOptionAmount
	 */
	 public void setShippingOptionAmount(BasicAmountType ShippingOptionAmount) {
	 	this.ShippingOptionAmount = ShippingOptionAmount;
	 }
	 
	/**
	 * Getter for ShippingOptionName
	 */
	 public String getShippingOptionName() {
	 	return ShippingOptionName;
	 }
	 
	/**
	 * Setter for ShippingOptionName
	 */
	 public void setShippingOptionName(String ShippingOptionName) {
	 	this.ShippingOptionName = ShippingOptionName;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ShippingOptionIsDefault != null) {
			sb.append("<ebl:ShippingOptionIsDefault>").append(ShippingOptionIsDefault);
			sb.append("</ebl:ShippingOptionIsDefault>");
		}
		if(ShippingOptionAmount != null) {
			sb.append("<ebl:ShippingOptionAmount");
			sb.append(ShippingOptionAmount.toXMLString());
			sb.append("</ebl:ShippingOptionAmount>");
		}
		if(ShippingOptionName != null) {
			sb.append("<ebl:ShippingOptionName>").append(ShippingOptionName);
			sb.append("</ebl:ShippingOptionName>");
		}
		return sb.toString();
	}

}