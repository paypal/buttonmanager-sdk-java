package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentCodeType;
import urn.ebay.apis.eBLBaseComponents.RefundSourceCodeType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.PaymentStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PendingStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.ReversalReasonCodeType;
import urn.ebay.apis.eBLBaseComponents.POSTransactionCodeType;
import urn.ebay.apis.eBLBaseComponents.SellerDetailsType;
import urn.ebay.apis.eBLBaseComponents.FMFDetailsType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedPaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.ErrorType;
import urn.ebay.apis.eBLBaseComponents.InstrumentDetailsType;
import urn.ebay.apis.eBLBaseComponents.OfferDetailsType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * PaymentInfoType Payment information. 
 */
public class PaymentInfoType{


	/**
	 * A transaction identification number. Character length and
	 * limits: 19 single-byte characters maximum	 
	 */ 
	private String transactionID;

	/**
	 * Its Ebay transaction id. EbayTransactionID will returned for
	 * immediate pay item transaction in ECA 	 
	 */ 
	private String ebayTransactionID;

	/**
	 * Parent or related transaction identification number. This
	 * field is populated for the following transaction types:
	 * ReversalCapture of an authorized transaction.Reauthorization
	 * of a transaction.Capture of an order. The value of
	 * ParentTransactionID is the original OrderID.Authorization of
	 * an order. The value of ParentTransactionID is the original
	 * OrderID.Capture of an order authorization.Void of an order.
	 * The value of ParentTransactionID is the original OrderID.
	 * Character length and limits: 19 single-byte characters
	 * maximum	 
	 */ 
	private String parentTransactionID;

	/**
	 * Receipt ID Character length and limitations: 16 digits in
	 * xxxx-xxxx-xxxx-xxxx format	 
	 */ 
	private String receiptID;

	/**
	 * The type of transaction cart: Transaction created via the
	 * PayPal Shopping Cart feature or by Express Checkout with
	 * multiple purchased item express-checkout: Transaction
	 * created by Express Checkout with a single purchased items
	 * send-money: Transaction created by customer from the Send
	 * Money tab on the PayPal website. web-accept: Transaction
	 * created by customer via Buy Now, Donation, or Auction Smart
	 * Logos. subscr-*: Transaction created by customer via
	 * Subscription. eot means "end of subscription term."
	 * merch-pmt: preapproved payment. mass-pay: Transaction
	 * created via MassPay. virtual-terminal: Transaction created
	 * via merchant virtual terminal. credit: Transaction created
	 * via merchant virtual terminal or API to credit a customer.	 
	 */ 
	private PaymentTransactionCodeType transactionType;

	/**
	 * The type of payment	 
	 */ 
	private PaymentCodeType paymentType;

	/**
	 * The type of funding source	 
	 */ 
	private RefundSourceCodeType refundSourceCodeType;

	/**
	 * eCheck latest expected clear date 	 
	 */ 
	private String expectedeCheckClearDate;

	/**
	 * Date and time of payment 	 
	 */ 
	private String paymentDate;

	/**
	 * Full amount of the customer's payment, before transaction
	 * fee is subtracted	 
	 */ 
	private BasicAmountType grossAmount;

	/**
	 * Transaction fee associated with the payment 	 
	 */ 
	private BasicAmountType feeAmount;

	/**
	 * Amount deposited into the account's primary balance after a
	 * currency conversion from automatic conversion through your
	 * Payment Receiving Preferences or manual conversion through
	 * manually accepting a payment. This amount is calculated
	 * after fees and taxes have been assessed. 	 
	 */ 
	private BasicAmountType settleAmount;

	/**
	 * Amount of tax for transaction 	 
	 */ 
	private BasicAmountType taxAmount;

	/**
	 * Exchange rate for transaction 	 
	 */ 
	private String exchangeRate;

	/**
	 * The status of the payment: None: No status Created: A
	 * giropay payment has been initiated. Canceled-Reversal: A
	 * reversal has been canceled. For example, you won a dispute
	 * with the customer, and the funds for the transaction that
	 * was reversed have been returned to you. Completed: The
	 * payment has been completed, and the funds have been added
	 * successfully to your account balance. Denied: You denied the
	 * payment. This happens only if the payment was previously
	 * pending because of possible reasons described for the
	 * PendingReason element. Expired: This authorization has
	 * expired and cannot be captured. Failed: The payment has
	 * failed. This happens only if the payment was made from your
	 * customer's bank account. In-Progress: The transaction is in
	 * process of authorization and capture. Partially-Refunded:
	 * The transaction has been partially refunded. Pending: The
	 * payment is pending. See "PendingReason" for more
	 * information. Refunded: You refunded the payment. Reversed: A
	 * payment was reversed due to a chargeback or other type of
	 * reversal. The funds have been removed from your account
	 * balance and returned to the buyer. The reason for the
	 * reversal is specified in the ReasonCode element. Processed:
	 * A payment has been accepted. Voided: This authorization has
	 * been voided. Completed-Funds-Held: The payment has been
	 * completed, and the funds have been added successfully to
	 * your pending balance. See the "HoldDecision" field for more
	 * information.	 
	 */ 
	private PaymentStatusCodeType paymentStatus;

	/**
	 * The reason the payment is pending: none: No pending reason
	 * address: The payment is pending because your customer did
	 * not include a confirmed shipping address and your Payment
	 * Receiving Preferences is set such that you want to manually
	 * accept or deny each of these payments. To change your
	 * preference, go to the Preferences section of your Profile.
	 * authorization: You set PaymentAction to Authorization on
	 * SetExpressCheckoutRequest and have not yet captured funds.
	 * echeck: The payment is pending because it was made by an
	 * eCheck that has not yet cleared. intl: The payment is
	 * pending because you hold a non-U.S. account and do not have
	 * a withdrawal mechanism. You must manually accept or deny
	 * this payment from your Account Overview. multi-currency: You
	 * do not have a balance in the currency sent, and you do not
	 * have your Payment Receiving Preferences set to automatically
	 * convert and accept this payment. You must manually accept or
	 * deny this payment. unilateral: The payment is pending
	 * because it was made to an email address that is not yet
	 * registered or confirmed. upgrade: The payment is pending
	 * because it was made via credit card and you must upgrade
	 * your account to Business or Premier status in order to
	 * receive the funds. upgrade can also mean that you have
	 * reached the monthly limit for transactions on your account.
	 * verify: The payment is pending because you are not yet
	 * verified. You must verify your account before you can accept
	 * this payment. other: The payment is pending for a reason
	 * other than those listed above. For more information, contact
	 * PayPal Customer Service.	 
	 */ 
	private PendingStatusCodeType pendingReason;

	/**
	 * The reason for a reversal if TransactionType is reversal:
	 * none: No reason code chargeback: A reversal has occurred on
	 * this transaction due to a chargeback by your customer.
	 * guarantee: A reversal has occurred on this transaction due
	 * to your customer triggering a money-back guarantee.
	 * buyer-complaint: A reversal has occurred on this transaction
	 * due to a complaint about the transaction from your customer.
	 * refund: A reversal has occurred on this transaction because
	 * you have given the customer a refund. other: A reversal has
	 * occurred on this transaction due to a reason not listed
	 * above.	 
	 */ 
	private ReversalReasonCodeType reasonCode;

	/**
	 * HoldDecision is returned in the response only if
	 * PaymentStatus is Completed-Funds-Held. The reason the funds
	 * are kept in pending balance: newsellerpaymenthold: The
	 * seller is new. paymenthold: A hold is placed on your
	 * transaction due to a reason not listed above. 	 
	 */ 
	private String holdDecision;

	/**
	 * Shipping method selected by the user during check-out. 	 
	 */ 
	private String shippingMethod;

	/**
	 * Protection Eligibility for this Transaction - None, SPP or
	 * ESPP 	 
	 */ 
	private String protectionEligibility;

	/**
	 * Protection Eligibility details for this Transaction 	 
	 */ 
	private String protectionEligibilityType;

	/**
	 * Receipt Reference Number for this Transaction 	 
	 */ 
	private String receiptReferenceNumber;

	/**
	 * The type of POS transaction F: Forced post transaction. POS
	 * merchant can send transactions at a later point if
	 * connectivity is lost. S: Single call checkout, and this is
	 * to identify PayPal Lite API usage. 	 
	 */ 
	private POSTransactionCodeType pOSTransactionType;

	/**
	 * Amount of shipping charged on transaction	 
	 */ 
	private String shipAmount;

	/**
	 * Amount of ship handling charged on transaction	 
	 */ 
	private String shipHandleAmount;

	/**
	 * Amount of shipping discount on transaction	 
	 */ 
	private String shipDiscount;

	/**
	 * Amount of Insurance amount on transaction	 
	 */ 
	private String insuranceAmount;

	/**
	 * Subject as entered in the transaction	 
	 */ 
	private String subject;

	/**
	 * StoreID as entered in the transaction	 
	 */ 
	private String storeID;

	/**
	 * TerminalID as entered in the transaction	 
	 */ 
	private String terminalID;

	/**
	 * Details about the seller. Optional 	 
	 */ 
	private SellerDetailsType sellerDetails;

	/**
	 * Unique identifier and mandatory for each bucket in case of
	 * split payement 	 
	 */ 
	private String paymentRequestID;

	/**
	 * Thes are filters that could result in accept/deny/pending
	 * action. 	 
	 */ 
	private FMFDetailsType fMFDetails;

	/**
	 * This will be enhanced info for the payment: Example: UATP
	 * details 	 
	 */ 
	private EnhancedPaymentInfoType enhancedPaymentInfo;

	/**
	 * This will indicate the payment status for individual payment
	 * request in case of split payment 	 
	 */ 
	private ErrorType paymentError;

	/**
	 * Type of the payment instrument. 	 
	 */ 
	private InstrumentDetailsType instrumentDetails;

	/**
	 * Offer Details. 	 
	 */ 
	private OfferDetailsType offerDetails;

	

	/**
	 * Default Constructor
	 */
	public PaymentInfoType (){
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
	 * Getter for ebayTransactionID
	 */
	 public String getEbayTransactionID() {
	 	return ebayTransactionID;
	 }
	 
	/**
	 * Setter for ebayTransactionID
	 */
	 public void setEbayTransactionID(String ebayTransactionID) {
	 	this.ebayTransactionID = ebayTransactionID;
	 }
	 
	/**
	 * Getter for parentTransactionID
	 */
	 public String getParentTransactionID() {
	 	return parentTransactionID;
	 }
	 
	/**
	 * Setter for parentTransactionID
	 */
	 public void setParentTransactionID(String parentTransactionID) {
	 	this.parentTransactionID = parentTransactionID;
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
	 * Getter for transactionType
	 */
	 public PaymentTransactionCodeType getTransactionType() {
	 	return transactionType;
	 }
	 
	/**
	 * Setter for transactionType
	 */
	 public void setTransactionType(PaymentTransactionCodeType transactionType) {
	 	this.transactionType = transactionType;
	 }
	 
	/**
	 * Getter for paymentType
	 */
	 public PaymentCodeType getPaymentType() {
	 	return paymentType;
	 }
	 
	/**
	 * Setter for paymentType
	 */
	 public void setPaymentType(PaymentCodeType paymentType) {
	 	this.paymentType = paymentType;
	 }
	 
	/**
	 * Getter for refundSourceCodeType
	 */
	 public RefundSourceCodeType getRefundSourceCodeType() {
	 	return refundSourceCodeType;
	 }
	 
	/**
	 * Setter for refundSourceCodeType
	 */
	 public void setRefundSourceCodeType(RefundSourceCodeType refundSourceCodeType) {
	 	this.refundSourceCodeType = refundSourceCodeType;
	 }
	 
	/**
	 * Getter for expectedeCheckClearDate
	 */
	 public String getExpectedeCheckClearDate() {
	 	return expectedeCheckClearDate;
	 }
	 
	/**
	 * Setter for expectedeCheckClearDate
	 */
	 public void setExpectedeCheckClearDate(String expectedeCheckClearDate) {
	 	this.expectedeCheckClearDate = expectedeCheckClearDate;
	 }
	 
	/**
	 * Getter for paymentDate
	 */
	 public String getPaymentDate() {
	 	return paymentDate;
	 }
	 
	/**
	 * Setter for paymentDate
	 */
	 public void setPaymentDate(String paymentDate) {
	 	this.paymentDate = paymentDate;
	 }
	 
	/**
	 * Getter for grossAmount
	 */
	 public BasicAmountType getGrossAmount() {
	 	return grossAmount;
	 }
	 
	/**
	 * Setter for grossAmount
	 */
	 public void setGrossAmount(BasicAmountType grossAmount) {
	 	this.grossAmount = grossAmount;
	 }
	 
	/**
	 * Getter for feeAmount
	 */
	 public BasicAmountType getFeeAmount() {
	 	return feeAmount;
	 }
	 
	/**
	 * Setter for feeAmount
	 */
	 public void setFeeAmount(BasicAmountType feeAmount) {
	 	this.feeAmount = feeAmount;
	 }
	 
	/**
	 * Getter for settleAmount
	 */
	 public BasicAmountType getSettleAmount() {
	 	return settleAmount;
	 }
	 
	/**
	 * Setter for settleAmount
	 */
	 public void setSettleAmount(BasicAmountType settleAmount) {
	 	this.settleAmount = settleAmount;
	 }
	 
	/**
	 * Getter for taxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return taxAmount;
	 }
	 
	/**
	 * Setter for taxAmount
	 */
	 public void setTaxAmount(BasicAmountType taxAmount) {
	 	this.taxAmount = taxAmount;
	 }
	 
	/**
	 * Getter for exchangeRate
	 */
	 public String getExchangeRate() {
	 	return exchangeRate;
	 }
	 
	/**
	 * Setter for exchangeRate
	 */
	 public void setExchangeRate(String exchangeRate) {
	 	this.exchangeRate = exchangeRate;
	 }
	 
	/**
	 * Getter for paymentStatus
	 */
	 public PaymentStatusCodeType getPaymentStatus() {
	 	return paymentStatus;
	 }
	 
	/**
	 * Setter for paymentStatus
	 */
	 public void setPaymentStatus(PaymentStatusCodeType paymentStatus) {
	 	this.paymentStatus = paymentStatus;
	 }
	 
	/**
	 * Getter for pendingReason
	 */
	 public PendingStatusCodeType getPendingReason() {
	 	return pendingReason;
	 }
	 
	/**
	 * Setter for pendingReason
	 */
	 public void setPendingReason(PendingStatusCodeType pendingReason) {
	 	this.pendingReason = pendingReason;
	 }
	 
	/**
	 * Getter for reasonCode
	 */
	 public ReversalReasonCodeType getReasonCode() {
	 	return reasonCode;
	 }
	 
	/**
	 * Setter for reasonCode
	 */
	 public void setReasonCode(ReversalReasonCodeType reasonCode) {
	 	this.reasonCode = reasonCode;
	 }
	 
	/**
	 * Getter for holdDecision
	 */
	 public String getHoldDecision() {
	 	return holdDecision;
	 }
	 
	/**
	 * Setter for holdDecision
	 */
	 public void setHoldDecision(String holdDecision) {
	 	this.holdDecision = holdDecision;
	 }
	 
	/**
	 * Getter for shippingMethod
	 */
	 public String getShippingMethod() {
	 	return shippingMethod;
	 }
	 
	/**
	 * Setter for shippingMethod
	 */
	 public void setShippingMethod(String shippingMethod) {
	 	this.shippingMethod = shippingMethod;
	 }
	 
	/**
	 * Getter for protectionEligibility
	 */
	 public String getProtectionEligibility() {
	 	return protectionEligibility;
	 }
	 
	/**
	 * Setter for protectionEligibility
	 */
	 public void setProtectionEligibility(String protectionEligibility) {
	 	this.protectionEligibility = protectionEligibility;
	 }
	 
	/**
	 * Getter for protectionEligibilityType
	 */
	 public String getProtectionEligibilityType() {
	 	return protectionEligibilityType;
	 }
	 
	/**
	 * Setter for protectionEligibilityType
	 */
	 public void setProtectionEligibilityType(String protectionEligibilityType) {
	 	this.protectionEligibilityType = protectionEligibilityType;
	 }
	 
	/**
	 * Getter for receiptReferenceNumber
	 */
	 public String getReceiptReferenceNumber() {
	 	return receiptReferenceNumber;
	 }
	 
	/**
	 * Setter for receiptReferenceNumber
	 */
	 public void setReceiptReferenceNumber(String receiptReferenceNumber) {
	 	this.receiptReferenceNumber = receiptReferenceNumber;
	 }
	 
	/**
	 * Getter for pOSTransactionType
	 */
	 public POSTransactionCodeType getPOSTransactionType() {
	 	return pOSTransactionType;
	 }
	 
	/**
	 * Setter for pOSTransactionType
	 */
	 public void setPOSTransactionType(POSTransactionCodeType pOSTransactionType) {
	 	this.pOSTransactionType = pOSTransactionType;
	 }
	 
	/**
	 * Getter for shipAmount
	 */
	 public String getShipAmount() {
	 	return shipAmount;
	 }
	 
	/**
	 * Setter for shipAmount
	 */
	 public void setShipAmount(String shipAmount) {
	 	this.shipAmount = shipAmount;
	 }
	 
	/**
	 * Getter for shipHandleAmount
	 */
	 public String getShipHandleAmount() {
	 	return shipHandleAmount;
	 }
	 
	/**
	 * Setter for shipHandleAmount
	 */
	 public void setShipHandleAmount(String shipHandleAmount) {
	 	this.shipHandleAmount = shipHandleAmount;
	 }
	 
	/**
	 * Getter for shipDiscount
	 */
	 public String getShipDiscount() {
	 	return shipDiscount;
	 }
	 
	/**
	 * Setter for shipDiscount
	 */
	 public void setShipDiscount(String shipDiscount) {
	 	this.shipDiscount = shipDiscount;
	 }
	 
	/**
	 * Getter for insuranceAmount
	 */
	 public String getInsuranceAmount() {
	 	return insuranceAmount;
	 }
	 
	/**
	 * Setter for insuranceAmount
	 */
	 public void setInsuranceAmount(String insuranceAmount) {
	 	this.insuranceAmount = insuranceAmount;
	 }
	 
	/**
	 * Getter for subject
	 */
	 public String getSubject() {
	 	return subject;
	 }
	 
	/**
	 * Setter for subject
	 */
	 public void setSubject(String subject) {
	 	this.subject = subject;
	 }
	 
	/**
	 * Getter for storeID
	 */
	 public String getStoreID() {
	 	return storeID;
	 }
	 
	/**
	 * Setter for storeID
	 */
	 public void setStoreID(String storeID) {
	 	this.storeID = storeID;
	 }
	 
	/**
	 * Getter for terminalID
	 */
	 public String getTerminalID() {
	 	return terminalID;
	 }
	 
	/**
	 * Setter for terminalID
	 */
	 public void setTerminalID(String terminalID) {
	 	this.terminalID = terminalID;
	 }
	 
	/**
	 * Getter for sellerDetails
	 */
	 public SellerDetailsType getSellerDetails() {
	 	return sellerDetails;
	 }
	 
	/**
	 * Setter for sellerDetails
	 */
	 public void setSellerDetails(SellerDetailsType sellerDetails) {
	 	this.sellerDetails = sellerDetails;
	 }
	 
	/**
	 * Getter for paymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return paymentRequestID;
	 }
	 
	/**
	 * Setter for paymentRequestID
	 */
	 public void setPaymentRequestID(String paymentRequestID) {
	 	this.paymentRequestID = paymentRequestID;
	 }
	 
	/**
	 * Getter for fMFDetails
	 */
	 public FMFDetailsType getFMFDetails() {
	 	return fMFDetails;
	 }
	 
	/**
	 * Setter for fMFDetails
	 */
	 public void setFMFDetails(FMFDetailsType fMFDetails) {
	 	this.fMFDetails = fMFDetails;
	 }
	 
	/**
	 * Getter for enhancedPaymentInfo
	 */
	 public EnhancedPaymentInfoType getEnhancedPaymentInfo() {
	 	return enhancedPaymentInfo;
	 }
	 
	/**
	 * Setter for enhancedPaymentInfo
	 */
	 public void setEnhancedPaymentInfo(EnhancedPaymentInfoType enhancedPaymentInfo) {
	 	this.enhancedPaymentInfo = enhancedPaymentInfo;
	 }
	 
	/**
	 * Getter for paymentError
	 */
	 public ErrorType getPaymentError() {
	 	return paymentError;
	 }
	 
	/**
	 * Setter for paymentError
	 */
	 public void setPaymentError(ErrorType paymentError) {
	 	this.paymentError = paymentError;
	 }
	 
	/**
	 * Getter for instrumentDetails
	 */
	 public InstrumentDetailsType getInstrumentDetails() {
	 	return instrumentDetails;
	 }
	 
	/**
	 * Setter for instrumentDetails
	 */
	 public void setInstrumentDetails(InstrumentDetailsType instrumentDetails) {
	 	this.instrumentDetails = instrumentDetails;
	 }
	 
	/**
	 * Getter for offerDetails
	 */
	 public OfferDetailsType getOfferDetails() {
	 	return offerDetails;
	 }
	 
	/**
	 * Setter for offerDetails
	 */
	 public void setOfferDetails(OfferDetailsType offerDetails) {
	 	this.offerDetails = offerDetails;
	 }
	 



	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else if (n.getNodeType() == Node.ELEMENT_NODE ) {
			return (n.getChildNodes().getLength() == 0);
		} else {
			return false;
		}
	}
	
	public PaymentInfoType(Node node) throws XPathExpressionException {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		Node childNode = null;
		NodeList nodeList = null;
		childNode = (Node) xpath.evaluate("TransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.transactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("EbayTransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.ebayTransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ParentTransactionID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.parentTransactionID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ReceiptID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.receiptID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TransactionType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.transactionType = PaymentTransactionCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PaymentType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentType = PaymentCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("RefundSourceCodeType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.refundSourceCodeType = RefundSourceCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ExpectedeCheckClearDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.expectedeCheckClearDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentDate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentDate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("GrossAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.grossAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("FeeAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.feeAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("SettleAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.settleAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("TaxAmount", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.taxAmount =  new BasicAmountType(childNode);
		}
		childNode = (Node) xpath.evaluate("ExchangeRate", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.exchangeRate = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("PaymentStatus", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentStatus = PaymentStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("PendingReason", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.pendingReason = PendingStatusCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ReasonCode", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.reasonCode = ReversalReasonCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("HoldDecision", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.holdDecision = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShippingMethod", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shippingMethod = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProtectionEligibility", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.protectionEligibility = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ProtectionEligibilityType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.protectionEligibilityType = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ReceiptReferenceNumber", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.receiptReferenceNumber = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("POSTransactionType", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.pOSTransactionType = POSTransactionCodeType.fromValue(childNode.getTextContent());
		}
		childNode = (Node) xpath.evaluate("ShipAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shipAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShipHandleAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shipHandleAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("ShipDiscount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.shipDiscount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("InsuranceAmount", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.insuranceAmount = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("Subject", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.subject = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("StoreID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.storeID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("TerminalID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.terminalID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("SellerDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.sellerDetails =  new SellerDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentRequestID", node, XPathConstants.NODE);
		if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentRequestID = childNode.getTextContent();
		}
	
		childNode = (Node) xpath.evaluate("FMFDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.fMFDetails =  new FMFDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("EnhancedPaymentInfo", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.enhancedPaymentInfo =  new EnhancedPaymentInfoType(childNode);
		}
		childNode = (Node) xpath.evaluate("PaymentError", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.paymentError =  new ErrorType(childNode);
		}
		childNode = (Node) xpath.evaluate("InstrumentDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.instrumentDetails =  new InstrumentDetailsType(childNode);
		}
		childNode = (Node) xpath.evaluate("OfferDetails", node, XPathConstants.NODE);
        if (childNode != null && !isWhitespaceNode(childNode)) {
		    this.offerDetails =  new OfferDetailsType(childNode);
		}
	}
 
}