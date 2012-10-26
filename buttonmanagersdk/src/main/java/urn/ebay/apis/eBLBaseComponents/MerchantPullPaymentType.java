package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;
import com.paypal.core.SDKUtil;

/**
 * MerchantPullPayment Parameters to make initiate a pull
 * payment 
 */
public class MerchantPullPaymentType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The amount to charge to the customer. Required Only numeric
	 * characters and a decimal separator are allowed. Limit: 10
	 * single-byte characters, including two for decimals You must
	 * set the currencyID attribute to one of the three-character
	 * currency code for any of the supported PayPal currencies. 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Preapproved Payments billing agreement identification number
	 * between the PayPal customer and you. Required Character
	 * limit: 19 single-byte alphanumeric characters. The format of
	 * a billing agreement identification number is the
	 * single-character prefix B, followed by a hyphen and an
	 * alphanumeric character string: B-unique_alphanumeric_string	 
	 */ 
	private String mpID;

	/**
	 * Specifies type of PayPal payment you require Optional	 
	 */ 
	private MerchantPullPaymentCodeType paymentType;

	/**
	 * Text entered by the customer in the Note field during
	 * enrollment Optional	 
	 */ 
	private String memo;

	/**
	 * Subject line of confirmation email sent to recipient
	 * Optional	 
	 */ 
	private String emailSubject;

	/**
	 * The tax charged on the transaction Optional	 
	 */ 
	private BasicAmountType tax;

	/**
	 * Per-transaction shipping charge Optional	 
	 */ 
	private BasicAmountType shipping;

	/**
	 * Per-transaction handling charge Optional	 
	 */ 
	private BasicAmountType handling;

	/**
	 * Name of purchased item Optional	 
	 */ 
	private String itemName;

	/**
	 * Reference number of purchased item Optional	 
	 */ 
	private String itemNumber;

	/**
	 * Your invoice number Optional	 
	 */ 
	private String invoice;

	/**
	 * Custom annotation field for tracking or other use Optional	 
	 */ 
	private String custom;

	/**
	 * An identification code for use by third-party applications
	 * to identify transactions. Optional Character length and
	 * limitations: 32 single-byte alphanumeric characters	 
	 */ 
	private String buttonSource;

	/**
	 * Passed in soft descriptor string to be appended. Optional
	 * Character length and limitations: single-byte alphanumeric
	 * characters	 
	 */ 
	private String softDescriptor;

	

	/**
	 * Default Constructor
	 */
	public MerchantPullPaymentType (){
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
	 * Getter for mpID
	 */
	 public String getMpID() {
	 	return mpID;
	 }
	 
	/**
	 * Setter for mpID
	 */
	 public void setMpID(String mpID) {
	 	this.mpID = mpID;
	 }
	 
	/**
	 * Getter for paymentType
	 */
	 public MerchantPullPaymentCodeType getPaymentType() {
	 	return paymentType;
	 }
	 
	/**
	 * Setter for paymentType
	 */
	 public void setPaymentType(MerchantPullPaymentCodeType paymentType) {
	 	this.paymentType = paymentType;
	 }
	 
	/**
	 * Getter for memo
	 */
	 public String getMemo() {
	 	return memo;
	 }
	 
	/**
	 * Setter for memo
	 */
	 public void setMemo(String memo) {
	 	this.memo = memo;
	 }
	 
	/**
	 * Getter for emailSubject
	 */
	 public String getEmailSubject() {
	 	return emailSubject;
	 }
	 
	/**
	 * Setter for emailSubject
	 */
	 public void setEmailSubject(String emailSubject) {
	 	this.emailSubject = emailSubject;
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
	 * Getter for handling
	 */
	 public BasicAmountType getHandling() {
	 	return handling;
	 }
	 
	/**
	 * Setter for handling
	 */
	 public void setHandling(BasicAmountType handling) {
	 	this.handling = handling;
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
	 * Getter for invoice
	 */
	 public String getInvoice() {
	 	return invoice;
	 }
	 
	/**
	 * Setter for invoice
	 */
	 public void setInvoice(String invoice) {
	 	this.invoice = invoice;
	 }
	 
	/**
	 * Getter for custom
	 */
	 public String getCustom() {
	 	return custom;
	 }
	 
	/**
	 * Setter for custom
	 */
	 public void setCustom(String custom) {
	 	this.custom = custom;
	 }
	 
	/**
	 * Getter for buttonSource
	 */
	 public String getButtonSource() {
	 	return buttonSource;
	 }
	 
	/**
	 * Setter for buttonSource
	 */
	 public void setButtonSource(String buttonSource) {
	 	this.buttonSource = buttonSource;
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
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(mpID != null) {
			sb.append("<").append(preferredPrefix).append(":MpID>").append(SDKUtil.escapeInvalidXmlCharsRegex(mpID));
			sb.append("</").append(preferredPrefix).append(":MpID>");
		}
		if(paymentType != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentType>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentType.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentType>");
		}
		if(memo != null) {
			sb.append("<").append(preferredPrefix).append(":Memo>").append(SDKUtil.escapeInvalidXmlCharsRegex(memo));
			sb.append("</").append(preferredPrefix).append(":Memo>");
		}
		if(emailSubject != null) {
			sb.append("<").append(preferredPrefix).append(":EmailSubject>").append(SDKUtil.escapeInvalidXmlCharsRegex(emailSubject));
			sb.append("</").append(preferredPrefix).append(":EmailSubject>");
		}
		if(tax != null) {
			sb.append(tax.toXMLString(preferredPrefix,"Tax"));
		}
		if(shipping != null) {
			sb.append(shipping.toXMLString(preferredPrefix,"Shipping"));
		}
		if(handling != null) {
			sb.append(handling.toXMLString(preferredPrefix,"Handling"));
		}
		if(itemName != null) {
			sb.append("<").append(preferredPrefix).append(":ItemName>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemName));
			sb.append("</").append(preferredPrefix).append(":ItemName>");
		}
		if(itemNumber != null) {
			sb.append("<").append(preferredPrefix).append(":ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemNumber));
			sb.append("</").append(preferredPrefix).append(":ItemNumber>");
		}
		if(invoice != null) {
			sb.append("<").append(preferredPrefix).append(":Invoice>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoice));
			sb.append("</").append(preferredPrefix).append(":Invoice>");
		}
		if(custom != null) {
			sb.append("<").append(preferredPrefix).append(":Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(custom));
			sb.append("</").append(preferredPrefix).append(":Custom>");
		}
		if(buttonSource != null) {
			sb.append("<").append(preferredPrefix).append(":ButtonSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(buttonSource));
			sb.append("</").append(preferredPrefix).append(":ButtonSource>");
		}
		if(softDescriptor != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(softDescriptor));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptor>");
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