package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingCodeType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;

/**
 * 
 */
public class BillingAgreementDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private BillingCodeType BillingType;

	/**
	 * Only needed for AutoBill billinng type. 	 
	 */ 
	private String BillingAgreementDescription;

	/**
	 * 	 
	 */ 
	private MerchantPullPaymentCodeType PaymentType;

	/**
	 * Custom annotation field for your exclusive use. 	 
	 */ 
	private String BillingAgreementCustom;

	

	/**
	 * Constructor with arguments
	 */
	public BillingAgreementDetailsType (BillingCodeType BillingType){
		this.BillingType = BillingType;
	}	

	/**
	 * Default Constructor
	 */
	public BillingAgreementDetailsType (){
	}	

	/**
	 * Getter for BillingType
	 */
	 public BillingCodeType getBillingType() {
	 	return BillingType;
	 }
	 
	/**
	 * Setter for BillingType
	 */
	 public void setBillingType(BillingCodeType BillingType) {
	 	this.BillingType = BillingType;
	 }
	 
	/**
	 * Getter for BillingAgreementDescription
	 */
	 public String getBillingAgreementDescription() {
	 	return BillingAgreementDescription;
	 }
	 
	/**
	 * Setter for BillingAgreementDescription
	 */
	 public void setBillingAgreementDescription(String BillingAgreementDescription) {
	 	this.BillingAgreementDescription = BillingAgreementDescription;
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
	 * Getter for BillingAgreementCustom
	 */
	 public String getBillingAgreementCustom() {
	 	return BillingAgreementCustom;
	 }
	 
	/**
	 * Setter for BillingAgreementCustom
	 */
	 public void setBillingAgreementCustom(String BillingAgreementCustom) {
	 	this.BillingAgreementCustom = BillingAgreementCustom;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BillingType != null) {
			sb.append("<ebl:BillingType>").append(BillingType.getValue());
			sb.append("</ebl:BillingType>");
		}
		if(BillingAgreementDescription != null) {
			sb.append("<ebl:BillingAgreementDescription>").append(BillingAgreementDescription);
			sb.append("</ebl:BillingAgreementDescription>");
		}
		if(PaymentType != null) {
			sb.append("<ebl:PaymentType>").append(PaymentType.getValue());
			sb.append("</ebl:PaymentType>");
		}
		if(BillingAgreementCustom != null) {
			sb.append("<ebl:BillingAgreementCustom>").append(BillingAgreementCustom);
			sb.append("</ebl:BillingAgreementCustom>");
		}
		return sb.toString();
	}

}