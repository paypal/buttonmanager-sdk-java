package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The value of a previously authorized transaction
 * identification number returned by a PayPal product. You can
 * obtain a buyer's transaction number from the TransactionID
 * element of the PayerInfo structure returned by
 * GetTransactionDetailsResponse. Required Character length and
 * limits: 19 single-byte characters maximum 
 */
public class DoReauthorizationRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The value of a previously authorized transaction
	 * identification number returned by a PayPal product. You can
	 * obtain a buyer's transaction number from the TransactionID
	 * element of the PayerInfo structure returned by
	 * GetTransactionDetailsResponse. Required Character length and
	 * limits: 19 single-byte characters maximum	  
	 *@Required	 
	 */ 
	private String authorizationID;

	/**
	 * Amount to reauthorize. Required Limitations: Must not exceed
	 * $10,000 USD in any currency. No currency symbol. Decimal
	 * separator must be a period (.), and the thousands separator
	 * must be a comma (,).	  
	 *@Required	 
	 */ 
	private BasicAmountType amount;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoReauthorizationRequestType (String authorizationID, BasicAmountType amount){
		this.authorizationID = authorizationID;
		this.amount = amount;
	}	

	/**
	 * Default Constructor
	 */
	public DoReauthorizationRequestType (){
	}	

	/**
	 * Getter for authorizationID
	 */
	 public String getAuthorizationID() {
	 	return authorizationID;
	 }
	 
	/**
	 * Setter for authorizationID
	 */
	 public void setAuthorizationID(String authorizationID) {
	 	this.authorizationID = authorizationID;
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
		if(authorizationID != null) {
			sb.append("<").append(preferredPrefix).append(":AuthorizationID>").append(SDKUtil.escapeInvalidXmlCharsRegex(authorizationID));
			sb.append("</").append(preferredPrefix).append(":AuthorizationID>");
		}
		if(amount != null) {
			sb.append(amount.toXMLString(preferredPrefix,"Amount"));
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