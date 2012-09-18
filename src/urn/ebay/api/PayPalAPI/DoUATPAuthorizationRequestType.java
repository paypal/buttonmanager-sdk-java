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


	/**
	 * UATP card details Required 	  
	 *@Required	 
	 */ 
	private UATPDetailsType UATPDetails;

	/**
	 * Type of transaction to authorize. The only allowable value
	 * is Order, which means that the transaction represents a
	 * customer order that can be fulfilled over 29 days. Optional	 
	 */ 
	private TransactionEntityType TransactionEntity;

	/**
	 * Amount to authorize. Required Limitations: Must not exceed
	 * $10,000 USD in any currency. No currency symbol. Decimal
	 * separator must be a period (.), and the thousands separator
	 * must be a comma (,).	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Invoice ID. A pass through. 	 
	 */ 
	private String InvoiceID;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoUATPAuthorizationRequestType (UATPDetailsType UATPDetails, BasicAmountType Amount){
		this.UATPDetails = UATPDetails;
		this.Amount = Amount;
	}	

	/**
	 * Default Constructor
	 */
	public DoUATPAuthorizationRequestType (){
	}	

	/**
	 * Getter for UATPDetails
	 */
	 public UATPDetailsType getUATPDetails() {
	 	return UATPDetails;
	 }
	 
	/**
	 * Setter for UATPDetails
	 */
	 public void setUATPDetails(UATPDetailsType UATPDetails) {
	 	this.UATPDetails = UATPDetails;
	 }
	 
	/**
	 * Getter for TransactionEntity
	 */
	 public TransactionEntityType getTransactionEntity() {
	 	return TransactionEntity;
	 }
	 
	/**
	 * Setter for TransactionEntity
	 */
	 public void setTransactionEntity(TransactionEntityType TransactionEntity) {
	 	this.TransactionEntity = TransactionEntity;
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
	 * Getter for MsgSubID
	 */
	 public String getMsgSubID() {
	 	return MsgSubID;
	 }
	 
	/**
	 * Setter for MsgSubID
	 */
	 public void setMsgSubID(String MsgSubID) {
	 	this.MsgSubID = MsgSubID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(UATPDetails != null) {
			sb.append("<ebl:UATPDetails>");
			sb.append(UATPDetails.toXMLString());
			sb.append("</ebl:UATPDetails>");
		}
		if(TransactionEntity != null) {
			sb.append("<urn:TransactionEntity>").append(SDKUtil.escapeInvalidXmlCharsRegex(TransactionEntity.getValue()));
			sb.append("</urn:TransactionEntity>");
		}
		if(Amount != null) {
			sb.append("<urn:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if(InvoiceID != null) {
			sb.append("<urn:InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(InvoiceID));
			sb.append("</urn:InvoiceID>");
		}
		if(MsgSubID != null) {
			sb.append("<urn:MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(MsgSubID));
			sb.append("</urn:MsgSubID>");
		}
		return sb.toString();
	}

}