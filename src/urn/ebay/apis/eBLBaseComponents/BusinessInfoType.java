package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BusinessTypeType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.BusinessCategoryType;
import urn.ebay.apis.eBLBaseComponents.BusinessSubCategoryType;
import urn.ebay.apis.eBLBaseComponents.AverageTransactionPriceType;
import urn.ebay.apis.eBLBaseComponents.AverageMonthlyVolumeType;
import urn.ebay.apis.eBLBaseComponents.SalesVenueType;
import urn.ebay.apis.eBLBaseComponents.PercentageRevenueFromOnlineSalesType;

/**
 * BusinessInfoType 
 */
public class BusinessInfoType{


	/**
	 * Type of business, such as corporation or sole proprietorship	 
	 */ 
	private BusinessTypeType Type;

	/**
	 * Official name of business Character length and limitations:
	 * 75 alphanumeric characters	 
	 */ 
	private String Name;

	/**
	 * Merchant’s business postal address	 
	 */ 
	private AddressType Address;

	/**
	 * Business’s primary telephone number Character length and
	 * limitations: 20 alphanumeric characters	 
	 */ 
	private String WorkPhone;

	/**
	 * Line of business, as defined in the enumerations	 
	 */ 
	private BusinessCategoryType Category;

	/**
	 * Business sub-category, as defined in the enumerations	 
	 */ 
	private BusinessSubCategoryType SubCategory;

	/**
	 * Average transaction price, as defined by the enumerations.
	 * Enumeration Meaning AverageTransactionPrice-Not-Applicable
	 * AverageTransactionPrice-Range1 Less than $25 USD
	 * AverageTransactionPrice-Range2 $25 USD to $50 USD
	 * AverageTransactionPrice-Range3 $50 USD to $100 USD
	 * AverageTransactionPrice-Range4 $100 USD to $250 USD
	 * AverageTransactionPrice-Range5 $250 USD to $500 USD
	 * AverageTransactionPrice-Range6 $500 USD to $1,000 USD
	 * AverageTransactionPrice-Range7 $1,000 USD to $2,000 USD
	 * AverageTransactionPrice-Range8 $2,000 USD to $5,000 USD
	 * AverageTransactionPrice-Range9 $5,000 USD to $10,000 USD
	 * AverageTransactionPrice-Range10 More than $10,000 USD 	 
	 */ 
	private AverageTransactionPriceType AveragePrice;

	/**
	 * Average monthly sales volume, as defined by the
	 * enumerations. Enumeration Meaning
	 * AverageMonthlyVolume-Not-Applicable
	 * AverageMonthlyVolume-Range1 Less than $1,000 USD
	 * AverageMonthlyVolume-Range2 $1,000 USD to $5,000 USD
	 * AverageMonthlyVolume-Range3 $5,000 USD to $25,000 USD
	 * AverageMonthlyVolume-Range4 $25,000 USD to $100,000 USD
	 * AverageMonthlyVolume-Range5 $100,000 USD to $1,000,000 USD
	 * AverageMonthlyVolume-Range6 More than $1,000,000 USD 	 
	 */ 
	private AverageMonthlyVolumeType AverageMonthlyVolume;

	/**
	 * Main sales venue, such as eBay	 
	 */ 
	private SalesVenueType SalesVenue;

	/**
	 * Primary URL of business Character length and limitations:
	 * 2,048 alphanumeric characters	 
	 */ 
	private String Website;

	/**
	 * Percentage of revenue attributable to online sales, as
	 * defined by the enumerations Enumeration Meaning
	 * PercentageRevenueFromOnlineSales-Not-Applicable
	 * PercentageRevenueFromOnlineSales-Range1 Less than 25%
	 * PercentageRevenueFromOnlineSales-Range2 25% to 50%
	 * PercentageRevenueFromOnlineSales-Range3 50% to 75%
	 * PercentageRevenueFromOnlineSales-Range4 75% to 100% 	 
	 */ 
	private PercentageRevenueFromOnlineSalesType RevenueFromOnlineSales;

	/**
	 * Date the merchant’s business was established	 
	 */ 
	private String BusinessEstablished;

	/**
	 * Email address to contact business’s customer service
	 * Character length and limitations: 127 alphanumeric
	 * characters	 
	 */ 
	private String CustomerServiceEmail;

	/**
	 * Telephone number to contact business’s customer service
	 * Character length and limitations: 32 alphanumeric characters	 
	 */ 
	private String CustomerServicePhone;

	

	/**
	 * Default Constructor
	 */
	public BusinessInfoType (){
	}	

	/**
	 * Getter for Type
	 */
	 public BusinessTypeType getType() {
	 	return Type;
	 }
	 
	/**
	 * Setter for Type
	 */
	 public void setType(BusinessTypeType Type) {
	 	this.Type = Type;
	 }
	 
	/**
	 * Getter for Name
	 */
	 public String getName() {
	 	return Name;
	 }
	 
	/**
	 * Setter for Name
	 */
	 public void setName(String Name) {
	 	this.Name = Name;
	 }
	 
	/**
	 * Getter for Address
	 */
	 public AddressType getAddress() {
	 	return Address;
	 }
	 
	/**
	 * Setter for Address
	 */
	 public void setAddress(AddressType Address) {
	 	this.Address = Address;
	 }
	 
	/**
	 * Getter for WorkPhone
	 */
	 public String getWorkPhone() {
	 	return WorkPhone;
	 }
	 
	/**
	 * Setter for WorkPhone
	 */
	 public void setWorkPhone(String WorkPhone) {
	 	this.WorkPhone = WorkPhone;
	 }
	 
	/**
	 * Getter for Category
	 */
	 public BusinessCategoryType getCategory() {
	 	return Category;
	 }
	 
	/**
	 * Setter for Category
	 */
	 public void setCategory(BusinessCategoryType Category) {
	 	this.Category = Category;
	 }
	 
	/**
	 * Getter for SubCategory
	 */
	 public BusinessSubCategoryType getSubCategory() {
	 	return SubCategory;
	 }
	 
	/**
	 * Setter for SubCategory
	 */
	 public void setSubCategory(BusinessSubCategoryType SubCategory) {
	 	this.SubCategory = SubCategory;
	 }
	 
	/**
	 * Getter for AveragePrice
	 */
	 public AverageTransactionPriceType getAveragePrice() {
	 	return AveragePrice;
	 }
	 
	/**
	 * Setter for AveragePrice
	 */
	 public void setAveragePrice(AverageTransactionPriceType AveragePrice) {
	 	this.AveragePrice = AveragePrice;
	 }
	 
	/**
	 * Getter for AverageMonthlyVolume
	 */
	 public AverageMonthlyVolumeType getAverageMonthlyVolume() {
	 	return AverageMonthlyVolume;
	 }
	 
	/**
	 * Setter for AverageMonthlyVolume
	 */
	 public void setAverageMonthlyVolume(AverageMonthlyVolumeType AverageMonthlyVolume) {
	 	this.AverageMonthlyVolume = AverageMonthlyVolume;
	 }
	 
	/**
	 * Getter for SalesVenue
	 */
	 public SalesVenueType getSalesVenue() {
	 	return SalesVenue;
	 }
	 
	/**
	 * Setter for SalesVenue
	 */
	 public void setSalesVenue(SalesVenueType SalesVenue) {
	 	this.SalesVenue = SalesVenue;
	 }
	 
	/**
	 * Getter for Website
	 */
	 public String getWebsite() {
	 	return Website;
	 }
	 
	/**
	 * Setter for Website
	 */
	 public void setWebsite(String Website) {
	 	this.Website = Website;
	 }
	 
	/**
	 * Getter for RevenueFromOnlineSales
	 */
	 public PercentageRevenueFromOnlineSalesType getRevenueFromOnlineSales() {
	 	return RevenueFromOnlineSales;
	 }
	 
	/**
	 * Setter for RevenueFromOnlineSales
	 */
	 public void setRevenueFromOnlineSales(PercentageRevenueFromOnlineSalesType RevenueFromOnlineSales) {
	 	this.RevenueFromOnlineSales = RevenueFromOnlineSales;
	 }
	 
	/**
	 * Getter for BusinessEstablished
	 */
	 public String getBusinessEstablished() {
	 	return BusinessEstablished;
	 }
	 
	/**
	 * Setter for BusinessEstablished
	 */
	 public void setBusinessEstablished(String BusinessEstablished) {
	 	this.BusinessEstablished = BusinessEstablished;
	 }
	 
	/**
	 * Getter for CustomerServiceEmail
	 */
	 public String getCustomerServiceEmail() {
	 	return CustomerServiceEmail;
	 }
	 
	/**
	 * Setter for CustomerServiceEmail
	 */
	 public void setCustomerServiceEmail(String CustomerServiceEmail) {
	 	this.CustomerServiceEmail = CustomerServiceEmail;
	 }
	 
	/**
	 * Getter for CustomerServicePhone
	 */
	 public String getCustomerServicePhone() {
	 	return CustomerServicePhone;
	 }
	 
	/**
	 * Setter for CustomerServicePhone
	 */
	 public void setCustomerServicePhone(String CustomerServicePhone) {
	 	this.CustomerServicePhone = CustomerServicePhone;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Type != null) {
			sb.append("<ebl:Type>").append(Type.getValue());
			sb.append("</ebl:Type>");
		}
		if(Name != null) {
			sb.append("<ebl:Name>").append(Name);
			sb.append("</ebl:Name>");
		}
		if(Address != null) {
			sb.append("<ebl:Address>");
			sb.append(Address.toXMLString());
			sb.append("</ebl:Address>");
		}
		if(WorkPhone != null) {
			sb.append("<ebl:WorkPhone>").append(WorkPhone);
			sb.append("</ebl:WorkPhone>");
		}
		if(Category != null) {
			sb.append("<ebl:Category>").append(Category.getValue());
			sb.append("</ebl:Category>");
		}
		if(SubCategory != null) {
			sb.append("<ebl:SubCategory>").append(SubCategory.getValue());
			sb.append("</ebl:SubCategory>");
		}
		if(AveragePrice != null) {
			sb.append("<ebl:AveragePrice>").append(AveragePrice.getValue());
			sb.append("</ebl:AveragePrice>");
		}
		if(AverageMonthlyVolume != null) {
			sb.append("<ebl:AverageMonthlyVolume>").append(AverageMonthlyVolume.getValue());
			sb.append("</ebl:AverageMonthlyVolume>");
		}
		if(SalesVenue != null) {
			sb.append("<ebl:SalesVenue>").append(SalesVenue.getValue());
			sb.append("</ebl:SalesVenue>");
		}
		if(Website != null) {
			sb.append("<ebl:Website>").append(Website);
			sb.append("</ebl:Website>");
		}
		if(RevenueFromOnlineSales != null) {
			sb.append("<ebl:RevenueFromOnlineSales>").append(RevenueFromOnlineSales.getValue());
			sb.append("</ebl:RevenueFromOnlineSales>");
		}
		if(BusinessEstablished != null) {
			sb.append("<ebl:BusinessEstablished>").append(BusinessEstablished);
			sb.append("</ebl:BusinessEstablished>");
		}
		if(CustomerServiceEmail != null) {
			sb.append("<ebl:CustomerServiceEmail>").append(CustomerServiceEmail);
			sb.append("</ebl:CustomerServiceEmail>");
		}
		if(CustomerServicePhone != null) {
			sb.append("<ebl:CustomerServicePhone>").append(CustomerServicePhone);
			sb.append("</ebl:CustomerServicePhone>");
		}
		return sb.toString();
	}

}