package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * The value of the original authorization identification
 * number returned by a PayPal product. If you are voiding a
 * transaction that has been reauthorized, use the ID from the
 * original authorization, and not the reauthorization.
 * Required Character length and limits: 19 single-byte
 * characters 
 */
public class DoVoidRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * The value of the original authorization identification
	 * number returned by a PayPal product. If you are voiding a
	 * transaction that has been reauthorized, use the ID from the
	 * original authorization, and not the reauthorization.
	 * Required Character length and limits: 19 single-byte
	 * characters	  
	 *@Required	 
	 */ 
	private String authorizationID;

	/**
	 * An informational note about this settlement that is
	 * displayed to the payer in email and in transaction history.
	 * Optional Character length and limits: 255 single-byte
	 * characters	 
	 */ 
	private String note;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoVoidRequestType (String authorizationID){
		this.authorizationID = authorizationID;
	}	

	/**
	 * Default Constructor
	 */
	public DoVoidRequestType (){
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
	 * Getter for note
	 */
	 public String getNote() {
	 	return note;
	 }
	 
	/**
	 * Setter for note
	 */
	 public void setNote(String note) {
	 	this.note = note;
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
		if(note != null) {
			sb.append("<").append(preferredPrefix).append(":Note>").append(SDKUtil.escapeInvalidXmlCharsRegex(note));
			sb.append("</").append(preferredPrefix).append(":Note>");
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