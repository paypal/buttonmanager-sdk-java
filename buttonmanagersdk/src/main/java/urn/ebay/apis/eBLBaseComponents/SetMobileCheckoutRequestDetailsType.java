package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PhoneNumberType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import com.paypal.core.SDKUtil;

/**
 * The phone number of the buyer's mobile device, if available.
 * Optional 
 */
public class SetMobileCheckoutRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * The phone number of the buyer's mobile device, if available.
	 * Optional 	 
	 */ 
	private PhoneNumberType buyerPhone;

	/**
	 * Cost of this item before tax and shipping.You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Required	  
	 *@Required	 
	 */ 
	private BasicAmountType itemAmount;

	/**
	 * Tax amount for this item.You must set the currencyID
	 * attribute to one of the three-character currency codes for
	 * any of the supported PayPal currencies. Optional	 
	 */ 
	private BasicAmountType tax;

	/**
	 * Shipping amount for this item.You must set the currencyID
	 * attribute to one of the three-character currency codes for
	 * any of the supported PayPal currencies. Optional	 
	 */ 
	private BasicAmountType shipping;

	/**
	 * Description of the item that the customer is purchasing.
	 * Required Character length and limitations: 127 single-byte
	 * alphanumeric characters	  
	 *@Required	 
	 */ 
	private String itemName;

	/**
	 * Reference number of the item that the customer is
	 * purchasing. Optional Character length and limitations: 127
	 * single-byte alphanumeric characters	 
	 */ 
	private String itemNumber;

	/**
	 * A free-form field for your own use, such as a tracking
	 * number or other value you want returned to you in IPN.
	 * Optional Character length and limitations: 256 single-byte
	 * alphanumeric characters	 
	 */ 
	private String custom;

	/**
	 * Your own unique invoice or tracking number. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String invoiceID;

	/**
	 * URL to which the customer's browser is returned after
	 * choosing to pay with PayPal. PayPal recommends that the
	 * value of ReturnURL be the final review page on which the
	 * customer confirms the order and payment. Required Character
	 * length and limitations: no limit. 	  
	 *@Required	 
	 */ 
	private String returnURL;

	/**
	 * URL to which the customer is returned if he does not approve
	 * the use of PayPal to pay you. PayPal recommends that the
	 * value of CancelURL be the original page on which the
	 * customer chose to pay with PayPal. Optional Character length
	 * and limitations: no limit	 
	 */ 
	private String cancelURL;

	/**
	 * The value 1 indicates that you require that the customer's
	 * shipping address on file with PayPal be a confirmed address.
	 * Setting this element overrides the setting you have
	 * specified in your Merchant Account Profile. Optional	 
	 */ 
	private Integer addressDisplayOptions;

	/**
	 * The value 1 indicates that you require that the customer
	 * specifies a contact phone for the transactxion. Default is 0
	 * / none required. Optional	 
	 */ 
	private Integer sharePhone;

	/**
	 * Customer's shipping address. Optional	 
	 */ 
	private AddressType shipToAddress;

	/**
	 * Email address of the buyer as entered during checkout.
	 * PayPal uses this value to pre-fill the login portion of the
	 * PayPal login page. Optional Character length and limit: 127
	 * single-byte alphanumeric characters 	 
	 */ 
	private String buyerEmail;

	

	/**
	 * Constructor with arguments
	 */
	public SetMobileCheckoutRequestDetailsType (BasicAmountType itemAmount, String itemName, String returnURL){
		this.itemAmount = itemAmount;
		this.itemName = itemName;
		this.returnURL = returnURL;
	}	

	/**
	 * Default Constructor
	 */
	public SetMobileCheckoutRequestDetailsType (){
	}	

	/**
	 * Getter for buyerPhone
	 */
	 public PhoneNumberType getBuyerPhone() {
	 	return buyerPhone;
	 }
	 
	/**
	 * Setter for buyerPhone
	 */
	 public void setBuyerPhone(PhoneNumberType buyerPhone) {
	 	this.buyerPhone = buyerPhone;
	 }
	 
	/**
	 * Getter for itemAmount
	 */
	 public BasicAmountType getItemAmount() {
	 	return itemAmount;
	 }
	 
	/**
	 * Setter for itemAmount
	 */
	 public void setItemAmount(BasicAmountType itemAmount) {
	 	this.itemAmount = itemAmount;
	 }
	 
	/**
	 * Getter for tax
	 */
	 public BasicAmountType getTax() {
	 	return tax;
	 }
	 
	/**
	 * Setter for tax
	 */
	 public void setTax(BasicAmountType tax) {
	 	this.tax = tax;
	 }
	 
	/**
	 * Getter for shipping
	 */
	 public BasicAmountType getShipping() {
	 	return shipping;
	 }
	 
	/**
	 * Setter for shipping
	 */
	 public void setShipping(BasicAmountType shipping) {
	 	this.shipping = shipping;
	 }
	 
	/**
	 * Getter for itemName
	 */
	 public String getItemName() {
	 	return itemName;
	 }
	 
	/**
	 * Setter for itemName
	 */
	 public void setItemName(String itemName) {
	 	this.itemName = itemName;
	 }
	 
	/**
	 * Getter for itemNumber
	 */
	 public String getItemNumber() {
	 	return itemNumber;
	 }
	 
	/**
	 * Setter for itemNumber
	 */
	 public void setItemNumber(String itemNumber) {
	 	this.itemNumber = itemNumber;
	 }
	 
	/**
	 * Getter for custom
	 */
	 public String getCustom() {
	 	return custom;
	 }
	 
	/**
	 * Setter for custom
	 */
	 public void setCustom(String custom) {
	 	this.custom = custom;
	 }
	 
	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
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
	 * Getter for addressDisplayOptions
	 */
	 public Integer getAddressDisplayOptions() {
	 	return addressDisplayOptions;
	 }
	 
	/**
	 * Setter for addressDisplayOptions
	 */
	 public void setAddressDisplayOptions(Integer addressDisplayOptions) {
	 	this.addressDisplayOptions = addressDisplayOptions;
	 }
	 
	/**
	 * Getter for sharePhone
	 */
	 public Integer getSharePhone() {
	 	return sharePhone;
	 }
	 
	/**
	 * Setter for sharePhone
	 */
	 public void setSharePhone(Integer sharePhone) {
	 	this.sharePhone = sharePhone;
	 }
	 
	/**
	 * Getter for shipToAddress
	 */
	 public AddressType getShipToAddress() {
	 	return shipToAddress;
	 }
	 
	/**
	 * Setter for shipToAddress
	 */
	 public void setShipToAddress(AddressType shipToAddress) {
	 	this.shipToAddress = shipToAddress;
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
		if(buyerPhone != null) {
			sb.append(buyerPhone.toXMLString(preferredPrefix,"BuyerPhone"));
		}
		if(itemAmount != null) {
			sb.append(itemAmount.toXMLString(preferredPrefix,"ItemAmount"));
		}
		if(tax != null) {
			sb.append(tax.toXMLString(preferredPrefix,"Tax"));
		}
		if(shipping != null) {
			sb.append(shipping.toXMLString(preferredPrefix,"Shipping"));
		}
		if(itemName != null) {
			sb.append("<").append(preferredPrefix).append(":ItemName>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemName));
			sb.append("</").append(preferredPrefix).append(":ItemName>");
		}
		if(itemNumber != null) {
			sb.append("<").append(preferredPrefix).append(":ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(itemNumber));
			sb.append("</").append(preferredPrefix).append(":ItemNumber>");
		}
		if(custom != null) {
			sb.append("<").append(preferredPrefix).append(":Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(custom));
			sb.append("</").append(preferredPrefix).append(":Custom>");
		}
		if(invoiceID != null) {
			sb.append("<").append(preferredPrefix).append(":InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(invoiceID));
			sb.append("</").append(preferredPrefix).append(":InvoiceID>");
		}
		if(returnURL != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnURL));
			sb.append("</").append(preferredPrefix).append(":ReturnURL>");
		}
		if(cancelURL != null) {
			sb.append("<").append(preferredPrefix).append(":CancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(cancelURL));
			sb.append("</").append(preferredPrefix).append(":CancelURL>");
		}
		if(addressDisplayOptions != null) {
			sb.append("<").append(preferredPrefix).append(":AddressDisplayOptions>").append(SDKUtil.escapeInvalidXmlCharsRegex(addressDisplayOptions));
			sb.append("</").append(preferredPrefix).append(":AddressDisplayOptions>");
		}
		if(sharePhone != null) {
			sb.append("<").append(preferredPrefix).append(":SharePhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(sharePhone));
			sb.append("</").append(preferredPrefix).append(":SharePhone>");
		}
		if(shipToAddress != null) {
			sb.append(shipToAddress.toXMLString(preferredPrefix,"ShipToAddress"));
		}
		if(buyerEmail != null) {
			sb.append("<").append(preferredPrefix).append(":BuyerEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(buyerEmail));
			sb.append("</").append(preferredPrefix).append(":BuyerEmail>");
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