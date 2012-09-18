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


	/**
	 * The Type of Approval requested - Billing Agreement or
	 * Profile	  
	 *@Required	 
	 */ 
	private ApprovalTypeType ApprovalType;

	/**
	 * The Approval subtype - Must be MerchantInitiatedBilling for
	 * BillingAgreement ApprovalType	 
	 */ 
	private ApprovalSubTypeType ApprovalSubType;

	/**
	 * Description about the Order	 
	 */ 
	private OrderDetailsType OrderDetails;

	/**
	 * Directives about the type of payment	 
	 */ 
	private PaymentDirectivesType PaymentDirectives;

	/**
	 * Client may pass in its identification of this Billing
	 * Agreement. It used for the client's tracking purposes.	 
	 */ 
	private String Custom;

	

	/**
	 * Constructor with arguments
	 */
	public BillingApprovalDetailsType (ApprovalTypeType ApprovalType){
		this.ApprovalType = ApprovalType;
	}	

	/**
	 * Default Constructor
	 */
	public BillingApprovalDetailsType (){
	}	

	/**
	 * Getter for ApprovalType
	 */
	 public ApprovalTypeType getApprovalType() {
	 	return ApprovalType;
	 }
	 
	/**
	 * Setter for ApprovalType
	 */
	 public void setApprovalType(ApprovalTypeType ApprovalType) {
	 	this.ApprovalType = ApprovalType;
	 }
	 
	/**
	 * Getter for ApprovalSubType
	 */
	 public ApprovalSubTypeType getApprovalSubType() {
	 	return ApprovalSubType;
	 }
	 
	/**
	 * Setter for ApprovalSubType
	 */
	 public void setApprovalSubType(ApprovalSubTypeType ApprovalSubType) {
	 	this.ApprovalSubType = ApprovalSubType;
	 }
	 
	/**
	 * Getter for OrderDetails
	 */
	 public OrderDetailsType getOrderDetails() {
	 	return OrderDetails;
	 }
	 
	/**
	 * Setter for OrderDetails
	 */
	 public void setOrderDetails(OrderDetailsType OrderDetails) {
	 	this.OrderDetails = OrderDetails;
	 }
	 
	/**
	 * Getter for PaymentDirectives
	 */
	 public PaymentDirectivesType getPaymentDirectives() {
	 	return PaymentDirectives;
	 }
	 
	/**
	 * Setter for PaymentDirectives
	 */
	 public void setPaymentDirectives(PaymentDirectivesType PaymentDirectives) {
	 	this.PaymentDirectives = PaymentDirectives;
	 }
	 
	/**
	 * Getter for Custom
	 */
	 public String getCustom() {
	 	return Custom;
	 }
	 
	/**
	 * Setter for Custom
	 */
	 public void setCustom(String Custom) {
	 	this.Custom = Custom;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ApprovalType != null) {
			sb.append("<ebl:ApprovalType>").append(SDKUtil.escapeInvalidXmlCharsRegex(ApprovalType.getValue()));
			sb.append("</ebl:ApprovalType>");
		}
		if(ApprovalSubType != null) {
			sb.append("<ebl:ApprovalSubType>").append(SDKUtil.escapeInvalidXmlCharsRegex(ApprovalSubType.getValue()));
			sb.append("</ebl:ApprovalSubType>");
		}
		if(OrderDetails != null) {
			sb.append("<ebl:OrderDetails>");
			sb.append(OrderDetails.toXMLString());
			sb.append("</ebl:OrderDetails>");
		}
		if(PaymentDirectives != null) {
			sb.append("<ebl:PaymentDirectives>");
			sb.append(PaymentDirectives.toXMLString());
			sb.append("</ebl:PaymentDirectives>");
		}
		if(Custom != null) {
			sb.append("<ebl:Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(Custom));
			sb.append("</ebl:Custom>");
		}
		return sb.toString();
	}

}