package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;

/**
 * Type of the Payment is it Instant or Echeck or Any. 
 */
public class PaymentDirectivesType{


	/**
	 * Type of the Payment is it Instant or Echeck or Any.	 
	 */ 
	private MerchantPullPaymentCodeType PaymentType;

	

	/**
	 * Default Constructor
	 */
	public PaymentDirectivesType (){
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
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(PaymentType != null) {
			sb.append("<ebl:PaymentType>").append(PaymentType.getValue());
			sb.append("</ebl:PaymentType>");
		}
		return sb.toString();
	}

}