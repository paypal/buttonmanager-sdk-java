
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.FailedPaymentActionType;


/**
 */
public class ActivationDetailsType {

	/**
	 *
	 * @Required
	 */
	private BasicAmountType InitialAmount;
	public BasicAmountType getInitialAmount() {
		return InitialAmount;
	}
	public void setInitialAmount(BasicAmountType value) {
		this.InitialAmount = value;
	}

	/**
	 */
	private FailedPaymentActionType FailedInitialAmountAction;
	public FailedPaymentActionType getFailedInitialAmountAction() {
		return FailedInitialAmountAction;
	}
	public void setFailedInitialAmountAction(FailedPaymentActionType value) {
		this.FailedInitialAmountAction = value;
	}


	public ActivationDetailsType(BasicAmountType InitialAmount) {
		this.InitialAmount = InitialAmount;
	}
	public ActivationDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( InitialAmount != null ) {
			sb.append("<ebl:InitialAmount ");
			sb.append(InitialAmount.toXMLString());
			sb.append("</ebl:InitialAmount>");
		}
		if( FailedInitialAmountAction != null ) {
			sb.append("<ebl:FailedInitialAmountAction>").append( FailedInitialAmountAction.getValue());
			sb.append("</ebl:FailedInitialAmountAction>");
		}
		return sb.toString();
	}

}
