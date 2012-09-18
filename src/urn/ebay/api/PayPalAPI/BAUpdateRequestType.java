package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BAUpdateRequestType extends AbstractRequestType {


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String ReferenceID;

	/**
	 * 	 
	 */ 
	private String BillingAgreementDescription;

	/**
	 * 	 
	 */ 
	private MerchantPullStatusCodeType BillingAgreementStatus;

	/**
	 * 	 
	 */ 
	private String BillingAgreementCustom;

	

	/**
	 * Constructor with arguments
	 */
	public BAUpdateRequestType (String ReferenceID){
		this.ReferenceID = ReferenceID;
	}	

	/**
	 * Default Constructor
	 */
	public BAUpdateRequestType (){
	}	

	/**
	 * Getter for ReferenceID
	 */
	 public String getReferenceID() {
	 	return ReferenceID;
	 }
	 
	/**
	 * Setter for ReferenceID
	 */
	 public void setReferenceID(String ReferenceID) {
	 	this.ReferenceID = ReferenceID;
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
	 * Getter for BillingAgreementStatus
	 */
	 public MerchantPullStatusCodeType getBillingAgreementStatus() {
	 	return BillingAgreementStatus;
	 }
	 
	/**
	 * Setter for BillingAgreementStatus
	 */
	 public void setBillingAgreementStatus(MerchantPullStatusCodeType BillingAgreementStatus) {
	 	this.BillingAgreementStatus = BillingAgreementStatus;
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
		sb.append(super.toXMLString());
		if(ReferenceID != null) {
			sb.append("<urn:ReferenceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReferenceID));
			sb.append("</urn:ReferenceID>");
		}
		if(BillingAgreementDescription != null) {
			sb.append("<urn:BillingAgreementDescription>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingAgreementDescription));
			sb.append("</urn:BillingAgreementDescription>");
		}
		if(BillingAgreementStatus != null) {
			sb.append("<urn:BillingAgreementStatus>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingAgreementStatus.getValue()));
			sb.append("</urn:BillingAgreementStatus>");
		}
		if(BillingAgreementCustom != null) {
			sb.append("<urn:BillingAgreementCustom>").append(SDKUtil.escapeInvalidXmlCharsRegex(BillingAgreementCustom));
			sb.append("</urn:BillingAgreementCustom>");
		}
		return sb.toString();
	}

}