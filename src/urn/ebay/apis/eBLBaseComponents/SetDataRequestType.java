package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.BillingApprovalDetailsType;
import urn.ebay.apis.eBLBaseComponents.BuyerDetailType;
import urn.ebay.apis.eBLBaseComponents.InfoSharingDirectivesType;

/**
 * Details about Billing Agreements requested to be created. 
 */
public class SetDataRequestType{


	/**
	 * Details about Billing Agreements requested to be created. 	 
	 */ 
	private List<BillingApprovalDetailsType> BillingApprovalDetails = new ArrayList<BillingApprovalDetailsType>();

	/**
	 * Only needed if Auto Authorization is requested. The
	 * authentication session token will be passed in here. 	 
	 */ 
	private BuyerDetailType BuyerDetail;

	/**
	 * Requests for specific buyer information like Billing Address
	 * to be returned through GetExpressCheckoutDetails should be
	 * specified under this. 	 
	 */ 
	private InfoSharingDirectivesType InfoSharingDirectives;

	

	/**
	 * Default Constructor
	 */
	public SetDataRequestType (){
	}	

	/**
	 * Getter for BillingApprovalDetails
	 */
	 public List<BillingApprovalDetailsType> getBillingApprovalDetails() {
	 	return BillingApprovalDetails;
	 }
	 
	/**
	 * Setter for BillingApprovalDetails
	 */
	 public void setBillingApprovalDetails(List<BillingApprovalDetailsType> BillingApprovalDetails) {
	 	this.BillingApprovalDetails = BillingApprovalDetails;
	 }
	 
	/**
	 * Getter for BuyerDetail
	 */
	 public BuyerDetailType getBuyerDetail() {
	 	return BuyerDetail;
	 }
	 
	/**
	 * Setter for BuyerDetail
	 */
	 public void setBuyerDetail(BuyerDetailType BuyerDetail) {
	 	this.BuyerDetail = BuyerDetail;
	 }
	 
	/**
	 * Getter for InfoSharingDirectives
	 */
	 public InfoSharingDirectivesType getInfoSharingDirectives() {
	 	return InfoSharingDirectives;
	 }
	 
	/**
	 * Setter for InfoSharingDirectives
	 */
	 public void setInfoSharingDirectives(InfoSharingDirectivesType InfoSharingDirectives) {
	 	this.InfoSharingDirectives = InfoSharingDirectives;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(BillingApprovalDetails != null) {
			for(int i=0; i < BillingApprovalDetails.size(); i++) {
				sb.append("<ebl:BillingApprovalDetails>");
				sb.append(BillingApprovalDetails.get(i).toXMLString());
				sb.append("</ebl:BillingApprovalDetails>");
			}
		}
		if(BuyerDetail != null) {
			sb.append("<ebl:BuyerDetail>");
			sb.append(BuyerDetail.toXMLString());
			sb.append("</ebl:BuyerDetail>");
		}
		if(InfoSharingDirectives != null) {
			sb.append("<ebl:InfoSharingDirectives>");
			sb.append(InfoSharingDirectives.toXMLString());
			sb.append("</ebl:InfoSharingDirectives>");
		}
		return sb.toString();
	}

}