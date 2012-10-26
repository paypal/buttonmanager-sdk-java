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

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String externalBuyerId;

	/**
	 * 	 
	 */ 
	private List<String> incentiveCodes = new ArrayList<String>();

	/**
	 * 	 
	 */ 
	private List<IncentiveApplyIndicationType> applyIndication = new ArrayList<IncentiveApplyIndicationType>();

	/**
	 * 	 
	 */ 
	private List<IncentiveBucketType> buckets = new ArrayList<IncentiveBucketType>();

	/**
	 * 	 
	 */ 
	private BasicAmountType cartTotalAmt;

	/**
	 * 	 
	 */ 
	private IncentiveRequestDetailsType requestDetails;

	

	/**
	 * Default Constructor
	 */
	public GetIncentiveEvaluationRequestDetailsType (){
	}	

	/**
	 * Getter for externalBuyerId
	 */
	 public String getExternalBuyerId() {
	 	return externalBuyerId;
	 }
	 
	/**
	 * Setter for externalBuyerId
	 */
	 public void setExternalBuyerId(String externalBuyerId) {
	 	this.externalBuyerId = externalBuyerId;
	 }
	 
	/**
	 * Getter for incentiveCodes
	 */
	 public List<String> getIncentiveCodes() {
	 	return incentiveCodes;
	 }
	 
	/**
	 * Setter for incentiveCodes
	 */
	 public void setIncentiveCodes(List<String> incentiveCodes) {
	 	this.incentiveCodes = incentiveCodes;
	 }
	 
	/**
	 * Getter for applyIndication
	 */
	 public List<IncentiveApplyIndicationType> getApplyIndication() {
	 	return applyIndication;
	 }
	 
	/**
	 * Setter for applyIndication
	 */
	 public void setApplyIndication(List<IncentiveApplyIndicationType> applyIndication) {
	 	this.applyIndication = applyIndication;
	 }
	 
	/**
	 * Getter for buckets
	 */
	 public List<IncentiveBucketType> getBuckets() {
	 	return buckets;
	 }
	 
	/**
	 * Setter for buckets
	 */
	 public void setBuckets(List<IncentiveBucketType> buckets) {
	 	this.buckets = buckets;
	 }
	 
	/**
	 * Getter for cartTotalAmt
	 */
	 public BasicAmountType getCartTotalAmt() {
	 	return cartTotalAmt;
	 }
	 
	/**
	 * Setter for cartTotalAmt
	 */
	 public void setCartTotalAmt(BasicAmountType cartTotalAmt) {
	 	this.cartTotalAmt = cartTotalAmt;
	 }
	 
	/**
	 * Getter for requestDetails
	 */
	 public IncentiveRequestDetailsType getRequestDetails() {
	 	return requestDetails;
	 }
	 
	/**
	 * Setter for requestDetails
	 */
	 public void setRequestDetails(IncentiveRequestDetailsType requestDetails) {
	 	this.requestDetails = requestDetails;
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
		if(externalBuyerId != null) {
			sb.append("<").append(preferredPrefix).append(":ExternalBuyerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(externalBuyerId));
			sb.append("</").append(preferredPrefix).append(":ExternalBuyerId>");
		}
		if(incentiveCodes != null) {
			for(int i=0; i < incentiveCodes.size(); i++) {
				sb.append("<").append(preferredPrefix).append(":IncentiveCodes>").append(SDKUtil.escapeInvalidXmlCharsRegex(incentiveCodes.get(i)));
				sb.append("</").append(preferredPrefix).append(":IncentiveCodes>");
			}
		}
		if(applyIndication != null) {
			for(int i=0; i < applyIndication.size(); i++) {
				sb.append(applyIndication.get(i).toXMLString(preferredPrefix,"ApplyIndication"));
			}
		}
		if(buckets != null) {
			for(int i=0; i < buckets.size(); i++) {
				sb.append(buckets.get(i).toXMLString(preferredPrefix,"Buckets"));
			}
		}
		if(cartTotalAmt != null) {
			sb.append(cartTotalAmt.toXMLString(preferredPrefix,"CartTotalAmt"));
		}
		if(requestDetails != null) {
			sb.append(requestDetails.toXMLString(preferredPrefix,"RequestDetails"));
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