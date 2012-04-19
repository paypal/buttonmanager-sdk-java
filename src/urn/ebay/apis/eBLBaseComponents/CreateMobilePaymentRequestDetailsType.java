
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.MobilePaymentCodeType;
import urn.ebay.apis.eBLBaseComponents.MobileRecipientCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PhoneNumberType;


/**
 * Type of the payment
 * Required
 */
public class CreateMobilePaymentRequestDetailsType {

	/**
Type of the payment
	 * Required
	 */
	private MobilePaymentCodeType PaymentType;
	public MobilePaymentCodeType getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(MobilePaymentCodeType value) {
		this.PaymentType = value;
	}

	/**
	 * How you want to obtain payment.  Defaults to Sale.
	 * Optional
	 * Authorization indicates that this payment is a basic authorization subject to settlement with PayPal Authorization and Capture.
	 * Sale indicates that this is a final sale for which you are requesting payment.
	 */
	private PaymentActionCodeType PaymentAction;
	public PaymentActionCodeType getPaymentAction() {
		return PaymentAction;
	}
	public void setPaymentAction(PaymentActionCodeType value) {
		this.PaymentAction = value;
	}

	/**
Phone number of the user making the payment.
	 * Required
	 */
	private PhoneNumberType SenderPhone;
	public PhoneNumberType getSenderPhone() {
		return SenderPhone;
	}
	public void setSenderPhone(PhoneNumberType value) {
		this.SenderPhone = value;
	}

	/**
Type of recipient specified, i.e., phone number or email address
	 * Required
	 */
	private MobileRecipientCodeType RecipientType;
	public MobileRecipientCodeType getRecipientType() {
		return RecipientType;
	}
	public void setRecipientType(MobileRecipientCodeType value) {
		this.RecipientType = value;
	}

	/**
Email address of the recipient
	 */
	private String RecipientEmail;
	public String getRecipientEmail() {
		return RecipientEmail;
	}
	public void setRecipientEmail(String value) {
		this.RecipientEmail = value;
	}

	/**
Phone number of the recipipent
	 * Required
	 */
	private PhoneNumberType RecipientPhone;
	public PhoneNumberType getRecipientPhone() {
		return RecipientPhone;
	}
	public void setRecipientPhone(PhoneNumberType value) {
		this.RecipientPhone = value;
	}

	/**
Amount of item before tax and shipping
	 */
	private BasicAmountType ItemAmount;
	public BasicAmountType getItemAmount() {
		return ItemAmount;
	}
	public void setItemAmount(BasicAmountType value) {
		this.ItemAmount = value;
	}

	/**
The tax charged on the transaction
Tax
	 * Optional
	 */
	private BasicAmountType Tax;
	public BasicAmountType getTax() {
		return Tax;
	}
	public void setTax(BasicAmountType value) {
		this.Tax = value;
	}

	/**
Per-transaction shipping charge
	 * Optional
	 */
	private BasicAmountType Shipping;
	public BasicAmountType getShipping() {
		return Shipping;
	}
	public void setShipping(BasicAmountType value) {
		this.Shipping = value;
	}

	/**
Name of the item being ordered
	 * Optional
	 * Character length and limitations: 255 single-byte alphanumeric characters
	 */
	private String ItemName;
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String value) {
		this.ItemName = value;
	}

	/**
SKU of the item being ordered
	 * Optional
	 * Character length and limitations: 255 single-byte alphanumeric characters
	 */
	private String ItemNumber;
	public String getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(String value) {
		this.ItemNumber = value;
	}

	/**
Memo entered by sender in PayPal Website Payments note field.
	 * Optional
	 * Character length and limitations: 255 single-byte alphanumeric characters
	 */
	private String Note;
	public String getNote() {
		return Note;
	}
	public void setNote(String value) {
		this.Note = value;
	}

	/**
Unique ID for the order.  Required for non-P2P transactions
	 * Optional
	 * Character length and limitations: 255 single-byte alphanumeric characters
	 */
	private String CustomID;
	public String getCustomID() {
		return CustomID;
	}
	public void setCustomID(String value) {
		this.CustomID = value;
	}

	/**
Indicates whether the sender's phone number will be shared with recipient
	 * Optional
	 */
	private Integer SharePhoneNumber;
	public Integer getSharePhoneNumber() {
		return SharePhoneNumber;
	}
	public void setSharePhoneNumber(Integer value) {
		this.SharePhoneNumber = value;
	}

	/**
Indicates whether the sender's home address will be shared with recipient
	 * Optional
	 */
	private Integer ShareHomeAddress;
	public Integer getShareHomeAddress() {
		return ShareHomeAddress;
	}
	public void setShareHomeAddress(Integer value) {
		this.ShareHomeAddress = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( PaymentType != null ) {
			sb.append("<ebl:PaymentType>").append( PaymentType.getValue());
			sb.append("</ebl:PaymentType>");
		}
		if( PaymentAction != null ) {
			sb.append("<ebl:PaymentAction>").append( PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if( SenderPhone != null ) {
			sb.append("<ebl:SenderPhone>");
			sb.append(SenderPhone.toXMLString());
			sb.append("</ebl:SenderPhone>");
		}
		if( RecipientType != null ) {
			sb.append("<ebl:RecipientType>").append( RecipientType.getValue());
			sb.append("</ebl:RecipientType>");
		}
		if( RecipientEmail != null ) {
			sb.append("<ebl:RecipientEmail>").append(RecipientEmail);
			sb.append("</ebl:RecipientEmail>");
		}
		if( RecipientPhone != null ) {
			sb.append("<ebl:RecipientPhone>");
			sb.append(RecipientPhone.toXMLString());
			sb.append("</ebl:RecipientPhone>");
		}
		if( ItemAmount != null ) {
			sb.append("<ebl:ItemAmount ");
			sb.append(ItemAmount.toXMLString());
			sb.append("</ebl:ItemAmount>");
		}
		if( Tax != null ) {
			sb.append("<ebl:Tax ");
			sb.append(Tax.toXMLString());
			sb.append("</ebl:Tax>");
		}
		if( Shipping != null ) {
			sb.append("<ebl:Shipping ");
			sb.append(Shipping.toXMLString());
			sb.append("</ebl:Shipping>");
		}
		if( ItemName != null ) {
			sb.append("<ebl:ItemName>").append(ItemName);
			sb.append("</ebl:ItemName>");
		}
		if( ItemNumber != null ) {
			sb.append("<ebl:ItemNumber>").append(ItemNumber);
			sb.append("</ebl:ItemNumber>");
		}
		if( Note != null ) {
			sb.append("<ebl:Note>").append(Note);
			sb.append("</ebl:Note>");
		}
		if( CustomID != null ) {
			sb.append("<ebl:CustomID>").append(CustomID);
			sb.append("</ebl:CustomID>");
		}
		if( SharePhoneNumber != null ) {
			sb.append("<ebl:SharePhoneNumber>").append(SharePhoneNumber);
			sb.append("</ebl:SharePhoneNumber>");
		}
		if( ShareHomeAddress != null ) {
			sb.append("<ebl:ShareHomeAddress>").append(ShareHomeAddress);
			sb.append("</ebl:ShareHomeAddress>");
		}
		return sb.toString();
	}

}
