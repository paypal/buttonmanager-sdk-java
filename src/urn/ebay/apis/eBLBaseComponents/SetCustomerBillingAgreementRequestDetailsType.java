package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BillingAgreementDetailsType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class SetCustomerBillingAgreementRequestDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private BillingAgreementDetailsType BillingAgreementDetails;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String ReturnURL;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String CancelURL;

	/**
	 * 	 
	 */ 
	private String LocaleCode;

	/**
	 * 	 
	 */ 
	private String PageStyle;

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
	private String BuyerEmail;

	/**
	 * The value 1 indicates that you require that the customer's
	 * billing address on file. Setting this element overrides the
	 * setting you have specified in Admin. Optional Character
	 * length and limitations: One single-byte numeric character.	 
	 */ 
	private String ReqBillingAddress;

	

	/**
	 * Constructor with arguments
	 */
	public SetCustomerBillingAgreementRequestDetailsType (BillingAgreementDetailsType BillingAgreementDetails, String ReturnURL, String CancelURL){
		this.BillingAgreementDetails = BillingAgreementDetails;
		this.ReturnURL = ReturnURL;
		this.CancelURL = CancelURL;
	}	

	/**
	 * Default Constructor
	 */
	public SetCustomerBillingAgreementRequestDetailsType (){
	}	

	/**
	 * Getter for BillingAgreementDetails
	 */
	 public BillingAgreementDetailsType getBillingAgreementDetails() {
	 	return BillingAgreementDetails;
	 }
	 
	/**
	 * Setter for BillingAgreementDetails
	 */
	 public void setBillingAgreementDetails(BillingAgreementDetailsType BillingAgreementDetails) {
	 	this.BillingAgreementDetails = BillingAgreementDetails;
	 }
	 
	/**
	 * Getter for ReturnURL
	 */
	 public String getReturnURL() {
	 	return ReturnURL;
	 }
	 
	/**
	 * Setter for ReturnURL
	 */
	 public void setReturnURL(String ReturnURL) {
	 	this.ReturnURL = ReturnURL;
	 }
	 
	/**
	 * Getter for CancelURL
	 */
	 public String getCancelURL() {
	 	return CancelURL;
	 }
	 
	/**
	 * Setter for CancelURL
	 */
	 public void setCancelURL(String CancelURL) {
	 	this.CancelURL = CancelURL;
	 }
	 
	/**
	 * Getter for LocaleCode
	 */
	 public String getLocaleCode() {
	 	return LocaleCode;
	 }
	 
	/**
	 * Setter for LocaleCode
	 */
	 public void setLocaleCode(String LocaleCode) {
	 	this.LocaleCode = LocaleCode;
	 }
	 
	/**
	 * Getter for PageStyle
	 */
	 public String getPageStyle() {
	 	return PageStyle;
	 }
	 
	/**
	 * Setter for PageStyle
	 */
	 public void setPageStyle(String PageStyle) {
	 	this.PageStyle = PageStyle;
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
	 * Getter for BuyerEmail
	 */
	 public String getBuyerEmail() {
	 	return BuyerEmail;
	 }
	 
	/**
	 * Setter for BuyerEmail
	 */
	 public void setBuyerEmail(String BuyerEmail) {
	 	this.BuyerEmail = BuyerEmail;
	 }
	 
	/**
	 * Getter for ReqBillingAddress
	 */
	 public String getReqBillingAddress() {
	 	return ReqBillingAddress;
	 }
	 
	/**
	 * Setter for ReqBillingAddress
	 */
	 public void setReqBillingAddress(String ReqBillingAddress) {
	 	this.ReqBillingAddress = ReqBillingAddress;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BillingAgreementDetails != null) {
			sb.append("<ebl:BillingAgreementDetails>");
			sb.append(BillingAgreementDetails.toXMLString());
			sb.append("</ebl:BillingAgreementDetails>");
		}
		if(ReturnURL != null) {
			sb.append("<ebl:ReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReturnURL));
			sb.append("</ebl:ReturnURL>");
		}
		if(CancelURL != null) {
			sb.append("<ebl:CancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(CancelURL));
			sb.append("</ebl:CancelURL>");
		}
		if(LocaleCode != null) {
			sb.append("<ebl:LocaleCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(LocaleCode));
			sb.append("</ebl:LocaleCode>");
		}
		if(PageStyle != null) {
			sb.append("<ebl:PageStyle>").append(SDKUtil.escapeInvalidXmlCharsRegex(PageStyle));
			sb.append("</ebl:PageStyle>");
		}
		if(cppHeaderImage != null) {
			sb.append("<ebl:cpp-header-image>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderImage));
			sb.append("</ebl:cpp-header-image>");
		}
		if(cppHeaderBorderColor != null) {
			sb.append("<ebl:cpp-header-border-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBorderColor));
			sb.append("</ebl:cpp-header-border-color>");
		}
		if(cppHeaderBackColor != null) {
			sb.append("<ebl:cpp-header-back-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppHeaderBackColor));
			sb.append("</ebl:cpp-header-back-color>");
		}
		if(cppPayflowColor != null) {
			sb.append("<ebl:cpp-payflow-color>").append(SDKUtil.escapeInvalidXmlCharsRegex(cppPayflowColor));
			sb.append("</ebl:cpp-payflow-color>");
		}
		if(BuyerEmail != null) {
			sb.append("<ebl:BuyerEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(BuyerEmail));
			sb.append("</ebl:BuyerEmail>");
		}
		if(ReqBillingAddress != null) {
			sb.append("<ebl:ReqBillingAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReqBillingAddress));
			sb.append("</ebl:ReqBillingAddress>");
		}
		return sb.toString();
	}


}