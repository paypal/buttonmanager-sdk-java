
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.RedeemedOfferType;


/**
 * Describes discount information
 */
public class DiscountType {

	/**
Item nameOptional
	 * Character length and limits: 127 single-byte characters
	 */
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String value) {
		this.Name = value;
	}

	/**
description of the discountOptional
	 * Character length and limits: 127 single-byte characters
	 */
	private String Description;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String value) {
		this.Description = value;
	}

	/**
amount discountedOptional
	 *
	 * @Required
	 */
	private BasicAmountType Amount;
	public BasicAmountType getAmount() {
		return Amount;
	}
	public void setAmount(BasicAmountType value) {
		this.Amount = value;
	}

	/**
offer typeOptional
	 */
	private RedeemedOfferType RedeemedOfferType;
	public RedeemedOfferType getRedeemedOfferType() {
		return RedeemedOfferType;
	}
	public void setRedeemedOfferType(RedeemedOfferType value) {
		this.RedeemedOfferType = value;
	}

	/**
offer IDOptional
	 * Character length and limits: 64 single-byte characters
	 */
	private String RedeemedOfferID;
	public String getRedeemedOfferID() {
		return RedeemedOfferID;
	}
	public void setRedeemedOfferID(String value) {
		this.RedeemedOfferID = value;
	}


	public DiscountType(BasicAmountType Amount) {
		this.Amount = Amount;
	}
	public DiscountType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Name != null ) {
			sb.append("<ebl:Name>").append(Name);
			sb.append("</ebl:Name>");
		}
		if( Description != null ) {
			sb.append("<ebl:Description>").append(Description);
			sb.append("</ebl:Description>");
		}
		if( Amount != null ) {
			sb.append("<ebl:Amount ");
			sb.append(Amount.toXMLString());
			sb.append("</ebl:Amount>");
		}
		if( RedeemedOfferType != null ) {
			sb.append("<ebl:RedeemedOfferType>").append( RedeemedOfferType.getValue());
			sb.append("</ebl:RedeemedOfferType>");
		}
		if( RedeemedOfferID != null ) {
			sb.append("<ebl:RedeemedOfferID>").append(RedeemedOfferID);
			sb.append("</ebl:RedeemedOfferID>");
		}
		return sb.toString();
	}

}
