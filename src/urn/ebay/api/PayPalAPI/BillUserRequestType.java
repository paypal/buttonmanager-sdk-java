
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentType;


/**
 * This flag indicates that the response should include FMFDetails
 */
public class BillUserRequestType extends AbstractRequestType{

	/**
	 */
	private MerchantPullPaymentType MerchantPullPaymentDetails;
	public MerchantPullPaymentType getMerchantPullPaymentDetails() {
		return MerchantPullPaymentDetails;
	}
	public void setMerchantPullPaymentDetails(MerchantPullPaymentType value) {
		this.MerchantPullPaymentDetails = value;
	}

	/**
This flag indicates that the response should include FMFDetails	 */
	private Integer ReturnFMFDetails;
	public Integer getReturnFMFDetails() {
		return ReturnFMFDetails;
	}
	public void setReturnFMFDetails(Integer value) {
		this.ReturnFMFDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( MerchantPullPaymentDetails != null ) {
			sb.append("<ebl:MerchantPullPaymentDetails>");
			sb.append(MerchantPullPaymentDetails.toXMLString());
			sb.append("</ebl:MerchantPullPaymentDetails>");
		}
		if( ReturnFMFDetails != null ) {
			sb.append("<urn:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}
