package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * Description of the Order. 
 */
public class OrderDetailsType{


	/**
	 * Description of the Order.	 
	 */ 
	private String Description;

	/**
	 * Expected maximum amount that the merchant may pull using
	 * DoReferenceTransaction	 
	 */ 
	private BasicAmountType MaxAmount;

	

	/**
	 * Default Constructor
	 */
	public OrderDetailsType (){
	}	

	/**
	 * Getter for Description
	 */
	 public String getDescription() {
	 	return Description;
	 }
	 
	/**
	 * Setter for Description
	 */
	 public void setDescription(String Description) {
	 	this.Description = Description;
	 }
	 
	/**
	 * Getter for MaxAmount
	 */
	 public BasicAmountType getMaxAmount() {
	 	return MaxAmount;
	 }
	 
	/**
	 * Setter for MaxAmount
	 */
	 public void setMaxAmount(BasicAmountType MaxAmount) {
	 	this.MaxAmount = MaxAmount;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Description != null) {
			sb.append("<ebl:Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(Description));
			sb.append("</ebl:Description>");
		}
		if(MaxAmount != null) {
			sb.append("<ebl:MaxAmount");
			sb.append(MaxAmount.toXMLString());
			sb.append("</ebl:MaxAmount>");
		}
		return sb.toString();
	}


}