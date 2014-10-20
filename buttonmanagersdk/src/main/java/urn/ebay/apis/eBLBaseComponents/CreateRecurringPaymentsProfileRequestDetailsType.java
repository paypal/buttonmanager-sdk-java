package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileDetailsType;
import urn.ebay.apis.eBLBaseComponents.ScheduleDetailsType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsItemType;
import com.paypal.core.SDKUtil;

/**
 * Billing Agreement token (required if Express Checkout) 
 */
public class CreateRecurringPaymentsProfileRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Billing Agreement token (required if Express Checkout) 	 
	 */ 
	private String token;

	/**
	 * Information about the credit card to be charged (required if
	 * Direct Payment) 	 
	 */ 
	private CreditCardDetailsType creditCard;

	/**
	 * Customer Information for this Recurring Payments 	  
	 *@Required	 
	 */ 
	private RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails;

	/**
	 * Schedule Information for this Recurring Payments 	  
	 *@Required	 
	 */ 
	private ScheduleDetailsType scheduleDetails;

	/**
	 * Information about the Item Details. 	 
	 */ 
	private List<PaymentDetailsItemType> paymentDetailsItem = new ArrayList<PaymentDetailsItemType>();

	/**
	 * Use this optional parameter to pass in your business name
	 * and other data describing the transaction. Optional This
	 * information is usually displayed in the CC account holder's
	 * statement. Example: RedCross Haiti, RedCross Uganda,
	 * Realtor.com dues, Realtor.com list fee Length 25 characters.
	 * Alphanumeric characters and dash(-), dot(.), asterisk(*),
	 * space( ) On the customer's statement, an asterisk is used to
	 * separate the DBA name and product name. The asterisk
	 * delimiter can appear in position 4, 8, or 13. 	 
	 */ 
	private String softDescriptor;

	/**
	 * Use this optional parameter to pass information about how
	 * consumer should contact the merchant. Optional This
	 * information is usually displayed in the CC account holder's
	 * statement. For Ecom trx: phone, email or URL is allowed For
	 * Retail trx: only the actual city is allowed For details on
	 * allowed characters in Soft Descriptor City refer to the API
	 * documentation. 	 
	 */ 
	private String softDescriptorCity;

	

	/**
	 * Constructor with arguments
	 */
	public CreateRecurringPaymentsProfileRequestDetailsType (RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails, ScheduleDetailsType scheduleDetails){
		this.recurringPaymentsProfileDetails = recurringPaymentsProfileDetails;
		this.scheduleDetails = scheduleDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CreateRecurringPaymentsProfileRequestDetailsType (){
	}	

	/**
	 * Getter for token
	 */
	 public String getToken() {
	 	return token;
	 }
	 
	/**
	 * Setter for token
	 */
	 public void setToken(String token) {
	 	this.token = token;
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
	 * Getter for recurringPaymentsProfileDetails
	 */
	 public RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
	 	return recurringPaymentsProfileDetails;
	 }
	 
	/**
	 * Setter for recurringPaymentsProfileDetails
	 */
	 public void setRecurringPaymentsProfileDetails(RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails) {
	 	this.recurringPaymentsProfileDetails = recurringPaymentsProfileDetails;
	 }
	 
	/**
	 * Getter for scheduleDetails
	 */
	 public ScheduleDetailsType getScheduleDetails() {
	 	return scheduleDetails;
	 }
	 
	/**
	 * Setter for scheduleDetails
	 */
	 public void setScheduleDetails(ScheduleDetailsType scheduleDetails) {
	 	this.scheduleDetails = scheduleDetails;
	 }
	 
	/**
	 * Getter for paymentDetailsItem
	 */
	 public List<PaymentDetailsItemType> getPaymentDetailsItem() {
	 	return paymentDetailsItem;
	 }
	 
	/**
	 * Setter for paymentDetailsItem
	 */
	 public void setPaymentDetailsItem(List<PaymentDetailsItemType> paymentDetailsItem) {
	 	this.paymentDetailsItem = paymentDetailsItem;
	 }
	 
	/**
	 * Getter for softDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return softDescriptor;
	 }
	 
	/**
	 * Setter for softDescriptor
	 */
	 public void setSoftDescriptor(String softDescriptor) {
	 	this.softDescriptor = softDescriptor;
	 }
	 
	/**
	 * Getter for softDescriptorCity
	 */
	 public String getSoftDescriptorCity() {
	 	return softDescriptorCity;
	 }
	 
	/**
	 * Setter for softDescriptorCity
	 */
	 public void setSoftDescriptorCity(String softDescriptorCity) {
	 	this.softDescriptorCity = softDescriptorCity;
	 }
	 


	public String toXMLString(String prefix, String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(token != null) {
			sb.append("<").append(preferredPrefix).append(":Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.token));
			sb.append("</").append(preferredPrefix).append(":Token>");
		}
		if(creditCard != null) {
			sb.append(creditCard.toXMLString(preferredPrefix,"CreditCard"));
		}
		if(recurringPaymentsProfileDetails != null) {
			sb.append(recurringPaymentsProfileDetails.toXMLString(preferredPrefix,"RecurringPaymentsProfileDetails"));
		}
		if(scheduleDetails != null) {
			sb.append(scheduleDetails.toXMLString(preferredPrefix,"ScheduleDetails"));
		}
		if(paymentDetailsItem != null) {
			for(int i=0; i < paymentDetailsItem.size(); i++) {
				sb.append(paymentDetailsItem.get(i).toXMLString(preferredPrefix,"PaymentDetailsItem"));
			}
		}
		if(softDescriptor != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.softDescriptor));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptor>");
		}
		if(softDescriptorCity != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptorCity>").append(SDKUtil.escapeInvalidXmlCharsRegex(this.softDescriptorCity));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptorCity>");
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