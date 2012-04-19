
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.AutoBillType;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodDetailsType_Update;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;


/**
 */
public class UpdateRecurringPaymentsProfileRequestDetailsType {

	/**
	 *
	 * @Required
	 */
	private String ProfileID;
	public String getProfileID() {
		return ProfileID;
	}
	public void setProfileID(String value) {
		this.ProfileID = value;
	}

	/**
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}

	/**
	 */
	private String Description;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String value) {
		this.Description = value;
	}

	/**
	 */
	private String SubscriberName;
	public String getSubscriberName() {
		return SubscriberName;
	}
	public void setSubscriberName(String value) {
		this.SubscriberName = value;
	}

	/**
	 */
	private AddressType SubscriberShippingAddress;
	public AddressType getSubscriberShippingAddress() {
		return SubscriberShippingAddress;
	}
	public void setSubscriberShippingAddress(AddressType value) {
		this.SubscriberShippingAddress = value;
	}

	/**
	 */
	private String ProfileReference;
	public String getProfileReference() {
		return ProfileReference;
	}
	public void setProfileReference(String value) {
		this.ProfileReference = value;
	}

	/**
	 */
	private Integer AdditionalBillingCycles;
	public Integer getAdditionalBillingCycles() {
		return AdditionalBillingCycles;
	}
	public void setAdditionalBillingCycles(Integer value) {
		this.AdditionalBillingCycles = value;
	}

	/**
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
	 */
	private BasicAmountType ShippingAmount;
	public BasicAmountType getShippingAmount() {
		return ShippingAmount;
	}
	public void setShippingAmount(BasicAmountType value) {
		this.ShippingAmount = value;
	}

	/**
	 */
	private BasicAmountType TaxAmount;
	public BasicAmountType getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(BasicAmountType value) {
		this.TaxAmount = value;
	}

	/**
	 */
	private BasicAmountType OutstandingBalance;
	public BasicAmountType getOutstandingBalance() {
		return OutstandingBalance;
	}
	public void setOutstandingBalance(BasicAmountType value) {
		this.OutstandingBalance = value;
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

	/**
	 */
	private Integer MaxFailedPayments;
	public Integer getMaxFailedPayments() {
		return MaxFailedPayments;
	}
	public void setMaxFailedPayments(Integer value) {
		this.MaxFailedPayments = value;
	}

	/**
	 * Information about the credit card to be charged (required if Direct Payment)
	 */
	private CreditCardDetailsType CreditCard;
	public CreditCardDetailsType getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(CreditCardDetailsType value) {
		this.CreditCard = value;
	}

	/**
	 * When does this Profile begin billing?
	 */
	private String BillingStartDate;
	public String getBillingStartDate() {
		return BillingStartDate;
	}
	public void setBillingStartDate(String value) {
		this.BillingStartDate = value;
	}

	/**
	 * Trial period of this schedule
	 */
	private BillingPeriodDetailsType_Update TrialPeriod;
	public BillingPeriodDetailsType_Update getTrialPeriod() {
		return TrialPeriod;
	}
	public void setTrialPeriod(BillingPeriodDetailsType_Update value) {
		this.TrialPeriod = value;
	}

	/**
	 */
	private BillingPeriodDetailsType_Update PaymentPeriod;
	public BillingPeriodDetailsType_Update getPaymentPeriod() {
		return PaymentPeriod;
	}
	public void setPaymentPeriod(BillingPeriodDetailsType_Update value) {
		this.PaymentPeriod = value;
	}


	public UpdateRecurringPaymentsProfileRequestDetailsType(String ProfileID) {
		this.ProfileID = ProfileID;
	}
	public UpdateRecurringPaymentsProfileRequestDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ProfileID != null ) {
			sb.append("<ebl:ProfileID>").append(ProfileID);
			sb.append("</ebl:ProfileID>");
		}
		if( Note != null ) {
			sb.append("<ebl:Note>").append(Note);
			sb.append("</ebl:Note>");
		}
		if( Description != null ) {
			sb.append("<ebl:Description>").append(Description);
			sb.append("</ebl:Description>");
		}
		if( SubscriberName != null ) {
			sb.append("<ebl:SubscriberName>").append(SubscriberName);
			sb.append("</ebl:SubscriberName>");
		}
		if( SubscriberShippingAddress != null ) {
			sb.append("<ebl:SubscriberShippingAddress>");
			sb.append(SubscriberShippingAddress.toXMLString());
			sb.append("</ebl:SubscriberShippingAddress>");
		}
		if( ProfileReference != null ) {
			sb.append("<ebl:ProfileReference>").append(ProfileReference);
			sb.append("</ebl:ProfileReference>");
		}
		if( AdditionalBillingCycles != null ) {
			sb.append("<ebl:AdditionalBillingCycles>").append(AdditionalBillingCycles);
			sb.append("</ebl:AdditionalBillingCycles>");
		}
		if( Amount != null ) {
			sb.append("<ebl:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if( ShippingAmount != null ) {
			sb.append("<ebl:ShippingAmount ");
			sb.append(ShippingAmount.toXMLString());
			sb.append("</ebl:ShippingAmount>");
		}
		if( TaxAmount != null ) {
			sb.append("<ebl:TaxAmount ");
			sb.append(TaxAmount.toXMLString());
			sb.append("</ebl:TaxAmount>");
		}
		if( OutstandingBalance != null ) {
			sb.append("<ebl:OutstandingBalance ");
			sb.append(OutstandingBalance.toXMLString());
			sb.append("</ebl:OutstandingBalance>");
		}
		if( AutoBillOutstandingAmount != null ) {
			sb.append("<ebl:AutoBillOutstandingAmount>").append( AutoBillOutstandingAmount.getValue());
			sb.append("</ebl:AutoBillOutstandingAmount>");
		}
		if( MaxFailedPayments != null ) {
			sb.append("<ebl:MaxFailedPayments>").append(MaxFailedPayments);
			sb.append("</ebl:MaxFailedPayments>");
		}
		if( CreditCard != null ) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if( BillingStartDate != null ) {
			sb.append("<ebl:BillingStartDate>").append(BillingStartDate);
			sb.append("</ebl:BillingStartDate>");
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
		return sb.toString();
	}

}
