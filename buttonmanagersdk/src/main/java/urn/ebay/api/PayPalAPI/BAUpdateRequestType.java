package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BAUpdateRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String referenceID;

	/**
	 * 	 
	 */ 
	private String billingAgreementDescription;

	/**
	 * 	 
	 */ 
	private MerchantPullStatusCodeType billingAgreementStatus;

	/**
	 * 	 
	 */ 
	private String billingAgreementCustom;

	

	/**
	 * Constructor with arguments
	 */
	public BAUpdateRequestType (String referenceID){
		this.referenceID = referenceID;
	}	

	/**
	 * Default Constructor
	 */
	public BAUpdateRequestType (){
	}	

	/**
	 * Getter for referenceID
	 */
	 public String getReferenceID() {
	 	return referenceID;
	 }
	 
	/**
	 * Setter for referenceID
	 */
	 public void setReferenceID(String referenceID) {
	 	this.referenceID = referenceID;
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
	 * Getter for billingAgreementStatus
	 */
	 public MerchantPullStatusCodeType getBillingAgreementStatus() {
	 	return billingAgreementStatus;
	 }
	 
	/**
	 * Setter for billingAgreementStatus
	 */
	 public void setBillingAgreementStatus(MerchantPullStatusCodeType billingAgreementStatus) {
	 	this.billingAgreementStatus = billingAgreementStatus;
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
		sb.append(super.toXMLString(prefix, null));
		if(referenceID != null) {
			sb.append("<").append(preferredPrefix).append(":ReferenceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(referenceID));
			sb.append("</").append(preferredPrefix).append(":ReferenceID>");
		}
		if(billingAgreementDescription != null) {
			sb.append("<").append(preferredPrefix).append(":BillingAgreementDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingAgreementDescription));
			sb.append("</").append(preferredPrefix).append(":BillingAgreementDescription>");
		}
		if(billingAgreementStatus != null) {
			sb.append("<").append(preferredPrefix).append(":BillingAgreementStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(billingAgreementStatus.getValue()));
			sb.append("</").append(preferredPrefix).append(":BillingAgreementStatus>");
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