
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.BillingCodeType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;


/**
 */
public class BillingAgreementDetailsType {

	/**
	 *
	 * @Required
	 */
	private BillingCodeType BillingType;
	public BillingCodeType getBillingType() {
		return BillingType;
	}
	public void setBillingType(BillingCodeType value) {
		this.BillingType = value;
	}

	/**
	 * Only needed for AutoBill billinng type.
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
	private MerchantPullPaymentCodeType PaymentType;
	public MerchantPullPaymentCodeType getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(MerchantPullPaymentCodeType value) {
		this.PaymentType = value;
	}

	/**
	 * Custom annotation field for your exclusive use.
	 */
	private String BillingAgreementCustom;
	public String getBillingAgreementCustom() {
		return BillingAgreementCustom;
	}
	public void setBillingAgreementCustom(String value) {
		this.BillingAgreementCustom = value;
	}


	public BillingAgreementDetailsType(BillingCodeType BillingType) {
		this.BillingType = BillingType;
	}
	public BillingAgreementDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( BillingType != null ) {
			sb.append("<ebl:BillingType>").append( BillingType.getValue());
			sb.append("</ebl:BillingType>");
		}
		if( BillingAgreementDescription != null ) {
			sb.append("<ebl:BillingAgreementDescription>").append(BillingAgreementDescription);
			sb.append("</ebl:BillingAgreementDescription>");
		}
		if( PaymentType != null ) {
			sb.append("<ebl:PaymentType>").append( PaymentType.getValue());
			sb.append("</ebl:PaymentType>");
		}
		if( BillingAgreementCustom != null ) {
			sb.append("<ebl:BillingAgreementCustom>").append(BillingAgreementCustom);
			sb.append("</ebl:BillingAgreementCustom>");
		}
		return sb.toString();
	}

}
