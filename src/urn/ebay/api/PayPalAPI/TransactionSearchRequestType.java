package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.PersonNameType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionClassCodeType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.CurrencyCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * The earliest transaction date at which to start the search.
 * No wildcards are allowed. Required
 */
public class TransactionSearchRequestType extends AbstractRequestType {


	/**
	 * The earliest transaction date at which to start the search.
	 * No wildcards are allowed. Required	  
	 *@Required	 
	 */ 
	private String StartDate;

	/**
	 * The latest transaction date to be included in the search
	 * Optional	 
	 */ 
	private String EndDate;

	/**
	 * Search by the buyer's email address OptionalCharacter length
	 * and limitations: 127 single-byte alphanumeric characters	 
	 */ 
	private String Payer;

	/**
	 * Search by the receiver's email address. If the merchant
	 * account has only one email, this is the primary email. Can
	 * also be a non-primary email.Optional	 
	 */ 
	private String Receiver;

	/**
	 * Search by the PayPal Account Optional receipt IDOptional	 
	 */ 
	private String ReceiptID;

	/**
	 * Search by the transaction ID. OptionalThe returned results
	 * are from the merchant's transaction records. Character
	 * length and limitations: 19 single-byte characters maximum	 
	 */ 
	private String TransactionID;

	/**
	 * Search by Recurring Payment Profile id. The ProfileID is
	 * returned as part of the CreateRecurringPaymentsProfile API
	 * response. Optional	 
	 */ 
	private String ProfileID;

	/**
	 * Search by the buyer's name OptionalSalutation: 20
	 * single-byte character limit.FirstName: 25 single-byte
	 * character limit.MiddleName: 25 single-byte character
	 * limit.LastName: 25 single-byte character limit.Suffix: 12
	 * single-byte character limit.	 
	 */ 
	private PersonNameType PayerName;

	/**
	 * Search by item number of the purchased goods.OptionalTo
	 * search for purchased items not related to auctions, set the
	 * AuctionItemNumber element to the value of the HTML
	 * item_number variable set in the shopping cart for the
	 * original transaction.	 
	 */ 
	private String AuctionItemNumber;

	/**
	 * Search by invoice identification key, as set by you for the
	 * original transaction. InvoiceID searches the invoice records
	 * for items sold by the merchant, not the items purchased.
	 * OptionalThe value for InvoiceID must exactly match an
	 * invoice identification number. No wildcards are allowed.
	 * Character length and limitations: 127 single-byte characters
	 * maximum	 
	 */ 
	private String InvoiceID;

	/**
	 * No Document Comments	 
	 */ 
	private String CardNumber;

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
	 * transactions involving eCheck	 
	 */ 
	private PaymentTransactionClassCodeType TransactionClass;

	/**
	 * Search by transaction amount OptionalYou must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. 	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Search by currency codeOptional	 
	 */ 
	private CurrencyCodeType CurrencyCode;

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
	private PaymentTransactionStatusCodeType Status;

	

	/**
	 * Constructor with arguments
	 */
	public TransactionSearchRequestType (String StartDate){
		this.StartDate = StartDate;
	}	

	/**
	 * Default Constructor
	 */
	public TransactionSearchRequestType (){
	}	

	/**
	 * Getter for StartDate
	 */
	 public String getStartDate() {
	 	return StartDate;
	 }
	 
	/**
	 * Setter for StartDate
	 */
	 public void setStartDate(String StartDate) {
	 	this.StartDate = StartDate;
	 }
	 
	/**
	 * Getter for EndDate
	 */
	 public String getEndDate() {
	 	return EndDate;
	 }
	 
	/**
	 * Setter for EndDate
	 */
	 public void setEndDate(String EndDate) {
	 	this.EndDate = EndDate;
	 }
	 
	/**
	 * Getter for Payer
	 */
	 public String getPayer() {
	 	return Payer;
	 }
	 
	/**
	 * Setter for Payer
	 */
	 public void setPayer(String Payer) {
	 	this.Payer = Payer;
	 }
	 
	/**
	 * Getter for Receiver
	 */
	 public String getReceiver() {
	 	return Receiver;
	 }
	 
	/**
	 * Setter for Receiver
	 */
	 public void setReceiver(String Receiver) {
	 	this.Receiver = Receiver;
	 }
	 
	/**
	 * Getter for ReceiptID
	 */
	 public String getReceiptID() {
	 	return ReceiptID;
	 }
	 
	/**
	 * Setter for ReceiptID
	 */
	 public void setReceiptID(String ReceiptID) {
	 	this.ReceiptID = ReceiptID;
	 }
	 
	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
	 }
	 
	/**
	 * Getter for ProfileID
	 */
	 public String getProfileID() {
	 	return ProfileID;
	 }
	 
	/**
	 * Setter for ProfileID
	 */
	 public void setProfileID(String ProfileID) {
	 	this.ProfileID = ProfileID;
	 }
	 
	/**
	 * Getter for PayerName
	 */
	 public PersonNameType getPayerName() {
	 	return PayerName;
	 }
	 
	/**
	 * Setter for PayerName
	 */
	 public void setPayerName(PersonNameType PayerName) {
	 	this.PayerName = PayerName;
	 }
	 
	/**
	 * Getter for AuctionItemNumber
	 */
	 public String getAuctionItemNumber() {
	 	return AuctionItemNumber;
	 }
	 
	/**
	 * Setter for AuctionItemNumber
	 */
	 public void setAuctionItemNumber(String AuctionItemNumber) {
	 	this.AuctionItemNumber = AuctionItemNumber;
	 }
	 
	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for CardNumber
	 */
	 public String getCardNumber() {
	 	return CardNumber;
	 }
	 
	/**
	 * Setter for CardNumber
	 */
	 public void setCardNumber(String CardNumber) {
	 	this.CardNumber = CardNumber;
	 }
	 
	/**
	 * Getter for TransactionClass
	 */
	 public PaymentTransactionClassCodeType getTransactionClass() {
	 	return TransactionClass;
	 }
	 
	/**
	 * Setter for TransactionClass
	 */
	 public void setTransactionClass(PaymentTransactionClassCodeType TransactionClass) {
	 	this.TransactionClass = TransactionClass;
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
	 * Getter for CurrencyCode
	 */
	 public CurrencyCodeType getCurrencyCode() {
	 	return CurrencyCode;
	 }
	 
	/**
	 * Setter for CurrencyCode
	 */
	 public void setCurrencyCode(CurrencyCodeType CurrencyCode) {
	 	this.CurrencyCode = CurrencyCode;
	 }
	 
	/**
	 * Getter for Status
	 */
	 public PaymentTransactionStatusCodeType getStatus() {
	 	return Status;
	 }
	 
	/**
	 * Setter for Status
	 */
	 public void setStatus(PaymentTransactionStatusCodeType Status) {
	 	this.Status = Status;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(StartDate != null) {
			sb.append("<urn:StartDate>").append(StartDate);
			sb.append("</urn:StartDate>");
		}
		if(EndDate != null) {
			sb.append("<urn:EndDate>").append(EndDate);
			sb.append("</urn:EndDate>");
		}
		if(Payer != null) {
			sb.append("<urn:Payer>").append(Payer);
			sb.append("</urn:Payer>");
		}
		if(Receiver != null) {
			sb.append("<urn:Receiver>").append(Receiver);
			sb.append("</urn:Receiver>");
		}
		if(ReceiptID != null) {
			sb.append("<urn:ReceiptID>").append(ReceiptID);
			sb.append("</urn:ReceiptID>");
		}
		if(TransactionID != null) {
			sb.append("<urn:TransactionID>").append(TransactionID);
			sb.append("</urn:TransactionID>");
		}
		if(ProfileID != null) {
			sb.append("<urn:ProfileID>").append(ProfileID);
			sb.append("</urn:ProfileID>");
		}
		if(PayerName != null) {
			sb.append("<urn:PayerName>");
			sb.append(PayerName.toXMLString());
			sb.append("</urn:PayerName>");
		}
		if(AuctionItemNumber != null) {
			sb.append("<urn:AuctionItemNumber>").append(AuctionItemNumber);
			sb.append("</urn:AuctionItemNumber>");
		}
		if(InvoiceID != null) {
			sb.append("<urn:InvoiceID>").append(InvoiceID);
			sb.append("</urn:InvoiceID>");
		}
		if(CardNumber != null) {
			sb.append("<urn:CardNumber>").append(CardNumber);
			sb.append("</urn:CardNumber>");
		}
		if(TransactionClass != null) {
			sb.append("<urn:TransactionClass>").append(TransactionClass.getValue());
			sb.append("</urn:TransactionClass>");
		}
		if(Amount != null) {
			sb.append("<urn:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if(CurrencyCode != null) {
			sb.append("<urn:CurrencyCode>").append(CurrencyCode.getValue());
			sb.append("</urn:CurrencyCode>");
		}
		if(Status != null) {
			sb.append("<urn:Status>").append(Status.getValue());
			sb.append("</urn:Status>");
		}
		return sb.toString();
	}

}