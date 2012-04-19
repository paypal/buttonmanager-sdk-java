
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;


/**
 */
public class BAUpdateRequestType extends AbstractRequestType{

	/**
	 *
	 * @Required
	 */
	private String ReferenceID;
	public String getReferenceID() {
		return ReferenceID;
	}
	public void setReferenceID(String value) {
		this.ReferenceID = value;
	}

	/**
	 */
	private String BillingAgreementDescription;
	public String getBillingAgreementDescription() {
		return BillingAgreementDescription;
	}
	public void setBillingAgreementDescription(String value) {
		this.BillingAgreementDescription = value;
	}

	/**
	 */
	private MerchantPullStatusCodeType BillingAgreementStatus;
	public MerchantPullStatusCodeType getBillingAgreementStatus() {
		return BillingAgreementStatus;
	}
	public void setBillingAgreementStatus(MerchantPullStatusCodeType value) {
		this.BillingAgreementStatus = value;
	}

	/**
	 */
	private String BillingAgreementCustom;
	public String getBillingAgreementCustom() {
		return BillingAgreementCustom;
	}
	public void setBillingAgreementCustom(String value) {
		this.BillingAgreementCustom = value;
	}


	public BAUpdateRequestType(String ReferenceID) {
		this.ReferenceID = ReferenceID;
	}
	public BAUpdateRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( ReferenceID != null ) {
			sb.append("<urn:ReferenceID>").append(ReferenceID);
			sb.append("</urn:ReferenceID>");
		}
		if( BillingAgreementDescription != null ) {
			sb.append("<urn:BillingAgreementDescription>").append(BillingAgreementDescription);
			sb.append("</urn:BillingAgreementDescription>");
		}
		if( BillingAgreementStatus != null ) {
			sb.append("<urn:BillingAgreementStatus>").append( BillingAgreementStatus.getValue());
			sb.append("</urn:BillingAgreementStatus>");
		}
		if( BillingAgreementCustom != null ) {
			sb.append("<urn:BillingAgreementCustom>").append(BillingAgreementCustom);
			sb.append("</urn:BillingAgreementCustom>");
		}
		return sb.toString();
	}

}
