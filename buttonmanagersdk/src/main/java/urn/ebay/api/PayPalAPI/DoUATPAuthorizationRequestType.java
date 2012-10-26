package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.UATPDetailsType;
import urn.ebay.apis.eBLBaseComponents.TransactionEntityType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * UATP card details Required 
 */
public class DoUATPAuthorizationRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * UATP card details Required 	  
	 *@Required	 
	 */ 
	private UATPDetailsType uATPDetails;

	/**
	 * Type of transaction to authorize. The only allowable value
	 * is Order, which means that the transaction represents a
	 * customer order that can be fulfilled over 29 days. Optional	 
	 */ 
	private TransactionEntityType transactionEntity;

	/**
	 * Amount to authorize. Required Limitations: Must not exceed
	 * $10,000 USD in any currency. No currency symbol. Decimal
	 * separator must be a period (.), and the thousands separator
	 * must be a comma (,).	  
	 *@Required	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Invoice ID. A pass through. 	 
	 */ 
	private String invoiceID;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoUATPAuthorizationRequestType (UATPDetailsType uATPDetails, BasicAmountType amount){
		this.uATPDetails = uATPDetails;
		this.amount = amount;
	}	

	/**
	 * Default Constructor
	 */
	public DoUATPAuthorizationRequestType (){
	}	

	/**
	 * Getter for uATPDetails
	 */
	 public UATPDetailsType getUATPDetails() {
	 	return uATPDetails;
	 }
	 
	/**
	 * Setter for uATPDetails
	 */
	 public void setUATPDetails(UATPDetailsType uATPDetails) {
	 	this.uATPDetails = uATPDetails;
	 }
	 
	/**
	 * Getter for transactionEntity
	 */
	 public TransactionEntityType getTransactionEntity() {
	 	return transactionEntity;
	 }
	 
	/**
	 * Setter for transactionEntity
	 */
	 public void setTransactionEntity(TransactionEntityType transactionEntity) {
	 	this.transactionEntity = transactionEntity;
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
		if(uATPDetails != null) {
			sb.append(uATPDetails.toXMLString(null,"UATPDetails"));
		}
		if(transactionEntity != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionEntity>").append(SDKUtil.escapeInvalidXmlCharsRegex(transactionEntity.getValue()));
			sb.append("</").append(preferredPrefix).append(":TransactionEntity>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
		}
		if(invoiceID != null) {
			sb.append("<").append(preferredPrefix).append(":InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoiceID));
			sb.append("</").append(preferredPrefix).append(":InvoiceID>");
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