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


	/**
	 * Billing Agreement token (required if Express Checkout) 	 
	 */ 
	private String Token;

	/**
	 * Information about the credit card to be charged (required if
	 * Direct Payment) 	 
	 */ 
	private CreditCardDetailsType CreditCard;

	/**
	 * Customer Information for this Recurring Payments 	  
	 *@Required	 
	 */ 
	private RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails;

	/**
	 * Schedule Information for this Recurring Payments 	  
	 *@Required	 
	 */ 
	private ScheduleDetailsType ScheduleDetails;

	/**
	 * Information about the Item Details. 	 
	 */ 
	private List<PaymentDetailsItemType> PaymentDetailsItem = new ArrayList<PaymentDetailsItemType>();

	

	/**
	 * Constructor with arguments
	 */
	public CreateRecurringPaymentsProfileRequestDetailsType (RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails, ScheduleDetailsType ScheduleDetails){
		this.RecurringPaymentsProfileDetails = RecurringPaymentsProfileDetails;
		this.ScheduleDetails = ScheduleDetails;
	}	

	/**
	 * Default Constructor
	 */
	public CreateRecurringPaymentsProfileRequestDetailsType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
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
	 * Getter for RecurringPaymentsProfileDetails
	 */
	 public RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
	 	return RecurringPaymentsProfileDetails;
	 }
	 
	/**
	 * Setter for RecurringPaymentsProfileDetails
	 */
	 public void setRecurringPaymentsProfileDetails(RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails) {
	 	this.RecurringPaymentsProfileDetails = RecurringPaymentsProfileDetails;
	 }
	 
	/**
	 * Getter for ScheduleDetails
	 */
	 public ScheduleDetailsType getScheduleDetails() {
	 	return ScheduleDetails;
	 }
	 
	/**
	 * Setter for ScheduleDetails
	 */
	 public void setScheduleDetails(ScheduleDetailsType ScheduleDetails) {
	 	this.ScheduleDetails = ScheduleDetails;
	 }
	 
	/**
	 * Getter for PaymentDetailsItem
	 */
	 public List<PaymentDetailsItemType> getPaymentDetailsItem() {
	 	return PaymentDetailsItem;
	 }
	 
	/**
	 * Setter for PaymentDetailsItem
	 */
	 public void setPaymentDetailsItem(List<PaymentDetailsItemType> PaymentDetailsItem) {
	 	this.PaymentDetailsItem = PaymentDetailsItem;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Token != null) {
			sb.append("<ebl:Token>").append(SDKUtil.escapeInvalidXmlCharsRegex(Token));
			sb.append("</ebl:Token>");
		}
		if(CreditCard != null) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if(RecurringPaymentsProfileDetails != null) {
			sb.append("<ebl:RecurringPaymentsProfileDetails>");
			sb.append(RecurringPaymentsProfileDetails.toXMLString());
			sb.append("</ebl:RecurringPaymentsProfileDetails>");
		}
		if(ScheduleDetails != null) {
			sb.append("<ebl:ScheduleDetails>");
			sb.append(ScheduleDetails.toXMLString());
			sb.append("</ebl:ScheduleDetails>");
		}
		if(PaymentDetailsItem != null) {
			for(int i=0; i < PaymentDetailsItem.size(); i++) {
				sb.append("<ebl:PaymentDetailsItem>");
				sb.append(PaymentDetailsItem.get(i).toXMLString());
				sb.append("</ebl:PaymentDetailsItem>");
			}
		}
		return sb.toString();
	}

}