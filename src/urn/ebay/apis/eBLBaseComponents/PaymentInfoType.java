package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentCodeType;
import urn.ebay.apis.eBLBaseComponents.RefundSourceCodeType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.PaymentStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PendingStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.ReversalReasonCodeType;
import urn.ebay.apis.eBLBaseComponents.SellerDetailsType;
import urn.ebay.apis.eBLBaseComponents.FMFDetailsType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedPaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.ErrorType;
import urn.ebay.apis.eBLBaseComponents.InstrumentDetailsType;
import urn.ebay.apis.eBLBaseComponents.OfferDetailsType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
	private String TransactionID;

	/**
	 * Its Ebay transaction id. EbayTransactionID will returned for
	 * immediate pay item transaction in ECA 	 
	 */ 
	private String EbayTransactionID;

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
	private String ParentTransactionID;

	/**
	 * Receipt ID Character length and limitations: 16 digits in
	 * xxxx-xxxx-xxxx-xxxx format	 
	 */ 
	private String ReceiptID;

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
	private PaymentTransactionCodeType TransactionType;

	/**
	 * The type of payment	 
	 */ 
	private PaymentCodeType PaymentType;

	/**
	 * The type of funding source	 
	 */ 
	private RefundSourceCodeType RefundSourceCodeType;

	/**
	 * eCheck latest expected clear date 	 
	 */ 
	private String ExpectedeCheckClearDate;

	/**
	 * Date and time of payment 	 
	 */ 
	private String PaymentDate;

	/**
	 * Full amount of the customer's payment, before transaction
	 * fee is subtracted	 
	 */ 
	private BasicAmountType GrossAmount;

	/**
	 * Transaction fee associated with the payment 	 
	 */ 
	private BasicAmountType FeeAmount;

	/**
	 * Amount deposited into the account's primary balance after a
	 * currency conversion from automatic conversion through your
	 * Payment Receiving Preferences or manual conversion through
	 * manually accepting a payment. This amount is calculated
	 * after fees and taxes have been assessed. 	 
	 */ 
	private BasicAmountType SettleAmount;

	/**
	 * Amount of tax for transaction 	 
	 */ 
	private BasicAmountType TaxAmount;

	/**
	 * Exchange rate for transaction 	 
	 */ 
	private String ExchangeRate;

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
	private PaymentStatusCodeType PaymentStatus;

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
	private PendingStatusCodeType PendingReason;

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
	private ReversalReasonCodeType ReasonCode;

	/**
	 * HoldDecision is returned in the response only if
	 * PaymentStatus is Completed-Funds-Held. The reason the funds
	 * are kept in pending balance: newsellerpaymenthold: The
	 * seller is new. paymenthold: A hold is placed on your
	 * transaction due to a reason not listed above. 	 
	 */ 
	private String HoldDecision;

	/**
	 * Shipping method selected by the user during check-out. 	 
	 */ 
	private String ShippingMethod;

	/**
	 * Protection Eligibility for this Transaction - None, SPP or
	 * ESPP 	 
	 */ 
	private String ProtectionEligibility;

	/**
	 * Protection Eligibility details for this Transaction 	 
	 */ 
	private String ProtectionEligibilityType;

	/**
	 * Amount of shipping charged on transaction	 
	 */ 
	private String ShipAmount;

	/**
	 * Amount of ship handling charged on transaction	 
	 */ 
	private String ShipHandleAmount;

	/**
	 * Amount of shipping discount on transaction	 
	 */ 
	private String ShipDiscount;

	/**
	 * Amount of Insurance amount on transaction	 
	 */ 
	private String InsuranceAmount;

	/**
	 * Subject as entered in the transaction	 
	 */ 
	private String Subject;

	/**
	 * StoreID as entered in the transaction	 
	 */ 
	private String StoreID;

	/**
	 * TerminalID as entered in the transaction	 
	 */ 
	private String TerminalID;

	/**
	 * Details about the seller. Optional 	 
	 */ 
	private SellerDetailsType SellerDetails;

	/**
	 * Unique identifier and mandatory for each bucket in case of
	 * split payement 	 
	 */ 
	private String PaymentRequestID;

	/**
	 * Thes are filters that could result in accept/deny/pending
	 * action. 	 
	 */ 
	private FMFDetailsType FMFDetails;

	/**
	 * This will be enhanced info for the payment: Example: UATP
	 * details 	 
	 */ 
	private EnhancedPaymentInfoType EnhancedPaymentInfo;

	/**
	 * This will indicate the payment status for individual payment
	 * request in case of split payment 	 
	 */ 
	private ErrorType PaymentError;

	/**
	 * Type of the payment instrument. 	 
	 */ 
	private InstrumentDetailsType InstrumentDetails;

	/**
	 * Offer Details. 	 
	 */ 
	private OfferDetailsType OfferDetails;

	

	/**
	 * Default Constructor
	 */
	public PaymentInfoType (){
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
	 * Getter for EbayTransactionID
	 */
	 public String getEbayTransactionID() {
	 	return EbayTransactionID;
	 }
	 
	/**
	 * Setter for EbayTransactionID
	 */
	 public void setEbayTransactionID(String EbayTransactionID) {
	 	this.EbayTransactionID = EbayTransactionID;
	 }
	 
	/**
	 * Getter for ParentTransactionID
	 */
	 public String getParentTransactionID() {
	 	return ParentTransactionID;
	 }
	 
	/**
	 * Setter for ParentTransactionID
	 */
	 public void setParentTransactionID(String ParentTransactionID) {
	 	this.ParentTransactionID = ParentTransactionID;
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
	 * Getter for TransactionType
	 */
	 public PaymentTransactionCodeType getTransactionType() {
	 	return TransactionType;
	 }
	 
	/**
	 * Setter for TransactionType
	 */
	 public void setTransactionType(PaymentTransactionCodeType TransactionType) {
	 	this.TransactionType = TransactionType;
	 }
	 
	/**
	 * Getter for PaymentType
	 */
	 public PaymentCodeType getPaymentType() {
	 	return PaymentType;
	 }
	 
	/**
	 * Setter for PaymentType
	 */
	 public void setPaymentType(PaymentCodeType PaymentType) {
	 	this.PaymentType = PaymentType;
	 }
	 
	/**
	 * Getter for RefundSourceCodeType
	 */
	 public RefundSourceCodeType getRefundSourceCodeType() {
	 	return RefundSourceCodeType;
	 }
	 
	/**
	 * Setter for RefundSourceCodeType
	 */
	 public void setRefundSourceCodeType(RefundSourceCodeType RefundSourceCodeType) {
	 	this.RefundSourceCodeType = RefundSourceCodeType;
	 }
	 
	/**
	 * Getter for ExpectedeCheckClearDate
	 */
	 public String getExpectedeCheckClearDate() {
	 	return ExpectedeCheckClearDate;
	 }
	 
	/**
	 * Setter for ExpectedeCheckClearDate
	 */
	 public void setExpectedeCheckClearDate(String ExpectedeCheckClearDate) {
	 	this.ExpectedeCheckClearDate = ExpectedeCheckClearDate;
	 }
	 
	/**
	 * Getter for PaymentDate
	 */
	 public String getPaymentDate() {
	 	return PaymentDate;
	 }
	 
	/**
	 * Setter for PaymentDate
	 */
	 public void setPaymentDate(String PaymentDate) {
	 	this.PaymentDate = PaymentDate;
	 }
	 
	/**
	 * Getter for GrossAmount
	 */
	 public BasicAmountType getGrossAmount() {
	 	return GrossAmount;
	 }
	 
	/**
	 * Setter for GrossAmount
	 */
	 public void setGrossAmount(BasicAmountType GrossAmount) {
	 	this.GrossAmount = GrossAmount;
	 }
	 
	/**
	 * Getter for FeeAmount
	 */
	 public BasicAmountType getFeeAmount() {
	 	return FeeAmount;
	 }
	 
	/**
	 * Setter for FeeAmount
	 */
	 public void setFeeAmount(BasicAmountType FeeAmount) {
	 	this.FeeAmount = FeeAmount;
	 }
	 
	/**
	 * Getter for SettleAmount
	 */
	 public BasicAmountType getSettleAmount() {
	 	return SettleAmount;
	 }
	 
	/**
	 * Setter for SettleAmount
	 */
	 public void setSettleAmount(BasicAmountType SettleAmount) {
	 	this.SettleAmount = SettleAmount;
	 }
	 
	/**
	 * Getter for TaxAmount
	 */
	 public BasicAmountType getTaxAmount() {
	 	return TaxAmount;
	 }
	 
	/**
	 * Setter for TaxAmount
	 */
	 public void setTaxAmount(BasicAmountType TaxAmount) {
	 	this.TaxAmount = TaxAmount;
	 }
	 
	/**
	 * Getter for ExchangeRate
	 */
	 public String getExchangeRate() {
	 	return ExchangeRate;
	 }
	 
	/**
	 * Setter for ExchangeRate
	 */
	 public void setExchangeRate(String ExchangeRate) {
	 	this.ExchangeRate = ExchangeRate;
	 }
	 
	/**
	 * Getter for PaymentStatus
	 */
	 public PaymentStatusCodeType getPaymentStatus() {
	 	return PaymentStatus;
	 }
	 
	/**
	 * Setter for PaymentStatus
	 */
	 public void setPaymentStatus(PaymentStatusCodeType PaymentStatus) {
	 	this.PaymentStatus = PaymentStatus;
	 }
	 
	/**
	 * Getter for PendingReason
	 */
	 public PendingStatusCodeType getPendingReason() {
	 	return PendingReason;
	 }
	 
	/**
	 * Setter for PendingReason
	 */
	 public void setPendingReason(PendingStatusCodeType PendingReason) {
	 	this.PendingReason = PendingReason;
	 }
	 
	/**
	 * Getter for ReasonCode
	 */
	 public ReversalReasonCodeType getReasonCode() {
	 	return ReasonCode;
	 }
	 
	/**
	 * Setter for ReasonCode
	 */
	 public void setReasonCode(ReversalReasonCodeType ReasonCode) {
	 	this.ReasonCode = ReasonCode;
	 }
	 
	/**
	 * Getter for HoldDecision
	 */
	 public String getHoldDecision() {
	 	return HoldDecision;
	 }
	 
	/**
	 * Setter for HoldDecision
	 */
	 public void setHoldDecision(String HoldDecision) {
	 	this.HoldDecision = HoldDecision;
	 }
	 
	/**
	 * Getter for ShippingMethod
	 */
	 public String getShippingMethod() {
	 	return ShippingMethod;
	 }
	 
	/**
	 * Setter for ShippingMethod
	 */
	 public void setShippingMethod(String ShippingMethod) {
	 	this.ShippingMethod = ShippingMethod;
	 }
	 
	/**
	 * Getter for ProtectionEligibility
	 */
	 public String getProtectionEligibility() {
	 	return ProtectionEligibility;
	 }
	 
	/**
	 * Setter for ProtectionEligibility
	 */
	 public void setProtectionEligibility(String ProtectionEligibility) {
	 	this.ProtectionEligibility = ProtectionEligibility;
	 }
	 
	/**
	 * Getter for ProtectionEligibilityType
	 */
	 public String getProtectionEligibilityType() {
	 	return ProtectionEligibilityType;
	 }
	 
	/**
	 * Setter for ProtectionEligibilityType
	 */
	 public void setProtectionEligibilityType(String ProtectionEligibilityType) {
	 	this.ProtectionEligibilityType = ProtectionEligibilityType;
	 }
	 
	/**
	 * Getter for ShipAmount
	 */
	 public String getShipAmount() {
	 	return ShipAmount;
	 }
	 
	/**
	 * Setter for ShipAmount
	 */
	 public void setShipAmount(String ShipAmount) {
	 	this.ShipAmount = ShipAmount;
	 }
	 
	/**
	 * Getter for ShipHandleAmount
	 */
	 public String getShipHandleAmount() {
	 	return ShipHandleAmount;
	 }
	 
	/**
	 * Setter for ShipHandleAmount
	 */
	 public void setShipHandleAmount(String ShipHandleAmount) {
	 	this.ShipHandleAmount = ShipHandleAmount;
	 }
	 
	/**
	 * Getter for ShipDiscount
	 */
	 public String getShipDiscount() {
	 	return ShipDiscount;
	 }
	 
	/**
	 * Setter for ShipDiscount
	 */
	 public void setShipDiscount(String ShipDiscount) {
	 	this.ShipDiscount = ShipDiscount;
	 }
	 
	/**
	 * Getter for InsuranceAmount
	 */
	 public String getInsuranceAmount() {
	 	return InsuranceAmount;
	 }
	 
	/**
	 * Setter for InsuranceAmount
	 */
	 public void setInsuranceAmount(String InsuranceAmount) {
	 	this.InsuranceAmount = InsuranceAmount;
	 }
	 
	/**
	 * Getter for Subject
	 */
	 public String getSubject() {
	 	return Subject;
	 }
	 
	/**
	 * Setter for Subject
	 */
	 public void setSubject(String Subject) {
	 	this.Subject = Subject;
	 }
	 
	/**
	 * Getter for StoreID
	 */
	 public String getStoreID() {
	 	return StoreID;
	 }
	 
	/**
	 * Setter for StoreID
	 */
	 public void setStoreID(String StoreID) {
	 	this.StoreID = StoreID;
	 }
	 
	/**
	 * Getter for TerminalID
	 */
	 public String getTerminalID() {
	 	return TerminalID;
	 }
	 
	/**
	 * Setter for TerminalID
	 */
	 public void setTerminalID(String TerminalID) {
	 	this.TerminalID = TerminalID;
	 }
	 
	/**
	 * Getter for SellerDetails
	 */
	 public SellerDetailsType getSellerDetails() {
	 	return SellerDetails;
	 }
	 
	/**
	 * Setter for SellerDetails
	 */
	 public void setSellerDetails(SellerDetailsType SellerDetails) {
	 	this.SellerDetails = SellerDetails;
	 }
	 
	/**
	 * Getter for PaymentRequestID
	 */
	 public String getPaymentRequestID() {
	 	return PaymentRequestID;
	 }
	 
	/**
	 * Setter for PaymentRequestID
	 */
	 public void setPaymentRequestID(String PaymentRequestID) {
	 	this.PaymentRequestID = PaymentRequestID;
	 }
	 
	/**
	 * Getter for FMFDetails
	 */
	 public FMFDetailsType getFMFDetails() {
	 	return FMFDetails;
	 }
	 
	/**
	 * Setter for FMFDetails
	 */
	 public void setFMFDetails(FMFDetailsType FMFDetails) {
	 	this.FMFDetails = FMFDetails;
	 }
	 
	/**
	 * Getter for EnhancedPaymentInfo
	 */
	 public EnhancedPaymentInfoType getEnhancedPaymentInfo() {
	 	return EnhancedPaymentInfo;
	 }
	 
	/**
	 * Setter for EnhancedPaymentInfo
	 */
	 public void setEnhancedPaymentInfo(EnhancedPaymentInfoType EnhancedPaymentInfo) {
	 	this.EnhancedPaymentInfo = EnhancedPaymentInfo;
	 }
	 
	/**
	 * Getter for PaymentError
	 */
	 public ErrorType getPaymentError() {
	 	return PaymentError;
	 }
	 
	/**
	 * Setter for PaymentError
	 */
	 public void setPaymentError(ErrorType PaymentError) {
	 	this.PaymentError = PaymentError;
	 }
	 
	/**
	 * Getter for InstrumentDetails
	 */
	 public InstrumentDetailsType getInstrumentDetails() {
	 	return InstrumentDetails;
	 }
	 
	/**
	 * Setter for InstrumentDetails
	 */
	 public void setInstrumentDetails(InstrumentDetailsType InstrumentDetails) {
	 	this.InstrumentDetails = InstrumentDetails;
	 }
	 
	/**
	 * Getter for OfferDetails
	 */
	 public OfferDetailsType getOfferDetails() {
	 	return OfferDetails;
	 }
	 
	/**
	 * Setter for OfferDetails
	 */
	 public void setOfferDetails(OfferDetailsType OfferDetails) {
	 	this.OfferDetails = OfferDetails;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "&lt![CDATA[\" + n.getNodeValue() + \"]]&gt";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public PaymentInfoType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("TransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))) {
				this.TransactionID = (String)document.getElementsByTagName("TransactionID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("EbayTransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("EbayTransactionID").item(0))) {
				this.EbayTransactionID = (String)document.getElementsByTagName("EbayTransactionID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ParentTransactionID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ParentTransactionID").item(0))) {
				this.ParentTransactionID = (String)document.getElementsByTagName("ParentTransactionID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ReceiptID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ReceiptID").item(0))) {
				this.ReceiptID = (String)document.getElementsByTagName("ReceiptID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("TransactionType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TransactionType").item(0))) {
				this.TransactionType = PaymentTransactionCodeType.fromValue(document.getElementsByTagName("TransactionType").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("PaymentType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentType").item(0))) {
				this.PaymentType = PaymentCodeType.fromValue(document.getElementsByTagName("PaymentType").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("RefundSourceCodeType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("RefundSourceCodeType").item(0))) {
				this.RefundSourceCodeType = RefundSourceCodeType.fromValue(document.getElementsByTagName("RefundSourceCodeType").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("ExpectedeCheckClearDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ExpectedeCheckClearDate").item(0))) {
				this.ExpectedeCheckClearDate = (String)document.getElementsByTagName("ExpectedeCheckClearDate").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("PaymentDate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentDate").item(0))) {
				this.PaymentDate = (String)document.getElementsByTagName("PaymentDate").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("GrossAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("GrossAmount").item(0))) {
				nodeList = document.getElementsByTagName("GrossAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.GrossAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("FeeAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FeeAmount").item(0))) {
				nodeList = document.getElementsByTagName("FeeAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.FeeAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("SettleAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SettleAmount").item(0))) {
				nodeList = document.getElementsByTagName("SettleAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.SettleAmount =  new BasicAmountType(xmlString);
			}
		}
		if(document.getElementsByTagName("TaxAmount").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TaxAmount").item(0))) {
				nodeList = document.getElementsByTagName("TaxAmount");
				xmlString = convertToXML(nodeList.item(0));
				this.TaxAmount =  new BasicAmountType(xmlString);
			}
		}
		if (document.getElementsByTagName("ExchangeRate").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ExchangeRate").item(0))) {
				this.ExchangeRate = (String)document.getElementsByTagName("ExchangeRate").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("PaymentStatus").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentStatus").item(0))) {
				this.PaymentStatus = PaymentStatusCodeType.fromValue(document.getElementsByTagName("PaymentStatus").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("PendingReason").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PendingReason").item(0))) {
				this.PendingReason = PendingStatusCodeType.fromValue(document.getElementsByTagName("PendingReason").item(0).getTextContent());
			}
		}
		if(document.getElementsByTagName("ReasonCode").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ReasonCode").item(0))) {
				this.ReasonCode = ReversalReasonCodeType.fromValue(document.getElementsByTagName("ReasonCode").item(0).getTextContent());
			}
		}
		if (document.getElementsByTagName("HoldDecision").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("HoldDecision").item(0))) {
				this.HoldDecision = (String)document.getElementsByTagName("HoldDecision").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ShippingMethod").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShippingMethod").item(0))) {
				this.ShippingMethod = (String)document.getElementsByTagName("ShippingMethod").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ProtectionEligibility").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProtectionEligibility").item(0))) {
				this.ProtectionEligibility = (String)document.getElementsByTagName("ProtectionEligibility").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ProtectionEligibilityType").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ProtectionEligibilityType").item(0))) {
				this.ProtectionEligibilityType = (String)document.getElementsByTagName("ProtectionEligibilityType").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ShipAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShipAmount").item(0))) {
				this.ShipAmount = (String)document.getElementsByTagName("ShipAmount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ShipHandleAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShipHandleAmount").item(0))) {
				this.ShipHandleAmount = (String)document.getElementsByTagName("ShipHandleAmount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("ShipDiscount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("ShipDiscount").item(0))) {
				this.ShipDiscount = (String)document.getElementsByTagName("ShipDiscount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("InsuranceAmount").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("InsuranceAmount").item(0))) {
				this.InsuranceAmount = (String)document.getElementsByTagName("InsuranceAmount").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("Subject").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Subject").item(0))) {
				this.Subject = (String)document.getElementsByTagName("Subject").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("StoreID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("StoreID").item(0))) {
				this.StoreID = (String)document.getElementsByTagName("StoreID").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("TerminalID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("TerminalID").item(0))) {
				this.TerminalID = (String)document.getElementsByTagName("TerminalID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("SellerDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SellerDetails").item(0))) {
				nodeList = document.getElementsByTagName("SellerDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.SellerDetails =  new SellerDetailsType(xmlString);
			}
		}
		if (document.getElementsByTagName("PaymentRequestID").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestID").item(0))) {
				this.PaymentRequestID = (String)document.getElementsByTagName("PaymentRequestID").item(0).getTextContent();
			}
		}
	
		if(document.getElementsByTagName("FMFDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("FMFDetails").item(0))) {
				nodeList = document.getElementsByTagName("FMFDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.FMFDetails =  new FMFDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("EnhancedPaymentInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("EnhancedPaymentInfo").item(0))) {
				nodeList = document.getElementsByTagName("EnhancedPaymentInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.EnhancedPaymentInfo =  new EnhancedPaymentInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("PaymentError").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentError").item(0))) {
				nodeList = document.getElementsByTagName("PaymentError");
				xmlString = convertToXML(nodeList.item(0));
				this.PaymentError =  new ErrorType(xmlString);
			}
		}
		if(document.getElementsByTagName("InstrumentDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("InstrumentDetails").item(0))) {
				nodeList = document.getElementsByTagName("InstrumentDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.InstrumentDetails =  new InstrumentDetailsType(xmlString);
			}
		}
		if(document.getElementsByTagName("OfferDetails").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("OfferDetails").item(0))) {
				nodeList = document.getElementsByTagName("OfferDetails");
				xmlString = convertToXML(nodeList.item(0));
				this.OfferDetails =  new OfferDetailsType(xmlString);
			}
		}
	}

}