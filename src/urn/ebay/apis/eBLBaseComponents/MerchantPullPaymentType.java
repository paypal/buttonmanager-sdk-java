
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;


/**
 * MerchantPullPayment 
 * Parameters to make initiate a pull payment
 */
public class MerchantPullPaymentType {

	/**
	 * The amount to charge to the customer. 
	 * Required
	 * Only numeric characters and a decimal separator are allowed. Limit: 10 single-byte characters, including two for decimals You must set the currencyID attribute to one of the three-character currency code for any of the supported PayPal currencies. 
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
	 * Preapproved Payments billing agreement identification number between the PayPal customer and you. 
	 * Required
	 * Character limit: 19 single-byte alphanumeric characters.
	 * The format of a billing agreement identification number is the single-character prefix B, followed by a hyphen and an alphanumeric character string: 
	 * B-unique_alphanumeric_string
	 */
	private String MpID;
	public String getMpID() {
		return MpID;
	}
	public void setMpID(String value) {
		this.MpID = value;
	}

	/**
Specifies type of PayPal payment you require 
	 * Optional
	 */
	private MerchantPullPaymentCodeType PaymentType;
	public MerchantPullPaymentCodeType getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(MerchantPullPaymentCodeType value) {
		this.PaymentType = value;
	}

	/**
Text entered by the customer in the Note field during enrollment 
	 * Optional
	 */
	private String Memo;
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String value) {
		this.Memo = value;
	}

	/**
Subject line of confirmation email sent to recipient
	 * Optional
	 */
	private String EmailSubject;
	public String getEmailSubject() {
		return EmailSubject;
	}
	public void setEmailSubject(String value) {
		this.EmailSubject = value;
	}

	/**
The tax charged on the transaction
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
	 * Optional	 */
	private BasicAmountType Shipping;
	public BasicAmountType getShipping() {
		return Shipping;
	}
	public void setShipping(BasicAmountType value) {
		this.Shipping = value;
	}

	/**
Per-transaction handling charge
	 * Optional	 */
	private BasicAmountType Handling;
	public BasicAmountType getHandling() {
		return Handling;
	}
	public void setHandling(BasicAmountType value) {
		this.Handling = value;
	}

	/**
Name of purchased item
	 * Optional	 */
	private String ItemName;
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String value) {
		this.ItemName = value;
	}

	/**
Reference number of purchased item
	 * Optional	 */
	private String ItemNumber;
	public String getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(String value) {
		this.ItemNumber = value;
	}

	/**
Your invoice number  
	 * Optional
	 */
	private String Invoice;
	public String getInvoice() {
		return Invoice;
	}
	public void setInvoice(String value) {
		this.Invoice = value;
	}

	/**
Custom annotation field for tracking or other use
	 * Optional
	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}

	/**
An identification code for use by third-party applications to identify transactions. 
	 * Optional
	 * Character length and limitations: 32 single-byte alphanumeric characters
	 */
	private String ButtonSource;
	public String getButtonSource() {
		return ButtonSource;
	}
	public void setButtonSource(String value) {
		this.ButtonSource = value;
	}

	/**
Passed in soft descriptor string to be appended. 
	 * Optional
	 * Character length and limitations: single-byte alphanumeric characters
	 */
	private String SoftDescriptor;
	public String getSoftDescriptor() {
		return SoftDescriptor;
	}
	public void setSoftDescriptor(String value) {
		this.SoftDescriptor = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Amount != null ) {
			sb.append("<ebl:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if( MpID != null ) {
			sb.append("<ebl:MpID>").append(MpID);
			sb.append("</ebl:MpID>");
		}
		if( PaymentType != null ) {
			sb.append("<ebl:PaymentType>").append( PaymentType.getValue());
			sb.append("</ebl:PaymentType>");
		}
		if( Memo != null ) {
			sb.append("<ebl:Memo>").append(Memo);
			sb.append("</ebl:Memo>");
		}
		if( EmailSubject != null ) {
			sb.append("<ebl:EmailSubject>").append(EmailSubject);
			sb.append("</ebl:EmailSubject>");
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
		if( Handling != null ) {
			sb.append("<ebl:Handling ");
			sb.append(Handling.toXMLString());
			sb.append("</ebl:Handling>");
		}
		if( ItemName != null ) {
			sb.append("<ebl:ItemName>").append(ItemName);
			sb.append("</ebl:ItemName>");
		}
		if( ItemNumber != null ) {
			sb.append("<ebl:ItemNumber>").append(ItemNumber);
			sb.append("</ebl:ItemNumber>");
		}
		if( Invoice != null ) {
			sb.append("<ebl:Invoice>").append(Invoice);
			sb.append("</ebl:Invoice>");
		}
		if( Custom != null ) {
			sb.append("<ebl:Custom>").append(Custom);
			sb.append("</ebl:Custom>");
		}
		if( ButtonSource != null ) {
			sb.append("<ebl:ButtonSource>").append(ButtonSource);
			sb.append("</ebl:ButtonSource>");
		}
		if( SoftDescriptor != null ) {
			sb.append("<ebl:SoftDescriptor>").append(SoftDescriptor);
			sb.append("</ebl:SoftDescriptor>");
		}
		return sb.toString();
	}

}
