package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.ApprovalTypeType;
import urn.ebay.apis.eBLBaseComponents.ApprovalSubTypeType;
import urn.ebay.apis.eBLBaseComponents.OrderDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentDirectivesType;
import com.paypal.core.SDKUtil;

/**
 * The Type of Approval requested - Billing Agreement or
 * Profile 
 */
public class BillingApprovalDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The Type of Approval requested - Billing Agreement or
	 * Profile	  
	 *@Required	 
	 */ 
	private ApprovalTypeType approvalType;

	/**
	 * The Approval subtype - Must be MerchantInitiatedBilling for
	 * BillingAgreement ApprovalType	 
	 */ 
	private ApprovalSubTypeType approvalSubType;

	/**
	 * Description about the Order	 
	 */ 
	private OrderDetailsType orderDetails;

	/**
	 * Directives about the type of payment	 
	 */ 
	private PaymentDirectivesType paymentDirectives;

	/**
	 * Client may pass in its identification of this Billing
	 * Agreement. It used for the client's tracking purposes.	 
	 */ 
	private String custom;

	

	/**
	 * Constructor with arguments
	 */
	public BillingApprovalDetailsType (ApprovalTypeType approvalType){
		this.approvalType = approvalType;
	}	

	/**
	 * Default Constructor
	 */
	public BillingApprovalDetailsType (){
	}	

	/**
	 * Getter for approvalType
	 */
	 public ApprovalTypeType getApprovalType() {
	 	return approvalType;
	 }
	 
	/**
	 * Setter for approvalType
	 */
	 public void setApprovalType(ApprovalTypeType approvalType) {
	 	this.approvalType = approvalType;
	 }
	 
	/**
	 * Getter for approvalSubType
	 */
	 public ApprovalSubTypeType getApprovalSubType() {
	 	return approvalSubType;
	 }
	 
	/**
	 * Setter for approvalSubType
	 */
	 public void setApprovalSubType(ApprovalSubTypeType approvalSubType) {
	 	this.approvalSubType = approvalSubType;
	 }
	 
	/**
	 * Getter for orderDetails
	 */
	 public OrderDetailsType getOrderDetails() {
	 	return orderDetails;
	 }
	 
	/**
	 * Setter for orderDetails
	 */
	 public void setOrderDetails(OrderDetailsType orderDetails) {
	 	this.orderDetails = orderDetails;
	 }
	 
	/**
	 * Getter for paymentDirectives
	 */
	 public PaymentDirectivesType getPaymentDirectives() {
	 	return paymentDirectives;
	 }
	 
	/**
	 * Setter for paymentDirectives
	 */
	 public void setPaymentDirectives(PaymentDirectivesType paymentDirectives) {
	 	this.paymentDirectives = paymentDirectives;
	 }
	 
	/**
	 * Getter for custom
	 */
	 public String getCustom() {
	 	return custom;
	 }
	 
	/**
	 * Setter for custom
	 */
	 public void setCustom(String custom) {
	 	this.custom = custom;
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
		if(approvalType != null) {
			sb.append("<").append(preferredPrefix).append(":ApprovalType>").append(SDKUtil.escapeInvalidXmlCharsRegex(approvalType.getValue()));
			sb.append("</").append(preferredPrefix).append(":ApprovalType>");
		}
		if(approvalSubType != null) {
			sb.append("<").append(preferredPrefix).append(":ApprovalSubType>").append(SDKUtil.escapeInvalidXmlCharsRegex(approvalSubType.getValue()));
			sb.append("</").append(preferredPrefix).append(":ApprovalSubType>");
		}
		if(orderDetails != null) {
			sb.append(orderDetails.toXMLString(preferredPrefix,"OrderDetails"));
		}
		if(paymentDirectives != null) {
			sb.append(paymentDirectives.toXMLString(preferredPrefix,"PaymentDirectives"));
		}
		if(custom != null) {
			sb.append("<").append(preferredPrefix).append(":Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(custom));
			sb.append("</").append(preferredPrefix).append(":Custom>");
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