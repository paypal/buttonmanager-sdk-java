
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.IdentificationInfoType;
import urn.ebay.apis.eBLBaseComponents.TaxIdDetailsType;


/**
 * Details about the buyer's account passed in by the merchant or partner.
 * Optional.
 */
public class BuyerDetailsType {

	/**
	 * The client's unique ID for this user.
	 */
	private String BuyerId;
	public String getBuyerId() {
		return BuyerId;
	}
	public void setBuyerId(String value) {
		this.BuyerId = value;
	}

	/**
	 * The user name of the user at the marketplaces site.
	 */
	private String BuyerUserName;
	public String getBuyerUserName() {
		return BuyerUserName;
	}
	public void setBuyerUserName(String value) {
		this.BuyerUserName = value;
	}

	/**
	 * Date when the user registered with the marketplace.
	 */
	private String BuyerRegistrationDate;
	public String getBuyerRegistrationDate() {
		return BuyerRegistrationDate;
	}
	public void setBuyerRegistrationDate(String value) {
		this.BuyerRegistrationDate = value;
	}

	/**
	 * Details about payer's tax info.
	 * Refer to the TaxIdDetailsType for more details.
	 */
	private TaxIdDetailsType TaxIdDetails;
	public TaxIdDetailsType getTaxIdDetails() {
		return TaxIdDetails;
	}
	public void setTaxIdDetails(TaxIdDetailsType value) {
		this.TaxIdDetails = value;
	}

	/**
	 * Contains information that identifies the buyer. e.g. email address or the external remember me id.
	 */
	private IdentificationInfoType IdentificationInfo;
	public IdentificationInfoType getIdentificationInfo() {
		return IdentificationInfo;
	}
	public void setIdentificationInfo(IdentificationInfoType value) {
		this.IdentificationInfo = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( BuyerId != null ) {
			sb.append("<ebl:BuyerId>").append(BuyerId);
			sb.append("</ebl:BuyerId>");
		}
		if( BuyerUserName != null ) {
			sb.append("<ebl:BuyerUserName>").append(BuyerUserName);
			sb.append("</ebl:BuyerUserName>");
		}
		if( BuyerRegistrationDate != null ) {
			sb.append("<ebl:BuyerRegistrationDate>").append(BuyerRegistrationDate);
			sb.append("</ebl:BuyerRegistrationDate>");
		}
		if( TaxIdDetails != null ) {
			sb.append("<ebl:TaxIdDetails>");
			sb.append(TaxIdDetails.toXMLString());
			sb.append("</ebl:TaxIdDetails>");
		}
		if( IdentificationInfo != null ) {
			sb.append("<ebl:IdentificationInfo>");
			sb.append(IdentificationInfo.toXMLString());
			sb.append("</ebl:IdentificationInfo>");
		}
		return sb.toString();
	}

}
