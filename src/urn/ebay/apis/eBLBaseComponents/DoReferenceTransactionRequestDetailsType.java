package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PaymentActionCodeType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentDetailsType;
import urn.ebay.apis.eBLBaseComponents.ReferenceCreditCardDetailsType;
import urn.ebay.apis.eBLBaseComponents.SenderDetailsType;

/**
 * No Document Comments
 */
public class DoReferenceTransactionRequestDetailsType{


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private String ReferenceID;

	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private PaymentActionCodeType PaymentAction;

	/**
	 * No Document Comments	 
	 */ 
	private MerchantPullPaymentCodeType PaymentType;

	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private PaymentDetailsType PaymentDetails;

	/**
	 * No Document Comments	 
	 */ 
	private ReferenceCreditCardDetailsType CreditCard;

	/**
	 * No Document Comments	 
	 */ 
	private String IPAddress;

	/**
	 * No Document Comments	 
	 */ 
	private String MerchantSessionId;

	/**
	 * No Document Comments	 
	 */ 
	private String ReqConfirmShipping;

	/**
	 * No Document Comments	 
	 */ 
	private String SoftDescriptor;

	/**
	 * No Document Comments	 
	 */ 
	private SenderDetailsType SenderDetails;

	

	/**
	 * Constructor with arguments
	 */
	public DoReferenceTransactionRequestDetailsType (String ReferenceID, PaymentActionCodeType PaymentAction, PaymentDetailsType PaymentDetails){
		this.ReferenceID = ReferenceID;
		this.PaymentAction = PaymentAction;
		this.PaymentDetails = PaymentDetails;
	}	

	/**
	 * Default Constructor
	 */
	public DoReferenceTransactionRequestDetailsType (){
	}	

	/**
	 * Getter for ReferenceID
	 */
	 public String getReferenceID() {
	 	return ReferenceID;
	 }
	 
	/**
	 * Setter for ReferenceID
	 */
	 public void setReferenceID(String ReferenceID) {
	 	this.ReferenceID = ReferenceID;
	 }
	 
	/**
	 * Getter for PaymentAction
	 */
	 public PaymentActionCodeType getPaymentAction() {
	 	return PaymentAction;
	 }
	 
	/**
	 * Setter for PaymentAction
	 */
	 public void setPaymentAction(PaymentActionCodeType PaymentAction) {
	 	this.PaymentAction = PaymentAction;
	 }
	 
	/**
	 * Getter for PaymentType
	 */
	 public MerchantPullPaymentCodeType getPaymentType() {
	 	return PaymentType;
	 }
	 
	/**
	 * Setter for PaymentType
	 */
	 public void setPaymentType(MerchantPullPaymentCodeType PaymentType) {
	 	this.PaymentType = PaymentType;
	 }
	 
	/**
	 * Getter for PaymentDetails
	 */
	 public PaymentDetailsType getPaymentDetails() {
	 	return PaymentDetails;
	 }
	 
	/**
	 * Setter for PaymentDetails
	 */
	 public void setPaymentDetails(PaymentDetailsType PaymentDetails) {
	 	this.PaymentDetails = PaymentDetails;
	 }
	 
	/**
	 * Getter for CreditCard
	 */
	 public ReferenceCreditCardDetailsType getCreditCard() {
	 	return CreditCard;
	 }
	 
	/**
	 * Setter for CreditCard
	 */
	 public void setCreditCard(ReferenceCreditCardDetailsType CreditCard) {
	 	this.CreditCard = CreditCard;
	 }
	 
	/**
	 * Getter for IPAddress
	 */
	 public String getIPAddress() {
	 	return IPAddress;
	 }
	 
	/**
	 * Setter for IPAddress
	 */
	 public void setIPAddress(String IPAddress) {
	 	this.IPAddress = IPAddress;
	 }
	 
	/**
	 * Getter for MerchantSessionId
	 */
	 public String getMerchantSessionId() {
	 	return MerchantSessionId;
	 }
	 
	/**
	 * Setter for MerchantSessionId
	 */
	 public void setMerchantSessionId(String MerchantSessionId) {
	 	this.MerchantSessionId = MerchantSessionId;
	 }
	 
	/**
	 * Getter for ReqConfirmShipping
	 */
	 public String getReqConfirmShipping() {
	 	return ReqConfirmShipping;
	 }
	 
	/**
	 * Setter for ReqConfirmShipping
	 */
	 public void setReqConfirmShipping(String ReqConfirmShipping) {
	 	this.ReqConfirmShipping = ReqConfirmShipping;
	 }
	 
	/**
	 * Getter for SoftDescriptor
	 */
	 public String getSoftDescriptor() {
	 	return SoftDescriptor;
	 }
	 
	/**
	 * Setter for SoftDescriptor
	 */
	 public void setSoftDescriptor(String SoftDescriptor) {
	 	this.SoftDescriptor = SoftDescriptor;
	 }
	 
	/**
	 * Getter for SenderDetails
	 */
	 public SenderDetailsType getSenderDetails() {
	 	return SenderDetails;
	 }
	 
	/**
	 * Setter for SenderDetails
	 */
	 public void setSenderDetails(SenderDetailsType SenderDetails) {
	 	this.SenderDetails = SenderDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ReferenceID != null) {
			sb.append("<ebl:ReferenceID>").append(ReferenceID);
			sb.append("</ebl:ReferenceID>");
		}
		if(PaymentAction != null) {
			sb.append("<ebl:PaymentAction>").append(PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if(PaymentType != null) {
			sb.append("<ebl:PaymentType>").append(PaymentType.getValue());
			sb.append("</ebl:PaymentType>");
		}
		if(PaymentDetails != null) {
			sb.append("<ebl:PaymentDetails>");
			sb.append(PaymentDetails.toXMLString());
			sb.append("</ebl:PaymentDetails>");
		}
		if(CreditCard != null) {
			sb.append("<ebl:CreditCard>");
			sb.append(CreditCard.toXMLString());
			sb.append("</ebl:CreditCard>");
		}
		if(IPAddress != null) {
			sb.append("<ebl:IPAddress>").append(IPAddress);
			sb.append("</ebl:IPAddress>");
		}
		if(MerchantSessionId != null) {
			sb.append("<ebl:MerchantSessionId>").append(MerchantSessionId);
			sb.append("</ebl:MerchantSessionId>");
		}
		if(ReqConfirmShipping != null) {
			sb.append("<ebl:ReqConfirmShipping>").append(ReqConfirmShipping);
			sb.append("</ebl:ReqConfirmShipping>");
		}
		if(SoftDescriptor != null) {
			sb.append("<ebl:SoftDescriptor>").append(SoftDescriptor);
			sb.append("</ebl:SoftDescriptor>");
		}
		if(SenderDetails != null) {
			sb.append("<ebl:SenderDetails>");
			sb.append(SenderDetails.toXMLString());
			sb.append("</ebl:SenderDetails>");
		}
		return sb.toString();
	}

}