package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.PersonNameType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionClassCodeType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CurrencyCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The earliest transaction date at which to start the search.
 * No wildcards are allowed. Required
 */
public class TransactionSearchRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The earliest transaction date at which to start the search.
	 * No wildcards are allowed. Required	  
	 *@Required	 
	 */ 
	private String startDate;

	/**
	 * The latest transaction date to be included in the search
	 * Optional	 
	 */ 
	private String endDate;

	/**
	 * Search by the buyer's email address OptionalCharacter length
	 * and limitations: 127 single-byte alphanumeric characters	 
	 */ 
	private String payer;

	/**
	 * Search by the receiver's email address. If the merchant
	 * account has only one email, this is the primary email. Can
	 * also be a non-primary email.Optional	 
	 */ 
	private String receiver;

	/**
	 * Search by the PayPal Account Optional receipt IDOptional	 
	 */ 
	private String receiptID;

	/**
	 * Search by the transaction ID. OptionalThe returned results
	 * are from the merchant's transaction records. Character
	 * length and limitations: 19 single-byte characters maximum	 
	 */ 
	private String transactionID;

	/**
	 * Search by Recurring Payment Profile id. The ProfileID is
	 * returned as part of the CreateRecurringPaymentsProfile API
	 * response. Optional	 
	 */ 
	private String profileID;

	/**
	 * Search by the buyer's name OptionalSalutation: 20
	 * single-byte character limit.FirstName: 25 single-byte
	 * character limit.MiddleName: 25 single-byte character
	 * limit.LastName: 25 single-byte character limit.Suffix: 12
	 * single-byte character limit.	 
	 */ 
	private PersonNameType payerName;

	/**
	 * Search by item number of the purchased goods.OptionalTo
	 * search for purchased items not related to auctions, set the
	 * AuctionItemNumber element to the value of the HTML
	 * item_number variable set in the shopping cart for the
	 * original transaction.	 
	 */ 
	private String auctionItemNumber;

	/**
	 * Search by invoice identification key, as set by you for the
	 * original transaction. InvoiceID searches the invoice records
	 * for items sold by the merchant, not the items purchased.
	 * OptionalThe value for InvoiceID must exactly match an
	 * invoice identification number. No wildcards are allowed.
	 * Character length and limitations: 127 single-byte characters
	 * maximum	 
	 */ 
	private String invoiceID;

	/**
	 * 	 
	 */ 
	private String cardNumber;

	/**
	 * Search by classification of transaction. Some kinds of
	 * possible classes of transactions are not searchable with
	 * TransactionSearchRequest. You cannot search for bank
	 * transfer withdrawals, for example. OptionalAll: all
	 * transaction classifications.Sent: only payments
	 * sent.Received: only payments received.MassPay: only mass
	 * payments.MoneyRequest: only money requests.FundsAdded: only
	 * funds added to balance.FundsWithdrawn: only funds withdrawn
	 * from balance.Referral: only transactions involving
	 * referrals.Fee: only transactions involving
	 * fees.Subscription: only transactions involving
	 * subscriptions.Dividend: only transactions involving
	 * dividends.Billpay: only transactions involving BillPay
	 * Transactions.Refund: only transactions involving
	 * funds.CurrencyConversions: only transactions involving
	 * currency conversions.BalanceTransfer: only transactions
	 * involving balance transfers.Reversal: only transactions
	 * involving BillPay reversals.Shipping: only transactions
	 * involving UPS shipping fees.BalanceAffecting: only
	 * transactions that affect the account balance.ECheck: only
	 * transactions involving eCheckForcedPostTransaction: forced
	 * post transaction.NonReferencedRefunds: non-referenced
	 * refunds.	 
	 */ 
	private PaymentTransactionClassCodeType transactionClass;

	/**
	 * Search by transaction amount OptionalYou must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. 	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Search by currency codeOptional	 
	 */ 
	private CurrencyCodeType currencyCode;

	/**
	 * Search by transaction status OptionalPending: The payment is
	 * pending. The specific reason the payment is pending is
	 * returned by the GetTransactionDetails APIPendingReason
	 * element. For more information, see PendingReason.Processing:
	 * The payment is being processed.Success: The payment has been
	 * completed and the funds have been added successfully to your
	 * account balance.Denied: You denied the payment. This happens
	 * only if the payment was previously pending.Reversed: A
	 * payment was reversed due to a chargeback or other type of
	 * reversal. The funds have been removed from your account
	 * balance and returned to the buyer.	 
	 */ 
	private PaymentTransactionStatusCodeType status;

	

	/**
	 * Constructor with arguments
	 */
	public TransactionSearchRequestType (String startDate){
		this.startDate = startDate;
	}	

	/**
	 * Default Constructor
	 */
	public TransactionSearchRequestType (){
	}	

	/**
	 * Getter for startDate
	 */
	 public String getStartDate() {
	 	return startDate;
	 }
	 
	/**
	 * Setter for startDate
	 */
	 public void setStartDate(String startDate) {
	 	this.startDate = startDate;
	 }
	 
	/**
	 * Getter for endDate
	 */
	 public String getEndDate() {
	 	return endDate;
	 }
	 
	/**
	 * Setter for endDate
	 */
	 public void setEndDate(String endDate) {
	 	this.endDate = endDate;
	 }
	 
	/**
	 * Getter for payer
	 */
	 public String getPayer() {
	 	return payer;
	 }
	 
	/**
	 * Setter for payer
	 */
	 public void setPayer(String payer) {
	 	this.payer = payer;
	 }
	 
	/**
	 * Getter for receiver
	 */
	 public String getReceiver() {
	 	return receiver;
	 }
	 
	/**
	 * Setter for receiver
	 */
	 public void setReceiver(String receiver) {
	 	this.receiver = receiver;
	 }
	 
	/**
	 * Getter for receiptID
	 */
	 public String getReceiptID() {
	 	return receiptID;
	 }
	 
	/**
	 * Setter for receiptID
	 */
	 public void setReceiptID(String receiptID) {
	 	this.receiptID = receiptID;
	 }
	 
	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
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
	 * Getter for payerName
	 */
	 public PersonNameType getPayerName() {
	 	return payerName;
	 }
	 
	/**
	 * Setter for payerName
	 */
	 public void setPayerName(PersonNameType payerName) {
	 	this.payerName = payerName;
	 }
	 
	/**
	 * Getter for auctionItemNumber
	 */
	 public String getAuctionItemNumber() {
	 	return auctionItemNumber;
	 }
	 
	/**
	 * Setter for auctionItemNumber
	 */
	 public void setAuctionItemNumber(String auctionItemNumber) {
	 	this.auctionItemNumber = auctionItemNumber;
	 }
	 
	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for cardNumber
	 */
	 public String getCardNumber() {
	 	return cardNumber;
	 }
	 
	/**
	 * Setter for cardNumber
	 */
	 public void setCardNumber(String cardNumber) {
	 	this.cardNumber = cardNumber;
	 }
	 
	/**
	 * Getter for transactionClass
	 */
	 public PaymentTransactionClassCodeType getTransactionClass() {
	 	return transactionClass;
	 }
	 
	/**
	 * Setter for transactionClass
	 */
	 public void setTransactionClass(PaymentTransactionClassCodeType transactionClass) {
	 	this.transactionClass = transactionClass;
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
	 * Getter for currencyCode
	 */
	 public CurrencyCodeType getCurrencyCode() {
	 	return currencyCode;
	 }
	 
	/**
	 * Setter for currencyCode
	 */
	 public void setCurrencyCode(CurrencyCodeType currencyCode) {
	 	this.currencyCode = currencyCode;
	 }
	 
	/**
	 * Getter for status
	 */
	 public PaymentTransactionStatusCodeType getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(PaymentTransactionStatusCodeType status) {
	 	this.status = status;
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
		sb.append(super.toXMLString(prefix, null));
		if(startDate != null) {
			sb.append("<").append(preferredPrefix).append(":StartDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(startDate));
			sb.append("</").append(preferredPrefix).append(":StartDate>");
		}
		if(endDate != null) {
			sb.append("<").append(preferredPrefix).append(":EndDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(endDate));
			sb.append("</").append(preferredPrefix).append(":EndDate>");
		}
		if(payer != null) {
			sb.append("<").append(preferredPrefix).append(":Payer>").append(SDKUtil.escapeInvalidXmlCharsRegex(payer));
			sb.append("</").append(preferredPrefix).append(":Payer>");
		}
		if(receiver != null) {
			sb.append("<").append(preferredPrefix).append(":Receiver>").append(SDKUtil.escapeInvalidXmlCharsRegex(receiver));
			sb.append("</").append(preferredPrefix).append(":Receiver>");
		}
		if(receiptID != null) {
			sb.append("<").append(preferredPrefix).append(":ReceiptID>").append(SDKUtil.escapeInvalidXmlCharsRegex(receiptID));
			sb.append("</").append(preferredPrefix).append(":ReceiptID>");
		}
		if(transactionID != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(transactionID));
			sb.append("</").append(preferredPrefix).append(":TransactionID>");
		}
		if(profileID != null) {
			sb.append("<").append(preferredPrefix).append(":ProfileID>").append(SDKUtil.escapeInvalidXmlCharsRegex(profileID));
			sb.append("</").append(preferredPrefix).append(":ProfileID>");
		}
		if(payerName != null) {
			sb.append(payerName.toXMLString(preferredPrefix,"PayerName"));
		}
		if(auctionItemNumber != null) {
			sb.append("<").append(preferredPrefix).append(":AuctionItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(auctionItemNumber));
			sb.append("</").append(preferredPrefix).append(":AuctionItemNumber>");
		}
		if(invoiceID != null) {
			sb.append("<").append(preferredPrefix).append(":InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoiceID));
			sb.append("</").append(preferredPrefix).append(":InvoiceID>");
		}
		if(cardNumber != null) {
			sb.append("<").append(preferredPrefix).append(":CardNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(cardNumber));
			sb.append("</").append(preferredPrefix).append(":CardNumber>");
		}
		if(transactionClass != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionClass>").append(SDKUtil.escapeInvalidXmlCharsRegex(transactionClass.getValue()));
			sb.append("</").append(preferredPrefix).append(":TransactionClass>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(currencyCode != null) {
			sb.append("<").append(preferredPrefix).append(":CurrencyCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(currencyCode.getValue()));
			sb.append("</").append(preferredPrefix).append(":CurrencyCode>");
		}
		if(status != null) {
			sb.append("<").append(preferredPrefix).append(":Status>").append(SDKUtil.escapeInvalidXmlCharsRegex(status.getValue()));
			sb.append("</").append(preferredPrefix).append(":Status>");
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