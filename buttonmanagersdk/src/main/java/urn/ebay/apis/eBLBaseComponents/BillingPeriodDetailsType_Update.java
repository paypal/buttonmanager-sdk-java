package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * Unit of meausre for billing cycle 
 */
public class BillingPeriodDetailsType_Update{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Unit of meausre for billing cycle 	 
	 */ 
	private BillingPeriodType billingPeriod;

	/**
	 * Number of BillingPeriod that make up one billing cycle 	 
	 */ 
	private Integer billingFrequency;

	/**
	 * Total billing cycles in this portion of the schedule 	 
	 */ 
	private Integer totalBillingCycles;

	/**
	 * Amount to charge 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Additional shipping amount to charge 	 
	 */ 
	private BasicAmountType shippingAmount;

	/**
	 * Additional tax amount to charge 	 
	 */ 
	private BasicAmountType taxAmount;

	

	/**
	 * Default Constructor
	 */
	public BillingPeriodDetailsType_Update (){
	}	

	/**
	 * Getter for billingPeriod
	 */
	 public BillingPeriodType getBillingPeriod() {
	 	return billingPeriod;
	 }
	 
	/**
	 * Setter for billingPeriod
	 */
	 public void setBillingPeriod(BillingPeriodType billingPeriod) {
	 	this.billingPeriod = billingPeriod;
	 }
	 
	/**
	 * Getter for billingFrequency
	 */
	 public Integer getBillingFrequency() {
	 	return billingFrequency;
	 }
	 
	/**
	 * Setter for billingFrequency
	 */
	 public void setBillingFrequency(Integer billingFrequency) {
	 	this.billingFrequency = billingFrequency;
	 }
	 
	/**
	 * Getter for totalBillingCycles
	 */
	 public Integer getTotalBillingCycles() {
	 	return totalBillingCycles;
	 }
	 
	/**
	 * Setter for totalBillingCycles
	 */
	 public void setTotalBillingCycles(Integer totalBillingCycles) {
	 	this.totalBillingCycles = totalBillingCycles;
	 }
	 
	/**
	 * Getter for amount
	 */
	 public BasicAmountType getAmount() {
	 	return amount;
	 }
	 
	/**
	 * Setter for amount
	 */
	 public void setAmount(BasicAmountType amount) {
	 	this.amount = amount;
	 }
	 
	/**
	 * Getter for shippingAmount
	 */
	 public BasicAmountType getShippingAmount() {
	 	return shippingAmount;
	 }
	 
	/**
	 * Setter for shippingAmount
	 */
	 public void setShippingAmount(BasicAmountType shippingAmount) {
	 	this.shippingAmount = shippingAmount;
	 }
	 
	/**
	 * Getter for taxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return taxAmount;
	 }
	 
	/**
	 * Setter for taxAmount
	 */
	 public void setTaxAmount(BasicAmountType taxAmount) {
	 	this.taxAmount = taxAmount;
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
		if(billingPeriod != null) {
			sb.append("<").append(preferredPrefix).append(":BillingPeriod>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingPeriod.getValue()));
			sb.append("</").append(preferredPrefix).append(":BillingPeriod>");
		}
		if(billingFrequency != null) {
			sb.append("<").append(preferredPrefix).append(":BillingFrequency>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingFrequency));
			sb.append("</").append(preferredPrefix).append(":BillingFrequency>");
		}
		if(totalBillingCycles != null) {
			sb.append("<").append(preferredPrefix).append(":TotalBillingCycles>").append(SDKUtil.escapeInvalidXmlCharsRegex(totalBillingCycles));
			sb.append("</").append(preferredPrefix).append(":TotalBillingCycles>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(shippingAmount != null) {
			sb.append(shippingAmount.toXMLString(preferredPrefix,"ShippingAmount"));
		}
		if(taxAmount != null) {
			sb.append(taxAmount.toXMLString(preferredPrefix,"TaxAmount"));
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