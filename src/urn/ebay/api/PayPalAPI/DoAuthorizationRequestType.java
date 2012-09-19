package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.TransactionEntityType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The value of the order’s transaction identification number
 * returned by a PayPal product. Required Character length and
 * limits: 19 single-byte characters maximum 
 */
public class DoAuthorizationRequestType extends AbstractRequestType {


	/**
	 * The value of the order’s transaction identification number
	 * returned by a PayPal product. Required Character length and
	 * limits: 19 single-byte characters maximum	  
	 *@Required	 
	 */ 
	private String TransactionID;

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
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoAuthorizationRequestType (String TransactionID, BasicAmountType Amount){
		this.TransactionID = TransactionID;
		this.Amount = Amount;
	}	

	/**
	 * Default Constructor
	 */
	public DoAuthorizationRequestType (){
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
		if(TransactionID != null) {
			sb.append("<urn:TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(TransactionID));
			sb.append("</urn:TransactionID>");
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
		if(MsgSubID != null) {
			sb.append("<urn:MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(MsgSubID));
			sb.append("</urn:MsgSubID>");
		}
		return sb.toString();
	}


}