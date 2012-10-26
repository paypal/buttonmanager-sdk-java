package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.MarketingCategoryType;
import urn.ebay.apis.eBLBaseComponents.BusinessInfoType;
import urn.ebay.apis.eBLBaseComponents.BusinessOwnerInfoType;
import urn.ebay.apis.eBLBaseComponents.BankAccountDetailsType;
import com.paypal.core.SDKUtil;

/**
 * Onboarding program code given to you by PayPal. Required
 * Character length and limitations: 64 alphanumeric characters
 * 
 */
public class EnterBoardingRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Onboarding program code given to you by PayPal. Required
	 * Character length and limitations: 64 alphanumeric characters	 
	 */ 
	private String programCode;

	/**
	 * A list of comma-separated values that indicate the PayPal
	 * products you are implementing for this merchant: Direct
	 * Payment (dp) allows payments by credit card without
	 * requiring the customer to have a PayPal account. Express
	 * Checkout (ec) allows customers to fund transactions with
	 * their PayPal account. Authorization and Capture
	 * (auth_settle) allows merchants to verify availability of
	 * funds in a PayPal account, but capture them at a later time.
	 * Administrative APIs (admin_api) is a collection of the
	 * PayPal APIs for transaction searching, getting transaction
	 * details, refunding, and mass payments. Required Character
	 * length and limitations: 64 alphanumeric characters	 
	 */ 
	private String productList;

	/**
	 * Any custom information you want to store for this partner
	 * Optional Character length and limitations: 256 alphanumeric
	 * characters	 
	 */ 
	private String partnerCustom;

	/**
	 * The URL for the logo displayed on the PayPal Partner Welcome
	 * Page. Optional Character length and limitations: 2,048
	 * alphanumeric characters	 
	 */ 
	private String imageUrl;

	/**
	 * Marketing category tha configures the graphic displayed n
	 * the PayPal Partner Welcome page.	 
	 */ 
	private MarketingCategoryType marketingCategory;

	/**
	 * Information about the merchant’s business	 
	 */ 
	private BusinessInfoType businessInfo;

	/**
	 * Information about the merchant (the business owner)	 
	 */ 
	private BusinessOwnerInfoType ownerInfo;

	/**
	 * Information about the merchant's bank account	 
	 */ 
	private BankAccountDetailsType bankAccount;

	

	/**
	 * Default Constructor
	 */
	public EnterBoardingRequestDetailsType (){
	}	

	/**
	 * Getter for programCode
	 */
	 public String getProgramCode() {
	 	return programCode;
	 }
	 
	/**
	 * Setter for programCode
	 */
	 public void setProgramCode(String programCode) {
	 	this.programCode = programCode;
	 }
	 
	/**
	 * Getter for productList
	 */
	 public String getProductList() {
	 	return productList;
	 }
	 
	/**
	 * Setter for productList
	 */
	 public void setProductList(String productList) {
	 	this.productList = productList;
	 }
	 
	/**
	 * Getter for partnerCustom
	 */
	 public String getPartnerCustom() {
	 	return partnerCustom;
	 }
	 
	/**
	 * Setter for partnerCustom
	 */
	 public void setPartnerCustom(String partnerCustom) {
	 	this.partnerCustom = partnerCustom;
	 }
	 
	/**
	 * Getter for imageUrl
	 */
	 public String getImageUrl() {
	 	return imageUrl;
	 }
	 
	/**
	 * Setter for imageUrl
	 */
	 public void setImageUrl(String imageUrl) {
	 	this.imageUrl = imageUrl;
	 }
	 
	/**
	 * Getter for marketingCategory
	 */
	 public MarketingCategoryType getMarketingCategory() {
	 	return marketingCategory;
	 }
	 
	/**
	 * Setter for marketingCategory
	 */
	 public void setMarketingCategory(MarketingCategoryType marketingCategory) {
	 	this.marketingCategory = marketingCategory;
	 }
	 
	/**
	 * Getter for businessInfo
	 */
	 public BusinessInfoType getBusinessInfo() {
	 	return businessInfo;
	 }
	 
	/**
	 * Setter for businessInfo
	 */
	 public void setBusinessInfo(BusinessInfoType businessInfo) {
	 	this.businessInfo = businessInfo;
	 }
	 
	/**
	 * Getter for ownerInfo
	 */
	 public BusinessOwnerInfoType getOwnerInfo() {
	 	return ownerInfo;
	 }
	 
	/**
	 * Setter for ownerInfo
	 */
	 public void setOwnerInfo(BusinessOwnerInfoType ownerInfo) {
	 	this.ownerInfo = ownerInfo;
	 }
	 
	/**
	 * Getter for bankAccount
	 */
	 public BankAccountDetailsType getBankAccount() {
	 	return bankAccount;
	 }
	 
	/**
	 * Setter for bankAccount
	 */
	 public void setBankAccount(BankAccountDetailsType bankAccount) {
	 	this.bankAccount = bankAccount;
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
		if(programCode != null) {
			sb.append("<").append(preferredPrefix).append(":ProgramCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(programCode));
			sb.append("</").append(preferredPrefix).append(":ProgramCode>");
		}
		if(productList != null) {
			sb.append("<").append(preferredPrefix).append(":ProductList>").append(SDKUtil.escapeInvalidXmlCharsRegex(productList));
			sb.append("</").append(preferredPrefix).append(":ProductList>");
		}
		if(partnerCustom != null) {
			sb.append("<").append(preferredPrefix).append(":PartnerCustom>").append(SDKUtil.escapeInvalidXmlCharsRegex(partnerCustom));
			sb.append("</").append(preferredPrefix).append(":PartnerCustom>");
		}
		if(imageUrl != null) {
			sb.append("<").append(preferredPrefix).append(":ImageUrl>").append(SDKUtil.escapeInvalidXmlCharsRegex(imageUrl));
			sb.append("</").append(preferredPrefix).append(":ImageUrl>");
		}
		if(marketingCategory != null) {
			sb.append("<").append(preferredPrefix).append(":MarketingCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(marketingCategory.getValue()));
			sb.append("</").append(preferredPrefix).append(":MarketingCategory>");
		}
		if(businessInfo != null) {
			sb.append(businessInfo.toXMLString(preferredPrefix,"BusinessInfo"));
		}
		if(ownerInfo != null) {
			sb.append(ownerInfo.toXMLString(preferredPrefix,"OwnerInfo"));
		}
		if(bankAccount != null) {
			sb.append(bankAccount.toXMLString(preferredPrefix,"BankAccount"));
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