package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * Fallback shipping options type. 
 */
public class ShippingOptionType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String shippingOptionIsDefault;

	/**
	 * 	 
	 */ 
	private BasicAmountType shippingOptionAmount;

	/**
	 * 	 
	 */ 
	private String shippingOptionName;

	

	/**
	 * Default Constructor
	 */
	public ShippingOptionType (){
	}	

	/**
	 * Getter for shippingOptionIsDefault
	 */
	 public String getShippingOptionIsDefault() {
	 	return shippingOptionIsDefault;
	 }
	 
	/**
	 * Setter for shippingOptionIsDefault
	 */
	 public void setShippingOptionIsDefault(String shippingOptionIsDefault) {
	 	this.shippingOptionIsDefault = shippingOptionIsDefault;
	 }
	 
	/**
	 * Getter for shippingOptionAmount
	 */
	 public BasicAmountType getShippingOptionAmount() {
	 	return shippingOptionAmount;
	 }
	 
	/**
	 * Setter for shippingOptionAmount
	 */
	 public void setShippingOptionAmount(BasicAmountType shippingOptionAmount) {
	 	this.shippingOptionAmount = shippingOptionAmount;
	 }
	 
	/**
	 * Getter for shippingOptionName
	 */
	 public String getShippingOptionName() {
	 	return shippingOptionName;
	 }
	 
	/**
	 * Setter for shippingOptionName
	 */
	 public void setShippingOptionName(String shippingOptionName) {
	 	this.shippingOptionName = shippingOptionName;
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
		if(shippingOptionIsDefault != null) {
			sb.append("<").append(preferredPrefix).append(":ShippingOptionIsDefault>").append(SDKUtil.escapeInvalidXmlCharsRegex(shippingOptionIsDefault));
			sb.append("</").append(preferredPrefix).append(":ShippingOptionIsDefault>");
		}
		if(shippingOptionAmount != null) {
			sb.append(shippingOptionAmount.toXMLString(preferredPrefix,"ShippingOptionAmount"));
		}
		if(shippingOptionName != null) {
			sb.append("<").append(preferredPrefix).append(":ShippingOptionName>").append(SDKUtil.escapeInvalidXmlCharsRegex(shippingOptionName));
			sb.append("</").append(preferredPrefix).append(":ShippingOptionName>");
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