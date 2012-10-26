package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * Description of the Order. 
 */
public class OrderDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Description of the Order.	 
	 */ 
	private String description;

	/**
	 * Expected maximum amount that the merchant may pull using
	 * DoReferenceTransaction	 
	 */ 
	private BasicAmountType maxAmount;

	

	/**
	 * Default Constructor
	 */
	public OrderDetailsType (){
	}	

	/**
	 * Getter for description
	 */
	 public String getDescription() {
	 	return description;
	 }
	 
	/**
	 * Setter for description
	 */
	 public void setDescription(String description) {
	 	this.description = description;
	 }
	 
	/**
	 * Getter for maxAmount
	 */
	 public BasicAmountType getMaxAmount() {
	 	return maxAmount;
	 }
	 
	/**
	 * Setter for maxAmount
	 */
	 public void setMaxAmount(BasicAmountType maxAmount) {
	 	this.maxAmount = maxAmount;
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
		if(description != null) {
			sb.append("<").append(preferredPrefix).append(":Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(description));
			sb.append("</").append(preferredPrefix).append(":Description>");
		}
		if(maxAmount != null) {
			sb.append(maxAmount.toXMLString(preferredPrefix,"MaxAmount"));
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