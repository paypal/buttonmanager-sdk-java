package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;
import com.paypal.core.SDKUtil;

/**
 * MerchantPullPayment Parameters to make initiate a pull
 * payment 
 */
public class MerchantPullPaymentType{


	/**
	 * The amount to charge to the customer. Required Only numeric
	 * characters and a decimal separator are allowed. Limit: 10
	 * single-byte characters, including two for decimals You must
	 * set the currencyID attribute to one of the three-character
	 * currency code for any of the supported PayPal currencies. 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Preapproved Payments billing agreement identification number
	 * between the PayPal customer and you. Required Character
	 * limit: 19 single-byte alphanumeric characters. The format of
	 * a billing agreement identification number is the
	 * single-character prefix B, followed by a hyphen and an
	 * alphanumeric character string: B-unique_alphanumeric_string	 
	 */ 
	private String MpID;

	/**
	 * Specifies type of PayPal payment you require Optional	 
	 */ 
	private MerchantPullPaymentCodeType PaymentType;

	/**
	 * Text entered by the customer in the Note field during
	 * enrollment Optional	 
	 */ 
	private String Memo;

	/**
	 * Subject line of confirmation email sent to recipient
	 * Optional	 
	 */ 
	private String EmailSubject;

	/**
	 * The tax charged on the transaction Optional	 
	 */ 
	private BasicAmountType Tax;

	/**
	 * Per-transaction shipping charge Optional	 
	 */ 
	private BasicAmountType Shipping;

	/**
	 * Per-transaction handling charge Optional	 
	 */ 
	private BasicAmountType Handling;

	/**
	 * Name of purchased item Optional	 
	 */ 
	private String ItemName;

	/**
	 * Reference number of purchased item Optional	 
	 */ 
	private String ItemNumber;

	/**
	 * Your invoice number Optional	 
	 */ 
	private String Invoice;

	/**
	 * Custom annotation field for tracking or other use Optional	 
	 */ 
	private String Custom;

	/**
	 * An identification code for use by third-party applications
	 * to identify transactions. Optional Character length and
	 * limitations: 32 single-byte alphanumeric characters	 
	 */ 
	private String ButtonSource;

	/**
	 * Passed in soft descriptor string to be appended. Optional
	 * Character length and limitations: single-byte alphanumeric
	 * characters	 
	 */ 
	private String SoftDescriptor;

	

	/**
	 * Default Constructor
	 */
	public MerchantPullPaymentType (){
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
	 * Getter for MpID
	 */
	 public String getMpID() {
	 	return MpID;
	 }
	 
	/**
	 * Setter for MpID
	 */
	 public void setMpID(String MpID) {
	 	this.MpID = MpID;
	 }
	 
	/**
	 * Getter for PaymentType
	 */
	 public MerchantPullPaymentCodeType getPaymentType() {
	 	return PaymentType;
	 }
	 
	/**
	 * Setter for PaymentType
	 */
	 public void setPaymentType(MerchantPullPaymentCodeType PaymentType) {
	 	this.PaymentType = PaymentType;
	 }
	 
	/**
	 * Getter for Memo
	 */
	 public String getMemo() {
	 	return Memo;
	 }
	 
	/**
	 * Setter for Memo
	 */
	 public void setMemo(String Memo) {
	 	this.Memo = Memo;
	 }
	 
	/**
	 * Getter for EmailSubject
	 */
	 public String getEmailSubject() {
	 	return EmailSubject;
	 }
	 
	/**
	 * Setter for EmailSubject
	 */
	 public void setEmailSubject(String EmailSubject) {
	 	this.EmailSubject = EmailSubject;
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
	 * Getter for Handling
	 */
	 public BasicAmountType getHandling() {
	 	return Handling;
	 }
	 
	/**
	 * Setter for Handling
	 */
	 public void setHandling(BasicAmountType Handling) {
	 	this.Handling = Handling;
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
	 * Getter for Invoice
	 */
	 public String getInvoice() {
	 	return Invoice;
	 }
	 
	/**
	 * Setter for Invoice
	 */
	 public void setInvoice(String Invoice) {
	 	this.Invoice = Invoice;
	 }
	 
	/**
	 * Getter for Custom
	 */
	 public String getCustom() {
	 	return Custom;
	 }
	 
	/**
	 * Setter for Custom
	 */
	 public void setCustom(String Custom) {
	 	this.Custom = Custom;
	 }
	 
	/**
	 * Getter for ButtonSource
	 */
	 public String getButtonSource() {
	 	return ButtonSource;
	 }
	 
	/**
	 * Setter for ButtonSource
	 */
	 public void setButtonSource(String ButtonSource) {
	 	this.ButtonSource = ButtonSource;
	 }
	 
	/**
	 * Getter for SoftDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return SoftDescriptor;
	 }
	 
	/**
	 * Setter for SoftDescriptor
	 */
	 public void setSoftDescriptor(String SoftDescriptor) {
	 	this.SoftDescriptor = SoftDescriptor;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(MpID != null) {
			sb.append("<ebl:MpID>").append(SDKUtil.escapeInvalidXmlCharsRegex(MpID));
			sb.append("</ebl:MpID>");
		}
		if(PaymentType != null) {
			sb.append("<ebl:PaymentType>").append(SDKUtil.escapeInvalidXmlCharsRegex(PaymentType.getValue()));
			sb.append("</ebl:PaymentType>");
		}
		if(Memo != null) {
			sb.append("<ebl:Memo>").append(SDKUtil.escapeInvalidXmlCharsRegex(Memo));
			sb.append("</ebl:Memo>");
		}
		if(EmailSubject != null) {
			sb.append("<ebl:EmailSubject>").append(SDKUtil.escapeInvalidXmlCharsRegex(EmailSubject));
			sb.append("</ebl:EmailSubject>");
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
		if(Handling != null) {
			sb.append("<ebl:Handling");
			sb.append(Handling.toXMLString());
			sb.append("</ebl:Handling>");
		}
		if(ItemName != null) {
			sb.append("<ebl:ItemName>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemName));
			sb.append("</ebl:ItemName>");
		}
		if(ItemNumber != null) {
			sb.append("<ebl:ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemNumber));
			sb.append("</ebl:ItemNumber>");
		}
		if(Invoice != null) {
			sb.append("<ebl:Invoice>").append(SDKUtil.escapeInvalidXmlCharsRegex(Invoice));
			sb.append("</ebl:Invoice>");
		}
		if(Custom != null) {
			sb.append("<ebl:Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(Custom));
			sb.append("</ebl:Custom>");
		}
		if(ButtonSource != null) {
			sb.append("<ebl:ButtonSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(ButtonSource));
			sb.append("</ebl:ButtonSource>");
		}
		if(SoftDescriptor != null) {
			sb.append("<ebl:SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(SoftDescriptor));
			sb.append("</ebl:SoftDescriptor>");
		}
		return sb.toString();
	}

}