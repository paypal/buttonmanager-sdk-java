package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.RedeemedOfferType;
import com.paypal.core.SDKUtil;

/**
 * Describes discount information 
 */
public class DiscountType{


	/**
	 * Item nameOptional Character length and limits: 127
	 * single-byte characters 	 
	 */ 
	private String Name;

	/**
	 * description of the discountOptional Character length and
	 * limits: 127 single-byte characters 	 
	 */ 
	private String Description;

	/**
	 * amount discountedOptional 	  
	 *@Required	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * offer typeOptional 	 
	 */ 
	private RedeemedOfferType RedeemedOfferType;

	/**
	 * offer IDOptional Character length and limits: 64 single-byte
	 * characters 	 
	 */ 
	private String RedeemedOfferID;

	

	/**
	 * Constructor with arguments
	 */
	public DiscountType (BasicAmountType Amount){
		this.Amount = Amount;
	}	

	/**
	 * Default Constructor
	 */
	public DiscountType (){
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
	 * Getter for Description
	 */
	 public String getDescription() {
	 	return Description;
	 }
	 
	/**
	 * Setter for Description
	 */
	 public void setDescription(String Description) {
	 	this.Description = Description;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for RedeemedOfferType
	 */
	 public RedeemedOfferType getRedeemedOfferType() {
	 	return RedeemedOfferType;
	 }
	 
	/**
	 * Setter for RedeemedOfferType
	 */
	 public void setRedeemedOfferType(RedeemedOfferType RedeemedOfferType) {
	 	this.RedeemedOfferType = RedeemedOfferType;
	 }
	 
	/**
	 * Getter for RedeemedOfferID
	 */
	 public String getRedeemedOfferID() {
	 	return RedeemedOfferID;
	 }
	 
	/**
	 * Setter for RedeemedOfferID
	 */
	 public void setRedeemedOfferID(String RedeemedOfferID) {
	 	this.RedeemedOfferID = RedeemedOfferID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Name != null) {
			sb.append("<ebl:Name>").append(SDKUtil.escapeInvalidXmlCharsRegex(Name));
			sb.append("</ebl:Name>");
		}
		if(Description != null) {
			sb.append("<ebl:Description>").append(SDKUtil.escapeInvalidXmlCharsRegex(Description));
			sb.append("</ebl:Description>");
		}
		if(Amount != null) {
			sb.append("<ebl:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if(RedeemedOfferType != null) {
			sb.append("<ebl:RedeemedOfferType>").append(SDKUtil.escapeInvalidXmlCharsRegex(RedeemedOfferType.getValue()));
			sb.append("</ebl:RedeemedOfferType>");
		}
		if(RedeemedOfferID != null) {
			sb.append("<ebl:RedeemedOfferID>").append(SDKUtil.escapeInvalidXmlCharsRegex(RedeemedOfferID));
			sb.append("</ebl:RedeemedOfferID>");
		}
		return sb.toString();
	}

}