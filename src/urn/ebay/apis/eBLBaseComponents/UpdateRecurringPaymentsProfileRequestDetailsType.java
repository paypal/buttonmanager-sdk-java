package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AutoBillType;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import urn.ebay.apis.eBLBaseComponents.BillingPeriodDetailsType_Update;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class UpdateRecurringPaymentsProfileRequestDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String ProfileID;

	/**
	 * 	 
	 */ 
	private String Note;

	/**
	 * 	 
	 */ 
	private String Description;

	/**
	 * 	 
	 */ 
	private String SubscriberName;

	/**
	 * 	 
	 */ 
	private AddressType SubscriberShippingAddress;

	/**
	 * 	 
	 */ 
	private String ProfileReference;

	/**
	 * 	 
	 */ 
	private Integer AdditionalBillingCycles;

	/**
	 * 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * 	 
	 */ 
	private BasicAmountType ShippingAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType TaxAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType OutstandingBalance;

	/**
	 * 	 
	 */ 
	private AutoBillType AutoBillOutstandingAmount;

	/**
	 * 	 
	 */ 
	private Integer MaxFailedPayments;

	/**
	 * Information about the credit card to be charged (required if
	 * Direct Payment) 	 
	 */ 
	private CreditCardDetailsType CreditCard;

	/**
	 * When does this Profile begin billing? 	 
	 */ 
	private String BillingStartDate;

	/**
	 * Trial period of this schedule 	 
	 */ 
	private BillingPeriodDetailsType_Update TrialPeriod;

	/**
	 * 	 
	 */ 
	private BillingPeriodDetailsType_Update PaymentPeriod;

	

	/**
	 * Constructor with arguments
	 */
	public UpdateRecurringPaymentsProfileRequestDetailsType (String ProfileID){
		this.ProfileID = ProfileID;
	}	

	/**
	 * Default Constructor
	 */
	public UpdateRecurringPaymentsProfileRequestDetailsType (){
	}	

	/**
	 * Getter for ProfileID
	 */
	 public String getProfileID() {
	 	return ProfileID;
	 }
	 
	/**
	 * Setter for ProfileID
	 */
	 public void setProfileID(String ProfileID) {
	 	this.ProfileID = ProfileID;
	 }
	 
	/**
	 * Getter for Note
	 */
	 public String getNote() {
	 	return Note;
	 }
	 
	/**
	 * Setter for Note
	 */
	 public void setNote(String Note) {
	 	this.Note = Note;
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
	 * Getter for SubscriberName
	 */
	 public String getSubscriberName() {
	 	return SubscriberName;
	 }
	 
	/**
	 * Setter for SubscriberName
	 */
	 public void setSubscriberName(String SubscriberName) {
	 	this.SubscriberName = SubscriberName;
	 }
	 
	/**
	 * Getter for SubscriberShippingAddress
	 */
	 public AddressType getSubscriberShippingAddress() {
	 	return SubscriberShippingAddress;
	 }
	 
	/**
	 * Setter for SubscriberShippingAddress
	 */
	 public void setSubscriberShippingAddress(AddressType SubscriberShippingAddress) {
	 	this.SubscriberShippingAddress = SubscriberShippingAddress;
	 }
	 
	/**
	 * Getter for ProfileReference
	 */
	 public String getProfileReference() {
	 	return ProfileReference;
	 }
	 
	/**
	 * Setter for ProfileReference
	 */
	 public void setProfileReference(String ProfileReference) {
	 	this.ProfileReference = ProfileReference;
	 }
	 
	/**
	 * Getter for AdditionalBillingCycles
	 */
	 public Integer getAdditionalBillingCycles() {
	 	return AdditionalBillingCycles;
	 }
	 
	/**
	 * Setter for AdditionalBillingCycles
	 */
	 public void setAdditionalBillingCycles(Integer AdditionalBillingCycles) {
	 	this.AdditionalBillingCycles = AdditionalBillingCycles;
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
	 
	/**
	 * Getter for OutstandingBalance
	 */
	 public BasicAmountType getOutstandingBalance() {
	 	return OutstandingBalance;
	 }
	 
	/**
	 * Setter for OutstandingBalance
	 */
	 public void setOutstandingBalance(BasicAmountType OutstandingBalance) {
	 	this.OutstandingBalance = OutstandingBalance;
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
	 * Getter for CreditCard
	 */
	 public CreditCardDetailsType getCreditCard() {
	 	return CreditCard;
	 }
	 
	/**
	 * Setter for CreditCard
	 */
	 public void setCreditCard(CreditCardDetailsType CreditCard) {
	 	this.CreditCard = CreditCard;
	 }
	 
	/**
	 * Getter for BillingStartDate
	 */
	 public String getBillingStartDate() {
	 	return BillingStartDate;
	 }
	 
	/**
	 * Setter for BillingStartDate
	 */
	 public void setBillingStartDate(String BillingStartDate) {
	 	this.BillingStartDate = BillingStartDate;
	 }
	 
	/**
	 * Getter for TrialPeriod
	 */
	 public BillingPeriodDetailsType_Update getTrialPeriod() {
	 	return TrialPeriod;
	 }
	 
	/**
	 * Setter for TrialPeriod
	 */
	 public void setTrialPeriod(BillingPeriodDetailsType_Update TrialPeriod) {
	 	this.TrialPeriod = TrialPeriod;
	 }
	 
	/**
	 * Getter for PaymentPeriod
	 */
	 public BillingPeriodDetailsType_Update getPaymentPeriod() {
	 	return PaymentPeriod;
	 }
	 
	/**
	 * Setter for PaymentPeriod
	 */
	 public void setPaymentPeriod(BillingPeriodDetailsType_Update PaymentPeriod) {
	 	this.PaymentPeriod = PaymentPeriod;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ProfileID != null) {
			sb.append("<ebl:ProfileID>").append(SDKUtil.escapeInvalidXmlCharsRegex(ProfileID));
			sb.append("</ebl:ProfileID>");
		}
		if(Note != null) {
			sb.append("<ebl:Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(Note));
			sb.append("</ebl:Note>");
		}
		if(Description != null) {
			sb.append("<ebl:Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(Description));
			sb.append("</ebl:Description>");
		}
		if(SubscriberName != null) {
			sb.append("<ebl:SubscriberName>").append(SDKUtil.escapeInvalidXmlCharsRegex(SubscriberName));
			sb.append("</ebl:SubscriberName>");
		}
		if(SubscriberShippingAddress != null) {
			sb.append("<ebl:SubscriberShippingAddress>");
			sb.append(SubscriberShippingAddress.toXMLString());
			sb.append("</ebl:SubscriberShippingAddress>");
		}
		if(ProfileReference != null) {
			sb.append("<ebl:ProfileReference>").append(SDKUtil.escapeInvalidXmlCharsRegex(ProfileReference));
			sb.append("</ebl:ProfileReference>");
		}
		if(AdditionalBillingCycles != null) {
			sb.append("<ebl:AdditionalBillingCycles>").append(SDKUtil.escapeInvalidXmlCharsRegex(AdditionalBillingCycles));
			sb.append("</ebl:AdditionalBillingCycles>");
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
		if(OutstandingBalance != null) {
			sb.append("<ebl:OutstandingBalance");
			sb.append(OutstandingBalance.toXMLString());
			sb.append("</ebl:OutstandingBalance>");
		}
		if(AutoBillOutstandingAmount != null) {
			sb.append("<ebl:AutoBillOutstandingAmount>").append(SDKUtil.escapeInvalidXmlCharsRegex(AutoBillOutstandingAmount.getValue()));
			sb.append("</ebl:AutoBillOutstandingAmount>");
		}
		if(MaxFailedPayments != null) {
			sb.append("<ebl:MaxFailedPayments>").append(SDKUtil.escapeInvalidXmlCharsRegex(MaxFailedPayments));
			sb.append("</ebl:MaxFailedPayments>");
		}
		if(CreditCard != null) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if(BillingStartDate != null) {
			sb.append("<ebl:BillingStartDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingStartDate));
			sb.append("</ebl:BillingStartDate>");
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
		return sb.toString();
	}


}