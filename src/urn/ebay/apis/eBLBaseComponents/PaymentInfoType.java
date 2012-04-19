
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.EnhancedDataTypes.EnhancedPaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.ErrorType;
import urn.ebay.apis.eBLBaseComponents.FMFDetailsType;
import urn.ebay.apis.eBLBaseComponents.InstrumentDetailsType;
import urn.ebay.apis.eBLBaseComponents.OfferDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionCodeType;
import urn.ebay.apis.eBLBaseComponents.PendingStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.RefundSourceCodeType;
import urn.ebay.apis.eBLBaseComponents.ReversalReasonCodeType;
import urn.ebay.apis.eBLBaseComponents.SellerDetailsType;


/**
 * PaymentInfoType 
 * Payment information.
 */
public class PaymentInfoType {

	/**
A transaction identification number. 
Character length and limits: 19 single-byte characters maximum
	 */
	private String TransactionID;
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String value) {
		this.TransactionID = value;
	}

	/**
Its Ebay transaction id.
	 * EbayTransactionID will returned for immediate pay item transaction in ECA 
	 */
	private String EbayTransactionID;
	public String getEbayTransactionID() {
		return EbayTransactionID;
	}
	public void setEbayTransactionID(String value) {
		this.EbayTransactionID = value;
	}

	/**
	 * Parent or related transaction identification number. This field is populated for the following transaction types: 
	 * Reversal
	 * Capture of an authorized transaction.
	 * Reauthorization of a transaction.
	 * Capture of an order. The value of ParentTransactionID is the original OrderID.
	 * Authorization of an order. The value of ParentTransactionID is the original OrderID.
	 * Capture of an order authorization.
	 * Void of an order. The value of ParentTransactionID is the original OrderID.
	 * Character length and limits: 19 single-byte characters maximum	 */
	private String ParentTransactionID;
	public String getParentTransactionID() {
		return ParentTransactionID;
	}
	public void setParentTransactionID(String value) {
		this.ParentTransactionID = value;
	}

	/**
	 * Receipt ID 
	 * Character length and limitations: 16 digits in xxxx-xxxx-xxxx-xxxx format	 */
	private String ReceiptID;
	public String getReceiptID() {
		return ReceiptID;
	}
	public void setReceiptID(String value) {
		this.ReceiptID = value;
	}

	/**
	 * The type of transaction 
	 * cart: Transaction created via the PayPal Shopping Cart feature or by Express Checkout with multiple purchased item
	 * express-checkout: Transaction created by Express Checkout with a single purchased items
	 * send-money: Transaction created by customer from the Send Money tab on the PayPal website.
	 * web-accept: Transaction created by customer via Buy Now, Donation, or Auction Smart Logos.
	 * subscr-*: Transaction created by customer via Subscription. eot means "end of subscription term."
	 * merch-pmt: preapproved payment.
	 * mass-pay: Transaction created via MassPay.
	 * virtual-terminal: Transaction created via merchant virtual terminal.
	 * credit: Transaction created via merchant virtual terminal or API to credit a customer.
	 */
	private PaymentTransactionCodeType TransactionType;
	public PaymentTransactionCodeType getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(PaymentTransactionCodeType value) {
		this.TransactionType = value;
	}

	/**
	 * The type of payment	 */
	private PaymentCodeType PaymentType;
	public PaymentCodeType getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(PaymentCodeType value) {
		this.PaymentType = value;
	}

	/**
	 * The type of funding source	 */
	private RefundSourceCodeType RefundSourceCodeType;
	public RefundSourceCodeType getRefundSourceCodeType() {
		return RefundSourceCodeType;
	}
	public void setRefundSourceCodeType(RefundSourceCodeType value) {
		this.RefundSourceCodeType = value;
	}

	/**
	 * eCheck latest expected clear date 	 */
	private String ExpectedeCheckClearDate;
	public String getExpectedeCheckClearDate() {
		return ExpectedeCheckClearDate;
	}
	public void setExpectedeCheckClearDate(String value) {
		this.ExpectedeCheckClearDate = value;
	}

	/**
	 * Date and time of payment 	 */
	private String PaymentDate;
	public String getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(String value) {
		this.PaymentDate = value;
	}

	/**
	 * Full amount of the customer's payment, before transaction fee is subtracted	 */
	private BasicAmountType GrossAmount;
	public BasicAmountType getGrossAmount() {
		return GrossAmount;
	}
	public void setGrossAmount(BasicAmountType value) {
		this.GrossAmount = value;
	}

	/**
	 * Transaction fee associated with the payment 	 */
	private BasicAmountType FeeAmount;
	public BasicAmountType getFeeAmount() {
		return FeeAmount;
	}
	public void setFeeAmount(BasicAmountType value) {
		this.FeeAmount = value;
	}

	/**
Amount deposited into the account's primary balance after a currency conversion from automatic conversion through your Payment Receiving Preferences or manual conversion through manually accepting a payment. This amount is calculated after fees and taxes have been assessed. 	 */
	private BasicAmountType SettleAmount;
	public BasicAmountType getSettleAmount() {
		return SettleAmount;
	}
	public void setSettleAmount(BasicAmountType value) {
		this.SettleAmount = value;
	}

	/**
	 * Amount of tax for transaction 	 */
	private BasicAmountType TaxAmount;
	public BasicAmountType getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(BasicAmountType value) {
		this.TaxAmount = value;
	}

	/**
	 * Exchange rate for transaction 	 */
	private String ExchangeRate;
	public String getExchangeRate() {
		return ExchangeRate;
	}
	public void setExchangeRate(String value) {
		this.ExchangeRate = value;
	}

	/**
	 * The status of the payment:
	 * None: No status
	 * Created: A giropay payment has been initiated.
	 * Canceled-Reversal: A reversal has been canceled. For example, you won a dispute with the customer, and the funds for the transaction that was reversed have been returned to you.
	 * Completed: The payment has been completed, and the funds have been added successfully to your account balance.
	 * Denied: You denied the payment. This happens only if the payment was previously pending because of possible reasons described for the PendingReason element.
	 * Expired: This authorization has expired and cannot be captured.
	 * Failed: The payment has failed. This happens only if the payment was made from your customer's bank account.
	 * In-Progress: The transaction is in process of authorization and capture.
	 * Partially-Refunded: The transaction has been partially refunded.
	 * Pending: The payment is pending. See "PendingReason" for more information.
	 * Refunded: You refunded the payment.
	 * Reversed: A payment was reversed due to a chargeback or other type of reversal. The funds have been removed from your account balance and returned to the buyer. The reason for the reversal is specified in the ReasonCode element.
	 * Processed: A payment has been accepted.
	 * Voided: This authorization has been voided.
	 * Completed-Funds-Held: The payment has been completed, and the funds have been added successfully to your pending balance. See the "HoldDecision" field for more information.
	 */
	private PaymentStatusCodeType PaymentStatus;
	public PaymentStatusCodeType getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(PaymentStatusCodeType value) {
		this.PaymentStatus = value;
	}

	/**
	 * The reason the payment is pending: 
none: No pending reason
	 * address: The payment is pending because your customer did not include a confirmed shipping address and your Payment Receiving Preferences is set such that you want to manually accept or deny each of these payments. To change your preference, go to the Preferences section of your Profile.
	 * authorization: You set PaymentAction to Authorization on SetExpressCheckoutRequest and have not yet captured funds.
	 * echeck: The payment is pending because it was made by an eCheck that has not yet cleared.
	 * intl: The payment is pending because you hold a non-U.S. account and do not have a withdrawal mechanism. You must manually accept or deny this payment from your Account Overview.
	 * multi-currency: You do not have a balance in the currency sent, and you do not have your Payment Receiving Preferences set to automatically convert and accept this payment. You must manually accept or deny this payment.
	 * unilateral: The payment is pending because it was made to an email address that is not yet registered or confirmed.
	 * upgrade: The payment is pending because it was made via credit card and you must upgrade your account to Business or Premier status in order to receive the funds. upgrade can also mean that you have reached the monthly limit for transactions on your account.
	 * verify: The payment is pending because you are not yet verified. You must verify your account before you can accept this payment.
	 * other: The payment is pending for a reason other than those listed above. For more information, contact PayPal Customer Service.
	 */
	private PendingStatusCodeType PendingReason;
	public PendingStatusCodeType getPendingReason() {
		return PendingReason;
	}
	public void setPendingReason(PendingStatusCodeType value) {
		this.PendingReason = value;
	}

	/**
	 * The reason for a reversal if TransactionType is reversal: 
none: No reason code
	 * chargeback: A reversal has occurred on this transaction due to a chargeback by your customer.
	 * guarantee: A reversal has occurred on this transaction due to your customer triggering a money-back guarantee.
	 * buyer-complaint: A reversal has occurred on this transaction due to a complaint about the transaction from your customer.
	 * refund: A reversal has occurred on this transaction because you have given the customer a refund.
	 * other: A reversal has occurred on this transaction due to a reason not listed above.
	 */
	private ReversalReasonCodeType ReasonCode;
	public ReversalReasonCodeType getReasonCode() {
		return ReasonCode;
	}
	public void setReasonCode(ReversalReasonCodeType value) {
		this.ReasonCode = value;
	}

	/**
	 * HoldDecision is returned in the response only if PaymentStatus is Completed-Funds-Held. The reason the funds are kept in pending balance: 
newsellerpaymenthold: The seller is new.
	 * paymenthold: A hold is placed on your transaction due to a reason not listed above.
	 */
	private String HoldDecision;
	public String getHoldDecision() {
		return HoldDecision;
	}
	public void setHoldDecision(String value) {
		this.HoldDecision = value;
	}

	/**
	 * Shipping method selected by the user during check-out.
	 */
	private String ShippingMethod;
	public String getShippingMethod() {
		return ShippingMethod;
	}
	public void setShippingMethod(String value) {
		this.ShippingMethod = value;
	}

	/**
	 * Protection Eligibility for this Transaction - None, SPP or ESPP
	 */
	private String ProtectionEligibility;
	public String getProtectionEligibility() {
		return ProtectionEligibility;
	}
	public void setProtectionEligibility(String value) {
		this.ProtectionEligibility = value;
	}

	/**
	 * Protection Eligibility details  for this Transaction
	 */
	private String ProtectionEligibilityType;
	public String getProtectionEligibilityType() {
		return ProtectionEligibilityType;
	}
	public void setProtectionEligibilityType(String value) {
		this.ProtectionEligibilityType = value;
	}

	/**
	 * Amount of shipping charged on transaction	 */
	private String ShipAmount;
	public String getShipAmount() {
		return ShipAmount;
	}
	public void setShipAmount(String value) {
		this.ShipAmount = value;
	}

	/**
	 * Amount of ship handling charged on transaction	 */
	private String ShipHandleAmount;
	public String getShipHandleAmount() {
		return ShipHandleAmount;
	}
	public void setShipHandleAmount(String value) {
		this.ShipHandleAmount = value;
	}

	/**
	 * Amount of shipping discount on transaction	 */
	private String ShipDiscount;
	public String getShipDiscount() {
		return ShipDiscount;
	}
	public void setShipDiscount(String value) {
		this.ShipDiscount = value;
	}

	/**
	 * Amount of Insurance amount on transaction	 */
	private String InsuranceAmount;
	public String getInsuranceAmount() {
		return InsuranceAmount;
	}
	public void setInsuranceAmount(String value) {
		this.InsuranceAmount = value;
	}

	/**
	 * Subject as entered in the transaction	 */
	private String Subject;
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String value) {
		this.Subject = value;
	}

	/**
	 * StoreID as entered in the transaction	 */
	private String StoreID;
	public String getStoreID() {
		return StoreID;
	}
	public void setStoreID(String value) {
		this.StoreID = value;
	}

	/**
	 * TerminalID as entered in the transaction	 */
	private String TerminalID;
	public String getTerminalID() {
		return TerminalID;
	}
	public void setTerminalID(String value) {
		this.TerminalID = value;
	}

	/**
	 * Details about the seller.
	 * Optional 
	 */
	private SellerDetailsType SellerDetails;
	public SellerDetailsType getSellerDetails() {
		return SellerDetails;
	}
	public void setSellerDetails(SellerDetailsType value) {
		this.SellerDetails = value;
	}

	/**
	 * Unique identifier and mandatory for each bucket in case of split payement
	 */
	private String PaymentRequestID;
	public String getPaymentRequestID() {
		return PaymentRequestID;
	}
	public void setPaymentRequestID(String value) {
		this.PaymentRequestID = value;
	}

	/**
	 * Thes are filters that could result in accept/deny/pending action.
	 */
	private FMFDetailsType FMFDetails;
	public FMFDetailsType getFMFDetails() {
		return FMFDetails;
	}
	public void setFMFDetails(FMFDetailsType value) {
		this.FMFDetails = value;
	}

	/**
	 * This will be enhanced info for the payment: Example: UATP details
	 */
	private EnhancedPaymentInfoType EnhancedPaymentInfo;
	public EnhancedPaymentInfoType getEnhancedPaymentInfo() {
		return EnhancedPaymentInfo;
	}
	public void setEnhancedPaymentInfo(EnhancedPaymentInfoType value) {
		this.EnhancedPaymentInfo = value;
	}

	/**
	 * This will indicate the payment status for individual payment request in case of split payment
	 */
	private ErrorType PaymentError;
	public ErrorType getPaymentError() {
		return PaymentError;
	}
	public void setPaymentError(ErrorType value) {
		this.PaymentError = value;
	}

	/**
	 * Type of the payment instrument.
	 */
	private InstrumentDetailsType InstrumentDetails;
	public InstrumentDetailsType getInstrumentDetails() {
		return InstrumentDetails;
	}
	public void setInstrumentDetails(InstrumentDetailsType value) {
		this.InstrumentDetails = value;
	}

	/**
	 * Offer Details.
	 */
	private OfferDetailsType OfferDetails;
	public OfferDetailsType getOfferDetails() {
		return OfferDetails;
	}
	public void setOfferDetails(OfferDetailsType value) {
		this.OfferDetails = value;
	}


	public PaymentInfoType() {
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
			  return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		 } 
		 if (name.startsWith("#")) {
			  return "";
		} 
		 StringBuffer sb = new StringBuffer();
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public PaymentInfoType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("TransactionID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TransactionID").item(0))){ 
		 this.TransactionID =(String)document.getElementsByTagName("TransactionID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("EbayTransactionID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("EbayTransactionID").item(0))){ 
		 this.EbayTransactionID =(String)document.getElementsByTagName("EbayTransactionID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ParentTransactionID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ParentTransactionID").item(0))){ 
		 this.ParentTransactionID =(String)document.getElementsByTagName("ParentTransactionID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ReceiptID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ReceiptID").item(0))){ 
		 this.ReceiptID =(String)document.getElementsByTagName("ReceiptID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TransactionType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TransactionType").item(0))){ 
		 this.TransactionType = PaymentTransactionCodeType.fromValue(document.getElementsByTagName("TransactionType").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("PaymentType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentType").item(0))){ 
		 this.PaymentType = PaymentCodeType.fromValue(document.getElementsByTagName("PaymentType").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("RefundSourceCodeType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("RefundSourceCodeType").item(0))){ 
		 this.RefundSourceCodeType = RefundSourceCodeType.fromValue(document.getElementsByTagName("RefundSourceCodeType").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ExpectedeCheckClearDate").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ExpectedeCheckClearDate").item(0))){ 
		 this.ExpectedeCheckClearDate =(String)document.getElementsByTagName("ExpectedeCheckClearDate").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentDate").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentDate").item(0))){ 
		 this.PaymentDate =(String)document.getElementsByTagName("PaymentDate").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("GrossAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("GrossAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("GrossAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.GrossAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("FeeAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("FeeAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("FeeAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.FeeAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("SettleAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SettleAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("SettleAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.SettleAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("TaxAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TaxAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("TaxAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.TaxAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("ExchangeRate").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ExchangeRate").item(0))){ 
		 this.ExchangeRate =(String)document.getElementsByTagName("ExchangeRate").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentStatus").item(0))){ 
		 this.PaymentStatus = PaymentStatusCodeType.fromValue(document.getElementsByTagName("PaymentStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("PendingReason").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PendingReason").item(0))){ 
		 this.PendingReason = PendingStatusCodeType.fromValue(document.getElementsByTagName("PendingReason").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ReasonCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ReasonCode").item(0))){ 
		 this.ReasonCode = ReversalReasonCodeType.fromValue(document.getElementsByTagName("ReasonCode").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("HoldDecision").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("HoldDecision").item(0))){ 
		 this.HoldDecision =(String)document.getElementsByTagName("HoldDecision").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ShippingMethod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShippingMethod").item(0))){ 
		 this.ShippingMethod =(String)document.getElementsByTagName("ShippingMethod").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ProtectionEligibility").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProtectionEligibility").item(0))){ 
		 this.ProtectionEligibility =(String)document.getElementsByTagName("ProtectionEligibility").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ProtectionEligibilityType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ProtectionEligibilityType").item(0))){ 
		 this.ProtectionEligibilityType =(String)document.getElementsByTagName("ProtectionEligibilityType").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ShipAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShipAmount").item(0))){ 
		 this.ShipAmount =(String)document.getElementsByTagName("ShipAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ShipHandleAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShipHandleAmount").item(0))){ 
		 this.ShipHandleAmount =(String)document.getElementsByTagName("ShipHandleAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ShipDiscount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShipDiscount").item(0))){ 
		 this.ShipDiscount =(String)document.getElementsByTagName("ShipDiscount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("InsuranceAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InsuranceAmount").item(0))){ 
		 this.InsuranceAmount =(String)document.getElementsByTagName("InsuranceAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Subject").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Subject").item(0))){ 
		 this.Subject =(String)document.getElementsByTagName("Subject").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("StoreID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("StoreID").item(0))){ 
		 this.StoreID =(String)document.getElementsByTagName("StoreID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TerminalID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TerminalID").item(0))){ 
		 this.TerminalID =(String)document.getElementsByTagName("TerminalID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("SellerDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SellerDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("SellerDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.SellerDetails =  new SellerDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("PaymentRequestID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestID").item(0))){ 
		 this.PaymentRequestID =(String)document.getElementsByTagName("PaymentRequestID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("FMFDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("FMFDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("FMFDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.FMFDetails =  new FMFDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("EnhancedPaymentInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("EnhancedPaymentInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("EnhancedPaymentInfo");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.EnhancedPaymentInfo =  new EnhancedPaymentInfoType(xmlString);

}
	}
		 if(document.getElementsByTagName("PaymentError").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentError").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentError");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PaymentError =  new ErrorType(xmlString);

}
	}
		 if(document.getElementsByTagName("InstrumentDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InstrumentDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("InstrumentDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.InstrumentDetails =  new InstrumentDetailsType(xmlString);

}
	}
		 if(document.getElementsByTagName("OfferDetails").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("OfferDetails").item(0))){ 
		 nodeList = document.getElementsByTagName("OfferDetails");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.OfferDetails =  new OfferDetailsType(xmlString);

}
	}
	}
}
