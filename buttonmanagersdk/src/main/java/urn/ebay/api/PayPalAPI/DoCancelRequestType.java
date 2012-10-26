package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.APIType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Msg Sub Id that was used for the orginal operation. 
 */
public class DoCancelRequestType extends AbstractRequestType {


	/**
	 * Msg Sub Id that was used for the orginal operation. 	  
	 *@Required	 
	 */ 
	private String CancelMsgSubID;

	/**
	 * Original API's type	  
	 *@Required	 
	 */ 
	private APIType APIType;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoCancelRequestType (String CancelMsgSubID, APIType APIType){
		this.CancelMsgSubID = CancelMsgSubID;
		this.APIType = APIType;
	}	

	/**
	 * Default Constructor
	 */
	public DoCancelRequestType (){
	}	

	/**
	 * Getter for CancelMsgSubID
	 */
	 public String getCancelMsgSubID() {
	 	return CancelMsgSubID;
	 }
	 
	/**
	 * Setter for CancelMsgSubID
	 */
	 public void setCancelMsgSubID(String CancelMsgSubID) {
	 	this.CancelMsgSubID = CancelMsgSubID;
	 }
	 
	/**
	 * Getter for APIType
	 */
	 public APIType getAPIType() {
	 	return APIType;
	 }
	 
	/**
	 * Setter for APIType
	 */
	 public void setAPIType(APIType APIType) {
	 	this.APIType = APIType;
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
		if(CancelMsgSubID != null) {
			sb.append("<urn:CancelMsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(CancelMsgSubID));
			sb.append("</urn:CancelMsgSubID>");
		}
		if(APIType != null) {
			sb.append("<urn:APIType>").append(SDKUtil.escapeInvalidXmlCharsRegex(APIType.getValue()));
			sb.append("</urn:APIType>");
		}
		if(MsgSubID != null) {
			sb.append("<urn:MsgSubID>").append(SDKUtil.escapeInvalidXmlCharsRegex(MsgSubID));
			sb.append("</urn:MsgSubID>");
		}
		return sb.toString();
	}


}