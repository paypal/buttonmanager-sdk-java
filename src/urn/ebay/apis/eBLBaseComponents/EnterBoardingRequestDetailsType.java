
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.BankAccountDetailsType;
import urn.ebay.apis.eBLBaseComponents.BusinessInfoType;
import urn.ebay.apis.eBLBaseComponents.BusinessOwnerInfoType;
import urn.ebay.apis.eBLBaseComponents.MarketingCategoryType;


/**
 * Onboarding program code given to you by PayPal.
 * Required
 * Character length and limitations: 64 alphanumeric characters
 */
public class EnterBoardingRequestDetailsType {

	/**
	 * Onboarding program code given to you by PayPal.
	 * Required
	 * Character length and limitations: 64 alphanumeric characters	 */
	private String ProgramCode;
	public String getProgramCode() {
		return ProgramCode;
	}
	public void setProgramCode(String value) {
		this.ProgramCode = value;
	}

	/**
	 * A list of comma-separated values that indicate the PayPal products you are implementing for this merchant:
	 * Direct Payment (dp) allows payments by credit card without requiring the customer to have a PayPal account. 
	 * Express Checkout (ec) allows customers to fund transactions with their PayPal account. 
	 * Authorization and Capture (auth_settle) allows merchants to verify availability of funds in a PayPal account, but capture them at a later time. 
	 * Administrative APIs (admin_api) is a collection of the PayPal APIs for transaction searching, getting transaction details, refunding, and mass payments. 
	 * Required
	 * Character length and limitations: 64 alphanumeric characters	 */
	private String ProductList;
	public String getProductList() {
		return ProductList;
	}
	public void setProductList(String value) {
		this.ProductList = value;
	}

	/**
	 * Any custom information you want to store for this partner
	 * Optional
	 * Character length and limitations: 256 alphanumeric characters	 */
	private String PartnerCustom;
	public String getPartnerCustom() {
		return PartnerCustom;
	}
	public void setPartnerCustom(String value) {
		this.PartnerCustom = value;
	}

	/**
	 * The URL for the logo displayed on the PayPal Partner Welcome Page.
	 * Optional
	 * Character length and limitations: 2,048 alphanumeric characters	 */
	private String ImageUrl;
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String value) {
		this.ImageUrl = value;
	}

	/**
	 * Marketing category tha configures the graphic displayed n the PayPal Partner Welcome page.	 */
	private MarketingCategoryType MarketingCategory;
	public MarketingCategoryType getMarketingCategory() {
		return MarketingCategory;
	}
	public void setMarketingCategory(MarketingCategoryType value) {
		this.MarketingCategory = value;
	}

	/**
	 * Information about the merchant’s business	 */
	private BusinessInfoType BusinessInfo;
	public BusinessInfoType getBusinessInfo() {
		return BusinessInfo;
	}
	public void setBusinessInfo(BusinessInfoType value) {
		this.BusinessInfo = value;
	}

	/**
	 * Information about the merchant (the business owner)	 */
	private BusinessOwnerInfoType OwnerInfo;
	public BusinessOwnerInfoType getOwnerInfo() {
		return OwnerInfo;
	}
	public void setOwnerInfo(BusinessOwnerInfoType value) {
		this.OwnerInfo = value;
	}

	/**
	 * Information about the merchant's bank account	 */
	private BankAccountDetailsType BankAccount;
	public BankAccountDetailsType getBankAccount() {
		return BankAccount;
	}
	public void setBankAccount(BankAccountDetailsType value) {
		this.BankAccount = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ProgramCode != null ) {
			sb.append("<ebl:ProgramCode>").append(ProgramCode);
			sb.append("</ebl:ProgramCode>");
		}
		if( ProductList != null ) {
			sb.append("<ebl:ProductList>").append(ProductList);
			sb.append("</ebl:ProductList>");
		}
		if( PartnerCustom != null ) {
			sb.append("<ebl:PartnerCustom>").append(PartnerCustom);
			sb.append("</ebl:PartnerCustom>");
		}
		if( ImageUrl != null ) {
			sb.append("<ebl:ImageUrl>").append(ImageUrl);
			sb.append("</ebl:ImageUrl>");
		}
		if( MarketingCategory != null ) {
			sb.append("<ebl:MarketingCategory>").append( MarketingCategory.getValue());
			sb.append("</ebl:MarketingCategory>");
		}
		if( BusinessInfo != null ) {
			sb.append("<ebl:BusinessInfo>");
			sb.append(BusinessInfo.toXMLString());
			sb.append("</ebl:BusinessInfo>");
		}
		if( OwnerInfo != null ) {
			sb.append("<ebl:OwnerInfo>");
			sb.append(OwnerInfo.toXMLString());
			sb.append("</ebl:OwnerInfo>");
		}
		if( BankAccount != null ) {
			sb.append("<ebl:BankAccount>");
			sb.append(BankAccount.toXMLString());
			sb.append("</ebl:BankAccount>");
		}
		return sb.toString();
	}

}
