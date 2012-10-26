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


	/**
	 * The phone number of the buyer's mobile device, if available.
	 * Optional 	 
	 */ 
	private PhoneNumberType BuyerPhone;

	/**
	 * Cost of this item before tax and shipping.You must set the
	 * currencyID attribute to one of the three-character currency
	 * codes for any of the supported PayPal currencies. Required	  
	 *@Required	 
	 */ 
	private BasicAmountType ItemAmount;

	/**
	 * Tax amount for this item.You must set the currencyID
	 * attribute to one of the three-character currency codes for
	 * any of the supported PayPal currencies. Optional	 
	 */ 
	private BasicAmountType Tax;

	/**
	 * Shipping amount for this item.You must set the currencyID
	 * attribute to one of the three-character currency codes for
	 * any of the supported PayPal currencies. Optional	 
	 */ 
	private BasicAmountType Shipping;

	/**
	 * Description of the item that the customer is purchasing.
	 * Required Character length and limitations: 127 single-byte
	 * alphanumeric characters	  
	 *@Required	 
	 */ 
	private String ItemName;

	/**
	 * Reference number of the item that the customer is
	 * purchasing. Optional Character length and limitations: 127
	 * single-byte alphanumeric characters	 
	 */ 
	private String ItemNumber;

	/**
	 * A free-form field for your own use, such as a tracking
	 * number or other value you want returned to you in IPN.
	 * Optional Character length and limitations: 256 single-byte
	 * alphanumeric characters	 
	 */ 
	private String Custom;

	/**
	 * Your own unique invoice or tracking number. Optional
	 * Character length and limitations: 127 single-byte
	 * alphanumeric characters	 
	 */ 
	private String InvoiceID;

	/**
	 * URL to which the customer's browser is returned after
	 * choosing to pay with PayPal. PayPal recommends that the
	 * value of ReturnURL be the final review page on which the
	 * customer confirms the order and payment. Required Character
	 * length and limitations: no limit. 	  
	 *@Required	 
	 */ 
	private String ReturnURL;

	/**
	 * URL to which the customer is returned if he does not approve
	 * the use of PayPal to pay you. PayPal recommends that the
	 * value of CancelURL be the original page on which the
	 * customer chose to pay with PayPal. Optional Character length
	 * and limitations: no limit	 
	 */ 
	private String CancelURL;

	/**
	 * The value 1 indicates that you require that the customer's
	 * shipping address on file with PayPal be a confirmed address.
	 * Setting this element overrides the setting you have
	 * specified in your Merchant Account Profile. Optional	 
	 */ 
	private Integer AddressDisplayOptions;

	/**
	 * The value 1 indicates that you require that the customer
	 * specifies a contact phone for the transactxion. Default is 0
	 * / none required. Optional	 
	 */ 
	private Integer SharePhone;

	/**
	 * Customer's shipping address. Optional	 
	 */ 
	private AddressType ShipToAddress;

	/**
	 * Email address of the buyer as entered during checkout.
	 * PayPal uses this value to pre-fill the login portion of the
	 * PayPal login page. Optional Character length and limit: 127
	 * single-byte alphanumeric characters 	 
	 */ 
	private String BuyerEmail;

	

	/**
	 * Constructor with arguments
	 */
	public SetMobileCheckoutRequestDetailsType (BasicAmountType ItemAmount, String ItemName, String ReturnURL){
		this.ItemAmount = ItemAmount;
		this.ItemName = ItemName;
		this.ReturnURL = ReturnURL;
	}	

	/**
	 * Default Constructor
	 */
	public SetMobileCheckoutRequestDetailsType (){
	}	

	/**
	 * Getter for BuyerPhone
	 */
	 public PhoneNumberType getBuyerPhone() {
	 	return BuyerPhone;
	 }
	 
	/**
	 * Setter for BuyerPhone
	 */
	 public void setBuyerPhone(PhoneNumberType BuyerPhone) {
	 	this.BuyerPhone = BuyerPhone;
	 }
	 
	/**
	 * Getter for ItemAmount
	 */
	 public BasicAmountType getItemAmount() {
	 	return ItemAmount;
	 }
	 
	/**
	 * Setter for ItemAmount
	 */
	 public void setItemAmount(BasicAmountType ItemAmount) {
	 	this.ItemAmount = ItemAmount;
	 }
	 
	/**
	 * Getter for Tax
	 */
	 public BasicAmountType getTax() {
	 	return Tax;
	 }
	 
	/**
	 * Setter for Tax
	 */
	 public void setTax(BasicAmountType Tax) {
	 	this.Tax = Tax;
	 }
	 
	/**
	 * Getter for Shipping
	 */
	 public BasicAmountType getShipping() {
	 	return Shipping;
	 }
	 
	/**
	 * Setter for Shipping
	 */
	 public void setShipping(BasicAmountType Shipping) {
	 	this.Shipping = Shipping;
	 }
	 
	/**
	 * Getter for ItemName
	 */
	 public String getItemName() {
	 	return ItemName;
	 }
	 
	/**
	 * Setter for ItemName
	 */
	 public void setItemName(String ItemName) {
	 	this.ItemName = ItemName;
	 }
	 
	/**
	 * Getter for ItemNumber
	 */
	 public String getItemNumber() {
	 	return ItemNumber;
	 }
	 
	/**
	 * Setter for ItemNumber
	 */
	 public void setItemNumber(String ItemNumber) {
	 	this.ItemNumber = ItemNumber;
	 }
	 
	/**
	 * Getter for Custom
	 */
	 public String getCustom() {
	 	return Custom;
	 }
	 
	/**
	 * Setter for Custom
	 */
	 public void setCustom(String Custom) {
	 	this.Custom = Custom;
	 }
	 
	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
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
	 * Getter for AddressDisplayOptions
	 */
	 public Integer getAddressDisplayOptions() {
	 	return AddressDisplayOptions;
	 }
	 
	/**
	 * Setter for AddressDisplayOptions
	 */
	 public void setAddressDisplayOptions(Integer AddressDisplayOptions) {
	 	this.AddressDisplayOptions = AddressDisplayOptions;
	 }
	 
	/**
	 * Getter for SharePhone
	 */
	 public Integer getSharePhone() {
	 	return SharePhone;
	 }
	 
	/**
	 * Setter for SharePhone
	 */
	 public void setSharePhone(Integer SharePhone) {
	 	this.SharePhone = SharePhone;
	 }
	 
	/**
	 * Getter for ShipToAddress
	 */
	 public AddressType getShipToAddress() {
	 	return ShipToAddress;
	 }
	 
	/**
	 * Setter for ShipToAddress
	 */
	 public void setShipToAddress(AddressType ShipToAddress) {
	 	this.ShipToAddress = ShipToAddress;
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
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BuyerPhone != null) {
			sb.append("<ebl:BuyerPhone>");
			sb.append(BuyerPhone.toXMLString());
			sb.append("</ebl:BuyerPhone>");
		}
		if(ItemAmount != null) {
			sb.append("<ebl:ItemAmount");
			sb.append(ItemAmount.toXMLString());
			sb.append("</ebl:ItemAmount>");
		}
		if(Tax != null) {
			sb.append("<ebl:Tax");
			sb.append(Tax.toXMLString());
			sb.append("</ebl:Tax>");
		}
		if(Shipping != null) {
			sb.append("<ebl:Shipping");
			sb.append(Shipping.toXMLString());
			sb.append("</ebl:Shipping>");
		}
		if(ItemName != null) {
			sb.append("<ebl:ItemName>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemName));
			sb.append("</ebl:ItemName>");
		}
		if(ItemNumber != null) {
			sb.append("<ebl:ItemNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(ItemNumber));
			sb.append("</ebl:ItemNumber>");
		}
		if(Custom != null) {
			sb.append("<ebl:Custom>").append(SDKUtil.escapeInvalidXmlCharsRegex(Custom));
			sb.append("</ebl:Custom>");
		}
		if(InvoiceID != null) {
			sb.append("<ebl:InvoiceID>").append(SDKUtil.escapeInvalidXmlCharsRegex(InvoiceID));
			sb.append("</ebl:InvoiceID>");
		}
		if(ReturnURL != null) {
			sb.append("<ebl:ReturnURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(ReturnURL));
			sb.append("</ebl:ReturnURL>");
		}
		if(CancelURL != null) {
			sb.append("<ebl:CancelURL>").append(SDKUtil.escapeInvalidXmlCharsRegex(CancelURL));
			sb.append("</ebl:CancelURL>");
		}
		if(AddressDisplayOptions != null) {
			sb.append("<ebl:AddressDisplayOptions>").append(SDKUtil.escapeInvalidXmlCharsRegex(AddressDisplayOptions));
			sb.append("</ebl:AddressDisplayOptions>");
		}
		if(SharePhone != null) {
			sb.append("<ebl:SharePhone>").append(SDKUtil.escapeInvalidXmlCharsRegex(SharePhone));
			sb.append("</ebl:SharePhone>");
		}
		if(ShipToAddress != null) {
			sb.append("<ebl:ShipToAddress>");
			sb.append(ShipToAddress.toXMLString());
			sb.append("</ebl:ShipToAddress>");
		}
		if(BuyerEmail != null) {
			sb.append("<ebl:BuyerEmail>").append(SDKUtil.escapeInvalidXmlCharsRegex(BuyerEmail));
			sb.append("</ebl:BuyerEmail>");
		}
		return sb.toString();
	}


}