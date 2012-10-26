package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.MerchantPullPaymentType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * This flag indicates that the response should include
 * FMFDetails 
 */
public class BillUserRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private MerchantPullPaymentType merchantPullPaymentDetails;

	/**
	 * This flag indicates that the response should include
	 * FMFDetails	 
	 */ 
	private Integer returnFMFDetails;

	

	/**
	 * Default Constructor
	 */
	public BillUserRequestType (){
	}	

	/**
	 * Getter for merchantPullPaymentDetails
	 */
	 public MerchantPullPaymentType getMerchantPullPaymentDetails() {
	 	return merchantPullPaymentDetails;
	 }
	 
	/**
	 * Setter for merchantPullPaymentDetails
	 */
	 public void setMerchantPullPaymentDetails(MerchantPullPaymentType merchantPullPaymentDetails) {
	 	this.merchantPullPaymentDetails = merchantPullPaymentDetails;
	 }
	 
	/**
	 * Getter for returnFMFDetails
	 */
	 public Integer getReturnFMFDetails() {
	 	return returnFMFDetails;
	 }
	 
	/**
	 * Setter for returnFMFDetails
	 */
	 public void setReturnFMFDetails(Integer returnFMFDetails) {
	 	this.returnFMFDetails = returnFMFDetails;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		sb.append(super.toXMLString(prefix, null));
		if(merchantPullPaymentDetails != null) {
			sb.append(merchantPullPaymentDetails.toXMLString(null,"MerchantPullPaymentDetails"));
		}
		if(returnFMFDetails != null) {
			sb.append("<").append(preferredPrefix).append(":ReturnFMFDetails>").append(SDKUtil.escapeInvalidXmlCharsRegex(returnFMFDetails));
			sb.append("</").append(preferredPrefix).append(":ReturnFMFDetails>");
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}