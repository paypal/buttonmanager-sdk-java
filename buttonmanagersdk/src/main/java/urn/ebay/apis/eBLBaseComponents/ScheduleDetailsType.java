package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodDetailsType;
import urn.ebay.apis.eBLBaseComponents.ActivationDetailsType;
import urn.ebay.apis.eBLBaseComponents.AutoBillType;
import com.paypal.core.SDKUtil;

/**
 * Schedule details for the Recurring Payment 
 */
public class ScheduleDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Schedule details for the Recurring Payment 	  
	 *@Required	 
	 */ 
	private String description;

	/**
	 * Trial period of this schedule 	 
	 */ 
	private BillingPeriodDetailsType trialPeriod;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BillingPeriodDetailsType paymentPeriod;

	/**
	 * The max number of payments the buyer can fail before this
	 * Recurring Payments profile is cancelled 	 
	 */ 
	private Integer maxFailedPayments;

	/**
	 * 	 
	 */ 
	private ActivationDetailsType activationDetails;

	/**
	 * 	 
	 */ 
	private AutoBillType autoBillOutstandingAmount;

	

	/**
	 * Constructor with arguments
	 */
	public ScheduleDetailsType (String description, BillingPeriodDetailsType paymentPeriod){
		this.description = description;
		this.paymentPeriod = paymentPeriod;
	}	

	/**
	 * Default Constructor
	 */
	public ScheduleDetailsType (){
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
	 * Getter for trialPeriod
	 */
	 public BillingPeriodDetailsType getTrialPeriod() {
	 	return trialPeriod;
	 }
	 
	/**
	 * Setter for trialPeriod
	 */
	 public void setTrialPeriod(BillingPeriodDetailsType trialPeriod) {
	 	this.trialPeriod = trialPeriod;
	 }
	 
	/**
	 * Getter for paymentPeriod
	 */
	 public BillingPeriodDetailsType getPaymentPeriod() {
	 	return paymentPeriod;
	 }
	 
	/**
	 * Setter for paymentPeriod
	 */
	 public void setPaymentPeriod(BillingPeriodDetailsType paymentPeriod) {
	 	this.paymentPeriod = paymentPeriod;
	 }
	 
	/**
	 * Getter for maxFailedPayments
	 */
	 public Integer getMaxFailedPayments() {
	 	return maxFailedPayments;
	 }
	 
	/**
	 * Setter for maxFailedPayments
	 */
	 public void setMaxFailedPayments(Integer maxFailedPayments) {
	 	this.maxFailedPayments = maxFailedPayments;
	 }
	 
	/**
	 * Getter for activationDetails
	 */
	 public ActivationDetailsType getActivationDetails() {
	 	return activationDetails;
	 }
	 
	/**
	 * Setter for activationDetails
	 */
	 public void setActivationDetails(ActivationDetailsType activationDetails) {
	 	this.activationDetails = activationDetails;
	 }
	 
	/**
	 * Getter for autoBillOutstandingAmount
	 */
	 public AutoBillType getAutoBillOutstandingAmount() {
	 	return autoBillOutstandingAmount;
	 }
	 
	/**
	 * Setter for autoBillOutstandingAmount
	 */
	 public void setAutoBillOutstandingAmount(AutoBillType autoBillOutstandingAmount) {
	 	this.autoBillOutstandingAmount = autoBillOutstandingAmount;
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
		if(trialPeriod != null) {
			sb.append(trialPeriod.toXMLString(preferredPrefix,"TrialPeriod"));
		}
		if(paymentPeriod != null) {
			sb.append(paymentPeriod.toXMLString(preferredPrefix,"PaymentPeriod"));
		}
		if(maxFailedPayments != null) {
			sb.append("<").append(preferredPrefix).append(":MaxFailedPayments>").append(SDKUtil.escapeInvalidXmlCharsRegex(maxFailedPayments));
			sb.append("</").append(preferredPrefix).append(":MaxFailedPayments>");
		}
		if(activationDetails != null) {
			sb.append(activationDetails.toXMLString(preferredPrefix,"ActivationDetails"));
		}
		if(autoBillOutstandingAmount != null) {
			sb.append("<").append(preferredPrefix).append(":AutoBillOutstandingAmount>").append(SDKUtil.escapeInvalidXmlCharsRegex(autoBillOutstandingAmount.getValue()));
			sb.append("</").append(preferredPrefix).append(":AutoBillOutstandingAmount>");
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