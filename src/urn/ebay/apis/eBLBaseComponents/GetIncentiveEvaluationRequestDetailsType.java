
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.IncentiveApplyIndicationType;
import urn.ebay.apis.eBLBaseComponents.IncentiveBucketType;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestDetailsType;


/**
 */
public class GetIncentiveEvaluationRequestDetailsType {

	/**
	 */
	private String ExternalBuyerId;
	public String getExternalBuyerId() {
		return ExternalBuyerId;
	}
	public void setExternalBuyerId(String value) {
		this.ExternalBuyerId = value;
	}

	/**
	 */
	private List<String> IncentiveCodes = new ArrayList<String>();
	public List<String> getIncentiveCodes() {
		return IncentiveCodes;
	}
	public void setIncentiveCodes(List<String> value) {
		this.IncentiveCodes = value;
	}

	/**
	 */
	private List<IncentiveApplyIndicationType> ApplyIndication = new ArrayList<IncentiveApplyIndicationType>();
	public List<IncentiveApplyIndicationType> getApplyIndication() {
		return ApplyIndication;
	}
	public void setApplyIndication(List<IncentiveApplyIndicationType> value) {
		this.ApplyIndication = value;
	}

	/**
	 */
	private List<IncentiveBucketType> Buckets = new ArrayList<IncentiveBucketType>();
	public List<IncentiveBucketType> getBuckets() {
		return Buckets;
	}
	public void setBuckets(List<IncentiveBucketType> value) {
		this.Buckets = value;
	}

	/**
	 */
	private BasicAmountType CartTotalAmt;
	public BasicAmountType getCartTotalAmt() {
		return CartTotalAmt;
	}
	public void setCartTotalAmt(BasicAmountType value) {
		this.CartTotalAmt = value;
	}

	/**
	 */
	private IncentiveRequestDetailsType RequestDetails;
	public IncentiveRequestDetailsType getRequestDetails() {
		return RequestDetails;
	}
	public void setRequestDetails(IncentiveRequestDetailsType value) {
		this.RequestDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ExternalBuyerId != null ) {
			sb.append("<ebl:ExternalBuyerId>").append(ExternalBuyerId);
			sb.append("</ebl:ExternalBuyerId>");
		}
		if( IncentiveCodes != null ) {
			for(int i=0; i<IncentiveCodes.size(); i++) {
				sb.append("<ebl:IncentiveCodes>").append(IncentiveCodes.get(i));
				sb.append("</ebl:IncentiveCodes>");
			}
		}
		if( ApplyIndication != null ) {
			for(int i=0; i<ApplyIndication.size(); i++) {
				sb.append("<ebl:ApplyIndication>");
				sb.append(ApplyIndication.get(i).toXMLString());
				sb.append("</ebl:ApplyIndication>");
			}
		}
		if( Buckets != null ) {
			for(int i=0; i<Buckets.size(); i++) {
				sb.append("<ebl:Buckets>");
				sb.append(Buckets.get(i).toXMLString());
				sb.append("</ebl:Buckets>");
			}
		}
		if( CartTotalAmt != null ) {
			sb.append("<ebl:CartTotalAmt ");
			sb.append(CartTotalAmt.toXMLString());
			sb.append("</ebl:CartTotalAmt>");
		}
		if( RequestDetails != null ) {
			sb.append("<ebl:RequestDetails>");
			sb.append(RequestDetails.toXMLString());
			sb.append("</ebl:RequestDetails>");
		}
		return sb.toString();
	}

}
