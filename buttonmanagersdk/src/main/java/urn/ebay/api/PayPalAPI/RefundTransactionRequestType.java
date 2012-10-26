package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.RefundType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.RefundSourceCodeType;
import urn.ebay.apis.eBLBaseComponents.MerchantStoreDetailsType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.InvoiceItemType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Unique identifier of the transaction you are refunding.
 * Optional Character length and limitations: 17 single-byte
 * alphanumeric characters 
 */
public class RefundTransactionRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Unique identifier of the transaction you are refunding.
	 * Optional Character length and limitations: 17 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String transactionID;

	/**
	 * Encrypted PayPal customer account identification number.
	 * Optional Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String payerID;

	/**
	 * Invoice number corresponding to transaction details for
	 * tracking the refund of a payment. This parameter is passed
	 * by the merchant or recipient while refunding the
	 * transaction. This parameter does not affect the business
	 * logic, it is persisted in the DB for transaction reference
	 * Optional 	 
	 */ 
	private String invoiceID;

	/**
	 * Type of refund you are making Required 	 
	 */ 
	private RefundType refundType;

	/**
	 * Refund amount. Amount is required if RefundType is Partial.
	 * NOTE: If RefundType is Full, do not set Amount.	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Custom memo about the refund. Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters	 
	 */ 
	private String memo;

	/**
	 * The maximum time till which refund must be tried. Optional 	 
	 */ 
	private String retryUntil;

	/**
	 * The type of funding source for refund. Optional 	 
	 */ 
	private RefundSourceCodeType refundSource;

	/**
	 * Flag to indicate that the customer was already given store
	 * credit for a given transaction. This will allow us to make
	 * sure we do not double refund. Optional 	 
	 */ 
	private Boolean refundAdvice;

	/**
	 * To pass the Merchant store informationOptional 	 
	 */ 
	private MerchantStoreDetailsType merchantStoreDetails;

	/**
	 * Information about the individual details of the items to be
	 * refunded.Optional 	 
	 */ 
	private List<InvoiceItemType> refundItemDetails = new ArrayList<InvoiceItemType>();

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Default Constructor
	 */
	public RefundTransactionRequestType (){
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
	 * Getter for payerID
	 */
	 public String getPayerID() {
	 	return payerID;
	 }
	 
	/**
	 * Setter for payerID
	 */
	 public void setPayerID(String payerID) {
	 	this.payerID = payerID;
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
	 * Getter for refundType
	 */
	 public RefundType getRefundType() {
	 	return refundType;
	 }
	 
	/**
	 * Setter for refundType
	 */
	 public void setRefundType(RefundType refundType) {
	 	this.refundType = refundType;
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
	 * Getter for retryUntil
	 */
	 public String getRetryUntil() {
	 	return retryUntil;
	 }
	 
	/**
	 * Setter for retryUntil
	 */
	 public void setRetryUntil(String retryUntil) {
	 	this.retryUntil = retryUntil;
	 }
	 
	/**
	 * Getter for refundSource
	 */
	 public RefundSourceCodeType getRefundSource() {
	 	return refundSource;
	 }
	 
	/**
	 * Setter for refundSource
	 */
	 public void setRefundSource(RefundSourceCodeType refundSource) {
	 	this.refundSource = refundSource;
	 }
	 
	/**
	 * Getter for refundAdvice
	 */
	 public Boolean getRefundAdvice() {
	 	return refundAdvice;
	 }
	 
	/**
	 * Setter for refundAdvice
	 */
	 public void setRefundAdvice(Boolean refundAdvice) {
	 	this.refundAdvice = refundAdvice;
	 }
	 
	/**
	 * Getter for merchantStoreDetails
	 */
	 public MerchantStoreDetailsType getMerchantStoreDetails() {
	 	return merchantStoreDetails;
	 }
	 
	/**
	 * Setter for merchantStoreDetails
	 */
	 public void setMerchantStoreDetails(MerchantStoreDetailsType merchantStoreDetails) {
	 	this.merchantStoreDetails = merchantStoreDetails;
	 }
	 
	/**
	 * Getter for refundItemDetails
	 */
	 public List<InvoiceItemType> getRefundItemDetails() {
	 	return refundItemDetails;
	 }
	 
	/**
	 * Setter for refundItemDetails
	 */
	 public void setRefundItemDetails(List<InvoiceItemType> refundItemDetails) {
	 	this.refundItemDetails = refundItemDetails;
	 }
	 
	/**
	 * Getter for msgSubID
	 */
	 public String getMsgSubID() {
	 	return msgSubID;
	 }
	 
	/**
	 * Setter for msgSubID
	 */
	 public void setMsgSubID(String msgSubID) {
	 	this.msgSubID = msgSubID;
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
		if(transactionID != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(transactionID));
			sb.append("</").append(preferredPrefix).append(":TransactionID>");
		}
		if(payerID != null) {
			sb.append("<").append(preferredPrefix).append(":PayerID>").append(SDKUtil.escapeInvalidXmlCharsRegex(payerID));
			sb.append("</").append(preferredPrefix).append(":PayerID>");
		}
		if(invoiceID != null) {
			sb.append("<").append(preferredPrefix).append(":InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoiceID));
			sb.append("</").append(preferredPrefix).append(":InvoiceID>");
		}
		if(refundType != null) {
			sb.append("<").append(preferredPrefix).append(":RefundType>").append(SDKUtil.escapeInvalidXmlCharsRegex(refundType.getValue()));
			sb.append("</").append(preferredPrefix).append(":RefundType>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(memo != null) {
			sb.append("<").append(preferredPrefix).append(":Memo>").append(SDKUtil.escapeInvalidXmlCharsRegex(memo));
			sb.append("</").append(preferredPrefix).append(":Memo>");
		}
		if(retryUntil != null) {
			sb.append("<").append(preferredPrefix).append(":RetryUntil>").append(SDKUtil.escapeInvalidXmlCharsRegex(retryUntil));
			sb.append("</").append(preferredPrefix).append(":RetryUntil>");
		}
		if(refundSource != null) {
			sb.append("<").append(preferredPrefix).append(":RefundSource>").append(SDKUtil.escapeInvalidXmlCharsRegex(refundSource.getValue()));
			sb.append("</").append(preferredPrefix).append(":RefundSource>");
		}
		if(refundAdvice != null) {
			sb.append("<").append(preferredPrefix).append(":RefundAdvice>").append(SDKUtil.escapeInvalidXmlCharsRegex(refundAdvice));
			sb.append("</").append(preferredPrefix).append(":RefundAdvice>");
		}
		if(merchantStoreDetails != null) {
			sb.append(merchantStoreDetails.toXMLString(null,"MerchantStoreDetails"));
		}
		if(refundItemDetails != null) {
			for(int i=0; i < refundItemDetails.size(); i++) {
				sb.append(refundItemDetails.get(i).toXMLString(null,"RefundItemDetails"));
			}
		}
		if(msgSubID != null) {
			sb.append("<").append(preferredPrefix).append(":MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(msgSubID));
			sb.append("</").append(preferredPrefix).append(":MsgSubID>");
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