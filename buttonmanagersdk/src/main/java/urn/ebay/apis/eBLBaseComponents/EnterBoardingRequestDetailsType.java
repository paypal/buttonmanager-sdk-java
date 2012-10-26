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


	/**
	 * Onboarding program code given to you by PayPal. Required
	 * Character length and limitations: 64 alphanumeric characters	 
	 */ 
	private String ProgramCode;

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
	private String ProductList;

	/**
	 * Any custom information you want to store for this partner
	 * Optional Character length and limitations: 256 alphanumeric
	 * characters	 
	 */ 
	private String PartnerCustom;

	/**
	 * The URL for the logo displayed on the PayPal Partner Welcome
	 * Page. Optional Character length and limitations: 2,048
	 * alphanumeric characters	 
	 */ 
	private String ImageUrl;

	/**
	 * Marketing category tha configures the graphic displayed n
	 * the PayPal Partner Welcome page.	 
	 */ 
	private MarketingCategoryType MarketingCategory;

	/**
	 * Information about the merchant’s business	 
	 */ 
	private BusinessInfoType BusinessInfo;

	/**
	 * Information about the merchant (the business owner)	 
	 */ 
	private BusinessOwnerInfoType OwnerInfo;

	/**
	 * Information about the merchant's bank account	 
	 */ 
	private BankAccountDetailsType BankAccount;

	

	/**
	 * Default Constructor
	 */
	public EnterBoardingRequestDetailsType (){
	}	

	/**
	 * Getter for ProgramCode
	 */
	 public String getProgramCode() {
	 	return ProgramCode;
	 }
	 
	/**
	 * Setter for ProgramCode
	 */
	 public void setProgramCode(String ProgramCode) {
	 	this.ProgramCode = ProgramCode;
	 }
	 
	/**
	 * Getter for ProductList
	 */
	 public String getProductList() {
	 	return ProductList;
	 }
	 
	/**
	 * Setter for ProductList
	 */
	 public void setProductList(String ProductList) {
	 	this.ProductList = ProductList;
	 }
	 
	/**
	 * Getter for PartnerCustom
	 */
	 public String getPartnerCustom() {
	 	return PartnerCustom;
	 }
	 
	/**
	 * Setter for PartnerCustom
	 */
	 public void setPartnerCustom(String PartnerCustom) {
	 	this.PartnerCustom = PartnerCustom;
	 }
	 
	/**
	 * Getter for ImageUrl
	 */
	 public String getImageUrl() {
	 	return ImageUrl;
	 }
	 
	/**
	 * Setter for ImageUrl
	 */
	 public void setImageUrl(String ImageUrl) {
	 	this.ImageUrl = ImageUrl;
	 }
	 
	/**
	 * Getter for MarketingCategory
	 */
	 public MarketingCategoryType getMarketingCategory() {
	 	return MarketingCategory;
	 }
	 
	/**
	 * Setter for MarketingCategory
	 */
	 public void setMarketingCategory(MarketingCategoryType MarketingCategory) {
	 	this.MarketingCategory = MarketingCategory;
	 }
	 
	/**
	 * Getter for BusinessInfo
	 */
	 public BusinessInfoType getBusinessInfo() {
	 	return BusinessInfo;
	 }
	 
	/**
	 * Setter for BusinessInfo
	 */
	 public void setBusinessInfo(BusinessInfoType BusinessInfo) {
	 	this.BusinessInfo = BusinessInfo;
	 }
	 
	/**
	 * Getter for OwnerInfo
	 */
	 public BusinessOwnerInfoType getOwnerInfo() {
	 	return OwnerInfo;
	 }
	 
	/**
	 * Setter for OwnerInfo
	 */
	 public void setOwnerInfo(BusinessOwnerInfoType OwnerInfo) {
	 	this.OwnerInfo = OwnerInfo;
	 }
	 
	/**
	 * Getter for BankAccount
	 */
	 public BankAccountDetailsType getBankAccount() {
	 	return BankAccount;
	 }
	 
	/**
	 * Setter for BankAccount
	 */
	 public void setBankAccount(BankAccountDetailsType BankAccount) {
	 	this.BankAccount = BankAccount;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ProgramCode != null) {
			sb.append("<ebl:ProgramCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(ProgramCode));
			sb.append("</ebl:ProgramCode>");
		}
		if(ProductList != null) {
			sb.append("<ebl:ProductList>").append(SDKUtil.escapeInvalidXmlCharsRegex(ProductList));
			sb.append("</ebl:ProductList>");
		}
		if(PartnerCustom != null) {
			sb.append("<ebl:PartnerCustom>").append(SDKUtil.escapeInvalidXmlCharsRegex(PartnerCustom));
			sb.append("</ebl:PartnerCustom>");
		}
		if(ImageUrl != null) {
			sb.append("<ebl:ImageUrl>").append(SDKUtil.escapeInvalidXmlCharsRegex(ImageUrl));
			sb.append("</ebl:ImageUrl>");
		}
		if(MarketingCategory != null) {
			sb.append("<ebl:MarketingCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(MarketingCategory.getValue()));
			sb.append("</ebl:MarketingCategory>");
		}
		if(BusinessInfo != null) {
			sb.append("<ebl:BusinessInfo>");
			sb.append(BusinessInfo.toXMLString());
			sb.append("</ebl:BusinessInfo>");
		}
		if(OwnerInfo != null) {
			sb.append("<ebl:OwnerInfo>");
			sb.append(OwnerInfo.toXMLString());
			sb.append("</ebl:OwnerInfo>");
		}
		if(BankAccount != null) {
			sb.append("<ebl:BankAccount>");
			sb.append(BankAccount.toXMLString());
			sb.append("</ebl:BankAccount>");
		}
		return sb.toString();
	}


}