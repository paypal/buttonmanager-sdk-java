
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.IncentiveItemType;


/**
 */
public class IncentiveBucketType {

	/**
	 */
	private List<IncentiveItemType> Items = new ArrayList<IncentiveItemType>();
	public List<IncentiveItemType> getItems() {
		return Items;
	}
	public void setItems(List<IncentiveItemType> value) {
		this.Items = value;
	}

	/**
	 */
	private String BucketId;
	public String getBucketId() {
		return BucketId;
	}
	public void setBucketId(String value) {
		this.BucketId = value;
	}

	/**
	 */
	private String SellerId;
	public String getSellerId() {
		return SellerId;
	}
	public void setSellerId(String value) {
		this.SellerId = value;
	}

	/**
	 */
	private String ExternalSellerId;
	public String getExternalSellerId() {
		return ExternalSellerId;
	}
	public void setExternalSellerId(String value) {
		this.ExternalSellerId = value;
	}

	/**
	 */
	private BasicAmountType BucketSubtotalAmt;
	public BasicAmountType getBucketSubtotalAmt() {
		return BucketSubtotalAmt;
	}
	public void setBucketSubtotalAmt(BasicAmountType value) {
		this.BucketSubtotalAmt = value;
	}

	/**
	 */
	private BasicAmountType BucketShippingAmt;
	public BasicAmountType getBucketShippingAmt() {
		return BucketShippingAmt;
	}
	public void setBucketShippingAmt(BasicAmountType value) {
		this.BucketShippingAmt = value;
	}

	/**
	 */
	private BasicAmountType BucketInsuranceAmt;
	public BasicAmountType getBucketInsuranceAmt() {
		return BucketInsuranceAmt;
	}
	public void setBucketInsuranceAmt(BasicAmountType value) {
		this.BucketInsuranceAmt = value;
	}

	/**
	 */
	private BasicAmountType BucketSalesTaxAmt;
	public BasicAmountType getBucketSalesTaxAmt() {
		return BucketSalesTaxAmt;
	}
	public void setBucketSalesTaxAmt(BasicAmountType value) {
		this.BucketSalesTaxAmt = value;
	}

	/**
	 */
	private BasicAmountType BucketTotalAmt;
	public BasicAmountType getBucketTotalAmt() {
		return BucketTotalAmt;
	}
	public void setBucketTotalAmt(BasicAmountType value) {
		this.BucketTotalAmt = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Items != null ) {
			for(int i=0; i<Items.size(); i++) {
				sb.append("<ebl:Items>");
				sb.append(Items.get(i).toXMLString());
				sb.append("</ebl:Items>");
			}
		}
		if( BucketId != null ) {
			sb.append("<ebl:BucketId>").append(BucketId);
			sb.append("</ebl:BucketId>");
		}
		if( SellerId != null ) {
			sb.append("<ebl:SellerId>").append(SellerId);
			sb.append("</ebl:SellerId>");
		}
		if( ExternalSellerId != null ) {
			sb.append("<ebl:ExternalSellerId>").append(ExternalSellerId);
			sb.append("</ebl:ExternalSellerId>");
		}
		if( BucketSubtotalAmt != null ) {
			sb.append("<ebl:BucketSubtotalAmt ");
			sb.append(BucketSubtotalAmt.toXMLString());
			sb.append("</ebl:BucketSubtotalAmt>");
		}
		if( BucketShippingAmt != null ) {
			sb.append("<ebl:BucketShippingAmt ");
			sb.append(BucketShippingAmt.toXMLString());
			sb.append("</ebl:BucketShippingAmt>");
		}
		if( BucketInsuranceAmt != null ) {
			sb.append("<ebl:BucketInsuranceAmt ");
			sb.append(BucketInsuranceAmt.toXMLString());
			sb.append("</ebl:BucketInsuranceAmt>");
		}
		if( BucketSalesTaxAmt != null ) {
			sb.append("<ebl:BucketSalesTaxAmt ");
			sb.append(BucketSalesTaxAmt.toXMLString());
			sb.append("</ebl:BucketSalesTaxAmt>");
		}
		if( BucketTotalAmt != null ) {
			sb.append("<ebl:BucketTotalAmt ");
			sb.append(BucketTotalAmt.toXMLString());
			sb.append("</ebl:BucketTotalAmt>");
		}
		return sb.toString();
	}

}
