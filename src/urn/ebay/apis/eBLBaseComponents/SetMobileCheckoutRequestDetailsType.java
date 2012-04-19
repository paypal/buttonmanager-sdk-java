
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.PhoneNumberType;


/**
 * The phone number of the buyer's mobile device, if available.
 * Optional
 */
public class SetMobileCheckoutRequestDetailsType {

	/**
The phone number of the buyer's mobile device, if available.
	 * Optional
	 */
	private PhoneNumberType BuyerPhone;
	public PhoneNumberType getBuyerPhone() {
		return BuyerPhone;
	}
	public void setBuyerPhone(PhoneNumberType value) {
		this.BuyerPhone = value;
	}

	/**
	 * Cost of this item before tax and shipping.
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Required
	 *
	 * @Required
	 */
	private BasicAmountType ItemAmount;
	public BasicAmountType getItemAmount() {
		return ItemAmount;
	}
	public void setItemAmount(BasicAmountType value) {
		this.ItemAmount = value;
	}

	/**
	 * Tax amount for this item.
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Optional
	 */
	private BasicAmountType Tax;
	public BasicAmountType getTax() {
		return Tax;
	}
	public void setTax(BasicAmountType value) {
		this.Tax = value;
	}

	/**
	 * Shipping amount for this item.
You must set the currencyID attribute to one of the three-character currency codes for any of the supported PayPal currencies.
	 * Optional
	 */
	private BasicAmountType Shipping;
	public BasicAmountType getShipping() {
		return Shipping;
	}
	public void setShipping(BasicAmountType value) {
		this.Shipping = value;
	}

	/**
Description of the item that the customer is purchasing. 
	 * Required
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 *
	 * @Required
	 */
	private String ItemName;
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String value) {
		this.ItemName = value;
	}

	/**
Reference number of the item that the customer is purchasing. 
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String ItemNumber;
	public String getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(String value) {
		this.ItemNumber = value;
	}

	/**
A free-form field for your own use, such as a tracking number or other value you want returned to you in IPN.
	 * Optional
	 * Character length and limitations: 256 single-byte alphanumeric characters
	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}

	/**
Your own unique invoice or tracking number.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}

	/**
URL to which the customer's browser is returned after choosing to pay with PayPal. PayPal recommends that the value of ReturnURL be the final review page on which the customer confirms the order and payment. 
	 * Required
	 * Character length and limitations: no limit. 	 *
	 * @Required
	 */
	private String ReturnURL;
	public String getReturnURL() {
		return ReturnURL;
	}
	public void setReturnURL(String value) {
		this.ReturnURL = value;
	}

	/**
URL to which the customer is returned if he does not approve the use of PayPal to pay you. PayPal recommends that the value of CancelURL be the original page on which the customer chose to pay with PayPal. 
	 * Optional
	 * Character length and limitations: no limit
	 */
	private String CancelURL;
	public String getCancelURL() {
		return CancelURL;
	}
	public void setCancelURL(String value) {
		this.CancelURL = value;
	}

	/**
The value 1 indicates that you require that the customer's shipping address on file with PayPal be a confirmed address. Setting this element overrides the setting you have specified in your Merchant Account Profile. 
	 * Optional
	 */
	private Integer AddressDisplayOptions;
	public Integer getAddressDisplayOptions() {
		return AddressDisplayOptions;
	}
	public void setAddressDisplayOptions(Integer value) {
		this.AddressDisplayOptions = value;
	}

	/**
The value 1 indicates that you require that the customer specifies a contact phone for the transactxion.  Default is 0 / none required.
	 * Optional
	 */
	private Integer SharePhone;
	public Integer getSharePhone() {
		return SharePhone;
	}
	public void setSharePhone(Integer value) {
		this.SharePhone = value;
	}

	/**
Customer's shipping address. 
	 * Optional
	 */
	private AddressType ShipToAddress;
	public AddressType getShipToAddress() {
		return ShipToAddress;
	}
	public void setShipToAddress(AddressType value) {
		this.ShipToAddress = value;
	}

	/**
	 * Email address of the buyer as entered during checkout. PayPal uses this value to pre-fill the login portion of the PayPal login page. 
	 * Optional
	 * Character length and limit: 127 single-byte alphanumeric characters 
	 */
	private String BuyerEmail;
	public String getBuyerEmail() {
		return BuyerEmail;
	}
	public void setBuyerEmail(String value) {
		this.BuyerEmail = value;
	}


	public SetMobileCheckoutRequestDetailsType(BasicAmountType ItemAmount, String ItemName, String ReturnURL) {
		this.ItemAmount = ItemAmount;
		this.ItemName = ItemName;
		this.ReturnURL = ReturnURL;
	}
	public SetMobileCheckoutRequestDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( BuyerPhone != null ) {
			sb.append("<ebl:BuyerPhone>");
			sb.append(BuyerPhone.toXMLString());
			sb.append("</ebl:BuyerPhone>");
		}
		if( ItemAmount != null ) {
			sb.append("<ebl:ItemAmount ");
			sb.append(ItemAmount.toXMLString());
			sb.append("</ebl:ItemAmount>");
		}
		if( Tax != null ) {
			sb.append("<ebl:Tax ");
			sb.append(Tax.toXMLString());
			sb.append("</ebl:Tax>");
		}
		if( Shipping != null ) {
			sb.append("<ebl:Shipping ");
			sb.append(Shipping.toXMLString());
			sb.append("</ebl:Shipping>");
		}
		if( ItemName != null ) {
			sb.append("<ebl:ItemName>").append(ItemName);
			sb.append("</ebl:ItemName>");
		}
		if( ItemNumber != null ) {
			sb.append("<ebl:ItemNumber>").append(ItemNumber);
			sb.append("</ebl:ItemNumber>");
		}
		if( Custom != null ) {
			sb.append("<ebl:Custom>").append(Custom);
			sb.append("</ebl:Custom>");
		}
		if( InvoiceID != null ) {
			sb.append("<ebl:InvoiceID>").append(InvoiceID);
			sb.append("</ebl:InvoiceID>");
		}
		if( ReturnURL != null ) {
			sb.append("<ebl:ReturnURL>").append(ReturnURL);
			sb.append("</ebl:ReturnURL>");
		}
		if( CancelURL != null ) {
			sb.append("<ebl:CancelURL>").append(CancelURL);
			sb.append("</ebl:CancelURL>");
		}
		if( AddressDisplayOptions != null ) {
			sb.append("<ebl:AddressDisplayOptions>").append(AddressDisplayOptions);
			sb.append("</ebl:AddressDisplayOptions>");
		}
		if( SharePhone != null ) {
			sb.append("<ebl:SharePhone>").append(SharePhone);
			sb.append("</ebl:SharePhone>");
		}
		if( ShipToAddress != null ) {
			sb.append("<ebl:ShipToAddress>");
			sb.append(ShipToAddress.toXMLString());
			sb.append("</ebl:ShipToAddress>");
		}
		if( BuyerEmail != null ) {
			sb.append("<ebl:BuyerEmail>").append(BuyerEmail);
			sb.append("</ebl:BuyerEmail>");
		}
		return sb.toString();
	}

}
