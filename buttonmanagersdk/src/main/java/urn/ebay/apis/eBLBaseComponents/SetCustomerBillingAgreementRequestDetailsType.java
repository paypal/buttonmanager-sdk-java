package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingAgreementDetailsType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetCustomerBillingAgreementRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private BillingAgreementDetailsType billingAgreementDetails;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String returnURL;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String cancelURL;

	/**
	 * 	 
	 */ 
	private String localeCode;

	/**
	 * 	 
	 */ 
	private String pageStyle;

	/**
	 * 	 
	 */ 
	private String cppHeaderImage;

	/**
	 * 	 
	 */ 
	private String cppHeaderBorderColor;

	/**
	 * 	 
	 */ 
	private String cppHeaderBackColor;

	/**
	 * 	 
	 */ 
	private String cppPayflowColor;

	/**
	 * 	 
	 */ 
	private String buyerEmail;

	/**
	 * The value 1 indicates that you require that the customer's
	 * billing address on file. Setting this element overrides the
	 * setting you have specified in Admin. Optional Character
	 * length and limitations: One single-byte numeric character.	 
	 */ 
	private String reqBillingAddress;

	

	/**
	 * Constructor with arguments
	 */
	public SetCustomerBillingAgreementRequestDetailsType (BillingAgreementDetailsType billingAgreementDetails, String returnURL, String cancelURL){
		this.billingAgreementDetails = billingAgreementDetails;
		this.returnURL = returnURL;
		this.cancelURL = cancelURL;
	}	

	/**
	 * Default Constructor
	 */
	public SetCustomerBillingAgreementRequestDetailsType (){
	}	

	/**
	 * Getter for billingAgreementDetails
	 */
	 public BillingAgreementDetailsType getBillingAgreementDetails() {
	 	return billingAgreementDetails;
	 }
	 
	/**
	 * Setter for billingAgreementDetails
	 */
	 public void setBillingAgreementDetails(BillingAgreementDetailsType billingAgreementDetails) {
	 	this.billingAgreementDetails = billingAgreementDetails;
	 }
	 
	/**
	 * Getter for returnURL
	 */
	 public String getReturnURL() {
	 	return returnURL;
	 }
	 
	/**
	 * Setter for returnURL
	 */
	 public void setReturnURL(String returnURL) {
	 	this.returnURL = returnURL;
	 }
	 
	/**
	 * Getter for cancelURL
	 */
	 public String getCancelURL() {
	 	return cancelURL;
	 }
	 
	/**
	 * Setter for cancelURL
	 */
	 public void setCancelURL(String cancelURL) {
	 	this.cancelURL = cancelURL;
	 }
	 
	/**
	 * Getter for localeCode
	 */
	 public String getLocaleCode() {
	 	return localeCode;
	 }
	 
	/**
	 * Setter for localeCode
	 */
	 public void setLocaleCode(String localeCode) {
	 	this.localeCode = localeCode;
	 }
	 
	/**
	 * Getter for pageStyle
	 */
	 public String getPageStyle() {
	 	return pageStyle;
	 }
	 
	/**
	 * Setter for pageStyle
	 */
	 public void setPageStyle(String pageStyle) {
	 	this.pageStyle = pageStyle;
	 }
	 
	/**
	 * Getter for cppHeaderImage
	 */
	 public String getCppHeaderImage() {
	 	return cppHeaderImage;
	 }
	 
	/**
	 * Setter for cppHeaderImage
	 */
	 public void setCppHeaderImage(String cppHeaderImage) {
	 	this.cppHeaderImage = cppHeaderImage;
	 }
	 
	/**
	 * Getter for cppHeaderBorderColor
	 */
	 public String getCppHeaderBorderColor() {
	 	return cppHeaderBorderColor;
	 }
	 
	/**
	 * Setter for cppHeaderBorderColor
	 */
	 public void setCppHeaderBorderColor(String cppHeaderBorderColor) {
	 	this.cppHeaderBorderColor = cppHeaderBorderColor;
	 }
	 
	/**
	 * Getter for cppHeaderBackColor
	 */
	 public String getCppHeaderBackColor() {
	 	return cppHeaderBackColor;
	 }
	 
	/**
	 * Setter for cppHeaderBackColor
	 */
	 public void setCppHeaderBackColor(String cppHeaderBackColor) {
	 	this.cppHeaderBackColor = cppHeaderBackColor;
	 }
	 
	/**
	 * Getter for cppPayflowColor
	 */
	 public String getCppPayflowColor() {
	 	return cppPayflowColor;
	 }
	 
	/**
	 * Setter for cppPayflowColor
	 */
	 public void setCppPayflowColor(String cppPayflowColor) {
	 	this.cppPayflowColor = cppPayflowColor;
	 }
	 
	/**
	 * Getter for buyerEmail
	 */
	 public String getBuyerEmail() {
	 	return buyerEmail;
	 }
	 
	/**
	 * Setter for buyerEmail
	 */
	 public void setBuyerEmail(String buyerEmail) {
	 	this.buyerEmail = buyerEmail;
	 }
	 
	/**
	 * Getter for reqBillingAddress
	 */
	 public String getReqBillingAddress() {
	 	return reqBillingAddress;
	 }
	 
	/**
	 * Setter for reqBillingAddress
	 */
	 public void setReqBillingAddress(String reqBillingAddress) {
	 	this.reqBillingAddress = reqBillingAddress;
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
		if(billingAgreementDetails != null) {
			sb.append(billingAgreementDetails.toXMLString(preferredPrefix,"BillingAgreementDetails"));
		}
		if(returnURL != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnURL));
			sb.append("</").append(preferredPrefix).append(":ReturnURL>");
		}
		if(cancelURL != null) {
			sb.append("<").append(preferredPrefix).append(":CancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(cancelURL));
			sb.append("</").append(preferredPrefix).append(":CancelURL>");
		}
		if(localeCode != null) {
			sb.append("<").append(preferredPrefix).append(":LocaleCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(localeCode));
			sb.append("</").append(preferredPrefix).append(":LocaleCode>");
		}
		if(pageStyle != null) {
			sb.append("<").append(preferredPrefix).append(":PageStyle>").append(SDKUtil.escapeInvalidXmlCharsRegex(pageStyle));
			sb.append("</").append(preferredPrefix).append(":PageStyle>");
		}
		if(cppHeaderImage != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-image>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderImage));
			sb.append("</").append(preferredPrefix).append(":cpp-header-image>");
		}
		if(cppHeaderBorderColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-border-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBorderColor));
			sb.append("</").append(preferredPrefix).append(":cpp-header-border-color>");
		}
		if(cppHeaderBackColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-header-back-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBackColor));
			sb.append("</").append(preferredPrefix).append(":cpp-header-back-color>");
		}
		if(cppPayflowColor != null) {
			sb.append("<").append(preferredPrefix).append(":cpp-payflow-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppPayflowColor));
			sb.append("</").append(preferredPrefix).append(":cpp-payflow-color>");
		}
		if(buyerEmail != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyerEmail));
			sb.append("</").append(preferredPrefix).append(":BuyerEmail>");
		}
		if(reqBillingAddress != null) {
			sb.append("<").append(preferredPrefix).append(":ReqBillingAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(reqBillingAddress));
			sb.append("</").append(preferredPrefix).append(":ReqBillingAddress>");
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