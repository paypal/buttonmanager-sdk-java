
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.ActivationDetailsType;
import urn.ebay.apis.eBLBaseComponents.AutoBillType;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodDetailsType;


/**
 * Schedule details for the Recurring Payment
 */
public class ScheduleDetailsType {

	/**
	 * Schedule details for the Recurring Payment
	 *
	 * @Required
	 */
	private String Description;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String value) {
		this.Description = value;
	}

	/**
	 * Trial period of this schedule
	 */
	private BillingPeriodDetailsType TrialPeriod;
	public BillingPeriodDetailsType getTrialPeriod() {
		return TrialPeriod;
	}
	public void setTrialPeriod(BillingPeriodDetailsType value) {
		this.TrialPeriod = value;
	}

	/**
	 *
	 * @Required
	 */
	private BillingPeriodDetailsType PaymentPeriod;
	public BillingPeriodDetailsType getPaymentPeriod() {
		return PaymentPeriod;
	}
	public void setPaymentPeriod(BillingPeriodDetailsType value) {
		this.PaymentPeriod = value;
	}

	/**
	 * The max number of payments the buyer can fail before this Recurring Payments profile is cancelled
	 */
	private Integer MaxFailedPayments;
	public Integer getMaxFailedPayments() {
		return MaxFailedPayments;
	}
	public void setMaxFailedPayments(Integer value) {
		this.MaxFailedPayments = value;
	}

	/**
	 */
	private ActivationDetailsType ActivationDetails;
	public ActivationDetailsType getActivationDetails() {
		return ActivationDetails;
	}
	public void setActivationDetails(ActivationDetailsType value) {
		this.ActivationDetails = value;
	}

	/**
	 */
	private AutoBillType AutoBillOutstandingAmount;
	public AutoBillType getAutoBillOutstandingAmount() {
		return AutoBillOutstandingAmount;
	}
	public void setAutoBillOutstandingAmount(AutoBillType value) {
		this.AutoBillOutstandingAmount = value;
	}


	public ScheduleDetailsType(String Description, BillingPeriodDetailsType PaymentPeriod) {
		this.Description = Description;
		this.PaymentPeriod = PaymentPeriod;
	}
	public ScheduleDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Description != null ) {
			sb.append("<ebl:Description>").append(Description);
			sb.append("</ebl:Description>");
		}
		if( TrialPeriod != null ) {
			sb.append("<ebl:TrialPeriod>");
			sb.append(TrialPeriod.toXMLString());
			sb.append("</ebl:TrialPeriod>");
		}
		if( PaymentPeriod != null ) {
			sb.append("<ebl:PaymentPeriod>");
			sb.append(PaymentPeriod.toXMLString());
			sb.append("</ebl:PaymentPeriod>");
		}
		if( MaxFailedPayments != null ) {
			sb.append("<ebl:MaxFailedPayments>").append(MaxFailedPayments);
			sb.append("</ebl:MaxFailedPayments>");
		}
		if( ActivationDetails != null ) {
			sb.append("<ebl:ActivationDetails>");
			sb.append(ActivationDetails.toXMLString());
			sb.append("</ebl:ActivationDetails>");
		}
		if( AutoBillOutstandingAmount != null ) {
			sb.append("<ebl:AutoBillOutstandingAmount>").append( AutoBillOutstandingAmount.getValue());
			sb.append("</ebl:AutoBillOutstandingAmount>");
		}
		return sb.toString();
	}

}
