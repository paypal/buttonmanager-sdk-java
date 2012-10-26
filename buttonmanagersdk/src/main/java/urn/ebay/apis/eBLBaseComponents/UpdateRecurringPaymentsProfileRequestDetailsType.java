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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String profileID;

	/**
	 * 	 
	 */ 
	private String note;

	/**
	 * 	 
	 */ 
	private String description;

	/**
	 * 	 
	 */ 
	private String subscriberName;

	/**
	 * 	 
	 */ 
	private AddressType subscriberShippingAddress;

	/**
	 * 	 
	 */ 
	private String profileReference;

	/**
	 * 	 
	 */ 
	private Integer additionalBillingCycles;

	/**
	 * 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * 	 
	 */ 
	private BasicAmountType shippingAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType taxAmount;

	/**
	 * 	 
	 */ 
	private BasicAmountType outstandingBalance;

	/**
	 * 	 
	 */ 
	private AutoBillType autoBillOutstandingAmount;

	/**
	 * 	 
	 */ 
	private Integer maxFailedPayments;

	/**
	 * Information about the credit card to be charged (required if
	 * Direct Payment) 	 
	 */ 
	private CreditCardDetailsType creditCard;

	/**
	 * When does this Profile begin billing? 	 
	 */ 
	private String billingStartDate;

	/**
	 * Trial period of this schedule 	 
	 */ 
	private BillingPeriodDetailsType_Update trialPeriod;

	/**
	 * 	 
	 */ 
	private BillingPeriodDetailsType_Update paymentPeriod;

	

	/**
	 * Constructor with arguments
	 */
	public UpdateRecurringPaymentsProfileRequestDetailsType (String profileID){
		this.profileID = profileID;
	}	

	/**
	 * Default Constructor
	 */
	public UpdateRecurringPaymentsProfileRequestDetailsType (){
	}	

	/**
	 * Getter for profileID
	 */
	 public String getProfileID() {
	 	return profileID;
	 }
	 
	/**
	 * Setter for profileID
	 */
	 public void setProfileID(String profileID) {
	 	this.profileID = profileID;
	 }
	 
	/**
	 * Getter for note
	 */
	 public String getNote() {
	 	return note;
	 }
	 
	/**
	 * Setter for note
	 */
	 public void setNote(String note) {
	 	this.note = note;
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
	 * Getter for subscriberName
	 */
	 public String getSubscriberName() {
	 	return subscriberName;
	 }
	 
	/**
	 * Setter for subscriberName
	 */
	 public void setSubscriberName(String subscriberName) {
	 	this.subscriberName = subscriberName;
	 }
	 
	/**
	 * Getter for subscriberShippingAddress
	 */
	 public AddressType getSubscriberShippingAddress() {
	 	return subscriberShippingAddress;
	 }
	 
	/**
	 * Setter for subscriberShippingAddress
	 */
	 public void setSubscriberShippingAddress(AddressType subscriberShippingAddress) {
	 	this.subscriberShippingAddress = subscriberShippingAddress;
	 }
	 
	/**
	 * Getter for profileReference
	 */
	 public String getProfileReference() {
	 	return profileReference;
	 }
	 
	/**
	 * Setter for profileReference
	 */
	 public void setProfileReference(String profileReference) {
	 	this.profileReference = profileReference;
	 }
	 
	/**
	 * Getter for additionalBillingCycles
	 */
	 public Integer getAdditionalBillingCycles() {
	 	return additionalBillingCycles;
	 }
	 
	/**
	 * Setter for additionalBillingCycles
	 */
	 public void setAdditionalBillingCycles(Integer additionalBillingCycles) {
	 	this.additionalBillingCycles = additionalBillingCycles;
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
	 
	/**
	 * Getter for outstandingBalance
	 */
	 public BasicAmountType getOutstandingBalance() {
	 	return outstandingBalance;
	 }
	 
	/**
	 * Setter for outstandingBalance
	 */
	 public void setOutstandingBalance(BasicAmountType outstandingBalance) {
	 	this.outstandingBalance = outstandingBalance;
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
	 * Getter for creditCard
	 */
	 public CreditCardDetailsType getCreditCard() {
	 	return creditCard;
	 }
	 
	/**
	 * Setter for creditCard
	 */
	 public void setCreditCard(CreditCardDetailsType creditCard) {
	 	this.creditCard = creditCard;
	 }
	 
	/**
	 * Getter for billingStartDate
	 */
	 public String getBillingStartDate() {
	 	return billingStartDate;
	 }
	 
	/**
	 * Setter for billingStartDate
	 */
	 public void setBillingStartDate(String billingStartDate) {
	 	this.billingStartDate = billingStartDate;
	 }
	 
	/**
	 * Getter for trialPeriod
	 */
	 public BillingPeriodDetailsType_Update getTrialPeriod() {
	 	return trialPeriod;
	 }
	 
	/**
	 * Setter for trialPeriod
	 */
	 public void setTrialPeriod(BillingPeriodDetailsType_Update trialPeriod) {
	 	this.trialPeriod = trialPeriod;
	 }
	 
	/**
	 * Getter for paymentPeriod
	 */
	 public BillingPeriodDetailsType_Update getPaymentPeriod() {
	 	return paymentPeriod;
	 }
	 
	/**
	 * Setter for paymentPeriod
	 */
	 public void setPaymentPeriod(BillingPeriodDetailsType_Update paymentPeriod) {
	 	this.paymentPeriod = paymentPeriod;
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
		if(profileID != null) {
			sb.append("<").append(preferredPrefix).append(":ProfileID>").append(SDKUtil.escapeInvalidXmlCharsRegex(profileID));
			sb.append("</").append(preferredPrefix).append(":ProfileID>");
		}
		if(note != null) {
			sb.append("<").append(preferredPrefix).append(":Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(note));
			sb.append("</").append(preferredPrefix).append(":Note>");
		}
		if(description != null) {
			sb.append("<").append(preferredPrefix).append(":Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(description));
			sb.append("</").append(preferredPrefix).append(":Description>");
		}
		if(subscriberName != null) {
			sb.append("<").append(preferredPrefix).append(":SubscriberName>").append(SDKUtil.escapeInvalidXmlCharsRegex(subscriberName));
			sb.append("</").append(preferredPrefix).append(":SubscriberName>");
		}
		if(subscriberShippingAddress != null) {
			sb.append(subscriberShippingAddress.toXMLString(preferredPrefix,"SubscriberShippingAddress"));
		}
		if(profileReference != null) {
			sb.append("<").append(preferredPrefix).append(":ProfileReference>").append(SDKUtil.escapeInvalidXmlCharsRegex(profileReference));
			sb.append("</").append(preferredPrefix).append(":ProfileReference>");
		}
		if(additionalBillingCycles != null) {
			sb.append("<").append(preferredPrefix).append(":AdditionalBillingCycles>").append(SDKUtil.escapeInvalidXmlCharsRegex(additionalBillingCycles));
			sb.append("</").append(preferredPrefix).append(":AdditionalBillingCycles>");
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
		if(outstandingBalance != null) {
			sb.append(outstandingBalance.toXMLString(preferredPrefix,"OutstandingBalance"));
		}
		if(autoBillOutstandingAmount != null) {
			sb.append("<").append(preferredPrefix).append(":AutoBillOutstandingAmount>").append(SDKUtil.escapeInvalidXmlCharsRegex(autoBillOutstandingAmount.getValue()));
			sb.append("</").append(preferredPrefix).append(":AutoBillOutstandingAmount>");
		}
		if(maxFailedPayments != null) {
			sb.append("<").append(preferredPrefix).append(":MaxFailedPayments>").append(SDKUtil.escapeInvalidXmlCharsRegex(maxFailedPayments));
			sb.append("</").append(preferredPrefix).append(":MaxFailedPayments>");
		}
		if(creditCard != null) {
			sb.append(creditCard.toXMLString(preferredPrefix,"CreditCard"));
		}
		if(billingStartDate != null) {
			sb.append("<").append(preferredPrefix).append(":BillingStartDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingStartDate));
			sb.append("</").append(preferredPrefix).append(":BillingStartDate>");
		}
		if(trialPeriod != null) {
			sb.append(trialPeriod.toXMLString(preferredPrefix,"TrialPeriod"));
		}
		if(paymentPeriod != null) {
			sb.append(paymentPeriod.toXMLString(preferredPrefix,"PaymentPeriod"));
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