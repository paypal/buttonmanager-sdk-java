
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.ApprovalSubTypeType;
import urn.ebay.apis.eBLBaseComponents.ApprovalTypeType;
import urn.ebay.apis.eBLBaseComponents.OrderDetailsType;
import urn.ebay.apis.eBLBaseComponents.PaymentDirectivesType;


/**
 * The Type of Approval requested - Billing Agreement or Profile
 */
public class BillingApprovalDetailsType {

	/**
The Type of Approval requested - Billing Agreement or Profile	 *
	 * @Required
	 */
	private ApprovalTypeType ApprovalType;
	public ApprovalTypeType getApprovalType() {
		return ApprovalType;
	}
	public void setApprovalType(ApprovalTypeType value) {
		this.ApprovalType = value;
	}

	/**
The Approval subtype - Must be MerchantInitiatedBilling for BillingAgreement ApprovalType	 */
	private ApprovalSubTypeType ApprovalSubType;
	public ApprovalSubTypeType getApprovalSubType() {
		return ApprovalSubType;
	}
	public void setApprovalSubType(ApprovalSubTypeType value) {
		this.ApprovalSubType = value;
	}

	/**
Description about the Order	 */
	private OrderDetailsType OrderDetails;
	public OrderDetailsType getOrderDetails() {
		return OrderDetails;
	}
	public void setOrderDetails(OrderDetailsType value) {
		this.OrderDetails = value;
	}

	/**
Directives about the type of payment	 */
	private PaymentDirectivesType PaymentDirectives;
	public PaymentDirectivesType getPaymentDirectives() {
		return PaymentDirectives;
	}
	public void setPaymentDirectives(PaymentDirectivesType value) {
		this.PaymentDirectives = value;
	}

	/**
Client may pass in its identification of this Billing Agreement. It used for the client's tracking purposes.	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}


	public BillingApprovalDetailsType(ApprovalTypeType ApprovalType) {
		this.ApprovalType = ApprovalType;
	}
	public BillingApprovalDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ApprovalType != null ) {
			sb.append("<ebl:ApprovalType>").append( ApprovalType.getValue());
			sb.append("</ebl:ApprovalType>");
		}
		if( ApprovalSubType != null ) {
			sb.append("<ebl:ApprovalSubType>").append( ApprovalSubType.getValue());
			sb.append("</ebl:ApprovalSubType>");
		}
		if( OrderDetails != null ) {
			sb.append("<ebl:OrderDetails>");
			sb.append(OrderDetails.toXMLString());
			sb.append("</ebl:OrderDetails>");
		}
		if( PaymentDirectives != null ) {
			sb.append("<ebl:PaymentDirectives>");
			sb.append(PaymentDirectives.toXMLString());
			sb.append("</ebl:PaymentDirectives>");
		}
		if( Custom != null ) {
			sb.append("<ebl:Custom>").append(Custom);
			sb.append("</ebl:Custom>");
		}
		return sb.toString();
	}

}
