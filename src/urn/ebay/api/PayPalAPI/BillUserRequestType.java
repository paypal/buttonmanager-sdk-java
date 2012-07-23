package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class BillUserRequestType extends AbstractRequestType {


	/**
	 * No Document Comments	 
	 */ 
	private MerchantPullPaymentType MerchantPullPaymentDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer ReturnFMFDetails;

	

	/**
	 * Default Constructor
	 */
	public BillUserRequestType (){
	}	

	/**
	 * Getter for MerchantPullPaymentDetails
	 */
	 public MerchantPullPaymentType getMerchantPullPaymentDetails() {
	 	return MerchantPullPaymentDetails;
	 }
	 
	/**
	 * Setter for MerchantPullPaymentDetails
	 */
	 public void setMerchantPullPaymentDetails(MerchantPullPaymentType MerchantPullPaymentDetails) {
	 	this.MerchantPullPaymentDetails = MerchantPullPaymentDetails;
	 }
	 
	/**
	 * Getter for ReturnFMFDetails
	 */
	 public Integer getReturnFMFDetails() {
	 	return ReturnFMFDetails;
	 }
	 
	/**
	 * Setter for ReturnFMFDetails
	 */
	 public void setReturnFMFDetails(Integer ReturnFMFDetails) {
	 	this.ReturnFMFDetails = ReturnFMFDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(MerchantPullPaymentDetails != null) {
			sb.append("<ebl:MerchantPullPaymentDetails>");
			sb.append(MerchantPullPaymentDetails.toXMLString());
			sb.append("</ebl:MerchantPullPaymentDetails>");
		}
		if(ReturnFMFDetails != null) {
			sb.append("<urn:ReturnFMFDetails>").append(ReturnFMFDetails);
			sb.append("</urn:ReturnFMFDetails>");
		}
		return sb.toString();
	}

}