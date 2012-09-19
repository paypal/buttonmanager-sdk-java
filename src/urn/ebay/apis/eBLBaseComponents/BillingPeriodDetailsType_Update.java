package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * Unit of meausre for billing cycle 
 */
public class BillingPeriodDetailsType_Update{


	/**
	 * Unit of meausre for billing cycle 	 
	 */ 
	private BillingPeriodType BillingPeriod;

	/**
	 * Number of BillingPeriod that make up one billing cycle 	 
	 */ 
	private Integer BillingFrequency;

	/**
	 * Total billing cycles in this portion of the schedule 	 
	 */ 
	private Integer TotalBillingCycles;

	/**
	 * Amount to charge 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Additional shipping amount to charge 	 
	 */ 
	private BasicAmountType ShippingAmount;

	/**
	 * Additional tax amount to charge 	 
	 */ 
	private BasicAmountType TaxAmount;

	

	/**
	 * Default Constructor
	 */
	public BillingPeriodDetailsType_Update (){
	}	

	/**
	 * Getter for BillingPeriod
	 */
	 public BillingPeriodType getBillingPeriod() {
	 	return BillingPeriod;
	 }
	 
	/**
	 * Setter for BillingPeriod
	 */
	 public void setBillingPeriod(BillingPeriodType BillingPeriod) {
	 	this.BillingPeriod = BillingPeriod;
	 }
	 
	/**
	 * Getter for BillingFrequency
	 */
	 public Integer getBillingFrequency() {
	 	return BillingFrequency;
	 }
	 
	/**
	 * Setter for BillingFrequency
	 */
	 public void setBillingFrequency(Integer BillingFrequency) {
	 	this.BillingFrequency = BillingFrequency;
	 }
	 
	/**
	 * Getter for TotalBillingCycles
	 */
	 public Integer getTotalBillingCycles() {
	 	return TotalBillingCycles;
	 }
	 
	/**
	 * Setter for TotalBillingCycles
	 */
	 public void setTotalBillingCycles(Integer TotalBillingCycles) {
	 	this.TotalBillingCycles = TotalBillingCycles;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for ShippingAmount
	 */
	 public BasicAmountType getShippingAmount() {
	 	return ShippingAmount;
	 }
	 
	/**
	 * Setter for ShippingAmount
	 */
	 public void setShippingAmount(BasicAmountType ShippingAmount) {
	 	this.ShippingAmount = ShippingAmount;
	 }
	 
	/**
	 * Getter for TaxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return TaxAmount;
	 }
	 
	/**
	 * Setter for TaxAmount
	 */
	 public void setTaxAmount(BasicAmountType TaxAmount) {
	 	this.TaxAmount = TaxAmount;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BillingPeriod != null) {
			sb.append("<ebl:BillingPeriod>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingPeriod.getValue()));
			sb.append("</ebl:BillingPeriod>");
		}
		if(BillingFrequency != null) {
			sb.append("<ebl:BillingFrequency>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingFrequency));
			sb.append("</ebl:BillingFrequency>");
		}
		if(TotalBillingCycles != null) {
			sb.append("<ebl:TotalBillingCycles>").append(SDKUtil.escapeInvalidXmlCharsRegex(TotalBillingCycles));
			sb.append("</ebl:TotalBillingCycles>");
		}
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(ShippingAmount != null) {
			sb.append("<ebl:ShippingAmount");
			sb.append(ShippingAmount.toXMLString());
			sb.append("</ebl:ShippingAmount>");
		}
		if(TaxAmount != null) {
			sb.append("<ebl:TaxAmount");
			sb.append(TaxAmount.toXMLString());
			sb.append("</ebl:TaxAmount>");
		}
		return sb.toString();
	}


}