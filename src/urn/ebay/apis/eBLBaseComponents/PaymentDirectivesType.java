
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentCodeType;


/**
 * Type of the Payment is it Instant or Echeck or Any.
 */
public class PaymentDirectivesType {

	/**
Type of the Payment is it Instant or Echeck or Any.	 */
	private MerchantPullPaymentCodeType PaymentType;
	public MerchantPullPaymentCodeType getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(MerchantPullPaymentCodeType value) {
		this.PaymentType = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( PaymentType != null ) {
			sb.append("<ebl:PaymentType>").append( PaymentType.getValue());
			sb.append("</ebl:PaymentType>");
		}
		return sb.toString();
	}

}
