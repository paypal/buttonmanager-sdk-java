
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.eBLBaseComponents.CreditCardDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsItemType;
import urn.ebay.apis.eBLBaseComponents.RecurringPaymentsProfileDetailsType;
import urn.ebay.apis.eBLBaseComponents.ScheduleDetailsType;


/**
 * Billing Agreement token (required if Express Checkout)
 */
public class CreateRecurringPaymentsProfileRequestDetailsType {

	/**
	 * Billing Agreement token (required if Express Checkout)
	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
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
	 * Customer Information for this Recurring Payments
	 *
	 * @Required
	 */
	private RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails;
	public RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
		return RecurringPaymentsProfileDetails;
	}
	public void setRecurringPaymentsProfileDetails(RecurringPaymentsProfileDetailsType value) {
		this.RecurringPaymentsProfileDetails = value;
	}

	/**
	 * Schedule Information for this Recurring Payments
	 *
	 * @Required
	 */
	private ScheduleDetailsType ScheduleDetails;
	public ScheduleDetailsType getScheduleDetails() {
		return ScheduleDetails;
	}
	public void setScheduleDetails(ScheduleDetailsType value) {
		this.ScheduleDetails = value;
	}

	/**
	 * Information about the Item Details.
	 */
	private List<PaymentDetailsItemType> PaymentDetailsItem = new ArrayList<PaymentDetailsItemType>();
	public List<PaymentDetailsItemType> getPaymentDetailsItem() {
		return PaymentDetailsItem;
	}
	public void setPaymentDetailsItem(List<PaymentDetailsItemType> value) {
		this.PaymentDetailsItem = value;
	}


	public CreateRecurringPaymentsProfileRequestDetailsType(RecurringPaymentsProfileDetailsType RecurringPaymentsProfileDetails, ScheduleDetailsType ScheduleDetails) {
		this.RecurringPaymentsProfileDetails = RecurringPaymentsProfileDetails;
		this.ScheduleDetails = ScheduleDetails;
	}
	public CreateRecurringPaymentsProfileRequestDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Token != null ) {
			sb.append("<ebl:Token>").append(Token);
			sb.append("</ebl:Token>");
		}
		if( CreditCard != null ) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if( RecurringPaymentsProfileDetails != null ) {
			sb.append("<ebl:RecurringPaymentsProfileDetails>");
			sb.append(RecurringPaymentsProfileDetails.toXMLString());
			sb.append("</ebl:RecurringPaymentsProfileDetails>");
		}
		if( ScheduleDetails != null ) {
			sb.append("<ebl:ScheduleDetails>");
			sb.append(ScheduleDetails.toXMLString());
			sb.append("</ebl:ScheduleDetails>");
		}
		if( PaymentDetailsItem != null ) {
			for(int i=0; i<PaymentDetailsItem.size(); i++) {
				sb.append("<ebl:PaymentDetailsItem>");
				sb.append(PaymentDetailsItem.get(i).toXMLString());
				sb.append("</ebl:PaymentDetailsItem>");
			}
		}
		return sb.toString();
	}

}
