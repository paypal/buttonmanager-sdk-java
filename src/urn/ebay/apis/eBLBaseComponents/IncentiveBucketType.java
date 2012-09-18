package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.IncentiveItemType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class IncentiveBucketType{


	/**
	 * 	 
	 */ 
	private List<IncentiveItemType> Items = new ArrayList<IncentiveItemType>();

	/**
	 * 	 
	 */ 
	private String BucketId;

	/**
	 * 	 
	 */ 
	private String SellerId;

	/**
	 * 	 
	 */ 
	private String ExternalSellerId;

	/**
	 * 	 
	 */ 
	private BasicAmountType BucketSubtotalAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType BucketShippingAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType BucketInsuranceAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType BucketSalesTaxAmt;

	/**
	 * 	 
	 */ 
	private BasicAmountType BucketTotalAmt;

	

	/**
	 * Default Constructor
	 */
	public IncentiveBucketType (){
	}	

	/**
	 * Getter for Items
	 */
	 public List<IncentiveItemType> getItems() {
	 	return Items;
	 }
	 
	/**
	 * Setter for Items
	 */
	 public void setItems(List<IncentiveItemType> Items) {
	 	this.Items = Items;
	 }
	 
	/**
	 * Getter for BucketId
	 */
	 public String getBucketId() {
	 	return BucketId;
	 }
	 
	/**
	 * Setter for BucketId
	 */
	 public void setBucketId(String BucketId) {
	 	this.BucketId = BucketId;
	 }
	 
	/**
	 * Getter for SellerId
	 */
	 public String getSellerId() {
	 	return SellerId;
	 }
	 
	/**
	 * Setter for SellerId
	 */
	 public void setSellerId(String SellerId) {
	 	this.SellerId = SellerId;
	 }
	 
	/**
	 * Getter for ExternalSellerId
	 */
	 public String getExternalSellerId() {
	 	return ExternalSellerId;
	 }
	 
	/**
	 * Setter for ExternalSellerId
	 */
	 public void setExternalSellerId(String ExternalSellerId) {
	 	this.ExternalSellerId = ExternalSellerId;
	 }
	 
	/**
	 * Getter for BucketSubtotalAmt
	 */
	 public BasicAmountType getBucketSubtotalAmt() {
	 	return BucketSubtotalAmt;
	 }
	 
	/**
	 * Setter for BucketSubtotalAmt
	 */
	 public void setBucketSubtotalAmt(BasicAmountType BucketSubtotalAmt) {
	 	this.BucketSubtotalAmt = BucketSubtotalAmt;
	 }
	 
	/**
	 * Getter for BucketShippingAmt
	 */
	 public BasicAmountType getBucketShippingAmt() {
	 	return BucketShippingAmt;
	 }
	 
	/**
	 * Setter for BucketShippingAmt
	 */
	 public void setBucketShippingAmt(BasicAmountType BucketShippingAmt) {
	 	this.BucketShippingAmt = BucketShippingAmt;
	 }
	 
	/**
	 * Getter for BucketInsuranceAmt
	 */
	 public BasicAmountType getBucketInsuranceAmt() {
	 	return BucketInsuranceAmt;
	 }
	 
	/**
	 * Setter for BucketInsuranceAmt
	 */
	 public void setBucketInsuranceAmt(BasicAmountType BucketInsuranceAmt) {
	 	this.BucketInsuranceAmt = BucketInsuranceAmt;
	 }
	 
	/**
	 * Getter for BucketSalesTaxAmt
	 */
	 public BasicAmountType getBucketSalesTaxAmt() {
	 	return BucketSalesTaxAmt;
	 }
	 
	/**
	 * Setter for BucketSalesTaxAmt
	 */
	 public void setBucketSalesTaxAmt(BasicAmountType BucketSalesTaxAmt) {
	 	this.BucketSalesTaxAmt = BucketSalesTaxAmt;
	 }
	 
	/**
	 * Getter for BucketTotalAmt
	 */
	 public BasicAmountType getBucketTotalAmt() {
	 	return BucketTotalAmt;
	 }
	 
	/**
	 * Setter for BucketTotalAmt
	 */
	 public void setBucketTotalAmt(BasicAmountType BucketTotalAmt) {
	 	this.BucketTotalAmt = BucketTotalAmt;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(Items != null) {
			for(int i=0; i < Items.size(); i++) {
				sb.append("<ebl:Items>");
				sb.append(Items.get(i).toXMLString());
				sb.append("</ebl:Items>");
			}
		}
		if(BucketId != null) {
			sb.append("<ebl:BucketId>").append(SDKUtil.escapeInvalidXmlCharsRegex(BucketId));
			sb.append("</ebl:BucketId>");
		}
		if(SellerId != null) {
			sb.append("<ebl:SellerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(SellerId));
			sb.append("</ebl:SellerId>");
		}
		if(ExternalSellerId != null) {
			sb.append("<ebl:ExternalSellerId>").append(SDKUtil.escapeInvalidXmlCharsRegex(ExternalSellerId));
			sb.append("</ebl:ExternalSellerId>");
		}
		if(BucketSubtotalAmt != null) {
			sb.append("<ebl:BucketSubtotalAmt");
			sb.append(BucketSubtotalAmt.toXMLString());
			sb.append("</ebl:BucketSubtotalAmt>");
		}
		if(BucketShippingAmt != null) {
			sb.append("<ebl:BucketShippingAmt");
			sb.append(BucketShippingAmt.toXMLString());
			sb.append("</ebl:BucketShippingAmt>");
		}
		if(BucketInsuranceAmt != null) {
			sb.append("<ebl:BucketInsuranceAmt");
			sb.append(BucketInsuranceAmt.toXMLString());
			sb.append("</ebl:BucketInsuranceAmt>");
		}
		if(BucketSalesTaxAmt != null) {
			sb.append("<ebl:BucketSalesTaxAmt");
			sb.append(BucketSalesTaxAmt.toXMLString());
			sb.append("</ebl:BucketSalesTaxAmt>");
		}
		if(BucketTotalAmt != null) {
			sb.append("<ebl:BucketTotalAmt");
			sb.append(BucketTotalAmt.toXMLString());
			sb.append("</ebl:BucketTotalAmt>");
		}
		return sb.toString();
	}

}