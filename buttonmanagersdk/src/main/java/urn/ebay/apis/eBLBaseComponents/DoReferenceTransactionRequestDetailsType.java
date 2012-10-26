package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.ReferenceCreditCardDetailsType;
import urn.ebay.apis.eBLBaseComponents.SenderDetailsType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoReferenceTransactionRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String referenceID;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private PaymentActionCodeType paymentAction;

	/**
	 * 	 
	 */ 
	private MerchantPullPaymentCodeType paymentType;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private PaymentDetailsType paymentDetails;

	/**
	 * 	 
	 */ 
	private ReferenceCreditCardDetailsType creditCard;

	/**
	 * 	 
	 */ 
	private String iPAddress;

	/**
	 * 	 
	 */ 
	private String merchantSessionId;

	/**
	 * 	 
	 */ 
	private String reqConfirmShipping;

	/**
	 * 	 
	 */ 
	private String softDescriptor;

	/**
	 * 	 
	 */ 
	private SenderDetailsType senderDetails;

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String msgSubID;

	

	/**
	 * Constructor with arguments
	 */
	public DoReferenceTransactionRequestDetailsType (String referenceID, PaymentActionCodeType paymentAction, PaymentDetailsType paymentDetails){
		this.referenceID = referenceID;
		this.paymentAction = paymentAction;
		this.paymentDetails = paymentDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionRequestDetailsType (){
	}	

	/**
	 * Getter for referenceID
	 */
	 public String getReferenceID() {
	 	return referenceID;
	 }
	 
	/**
	 * Setter for referenceID
	 */
	 public void setReferenceID(String referenceID) {
	 	this.referenceID = referenceID;
	 }
	 
	/**
	 * Getter for paymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return paymentAction;
	 }
	 
	/**
	 * Setter for paymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType paymentAction) {
	 	this.paymentAction = paymentAction;
	 }
	 
	/**
	 * Getter for paymentType
	 */
	 public MerchantPullPaymentCodeType getPaymentType() {
	 	return paymentType;
	 }
	 
	/**
	 * Setter for paymentType
	 */
	 public void setPaymentType(MerchantPullPaymentCodeType paymentType) {
	 	this.paymentType = paymentType;
	 }
	 
	/**
	 * Getter for paymentDetails
	 */
	 public PaymentDetailsType getPaymentDetails() {
	 	return paymentDetails;
	 }
	 
	/**
	 * Setter for paymentDetails
	 */
	 public void setPaymentDetails(PaymentDetailsType paymentDetails) {
	 	this.paymentDetails = paymentDetails;
	 }
	 
	/**
	 * Getter for creditCard
	 */
	 public ReferenceCreditCardDetailsType getCreditCard() {
	 	return creditCard;
	 }
	 
	/**
	 * Setter for creditCard
	 */
	 public void setCreditCard(ReferenceCreditCardDetailsType creditCard) {
	 	this.creditCard = creditCard;
	 }
	 
	/**
	 * Getter for iPAddress
	 */
	 public String getIPAddress() {
	 	return iPAddress;
	 }
	 
	/**
	 * Setter for iPAddress
	 */
	 public void setIPAddress(String iPAddress) {
	 	this.iPAddress = iPAddress;
	 }
	 
	/**
	 * Getter for merchantSessionId
	 */
	 public String getMerchantSessionId() {
	 	return merchantSessionId;
	 }
	 
	/**
	 * Setter for merchantSessionId
	 */
	 public void setMerchantSessionId(String merchantSessionId) {
	 	this.merchantSessionId = merchantSessionId;
	 }
	 
	/**
	 * Getter for reqConfirmShipping
	 */
	 public String getReqConfirmShipping() {
	 	return reqConfirmShipping;
	 }
	 
	/**
	 * Setter for reqConfirmShipping
	 */
	 public void setReqConfirmShipping(String reqConfirmShipping) {
	 	this.reqConfirmShipping = reqConfirmShipping;
	 }
	 
	/**
	 * Getter for softDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return softDescriptor;
	 }
	 
	/**
	 * Setter for softDescriptor
	 */
	 public void setSoftDescriptor(String softDescriptor) {
	 	this.softDescriptor = softDescriptor;
	 }
	 
	/**
	 * Getter for senderDetails
	 */
	 public SenderDetailsType getSenderDetails() {
	 	return senderDetails;
	 }
	 
	/**
	 * Setter for senderDetails
	 */
	 public void setSenderDetails(SenderDetailsType senderDetails) {
	 	this.senderDetails = senderDetails;
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
		if(referenceID != null) {
			sb.append("<").append(preferredPrefix).append(":ReferenceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(referenceID));
			sb.append("</").append(preferredPrefix).append(":ReferenceID>");
		}
		if(paymentAction != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentAction.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentAction>");
		}
		if(paymentType != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentType>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentType.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentType>");
		}
		if(paymentDetails != null) {
			sb.append(paymentDetails.toXMLString(preferredPrefix,"PaymentDetails"));
		}
		if(creditCard != null) {
			sb.append(creditCard.toXMLString(preferredPrefix,"CreditCard"));
		}
		if(iPAddress != null) {
			sb.append("<").append(preferredPrefix).append(":IPAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(iPAddress));
			sb.append("</").append(preferredPrefix).append(":IPAddress>");
		}
		if(merchantSessionId != null) {
			sb.append("<").append(preferredPrefix).append(":MerchantSessionId>").append(SDKUtil.escapeInvalidXmlCharsRegex(merchantSessionId));
			sb.append("</").append(preferredPrefix).append(":MerchantSessionId>");
		}
		if(reqConfirmShipping != null) {
			sb.append("<").append(preferredPrefix).append(":ReqConfirmShipping>").append(SDKUtil.escapeInvalidXmlCharsRegex(reqConfirmShipping));
			sb.append("</").append(preferredPrefix).append(":ReqConfirmShipping>");
		}
		if(softDescriptor != null) {
			sb.append("<").append(preferredPrefix).append(":SoftDescriptor>").append(SDKUtil.escapeInvalidXmlCharsRegex(softDescriptor));
			sb.append("</").append(preferredPrefix).append(":SoftDescriptor>");
		}
		if(senderDetails != null) {
			sb.append(senderDetails.toXMLString(preferredPrefix,"SenderDetails"));
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