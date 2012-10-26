package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingCodeType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BillingAgreementDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BillingCodeType billingType;

	/**
	 * Only needed for AutoBill billinng type. 	 
	 */ 
	private String billingAgreementDescription;

	/**
	 * 	 
	 */ 
	private MerchantPullPaymentCodeType paymentType;

	/**
	 * Custom annotation field for your exclusive use. 	 
	 */ 
	private String billingAgreementCustom;

	

	/**
	 * Constructor with arguments
	 */
	public BillingAgreementDetailsType (BillingCodeType billingType){
		this.billingType = billingType;
	}	

	/**
	 * Default Constructor
	 */
	public BillingAgreementDetailsType (){
	}	

	/**
	 * Getter for billingType
	 */
	 public BillingCodeType getBillingType() {
	 	return billingType;
	 }
	 
	/**
	 * Setter for billingType
	 */
	 public void setBillingType(BillingCodeType billingType) {
	 	this.billingType = billingType;
	 }
	 
	/**
	 * Getter for billingAgreementDescription
	 */
	 public String getBillingAgreementDescription() {
	 	return billingAgreementDescription;
	 }
	 
	/**
	 * Setter for billingAgreementDescription
	 */
	 public void setBillingAgreementDescription(String billingAgreementDescription) {
	 	this.billingAgreementDescription = billingAgreementDescription;
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
	 * Getter for billingAgreementCustom
	 */
	 public String getBillingAgreementCustom() {
	 	return billingAgreementCustom;
	 }
	 
	/**
	 * Setter for billingAgreementCustom
	 */
	 public void setBillingAgreementCustom(String billingAgreementCustom) {
	 	this.billingAgreementCustom = billingAgreementCustom;
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
		if(billingType != null) {
			sb.append("<").append(preferredPrefix).append(":BillingType>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingType.getValue()));
			sb.append("</").append(preferredPrefix).append(":BillingType>");
		}
		if(billingAgreementDescription != null) {
			sb.append("<").append(preferredPrefix).append(":BillingAgreementDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingAgreementDescription));
			sb.append("</").append(preferredPrefix).append(":BillingAgreementDescription>");
		}
		if(paymentType != null) {
			sb.append("<").append(preferredPrefix).append(":PaymentType>").append(SDKUtil.escapeInvalidXmlCharsRegex(paymentType.getValue()));
			sb.append("</").append(preferredPrefix).append(":PaymentType>");
		}
		if(billingAgreementCustom != null) {
			sb.append("<").append(preferredPrefix).append(":BillingAgreementCustom>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingAgreementCustom));
			sb.append("</").append(preferredPrefix).append(":BillingAgreementCustom>");
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