package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.APIType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Msg Sub Id that was used for the orginal operation. 
 */
public class DoCancelRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Msg Sub Id that was used for the orginal operation. 	  
	 *@Required	 
	 */ 
	private String cancelMsgSubID;

	/**
	 * Original API's type	  
	 *@Required	 
	 */ 
	private APIType aPIType;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoCancelRequestType (String cancelMsgSubID, APIType aPIType){
		this.cancelMsgSubID = cancelMsgSubID;
		this.aPIType = aPIType;
	}	

	/**
	 * Default Constructor
	 */
	public DoCancelRequestType (){
	}	

	/**
	 * Getter for cancelMsgSubID
	 */
	 public String getCancelMsgSubID() {
	 	return cancelMsgSubID;
	 }
	 
	/**
	 * Setter for cancelMsgSubID
	 */
	 public void setCancelMsgSubID(String cancelMsgSubID) {
	 	this.cancelMsgSubID = cancelMsgSubID;
	 }
	 
	/**
	 * Getter for aPIType
	 */
	 public APIType getAPIType() {
	 	return aPIType;
	 }
	 
	/**
	 * Setter for aPIType
	 */
	 public void setAPIType(APIType aPIType) {
	 	this.aPIType = aPIType;
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
		if(cancelMsgSubID != null) {
			sb.append("<").append(preferredPrefix).append(":CancelMsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(cancelMsgSubID));
			sb.append("</").append(preferredPrefix).append(":CancelMsgSubID>");
		}
		if(aPIType != null) {
			sb.append("<").append(preferredPrefix).append(":APIType>").append(SDKUtil.escapeInvalidXmlCharsRegex(aPIType.getValue()));
			sb.append("</").append(preferredPrefix).append(":APIType>");
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