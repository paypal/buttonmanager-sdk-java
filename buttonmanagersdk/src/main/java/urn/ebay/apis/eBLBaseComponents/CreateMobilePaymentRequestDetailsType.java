package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MobilePaymentCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.PhoneNumberType;
import urn.ebay.apis.eBLBaseComponents.MobileRecipientCodeType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * Type of the payment Required 
 */
public class CreateMobilePaymentRequestDetailsType{


	/**
	 * Type of the payment Required 	 
	 */ 
	private MobilePaymentCodeType PaymentType;

	/**
	 * How you want to obtain payment. Defaults to Sale. Optional
	 * Authorization indicates that this payment is a basic
	 * authorization subject to settlement with PayPal
	 * Authorization and Capture. Sale indicates that this is a
	 * final sale for which you are requesting payment. 	 
	 */ 
	private PaymentActionCodeType PaymentAction;

	/**
	 * Phone number of the user making the payment. Required 	 
	 */ 
	private PhoneNumberType SenderPhone;

	/**
	 * Type of recipient specified, i.e., phone number or email
	 * address Required 	 
	 */ 
	private MobileRecipientCodeType RecipientType;

	/**
	 * Email address of the recipient 	 
	 */ 
	private String RecipientEmail;

	/**
	 * Phone number of the recipipent Required 	 
	 */ 
	private PhoneNumberType RecipientPhone;

	/**
	 * Amount of item before tax and shipping 	 
	 */ 
	private BasicAmountType ItemAmount;

	/**
	 * The tax charged on the transactionTax Optional 	 
	 */ 
	private BasicAmountType Tax;

	/**
	 * Per-transaction shipping charge Optional 	 
	 */ 
	private BasicAmountType Shipping;

	/**
	 * Name of the item being ordered Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters 	 
	 */ 
	private String ItemName;

	/**
	 * SKU of the item being ordered Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters 	 
	 */ 
	private String ItemNumber;

	/**
	 * Memo entered by sender in PayPal Website Payments note
	 * field. Optional Character length and limitations: 255
	 * single-byte alphanumeric characters 	 
	 */ 
	private String Note;

	/**
	 * Unique ID for the order. Required for non-P2P transactions
	 * Optional Character length and limitations: 255 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String CustomID;

	/**
	 * Indicates whether the sender's phone number will be shared
	 * with recipient Optional 	 
	 */ 
	private Integer SharePhoneNumber;

	/**
	 * Indicates whether the sender's home address will be shared
	 * with recipient Optional 	 
	 */ 
	private Integer ShareHomeAddress;

	

	/**
	 * Default Constructor
	 */
	public CreateMobilePaymentRequestDetailsType (){
	}	

	/**
	 * Getter for PaymentType
	 */
	 public MobilePaymentCodeType getPaymentType() {
	 	return PaymentType;
	 }
	 
	/**
	 * Setter for PaymentType
	 */
	 public void setPaymentType(MobilePaymentCodeType PaymentType) {
	 	this.PaymentType = PaymentType;
	 }
	 
	/**
	 * Getter for PaymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return PaymentAction;
	 }
	 
	/**
	 * Setter for PaymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType PaymentAction) {
	 	this.PaymentAction = PaymentAction;
	 }
	 
	/**
	 * Getter for SenderPhone
	 */
	 public PhoneNumberType getSenderPhone() {
	 	return SenderPhone;
	 }
	 
	/**
	 * Setter for SenderPhone
	 */
	 public void setSenderPhone(PhoneNumberType SenderPhone) {
	 	this.SenderPhone = SenderPhone;
	 }
	 
	/**
	 * Getter for RecipientType
	 */
	 public MobileRecipientCodeType getRecipientType() {
	 	return RecipientType;
	 }
	 
	/**
	 * Setter for RecipientType
	 */
	 public void setRecipientType(MobileRecipientCodeType RecipientType) {
	 	this.RecipientType = RecipientType;
	 }
	 
	/**
	 * Getter for RecipientEmail
	 */
	 public String getRecipientEmail() {
	 	return RecipientEmail;
	 }
	 
	/**
	 * Setter for RecipientEmail
	 */
	 public void setRecipientEmail(String RecipientEmail) {
	 	this.RecipientEmail = RecipientEmail;
	 }
	 
	/**
	 * Getter for RecipientPhone
	 */
	 public PhoneNumberType getRecipientPhone() {
	 	return RecipientPhone;
	 }
	 
	/**
	 * Setter for RecipientPhone
	 */
	 public void setRecipientPhone(PhoneNumberType RecipientPhone) {
	 	this.RecipientPhone = RecipientPhone;
	 }
	 
	/**
	 * Getter for ItemAmount
	 */
	 public BasicAmountType getItemAmount() {
	 	return ItemAmount;
	 }
	 
	/**
	 * Setter for ItemAmount
	 */
	 public void setItemAmount(BasicAmountType ItemAmount) {
	 	this.ItemAmount = ItemAmount;
	 }
	 
	/**
	 * Getter for Tax
	 */
	 public BasicAmountType getTax() {
	 	return Tax;
	 }
	 
	/**
	 * Setter for Tax
	 */
	 public void setTax(BasicAmountType Tax) {
	 	this.Tax = Tax;
	 }
	 
	/**
	 * Getter for Shipping
	 */
	 public BasicAmountType getShipping() {
	 	return Shipping;
	 }
	 
	/**
	 * Setter for Shipping
	 */
	 public void setShipping(BasicAmountType Shipping) {
	 	this.Shipping = Shipping;
	 }
	 
	/**
	 * Getter for ItemName
	 */
	 public String getItemName() {
	 	return ItemName;
	 }
	 
	/**
	 * Setter for ItemName
	 */
	 public void setItemName(String ItemName) {
	 	this.ItemName = ItemName;
	 }
	 
	/**
	 * Getter for ItemNumber
	 */
	 public String getItemNumber() {
	 	return ItemNumber;
	 }
	 
	/**
	 * Setter for ItemNumber
	 */
	 public void setItemNumber(String ItemNumber) {
	 	this.ItemNumber = ItemNumber;
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
	 * Getter for CustomID
	 */
	 public String getCustomID() {
	 	return CustomID;
	 }
	 
	/**
	 * Setter for CustomID
	 */
	 public void setCustomID(String CustomID) {
	 	this.CustomID = CustomID;
	 }
	 
	/**
	 * Getter for SharePhoneNumber
	 */
	 public Integer getSharePhoneNumber() {
	 	return SharePhoneNumber;
	 }
	 
	/**
	 * Setter for SharePhoneNumber
	 */
	 public void setSharePhoneNumber(Integer SharePhoneNumber) {
	 	this.SharePhoneNumber = SharePhoneNumber;
	 }
	 
	/**
	 * Getter for ShareHomeAddress
	 */
	 public Integer getShareHomeAddress() {
	 	return ShareHomeAddress;
	 }
	 
	/**
	 * Setter for ShareHomeAddress
	 */
	 public void setShareHomeAddress(Integer ShareHomeAddress) {
	 	this.ShareHomeAddress = ShareHomeAddress;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(PaymentType != null) {
			sb.append("<ebl:PaymentType>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentType.getValue()));
			sb.append("</ebl:PaymentType>");
		}
		if(PaymentAction != null) {
			sb.append("<ebl:PaymentAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentAction.getValue()));
			sb.append("</ebl:PaymentAction>");
		}
		if(SenderPhone != null) {
			sb.append("<ebl:SenderPhone>");
			sb.append(SenderPhone.toXMLString());
			sb.append("</ebl:SenderPhone>");
		}
		if(RecipientType != null) {
			sb.append("<ebl:RecipientType>").append(SDKUtil.escapeInvalidXmlCharsRegex(RecipientType.getValue()));
			sb.append("</ebl:RecipientType>");
		}
		if(RecipientEmail != null) {
			sb.append("<ebl:RecipientEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(RecipientEmail));
			sb.append("</ebl:RecipientEmail>");
		}
		if(RecipientPhone != null) {
			sb.append("<ebl:RecipientPhone>");
			sb.append(RecipientPhone.toXMLString());
			sb.append("</ebl:RecipientPhone>");
		}
		if(ItemAmount != null) {
			sb.append("<ebl:ItemAmount");
			sb.append(ItemAmount.toXMLString());
			sb.append("</ebl:ItemAmount>");
		}
		if(Tax != null) {
			sb.append("<ebl:Tax");
			sb.append(Tax.toXMLString());
			sb.append("</ebl:Tax>");
		}
		if(Shipping != null) {
			sb.append("<ebl:Shipping");
			sb.append(Shipping.toXMLString());
			sb.append("</ebl:Shipping>");
		}
		if(ItemName != null) {
			sb.append("<ebl:ItemName>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemName));
			sb.append("</ebl:ItemName>");
		}
		if(ItemNumber != null) {
			sb.append("<ebl:ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemNumber));
			sb.append("</ebl:ItemNumber>");
		}
		if(Note != null) {
			sb.append("<ebl:Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(Note));
			sb.append("</ebl:Note>");
		}
		if(CustomID != null) {
			sb.append("<ebl:CustomID>").append(SDKUtil.escapeInvalidXmlCharsRegex(CustomID));
			sb.append("</ebl:CustomID>");
		}
		if(SharePhoneNumber != null) {
			sb.append("<ebl:SharePhoneNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(SharePhoneNumber));
			sb.append("</ebl:SharePhoneNumber>");
		}
		if(ShareHomeAddress != null) {
			sb.append("<ebl:ShareHomeAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(ShareHomeAddress));
			sb.append("</ebl:ShareHomeAddress>");
		}
		return sb.toString();
	}


}