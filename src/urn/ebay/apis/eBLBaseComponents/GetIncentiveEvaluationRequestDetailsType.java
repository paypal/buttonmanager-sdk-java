package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveApplyIndicationType;
import urn.ebay.apis.eBLBaseComponents.IncentiveBucketType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestDetailsType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetIncentiveEvaluationRequestDetailsType{


	/**
	 * 	 
	 */ 
	private String ExternalBuyerId;

	/**
	 * 	 
	 */ 
	private List<String> IncentiveCodes = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private List<IncentiveApplyIndicationType> ApplyIndication = new ArrayList<IncentiveApplyIndicationType>();

	/**
	 * 	 
	 */ 
	private List<IncentiveBucketType> Buckets = new ArrayList<IncentiveBucketType>();

	/**
	 * 	 
	 */ 
	private BasicAmountType CartTotalAmt;

	/**
	 * 	 
	 */ 
	private IncentiveRequestDetailsType RequestDetails;

	

	/**
	 * Default Constructor
	 */
	public GetIncentiveEvaluationRequestDetailsType (){
	}	

	/**
	 * Getter for ExternalBuyerId
	 */
	 public String getExternalBuyerId() {
	 	return ExternalBuyerId;
	 }
	 
	/**
	 * Setter for ExternalBuyerId
	 */
	 public void setExternalBuyerId(String ExternalBuyerId) {
	 	this.ExternalBuyerId = ExternalBuyerId;
	 }
	 
	/**
	 * Getter for IncentiveCodes
	 */
	 public List<String> getIncentiveCodes() {
	 	return IncentiveCodes;
	 }
	 
	/**
	 * Setter for IncentiveCodes
	 */
	 public void setIncentiveCodes(List<String> IncentiveCodes) {
	 	this.IncentiveCodes = IncentiveCodes;
	 }
	 
	/**
	 * Getter for ApplyIndication
	 */
	 public List<IncentiveApplyIndicationType> getApplyIndication() {
	 	return ApplyIndication;
	 }
	 
	/**
	 * Setter for ApplyIndication
	 */
	 public void setApplyIndication(List<IncentiveApplyIndicationType> ApplyIndication) {
	 	this.ApplyIndication = ApplyIndication;
	 }
	 
	/**
	 * Getter for Buckets
	 */
	 public List<IncentiveBucketType> getBuckets() {
	 	return Buckets;
	 }
	 
	/**
	 * Setter for Buckets
	 */
	 public void setBuckets(List<IncentiveBucketType> Buckets) {
	 	this.Buckets = Buckets;
	 }
	 
	/**
	 * Getter for CartTotalAmt
	 */
	 public BasicAmountType getCartTotalAmt() {
	 	return CartTotalAmt;
	 }
	 
	/**
	 * Setter for CartTotalAmt
	 */
	 public void setCartTotalAmt(BasicAmountType CartTotalAmt) {
	 	this.CartTotalAmt = CartTotalAmt;
	 }
	 
	/**
	 * Getter for RequestDetails
	 */
	 public IncentiveRequestDetailsType getRequestDetails() {
	 	return RequestDetails;
	 }
	 
	/**
	 * Setter for RequestDetails
	 */
	 public void setRequestDetails(IncentiveRequestDetailsType RequestDetails) {
	 	this.RequestDetails = RequestDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ExternalBuyerId != null) {
			sb.append("<ebl:ExternalBuyerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExternalBuyerId));
			sb.append("</ebl:ExternalBuyerId>");
		}
		if(IncentiveCodes != null) {
			for(int i=0; i < IncentiveCodes.size(); i++) {
				sb.append("<ebl:IncentiveCodes>").append(SDKUtil.escapeInvalidXmlCharsRegex(IncentiveCodes.get(i)));
				sb.append("</ebl:IncentiveCodes>");
			}
		}
		if(ApplyIndication != null) {
			for(int i=0; i < ApplyIndication.size(); i++) {
				sb.append("<ebl:ApplyIndication>");
				sb.append(ApplyIndication.get(i).toXMLString());
				sb.append("</ebl:ApplyIndication>");
			}
		}
		if(Buckets != null) {
			for(int i=0; i < Buckets.size(); i++) {
				sb.append("<ebl:Buckets>");
				sb.append(Buckets.get(i).toXMLString());
				sb.append("</ebl:Buckets>");
			}
		}
		if(CartTotalAmt != null) {
			sb.append("<ebl:CartTotalAmt");
			sb.append(CartTotalAmt.toXMLString());
			sb.append("</ebl:CartTotalAmt>");
		}
		if(RequestDetails != null) {
			sb.append("<ebl:RequestDetails>");
			sb.append(RequestDetails.toXMLString());
			sb.append("</ebl:RequestDetails>");
		}
		return sb.toString();
	}

}