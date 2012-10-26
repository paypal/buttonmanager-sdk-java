package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.BillingApprovalDetailsType;
import urn.ebay.apis.eBLBaseComponents.BuyerDetailType;
import urn.ebay.apis.eBLBaseComponents.InfoSharingDirectivesType;
import com.paypal.core.SDKUtil;

/**
 * Details about Billing Agreements requested to be created. 
 */
public class SetDataRequestType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * Details about Billing Agreements requested to be created. 	 
	 */ 
	private List<BillingApprovalDetailsType> billingApprovalDetails = new ArrayList<BillingApprovalDetailsType>();

	/**
	 * Only needed if Auto Authorization is requested. The
	 * authentication session token will be passed in here. 	 
	 */ 
	private BuyerDetailType buyerDetail;

	/**
	 * Requests for specific buyer information like Billing Address
	 * to be returned through GetExpressCheckoutDetails should be
	 * specified under this. 	 
	 */ 
	private InfoSharingDirectivesType infoSharingDirectives;

	

	/**
	 * Default Constructor
	 */
	public SetDataRequestType (){
	}	

	/**
	 * Getter for billingApprovalDetails
	 */
	 public List<BillingApprovalDetailsType> getBillingApprovalDetails() {
	 	return billingApprovalDetails;
	 }
	 
	/**
	 * Setter for billingApprovalDetails
	 */
	 public void setBillingApprovalDetails(List<BillingApprovalDetailsType> billingApprovalDetails) {
	 	this.billingApprovalDetails = billingApprovalDetails;
	 }
	 
	/**
	 * Getter for buyerDetail
	 */
	 public BuyerDetailType getBuyerDetail() {
	 	return buyerDetail;
	 }
	 
	/**
	 * Setter for buyerDetail
	 */
	 public void setBuyerDetail(BuyerDetailType buyerDetail) {
	 	this.buyerDetail = buyerDetail;
	 }
	 
	/**
	 * Getter for infoSharingDirectives
	 */
	 public InfoSharingDirectivesType getInfoSharingDirectives() {
	 	return infoSharingDirectives;
	 }
	 
	/**
	 * Setter for infoSharingDirectives
	 */
	 public void setInfoSharingDirectives(InfoSharingDirectivesType infoSharingDirectives) {
	 	this.infoSharingDirectives = infoSharingDirectives;
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
		if(billingApprovalDetails != null) {
			for(int i=0; i < billingApprovalDetails.size(); i++) {
				sb.append(billingApprovalDetails.get(i).toXMLString(preferredPrefix,"BillingApprovalDetails"));
			}
		}
		if(buyerDetail != null) {
			sb.append(buyerDetail.toXMLString(preferredPrefix,"BuyerDetail"));
		}
		if(infoSharingDirectives != null) {
			sb.append(infoSharingDirectives.toXMLString(preferredPrefix,"InfoSharingDirectives"));
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