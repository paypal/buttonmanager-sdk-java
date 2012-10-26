package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.FailedPaymentActionType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ActivationDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BasicAmountType initialAmount;

	/**
	 * 	 
	 */ 
	private FailedPaymentActionType failedInitialAmountAction;

	

	/**
	 * Constructor with arguments
	 */
	public ActivationDetailsType (BasicAmountType initialAmount){
		this.initialAmount = initialAmount;
	}	

	/**
	 * Default Constructor
	 */
	public ActivationDetailsType (){
	}	

	/**
	 * Getter for initialAmount
	 */
	 public BasicAmountType getInitialAmount() {
	 	return initialAmount;
	 }
	 
	/**
	 * Setter for initialAmount
	 */
	 public void setInitialAmount(BasicAmountType initialAmount) {
	 	this.initialAmount = initialAmount;
	 }
	 
	/**
	 * Getter for failedInitialAmountAction
	 */
	 public FailedPaymentActionType getFailedInitialAmountAction() {
	 	return failedInitialAmountAction;
	 }
	 
	/**
	 * Setter for failedInitialAmountAction
	 */
	 public void setFailedInitialAmountAction(FailedPaymentActionType failedInitialAmountAction) {
	 	this.failedInitialAmountAction = failedInitialAmountAction;
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
		if(initialAmount != null) {
			sb.append(initialAmount.toXMLString(preferredPrefix,"InitialAmount"));
		}
		if(failedInitialAmountAction != null) {
			sb.append("<").append(preferredPrefix).append(":FailedInitialAmountAction>").append(SDKUtil.escapeInvalidXmlCharsRegex(failedInitialAmountAction.getValue()));
			sb.append("</").append(preferredPrefix).append(":FailedInitialAmountAction>");
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