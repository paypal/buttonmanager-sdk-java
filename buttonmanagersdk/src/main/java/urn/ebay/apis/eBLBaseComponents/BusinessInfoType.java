package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.BusinessTypeType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.BusinessCategoryType;
import urn.ebay.apis.eBLBaseComponents.BusinessSubCategoryType;
import urn.ebay.apis.eBLBaseComponents.AverageTransactionPriceType;
import urn.ebay.apis.eBLBaseComponents.AverageMonthlyVolumeType;
import urn.ebay.apis.eBLBaseComponents.SalesVenueType;
import urn.ebay.apis.eBLBaseComponents.PercentageRevenueFromOnlineSalesType;
import com.paypal.core.SDKUtil;

/**
 * BusinessInfoType 
 */
public class BusinessInfoType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Type of business, such as corporation or sole proprietorship	 
	 */ 
	private BusinessTypeType type;

	/**
	 * Official name of business Character length and limitations:
	 * 75 alphanumeric characters	 
	 */ 
	private String name;

	/**
	 * Merchant’s business postal address	 
	 */ 
	private AddressType address;

	/**
	 * Business’s primary telephone number Character length and
	 * limitations: 20 alphanumeric characters	 
	 */ 
	private String workPhone;

	/**
	 * Line of business, as defined in the enumerations	 
	 */ 
	private BusinessCategoryType category;

	/**
	 * Business sub-category, as defined in the enumerations	 
	 */ 
	private BusinessSubCategoryType subCategory;

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
	private AverageTransactionPriceType averagePrice;

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
	private AverageMonthlyVolumeType averageMonthlyVolume;

	/**
	 * Main sales venue, such as eBay	 
	 */ 
	private SalesVenueType salesVenue;

	/**
	 * Primary URL of business Character length and limitations:
	 * 2,048 alphanumeric characters	 
	 */ 
	private String website;

	/**
	 * Percentage of revenue attributable to online sales, as
	 * defined by the enumerations Enumeration Meaning
	 * PercentageRevenueFromOnlineSales-Not-Applicable
	 * PercentageRevenueFromOnlineSales-Range1 Less than 25%
	 * PercentageRevenueFromOnlineSales-Range2 25% to 50%
	 * PercentageRevenueFromOnlineSales-Range3 50% to 75%
	 * PercentageRevenueFromOnlineSales-Range4 75% to 100% 	 
	 */ 
	private PercentageRevenueFromOnlineSalesType revenueFromOnlineSales;

	/**
	 * Date the merchant’s business was established	 
	 */ 
	private String businessEstablished;

	/**
	 * Email address to contact business’s customer service
	 * Character length and limitations: 127 alphanumeric
	 * characters	 
	 */ 
	private String customerServiceEmail;

	/**
	 * Telephone number to contact business’s customer service
	 * Character length and limitations: 32 alphanumeric characters	 
	 */ 
	private String customerServicePhone;

	

	/**
	 * Default Constructor
	 */
	public BusinessInfoType (){
	}	

	/**
	 * Getter for type
	 */
	 public BusinessTypeType getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(BusinessTypeType type) {
	 	this.type = type;
	 }
	 
	/**
	 * Getter for name
	 */
	 public String getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(String name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for address
	 */
	 public AddressType getAddress() {
	 	return address;
	 }
	 
	/**
	 * Setter for address
	 */
	 public void setAddress(AddressType address) {
	 	this.address = address;
	 }
	 
	/**
	 * Getter for workPhone
	 */
	 public String getWorkPhone() {
	 	return workPhone;
	 }
	 
	/**
	 * Setter for workPhone
	 */
	 public void setWorkPhone(String workPhone) {
	 	this.workPhone = workPhone;
	 }
	 
	/**
	 * Getter for category
	 */
	 public BusinessCategoryType getCategory() {
	 	return category;
	 }
	 
	/**
	 * Setter for category
	 */
	 public void setCategory(BusinessCategoryType category) {
	 	this.category = category;
	 }
	 
	/**
	 * Getter for subCategory
	 */
	 public BusinessSubCategoryType getSubCategory() {
	 	return subCategory;
	 }
	 
	/**
	 * Setter for subCategory
	 */
	 public void setSubCategory(BusinessSubCategoryType subCategory) {
	 	this.subCategory = subCategory;
	 }
	 
	/**
	 * Getter for averagePrice
	 */
	 public AverageTransactionPriceType getAveragePrice() {
	 	return averagePrice;
	 }
	 
	/**
	 * Setter for averagePrice
	 */
	 public void setAveragePrice(AverageTransactionPriceType averagePrice) {
	 	this.averagePrice = averagePrice;
	 }
	 
	/**
	 * Getter for averageMonthlyVolume
	 */
	 public AverageMonthlyVolumeType getAverageMonthlyVolume() {
	 	return averageMonthlyVolume;
	 }
	 
	/**
	 * Setter for averageMonthlyVolume
	 */
	 public void setAverageMonthlyVolume(AverageMonthlyVolumeType averageMonthlyVolume) {
	 	this.averageMonthlyVolume = averageMonthlyVolume;
	 }
	 
	/**
	 * Getter for salesVenue
	 */
	 public SalesVenueType getSalesVenue() {
	 	return salesVenue;
	 }
	 
	/**
	 * Setter for salesVenue
	 */
	 public void setSalesVenue(SalesVenueType salesVenue) {
	 	this.salesVenue = salesVenue;
	 }
	 
	/**
	 * Getter for website
	 */
	 public String getWebsite() {
	 	return website;
	 }
	 
	/**
	 * Setter for website
	 */
	 public void setWebsite(String website) {
	 	this.website = website;
	 }
	 
	/**
	 * Getter for revenueFromOnlineSales
	 */
	 public PercentageRevenueFromOnlineSalesType getRevenueFromOnlineSales() {
	 	return revenueFromOnlineSales;
	 }
	 
	/**
	 * Setter for revenueFromOnlineSales
	 */
	 public void setRevenueFromOnlineSales(PercentageRevenueFromOnlineSalesType revenueFromOnlineSales) {
	 	this.revenueFromOnlineSales = revenueFromOnlineSales;
	 }
	 
	/**
	 * Getter for businessEstablished
	 */
	 public String getBusinessEstablished() {
	 	return businessEstablished;
	 }
	 
	/**
	 * Setter for businessEstablished
	 */
	 public void setBusinessEstablished(String businessEstablished) {
	 	this.businessEstablished = businessEstablished;
	 }
	 
	/**
	 * Getter for customerServiceEmail
	 */
	 public String getCustomerServiceEmail() {
	 	return customerServiceEmail;
	 }
	 
	/**
	 * Setter for customerServiceEmail
	 */
	 public void setCustomerServiceEmail(String customerServiceEmail) {
	 	this.customerServiceEmail = customerServiceEmail;
	 }
	 
	/**
	 * Getter for customerServicePhone
	 */
	 public String getCustomerServicePhone() {
	 	return customerServicePhone;
	 }
	 
	/**
	 * Setter for customerServicePhone
	 */
	 public void setCustomerServicePhone(String customerServicePhone) {
	 	this.customerServicePhone = customerServicePhone;
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
		if(type != null) {
			sb.append("<").append(preferredPrefix).append(":Type>").append(SDKUtil.escapeInvalidXmlCharsRegex(type.getValue()));
			sb.append("</").append(preferredPrefix).append(":Type>");
		}
		if(name != null) {
			sb.append("<").append(preferredPrefix).append(":Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(name));
			sb.append("</").append(preferredPrefix).append(":Name>");
		}
		if(address != null) {
			sb.append(address.toXMLString(preferredPrefix,"Address"));
		}
		if(workPhone != null) {
			sb.append("<").append(preferredPrefix).append(":WorkPhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(workPhone));
			sb.append("</").append(preferredPrefix).append(":WorkPhone>");
		}
		if(category != null) {
			sb.append("<").append(preferredPrefix).append(":Category>").append(SDKUtil.escapeInvalidXmlCharsRegex(category.getValue()));
			sb.append("</").append(preferredPrefix).append(":Category>");
		}
		if(subCategory != null) {
			sb.append("<").append(preferredPrefix).append(":SubCategory>").append(SDKUtil.escapeInvalidXmlCharsRegex(subCategory.getValue()));
			sb.append("</").append(preferredPrefix).append(":SubCategory>");
		}
		if(averagePrice != null) {
			sb.append("<").append(preferredPrefix).append(":AveragePrice>").append(SDKUtil.escapeInvalidXmlCharsRegex(averagePrice.getValue()));
			sb.append("</").append(preferredPrefix).append(":AveragePrice>");
		}
		if(averageMonthlyVolume != null) {
			sb.append("<").append(preferredPrefix).append(":AverageMonthlyVolume>").append(SDKUtil.escapeInvalidXmlCharsRegex(averageMonthlyVolume.getValue()));
			sb.append("</").append(preferredPrefix).append(":AverageMonthlyVolume>");
		}
		if(salesVenue != null) {
			sb.append("<").append(preferredPrefix).append(":SalesVenue>").append(SDKUtil.escapeInvalidXmlCharsRegex(salesVenue.getValue()));
			sb.append("</").append(preferredPrefix).append(":SalesVenue>");
		}
		if(website != null) {
			sb.append("<").append(preferredPrefix).append(":Website>").append(SDKUtil.escapeInvalidXmlCharsRegex(website));
			sb.append("</").append(preferredPrefix).append(":Website>");
		}
		if(revenueFromOnlineSales != null) {
			sb.append("<").append(preferredPrefix).append(":RevenueFromOnlineSales>").append(SDKUtil.escapeInvalidXmlCharsRegex(revenueFromOnlineSales.getValue()));
			sb.append("</").append(preferredPrefix).append(":RevenueFromOnlineSales>");
		}
		if(businessEstablished != null) {
			sb.append("<").append(preferredPrefix).append(":BusinessEstablished>").append(SDKUtil.escapeInvalidXmlCharsRegex(businessEstablished));
			sb.append("</").append(preferredPrefix).append(":BusinessEstablished>");
		}
		if(customerServiceEmail != null) {
			sb.append("<").append(preferredPrefix).append(":CustomerServiceEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(customerServiceEmail));
			sb.append("</").append(preferredPrefix).append(":CustomerServiceEmail>");
		}
		if(customerServicePhone != null) {
			sb.append("<").append(preferredPrefix).append(":CustomerServicePhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(customerServicePhone));
			sb.append("</").append(preferredPrefix).append(":CustomerServicePhone>");
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