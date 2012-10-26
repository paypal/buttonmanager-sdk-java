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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Type of the payment Required 	 
	 */ 
	private MobilePaymentCodeType paymentType;

	/**
	 * How you want to obtain payment. Defaults to Sale. Optional
	 * Authorization indicates that this payment is a basic
	 * authorization subject to settlement with PayPal
	 * Authorization and Capture. Sale indicates that this is a
	 * final sale for which you are requesting payment. 	 
	 */ 
	private PaymentActionCodeType paymentAction;

	/**
	 * Phone number of the user making the payment. Required 	 
	 */ 
	private PhoneNumberType senderPhone;

	/**
	 * Type of recipient specified, i.e., phone number or email
	 * address Required 	 
	 */ 
	private MobileRecipientCodeType recipientType;

	/**
	 * Email address of the recipient 	 
	 */ 
	private String recipientEmail;

	/**
	 * Phone number of the recipipent Required 	 
	 */ 
	private PhoneNumberType recipientPhone;

	/**
	 * Amount of item before tax and shipping 	 
	 */ 
	private BasicAmountType itemAmount;

	/**
	 * The tax charged on the transactionTax Optional 	 
	 */ 
	private BasicAmountType tax;

	/**
	 * Per-transaction shipping charge Optional 	 
	 */ 
	private BasicAmountType shipping;

	/**
	 * Name of the item being ordered Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters 	 
	 */ 
	private String itemName;

	/**
	 * SKU of the item being ordered Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters 	 
	 */ 
	private String itemNumber;

	/**
	 * Memo entered by sender in PayPal Website Payments note
	 * field. Optional Character length and limitations: 255
	 * single-byte alphanumeric characters 	 
	 */ 
	private String note;

	/**
	 * Unique ID for the order. Required for non-P2P transactions
	 * Optional Character length and limitations: 255 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String customID;

	/**
	 * Indicates whether the sender's phone number will be shared
	 * with recipient Optional 	 
	 */ 
	private Integer sharePhoneNumber;

	/**
	 * Indicates whether the sender's home address will be shared
	 * with recipient Optional 	 
	 */ 
	private Integer shareHomeAddress;

	

	/**
	 * Default Constructor
	 */
	public CreateMobilePaymentRequestDetailsType (){
	}	

	/**
	 * Getter for paymentType
	 */
	 public MobilePaymentCodeType getPaymentType() {
	 	return paymentType;
	 }
	 
	/**
	 * Setter for paymentType
	 */
	 public void setPaymentType(MobilePaymentCodeType paymentType) {
	 	this.paymentType = paymentType;
	 }
	 
	/**
	 * Getter for paymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return paymentAction;
	 }
	 
	/**
	 * Setter for paymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType paymentAction) {
	 	this.paymentAction = paymentAction;
	 }
	 
	/**
	 * Getter for senderPhone
	 */
	 public PhoneNumberType getSenderPhone() {
	 	return senderPhone;
	 }
	 
	/**
	 * Setter for senderPhone
	 */
	 public void setSenderPhone(PhoneNumberType senderPhone) {
	 	this.senderPhone = senderPhone;
	 }
	 
	/**
	 * Getter for recipientType
	 */
	 public MobileRecipientCodeType getRecipientType() {
	 	return recipientType;
	 }
	 
	/**
	 * Setter for recipientType
	 */
	 public void setRecipientType(MobileRecipientCodeType recipientType) {
	 	this.recipientType = recipientType;
	 }
	 
	/**
	 * Getter for recipientEmail
	 */
	 public String getRecipientEmail() {
	 	return recipientEmail;
	 }
	 
	/**
	 * Setter for recipientEmail
	 */
	 public void setRecipientEmail(String recipientEmail) {
	 	this.recipientEmail = recipientEmail;
	 }
	 
	/**
	 * Getter for recipientPhone
	 */
	 public PhoneNumberType getRecipientPhone() {
	 	return recipientPhone;
	 }
	 
	/**
	 * Setter for recipientPhone
	 */
	 public void setRecipientPhone(PhoneNumberType recipientPhone) {
	 	this.recipientPhone = recipientPhone;
	 }
	 
	/**
	 * Getter for itemAmount
	 */
	 public BasicAmountType getItemAmount() {
	 	return itemAmount;
	 }
	 
	/**
	 * Setter for itemAmount
	 */
	 public void setItemAmount(BasicAmountType itemAmount) {
	 	this.itemAmount = itemAmount;
	 }
	 
	/**
	 * Getter for tax
	 */
	 public BasicAmountType getTax() {
	 	return tax;
	 }
	 
	/**
	 * Setter for tax
	 */
	 public void setTax(BasicAmountType tax) {
	 	this.tax = tax;
	 }
	 
	/**
	 * Getter for shipping
	 */
	 public BasicAmountType getShipping() {
	 	return shipping;
	 }
	 
	/**
	 * Setter for shipping
	 */
	 public void setShipping(BasicAmountType shipping) {
	 	this.shipping = shipping;
	 }
	 
	/**
	 * Getter for itemName
	 */
	 public String getItemName() {
	 	return itemName;
	 }
	 
	/**
	 * Setter for itemName
	 */
	 public void setItemName(String itemName) {
	 	this.itemName = itemName;
	 }
	 
	/**
	 * Getter for itemNumber
	 */
	 public String getItemNumber() {
	 	return itemNumber;
	 }
	 
	/**
	 * Setter for itemNumber
	 */
	 public void setItemNumber(String itemNumber) {
	 	this.itemNumber = itemNumber;
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
	 * Getter for customID
	 */
	 public String getCustomID() {
	 	return customID;
	 }
	 
	/**
	 * Setter for customID
	 */
	 public void setCustomID(String customID) {
	 	this.customID = customID;
	 }
	 
	/**
	 * Getter for sharePhoneNumber
	 */
	 public Integer getSharePhoneNumber() {
	 	return sharePhoneNumber;
	 }
	 
	/**
	 * Setter for sharePhoneNumber
	 */
	 public void setSharePhoneNumber(Integer sharePhoneNumber) {
	 	this.sharePhoneNumber = sharePhoneNumber;
	 }
	 
	/**
	 * Getter for shareHomeAddress
	 */
	 public Integer getShareHomeAddress() {
	 	return shareHomeAddress;
	 }
	 
	/**
	 * Setter for shareHomeAddress
	 */
	 public void setShareHomeAddress(Integer shareHomeAddress) {
	 	this.shareHomeAddress = shareHomeAddress;
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
		if(paymentType != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentType>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentType.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentType>");
		}
		if(paymentAction != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentAction.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentAction>");
		}
		if(senderPhone != null) {
			sb.append(senderPhone.toXMLString(preferredPrefix,"SenderPhone"));
		}
		if(recipientType != null) {
			sb.append("<").append(preferredPrefix).append(":RecipientType>").append(SDKUtil.escapeInvalidXmlCharsRegex(recipientType.getValue()));
			sb.append("</").append(preferredPrefix).append(":RecipientType>");
		}
		if(recipientEmail != null) {
			sb.append("<").append(preferredPrefix).append(":RecipientEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(recipientEmail));
			sb.append("</").append(preferredPrefix).append(":RecipientEmail>");
		}
		if(recipientPhone != null) {
			sb.append(recipientPhone.toXMLString(preferredPrefix,"RecipientPhone"));
		}
		if(itemAmount != null) {
			sb.append(itemAmount.toXMLString(preferredPrefix,"ItemAmount"));
		}
		if(tax != null) {
			sb.append(tax.toXMLString(preferredPrefix,"Tax"));
		}
		if(shipping != null) {
			sb.append(shipping.toXMLString(preferredPrefix,"Shipping"));
		}
		if(itemName != null) {
			sb.append("<").append(preferredPrefix).append(":ItemName>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemName));
			sb.append("</").append(preferredPrefix).append(":ItemName>");
		}
		if(itemNumber != null) {
			sb.append("<").append(preferredPrefix).append(":ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemNumber));
			sb.append("</").append(preferredPrefix).append(":ItemNumber>");
		}
		if(note != null) {
			sb.append("<").append(preferredPrefix).append(":Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(note));
			sb.append("</").append(preferredPrefix).append(":Note>");
		}
		if(customID != null) {
			sb.append("<").append(preferredPrefix).append(":CustomID>").append(SDKUtil.escapeInvalidXmlCharsRegex(customID));
			sb.append("</").append(preferredPrefix).append(":CustomID>");
		}
		if(sharePhoneNumber != null) {
			sb.append("<").append(preferredPrefix).append(":SharePhoneNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(sharePhoneNumber));
			sb.append("</").append(preferredPrefix).append(":SharePhoneNumber>");
		}
		if(shareHomeAddress != null) {
			sb.append("<").append(preferredPrefix).append(":ShareHomeAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(shareHomeAddress));
			sb.append("</").append(preferredPrefix).append(":ShareHomeAddress>");
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