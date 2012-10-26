package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;
import com.paypal.core.SDKUtil;

/**
 * Type of the Payment is it Instant or Echeck or Any. 
 */
public class PaymentDirectivesType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Type of the Payment is it Instant or Echeck or Any.	 
	 */ 
	private MerchantPullPaymentCodeType paymentType;

	

	/**
	 * Default Constructor
	 */
	public PaymentDirectivesType (){
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
		if(paymentType != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentType>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentType.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentType>");
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