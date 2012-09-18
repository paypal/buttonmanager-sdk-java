package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodDetailsType;
import urn.ebay.apis.eBLBaseComponents.ActivationDetailsType;
import urn.ebay.apis.eBLBaseComponents.AutoBillType;
import com.paypal.core.SDKUtil;

/**
 * Schedule details for the Recurring Payment 
 */
public class ScheduleDetailsType{


	/**
	 * Schedule details for the Recurring Payment 	  
	 *@Required	 
	 */ 
	private String Description;

	/**
	 * Trial period of this schedule 	 
	 */ 
	private BillingPeriodDetailsType TrialPeriod;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BillingPeriodDetailsType PaymentPeriod;

	/**
	 * The max number of payments the buyer can fail before this
	 * Recurring Payments profile is cancelled 	 
	 */ 
	private Integer MaxFailedPayments;

	/**
	 * 	 
	 */ 
	private ActivationDetailsType ActivationDetails;

	/**
	 * 	 
	 */ 
	private AutoBillType AutoBillOutstandingAmount;

	

	/**
	 * Constructor with arguments
	 */
	public ScheduleDetailsType (String Description, BillingPeriodDetailsType PaymentPeriod){
		this.Description = Description;
		this.PaymentPeriod = PaymentPeriod;
	}	

	/**
	 * Default Constructor
	 */
	public ScheduleDetailsType (){
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
	 * Getter for TrialPeriod
	 */
	 public BillingPeriodDetailsType getTrialPeriod() {
	 	return TrialPeriod;
	 }
	 
	/**
	 * Setter for TrialPeriod
	 */
	 public void setTrialPeriod(BillingPeriodDetailsType TrialPeriod) {
	 	this.TrialPeriod = TrialPeriod;
	 }
	 
	/**
	 * Getter for PaymentPeriod
	 */
	 public BillingPeriodDetailsType getPaymentPeriod() {
	 	return PaymentPeriod;
	 }
	 
	/**
	 * Setter for PaymentPeriod
	 */
	 public void setPaymentPeriod(BillingPeriodDetailsType PaymentPeriod) {
	 	this.PaymentPeriod = PaymentPeriod;
	 }
	 
	/**
	 * Getter for MaxFailedPayments
	 */
	 public Integer getMaxFailedPayments() {
	 	return MaxFailedPayments;
	 }
	 
	/**
	 * Setter for MaxFailedPayments
	 */
	 public void setMaxFailedPayments(Integer MaxFailedPayments) {
	 	this.MaxFailedPayments = MaxFailedPayments;
	 }
	 
	/**
	 * Getter for ActivationDetails
	 */
	 public ActivationDetailsType getActivationDetails() {
	 	return ActivationDetails;
	 }
	 
	/**
	 * Setter for ActivationDetails
	 */
	 public void setActivationDetails(ActivationDetailsType ActivationDetails) {
	 	this.ActivationDetails = ActivationDetails;
	 }
	 
	/**
	 * Getter for AutoBillOutstandingAmount
	 */
	 public AutoBillType getAutoBillOutstandingAmount() {
	 	return AutoBillOutstandingAmount;
	 }
	 
	/**
	 * Setter for AutoBillOutstandingAmount
	 */
	 public void setAutoBillOutstandingAmount(AutoBillType AutoBillOutstandingAmount) {
	 	this.AutoBillOutstandingAmount = AutoBillOutstandingAmount;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Description != null) {
			sb.append("<ebl:Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(Description));
			sb.append("</ebl:Description>");
		}
		if(TrialPeriod != null) {
			sb.append("<ebl:TrialPeriod>");
			sb.append(TrialPeriod.toXMLString());
			sb.append("</ebl:TrialPeriod>");
		}
		if(PaymentPeriod != null) {
			sb.append("<ebl:PaymentPeriod>");
			sb.append(PaymentPeriod.toXMLString());
			sb.append("</ebl:PaymentPeriod>");
		}
		if(MaxFailedPayments != null) {
			sb.append("<ebl:MaxFailedPayments>").append(SDKUtil.escapeInvalidXmlCharsRegex(MaxFailedPayments));
			sb.append("</ebl:MaxFailedPayments>");
		}
		if(ActivationDetails != null) {
			sb.append("<ebl:ActivationDetails>");
			sb.append(ActivationDetails.toXMLString());
			sb.append("</ebl:ActivationDetails>");
		}
		if(AutoBillOutstandingAmount != null) {
			sb.append("<ebl:AutoBillOutstandingAmount>").append(SDKUtil.escapeInvalidXmlCharsRegex(AutoBillOutstandingAmount.getValue()));
			sb.append("</ebl:AutoBillOutstandingAmount>");
		}
		return sb.toString();
	}

}